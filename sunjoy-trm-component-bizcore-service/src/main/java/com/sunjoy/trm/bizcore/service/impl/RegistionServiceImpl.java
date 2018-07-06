package com.sunjoy.trm.bizcore.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.common.utils.BeanUtils;
import com.sunjoy.common.utils.RandomUtils;
import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.RegistionDao;
import com.sunjoy.trm.bizcore.dao.criteria.RegistionCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RegistionDto;
import com.sunjoy.trm.bizcore.dao.entity.Registion;
import com.sunjoy.trm.bizcore.enums.RegistionStatus;
import com.sunjoy.trm.bizcore.service.IRegistionService;
import com.sunjoy.trm.master.dao.entity.Student;
import com.sunjoy.trm.master.service.IStudentService;

/**
 * 课程注册服务实现类
 * 
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
@Service(value = "registionService")
@Transactional
public class RegistionServiceImpl implements IRegistionService {

	@Autowired
	private RegistionDao registionDao;
	@Autowired
	private IStudentService studentService;

	@Override
	public Page<RegistionDto> query(RegistionCriteria criteria, PageInfo page) {
		Page<RegistionDto> returnPage = new Page<RegistionDto>(page);
		List<RegistionDto> results = registionDao.queryRegistions(criteria,
				page);
		long count = this.registionDao.getRegistionTotalCount(criteria);
		returnPage.setRows(results);
		returnPage.setCount(count);
		return returnPage;
	}

	@Override
	public Registion update(RegistionDto registionDto) {
		// step 1, 非空检查，加上UUID
		BeanUtils.checkEmptyFields(registionDto, "id", "studentId",
				"courseId", "periods");
		// step 2, 更新学员信息
		Student student = new Student();
		BeanUtils.copyProperties(registionDto, student);
		student.setId(registionDto.getStudentId());
		student.setCode(registionDto.getStudentCode());
		student.setName(registionDto.getStudentName());
		this.studentService.update(student);

		// step 3, 再更新注册信息
		Registion registion = new Registion();
		BeanUtils.copyProperties(registionDto, registion);
		this.registionDao.updateRegistion(registion);
		return registion;
	}

	@Override
	public Registion add(RegistionDto registionDto) {
		//先设置一个学员ID
		registionDto.setStudentId(RandomUtils.createUUID());
		// 先保存学党信息
		Student student = new Student();
		BeanUtils.copyProperties(registionDto, student);
		student.setId(registionDto.getStudentId());
		student.setCode(registionDto.getStudentCode());
		student.setName(registionDto.getStudentName());
		
		this.studentService.add(student);

		// 再保存注册信息
		Registion registion = new Registion();
		BeanUtils.copyProperties(registionDto, registion);
		registion.setId(RandomUtils.createUUID());
		if(registion.getRegisterDate()==null){
			registion.setRegisterDate(new Date());
		}
		registion.setStatus(RegistionStatus.DRAFT.getValue());
		this.registionDao.addRegistion(registion);
		return registion;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RegistionDto get(String id) {
		
		return this.registionDao.selectOneByPrimaryKey(id);
	}

}
