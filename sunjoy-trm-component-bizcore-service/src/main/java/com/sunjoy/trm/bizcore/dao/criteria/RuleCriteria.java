package com.sunjoy.trm.bizcore.dao.criteria;

import com.sunjoy.trm.bizcore.dao.entity.Rule;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public class RuleCriteria extends Rule{
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
