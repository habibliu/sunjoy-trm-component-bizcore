package com.sunjoy.trm.bizcore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.ShiftDao;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.service.IShiftService;

@Service(value = "shiftService")
@Transactional
public class ShiftServiceImpl implements IShiftService{
	@Autowired
	private ShiftDao shiftDao;
	@Override
	public Page<ShiftDto> query(ShiftDto criteria, PageInfo page) {
		Page<ShiftDto> returnPage = new Page<ShiftDto>(page);
		List<ShiftDto> results = shiftDao.queryShifts(criteria, page);
		long count = this.shiftDao.queryShiftsCount(criteria);
		returnPage.setRows(results);
		returnPage.setCount(count);
		return returnPage;
	}

}
