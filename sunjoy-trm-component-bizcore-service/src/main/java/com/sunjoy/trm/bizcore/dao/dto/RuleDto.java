package com.sunjoy.trm.bizcore.dao.dto;

import com.sunjoy.trm.bizcore.dao.entity.Rule;

public class RuleDto extends Rule{
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
