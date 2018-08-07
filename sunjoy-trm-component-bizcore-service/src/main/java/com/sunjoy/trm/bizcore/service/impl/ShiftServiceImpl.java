package com.sunjoy.trm.bizcore.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.framework.exception.CommonException;
import com.sunjoy.trm.bizcore.dao.ShiftDao;
import com.sunjoy.trm.bizcore.dao.ShiftStudentDao;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.dto.ShiftStudentDto;
import com.sunjoy.trm.bizcore.dao.entity.Shift;
import com.sunjoy.trm.bizcore.service.IRegistionService;
import com.sunjoy.trm.bizcore.service.IShiftService;

@Service(value = "shiftService")
@Transactional
public class ShiftServiceImpl implements IShiftService{
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
	public List<ShiftStudentDto> queryShiftStudents(String  shiftId) {
		if(StringUtils.isEmpty(shiftId)){
			throw new CommonException("参数不能为空!");
		}
		return this.shiftStudentDao.queryShiftStudents(shiftId);
	}
	@Override
	public void deleteShift(String id) {
		Shift shift=this.shiftDao.getMapper().findShiftById(id);
		//将学员的已排期节数减1
		List<ShiftStudentDto> students=queryShiftStudents(id);
		for(ShiftStudentDto stu:students) {
			this.registionService.decreaseArrangedSections(shift.getCourseId(), stu.getStudentId());
		}
		//删除本排班学员
		this.shiftStudentDao.deleteShiftStudents(id);
		//删除本排班
		this.shiftDao.deleteShift(id);
	}

}
