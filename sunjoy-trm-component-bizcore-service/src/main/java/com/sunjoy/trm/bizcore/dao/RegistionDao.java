package com.sunjoy.trm.bizcore.dao;
/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sunjoy.common.utils.BeanUtils;
import com.sunjoy.framework.dao.BaseDao;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.criteria.RegistionCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RegistionDto;
import com.sunjoy.trm.bizcore.dao.entity.Registion;
import com.sunjoy.trm.bizcore.dao.mapper.RegistionMapper;

@Repository
public class RegistionDao extends BaseDao<RegistionMapper, Registion>{
	

	@Override
	protected void setMapperClass() {
		super.setMapperClass(RegistionMapper.class);
	}

	@Override
	protected void setEntityClass() {
		super.setEntityClass(Registion.class);
		
	}
	
	/**
	 * 课程注册分页查询
	 * 
	 * @param criteria 过虑条件
	 * @return
	 */
	public List<RegistionDto> queryRegistions(RegistionCriteria criteria,PageInfo page) {
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("criteria", criteria);
		params.put("page", page);
		return this.getMapper().queryRegistions(params);

	}

	/**
	 * 获取课程注册的总记录数
	 * @param criteria 过虑条件
	 * @return
	 */
	public long getRegistionTotalCount(RegistionCriteria criteria) {
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("criteria", criteria);
		return this.getMapper().queryRegistionsCount(params);
	}

	
	public void  addRegistion(Registion Registion) {
		logger.debug("addRegistion:\n{}",Registion);
		this.getMapper().addRegistion(Registion);
	}
	
	public int updateRegistion(Registion Registion) {
		logger.debug("updateRegistion:\n{}",Registion);
		return this.getMapper().updateRegistion(Registion);
	}
	
	public RegistionDto selectOneByPrimaryKey(String uuid) {
		return this.getMapper().selectOneByPrimaryKey(uuid);
	}

}
