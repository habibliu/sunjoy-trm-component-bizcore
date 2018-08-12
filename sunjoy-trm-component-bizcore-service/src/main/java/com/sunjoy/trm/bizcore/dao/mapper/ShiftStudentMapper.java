package com.sunjoy.trm.bizcore.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunjoy.trm.bizcore.dao.dto.ShiftStudentDto;
import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;

public interface ShiftStudentMapper {
	/**
	 * 批量插入
	 * @param shiftStudents
	 * @return
	 */
	long batchInsert(List<ShiftStudent> shiftStudents);
	/**
	 * 查询班次学员
	 * @param shiftId
	 * @return
	 */
	List<ShiftStudentDto> queryShiftStudents(@Param("shiftId") String shiftId);
	
	long deleteShfitStudents(@Param("shiftId") String shiftId);
	/**
	 * 批量更新学员的考勤结果
	 * @param studnets
	 * @return
	 */
	long batchUpdateStudentAttendance(List<ShiftStudentDto> studnets);
}
