package com.sunjoy.trm.bizcore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sunjoy.framework.dao.BaseDao;
import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;
import com.sunjoy.trm.bizcore.dao.mapper.ShiftStudentMapper;

@Repository
public class ShiftStudentDao extends BaseDao<ShiftStudentMapper, ShiftStudent>{

	@Override
	protected void setMapperClass() {
		super.setMapperClass(ShiftStudentMapper.class);
	}

	@Override
	protected void setEntityClass() {
		super.setEntityClass(ShiftStudent.class);
	}

	public long batchAdd(List<ShiftStudent> students) {
		return this.getMapper().batchInsert(students);
	}
}
