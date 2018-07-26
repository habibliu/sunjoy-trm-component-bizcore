package com.sunjoy.trm.bizcore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.framework.dao.paging.PageInfo;
import com.sunjoy.framework.utils.BeanUtils;
import com.sunjoy.framework.utils.RandomUtils;
import com.sunjoy.trm.bizcore.dao.RuleDao;
import com.sunjoy.trm.bizcore.dao.criteria.RuleCriteria;
import com.sunjoy.trm.bizcore.dao.dto.RuleDto;
import com.sunjoy.trm.bizcore.dao.entity.Rule;
import com.sunjoy.trm.bizcore.service.IRuleService;

@Service(value = "ruleService")
@Transactional
public class RuleServiceImpl implements IRuleService {
	@Autowired
	private RuleDao ruleDao;

	@Override
	public Page<RuleDto> queryByPage(RuleCriteria criteria, PageInfo page) {
		Page<RuleDto> returnPage = new Page<RuleDto>(page);
		List<RuleDto> results = ruleDao.queryRules(criteria, page);
		long count = this.ruleDao.queryRulesCount(criteria);
		returnPage.setRows(results);
		returnPage.setCount(count);
		return returnPage;
	}

	@Override
	public List<Rule> query(RuleCriteria criteria) {
		return null;
	}

	@Override
	public Rule update(Rule rule) {
		// step 1, 非空检查，加上UUID
		BeanUtils.checkEmptyFields(rule, "id", "courseId", "subscribePeriods", "freeSections");
		this.ruleDao.updateRule(rule);
		return rule;
	}

	@Override
	public Rule add(Rule rule) {
		// step 1, 非空检查，加上UUID
		BeanUtils.checkEmptyFields(rule, "courseId", "subscribePeriods", "freeSections");

		// step 2, 再保存信息
		if (StringUtils.isEmpty(rule.getId())) {
			rule.setId(RandomUtils.createUUID());
		}
		rule.setStatus("VALID");
		this.ruleDao.addRule(rule);
		return rule;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rule get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
