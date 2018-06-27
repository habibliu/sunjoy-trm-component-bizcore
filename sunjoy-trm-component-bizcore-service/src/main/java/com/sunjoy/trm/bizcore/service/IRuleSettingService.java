package com.sunjoy.trm.bizcore.service;

import java.util.List;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.trm.bizcore.dao.criteria.RuleCriteria;
import com.sunjoy.trm.bizcore.dao.entity.Rule;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public interface IRuleSettingService {
	/**
	 * 分页查询
	 */
	public Page<Rule> queryByPage(RuleCriteria criteria);

	/**
	 * 不分页查询
	 * 
	 * @param criteria
	 * @return
	 */
	public List<Rule> query(RuleCriteria criteria);

	/**
	 * 更新规则资料
	 * 
	 * @param rule
	 * @return
	 */
	public Rule update(Rule rule);

	/**
	 * 新增规则记录
	 * 
	 * @param rule
	 * @return
	 */
	public Rule add(Rule rule);

	/**
	 * 根据主键删除规则记录(逻辑删除)
	 * 
	 * @param id
	 * @return
	 */
	public int remove(String id);

	/**
	 * 根据主键获取规则记录
	 * @param id
	 * @return
	 */
	public Rule get(String id);
}
