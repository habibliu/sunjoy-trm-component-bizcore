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
	private Integer totalCount;
	private Integer normalCount;
	private Integer leaveCount;
	private Integer absentCount;
	
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
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getNormalCount() {
		return normalCount;
	}
	public void setNormalCount(Integer normalCount) {
		this.normalCount = normalCount;
	}
	public Integer getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(Integer leaveCount) {
		this.leaveCount = leaveCount;
	}
	public Integer getAbsentCount() {
		return absentCount;
	}
	public void setAbsentCount(Integer absentCount) {
		this.absentCount = absentCount;
	}
}
