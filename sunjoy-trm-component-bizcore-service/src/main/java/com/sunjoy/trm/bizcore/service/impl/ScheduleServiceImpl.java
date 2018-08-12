package com.sunjoy.trm.bizcore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.framework.exception.CommonException;
import com.sunjoy.framework.utils.RandomUtils;
import com.sunjoy.trm.bizcore.dao.ShiftDao;
import com.sunjoy.trm.bizcore.dao.ShiftStudentDao;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.dto.ShiftStudentDto;
import com.sunjoy.trm.bizcore.dao.entity.Shift;
import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;
import com.sunjoy.trm.bizcore.service.IRegistionService;
import com.sunjoy.trm.bizcore.service.IScheduelService;

@Service(value="scheduleService")
@Transactional
public class ScheduleServiceImpl implements IScheduelService{
	@Autowired
	private ShiftDao shiftDao;
	@Autowired
	private ShiftStudentDao shiftStudentDao;
	@Autowired
	private IRegistionService registionService;
	@Override
	public void batchAddShift(List<ShiftDto> shifts) {
		for(ShiftDto shiftDto:shifts) {
			//保存排班记录
			Shift shift=new Shift();
			BeanUtils.copyProperties(shiftDto, shift);
			if(shift.getId()==null ||shift.getId().isEmpty()) {
				shift.setId(RandomUtils.createUUID());
			}
			shift.setStatus("VALID");
			
			//批量保存排班记录下的学员
			List<ShiftStudentDto> studentDtos=shiftDto.getStudents();
			shift.setTotalCount(studentDtos.size());
			this.shiftDao.addShift(shift);
			if(studentDtos!=null && !studentDtos.isEmpty()) {
				List<ShiftStudent> students=new ArrayList<ShiftStudent>();
				for(ShiftStudentDto dto:studentDtos) {
					ShiftStudent shiftStudent=new ShiftStudent();
					shiftStudent.setStudentId(dto.getStudentId());
					shiftStudent.setId(RandomUtils.createUUID());
					shiftStudent.setShiftId(shift.getId());
					students.add(shiftStudent);
					//增节学员的已排班节数
					this.registionService.increaseArrangedSections(shiftDto.getCourseId(), shiftStudent.getStudentId());
				}
				
				//批量增加
				this.shiftStudentDao.batchAdd(students);
			}else {
				throw new CommonException("排班缺少学员，排班无效！");
			}
			
		}
		
	}


}
