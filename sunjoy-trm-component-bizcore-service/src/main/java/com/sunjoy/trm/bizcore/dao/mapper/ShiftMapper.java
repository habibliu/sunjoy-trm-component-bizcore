package com.sunjoy.trm.bizcore.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;
import com.sunjoy.trm.bizcore.dao.entity.Shift;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface ShiftMapper {
	List<ShiftDto> queryShifts(@Param("criteria") ShiftDto criteria,@Param("page") PageInfo page);
	
	Long queryShiftsCount(@Param("criteria") ShiftDto criteria);
	
	int addShift(Shift shift);
	
	int update(Shift shift);
	
	int deleteShift(@Param("id") String id);
	
	Shift findShiftById(@Param("id") String id);
}
