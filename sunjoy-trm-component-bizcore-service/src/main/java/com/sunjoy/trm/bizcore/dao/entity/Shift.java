package com.sunjoy.trm.bizcore.dao.entity;

import java.util.Date;

import com.sunjoy.framework.dao.BaseEntity;

/**
 * 排班表
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public class Shift  extends BaseEntity{
	private Date trainDate;
	private String trainTime;
	private String courseId;
	private String coachId;
	private String venueId;
	private String status;
	public Date getTrainDate() {
		return trainDate;
	}
	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}
	public String getTrainTime() {
		return trainTime;
	}
	public void setTrainTime(String trainTime) {
		this.trainTime = trainTime;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCoachId() {
		return coachId;
	}
	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	public String getVenueId() {
		return venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
