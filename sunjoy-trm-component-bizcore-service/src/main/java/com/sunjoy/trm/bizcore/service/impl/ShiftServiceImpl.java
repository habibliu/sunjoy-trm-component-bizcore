package com.sunjoy.trm.bizcore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.framework.exception.CommonException;
import com.sunjoy.framework.utils.RandomUtils;
import com.sunjoy.trm.bizcore.dao.ShiftDao;
import com.sunjoy.trm.bizcore.dao.ShiftStudentDao;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.dto.ShiftStudentDto;
import com.sunjoy.trm.bizcore.dao.entity.Shift;
import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;
import com.sunjoy.trm.bizcore.enums.AttendanceType;
import com.sunjoy.trm.bizcore.service.IRegistionService;
import com.sunjoy.trm.bizcore.service.IShiftService;

@Service(value = "shiftService")
@Transactional
public class ShiftServiceImpl implements IShiftService {
	@Autowired
	private ShiftDao shiftDao;
	@Autowired
	private ShiftStudentDao shiftStudentDao;

	@Autowired
	private IRegistionService registionService;

	@Override
	public Page<ShiftDto> query(ShiftDto criteria, PageInfo page) {
		Page<ShiftDto> returnPage = new Page<ShiftDto>(page);
		List<ShiftDto> results = shiftDao.queryShifts(criteria, page);
		long count = this.shiftDao.queryShiftsCount(criteria);
		returnPage.setRows(results);
		returnPage.setCount(count);
		return returnPage;
	}

	@Override
	public List<ShiftStudentDto> queryShiftStudents(String shiftId) {
		if (StringUtils.isEmpty(shiftId)) {
			throw new CommonException("参数不能为空!");
		}
		return this.shiftStudentDao.queryShiftStudents(shiftId);
	}

	@Override
	public void deleteShift(String id) {
		Shift shift = this.shiftDao.getMapper().findShiftById(id);
		// 将学员的已排期节数减1
		List<ShiftStudentDto> students = queryShiftStudents(id);
		for (ShiftStudentDto stu : students) {
			this.registionService.decreaseArrangedSections(shift.getCourseId(), stu.getStudentId());
		}
		// 删除本排班学员
		this.shiftStudentDao.deleteShiftStudents(id);
		// 删除本排班
		this.shiftDao.deleteShift(id);
	}

	@Override
	public void updateAttendance(ShiftDto shift) {
		// 先更新学员的考勤
		this.shiftStudentDao.getMapper().batchUpdateStudentAttendance(shift.getStudents());
		// 再更新shift主表的统计信息

		List<ShiftStudentDto> students = this.queryShiftStudents(shift.getId());
		int normalCount = 0;
		int leaveCount = 0;
		int absentCount = 0;
		for (ShiftStudentDto student : students) {
			switch (student.getCheckingIn() == null ? "" : student.getCheckingIn()) {
			case "NORMAL":
				normalCount++;
				break;
			case "LEAVE":
				leaveCount++;
				break;
			case "ABSENT":
				absentCount++;
				break;
			default:
				break;
			}
		}
		Shift shiftTotal = new Shift();
		shiftTotal.setId(shift.getId());
		shiftTotal.setNormalCount(normalCount);
		shiftTotal.setLeaveCount(leaveCount);
		shiftTotal.setAbsentCount(absentCount);

		this.shiftDao.getMapper().updateAttendanceTotal(shiftTotal);
	}

	@Override
	public void updateShift(ShiftDto shiftDto) {
		// 批量保存排班记录下的学员
		List<ShiftStudentDto> studentDtos = shiftDto.getStudents();
		// 更新排班主表信息(日期与时间不能改)

		Shift shift = new Shift();
		BeanUtils.copyProperties(shiftDto, shift);
		shift.setTotalCount(studentDtos.size());
		this.shiftDao.getMapper().updateShift(shift);
		// 先删除学员(条件：没有考勤记录)
		this.shiftStudentDao.getMapper().deleteShfitStudents(shift.getId());
		// 再重新保存学员
		batchAddShiftStudents(shiftDto.getId(),shiftDto.getCourseId(),studentDtos);
	}

	public void batchAddShiftStudents(String shiftId, String courseId, List<ShiftStudentDto> studentDtos) {

		if (studentDtos != null && !studentDtos.isEmpty()) {
			List<ShiftStudent> students = new ArrayList<ShiftStudent>();
			for (ShiftStudentDto dto : studentDtos) {
				ShiftStudent shiftStudent = new ShiftStudent();
				shiftStudent.setStudentId(dto.getStudentId());
				shiftStudent.setId(RandomUtils.createUUID());
				shiftStudent.setShiftId(shiftId);
				students.add(shiftStudent);
				// 增节学员的已排班节数
				this.registionService.increaseArrangedSections(courseId, shiftStudent.getStudentId());
			}

			// 批量增加
			this.shiftStudentDao.batchAdd(students);
		} else {
			throw new CommonException("排班缺少学员，排班无效！");
		}
	}

}
