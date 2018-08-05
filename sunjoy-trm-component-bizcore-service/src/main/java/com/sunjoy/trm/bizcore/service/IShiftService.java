package com.sunjoy.trm.bizcore.service;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;

public interface IShiftService {
	/**
	 * 分页查询
	 */
	public Page<ShiftDto> query(ShiftDto criteria,PageInfo page);

}
