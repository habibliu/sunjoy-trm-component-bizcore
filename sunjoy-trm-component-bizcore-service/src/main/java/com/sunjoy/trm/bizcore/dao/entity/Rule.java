package com.sunjoy.trm.bizcore.dao.entity;

import com.sunjoy.framework.dao.BaseEntity;

/**
 * 赠关规则实体类
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public class Rule  extends BaseEntity{
	/**
	 * 课程ID
	 */
	private String courseId;
	/**
	 * 购买课程数
	 */
	private Integer subscribePeriods;
	/**
	 * 赠送节数
	 */
	private Integer freeSections;
	private String status;
	private String memo;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Integer getSubscribePeriods() {
		return subscribePeriods;
	}
	public void setSubscribePeriods(Integer subscribePeriods) {
		this.subscribePeriods = subscribePeriods;
	}
	public Integer getFreeSections() {
		return freeSections;
	}
	public void setFreeSections(Integer freeSections) {
		this.freeSections = freeSections;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
