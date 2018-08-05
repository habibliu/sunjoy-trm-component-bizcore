package com.sunjoy.trm.bizcore.service;

import java.util.List;

import com.sunjoy.trm.bizcore.dao.dto.ShiftDto;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface IScheduelService {
	/**
	 * 批量保存排班结果
	 * @param shifts
	 */
	void batchAddShift(List<ShiftDto> shifts);
}
