package com.sunjoy.trm.bizcore.service;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.criteria.RegistionCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RegistionDto;
import com.sunjoy.trm.bizcore.dao.entity.Registion;

/**
 * 课程注册服务接口
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface IRegistionService {
	/**
	 * 分页查询
	 */
	public Page<RegistionDto> query(RegistionCriteria criteria,PageInfo page);

	
	/**
	 * 更新注册资料
	 * 
	 * @param student
	 * @return
	 */
	public Registion update(RegistionDto student);

	/**
	 * 新增注册记录
	 * 
	 * @param student
	 * @return
	 */
	public Registion add(RegistionDto student);

	/**
	 * 根据主键删除注册记录(逻辑删除)
	 * 
	 * @param id
	 * @return
	 */
	public int remove(String id);

	/**
	 * 根据主键获取注册记录
	 * @param id
	 * @return
	 */
	public RegistionDto get(String id);
}
