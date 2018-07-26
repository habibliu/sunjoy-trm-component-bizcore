package com.sunjoy.trm.bizcore.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.trm.bizcore.dao.criteria.RuleCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RuleDto;
import com.sunjoy.trm.bizcore.dao.entity.Rule;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface RuleMapper {
	/**
	 * 分页查询
	 * @param criteria
	 * @param page
	 * @return
	 */
	List<RuleDto> queryRules(@Param("criteria") RuleCriteria criteria,@Param("page") PageInfo page);
	
	/**
	 * 取回条件约束下的总记录数
	 * @param criteria
	 * @return
	 */
	long queryRulesCount(@Param("criteria") RuleCriteria criteria);
	
	/**
	 * 
	 * @param rule
	 * @return
	 */
	int addRule(Rule rule);
	
	int updateRule(Rule rule);
	
}
