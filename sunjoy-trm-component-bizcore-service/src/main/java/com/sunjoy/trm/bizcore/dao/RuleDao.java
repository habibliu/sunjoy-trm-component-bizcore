package com.sunjoy.trm.bizcore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sunjoy.framework.dao.BaseDao;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.criteria.RuleCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RuleDto;
import com.sunjoy.trm.bizcore.dao.entity.Rule;
import com.sunjoy.trm.bizcore.dao.mapper.RuleMapper;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
@Repository
public class RuleDao extends BaseDao<RuleMapper, Rule>{

	@Override
	protected void setMapperClass() {
		super.setMapperClass(RuleMapper.class);
		
	}

	@Override
	protected void setEntityClass() {
		super.setEntityClass(Rule.class);
		
	}

	/**
	 * 分页查询
	 * @param criteria
	 * @param page
	 * @return
	 */
	public List<RuleDto> queryRules( RuleCriteria criteria,PageInfo page){
		return this.getMapper().queryRules(criteria, page);
	}
	
	/**
	 * 取回条件约束下的总记录数
	 * @param criteria
	 * @return
	 */
	public  long queryRulesCount(RuleCriteria criteria) {
		return this.getMapper().queryRulesCount(criteria);
	}
	
	/**
	 * 
	 * @param rule
	 * @return
	 */
	public  int addRule(Rule rule) {
		return this.getMapper().addRule(rule);
	}
	
	public int updateRule(Rule rule) {
		return this.getMapper().updateRule(rule);
	}
}
