package com.sunjoy.trm.bizcore.service;

import java.util.List;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.dto.ShiftStudentDto;

public interface IShiftService {
	/**
	 * 分页查询
	 */
	public Page<ShiftDto> query(ShiftDto criteria,PageInfo page);
	/**
	 * 查询班次的学员
	 * @param criteria
	 * @return
	 */
	public List<ShiftStudentDto> queryShiftStudents(String shiftId);
	
	void deleteShift(String id);

}
