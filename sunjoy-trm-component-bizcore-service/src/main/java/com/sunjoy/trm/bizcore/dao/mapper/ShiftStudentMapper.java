package com.sunjoy.trm.bizcore.dao.mapper;

import java.util.List;

import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;

public interface ShiftStudentMapper {
	/**
	 * 批量插入
	 * @param shiftStudents
	 * @return
	 */
	long batchInsert(List<ShiftStudent> shiftStudents);
}
