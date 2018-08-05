package com.sunjoy.trm.bizcore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sunjoy.framework.dao.BaseDao;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.entity.Shift;
import com.sunjoy.trm.bizcore.dao.mapper.ShiftMapper;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
@Repository
public class ShiftDao extends BaseDao<ShiftMapper, Shift>{

	@Override
	protected void setMapperClass() {
		super.setMapperClass(ShiftMapper.class);
	}

	@Override
	protected void setEntityClass() {
		super.setEntityClass(Shift.class);
	}
	
	public List<ShiftDto> queryShifts(ShiftDto criteria,PageInfo page){
		return this.getMapper().queryShifts(criteria, page);
	}

	public Long queryShiftsCount(ShiftDto criteria) {
		return this.getMapper().queryShiftsCount(criteria);
	}
	
	public Integer addShift(Shift shift) {
		return this.getMapper().addShift(shift);
	}
	
	public Integer updateShift(Shift shift) {
		return this.getMapper().update(shift);
	}
	
	public Integer deleteShift(String id) {
		return this.getMapper().deleteShift(id);
	}
}
