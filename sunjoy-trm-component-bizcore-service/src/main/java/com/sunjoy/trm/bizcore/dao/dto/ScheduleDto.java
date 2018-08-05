package com.sunjoy.trm.bizcore.dao.dto;

import java.util.Date;
import java.util.List;

/**
 * 排班记录
 * @author habibliu
 *
 */
public class ScheduleDto{
	private String courseId;
	private String coachId;
	private String venueId;
	private Date trainDate;
	private String[] trainTimeSpan;
	private List<ScheduleStudentDto> students;
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
	
	public String[] getTrainTimeSpan() {
		return trainTimeSpan;
	}
	public void setTrainTimeSpan(String[] trainTimeSpan) {
		this.trainTimeSpan = trainTimeSpan;
	}
	public List<ScheduleStudentDto> getStudents() {
		return students;
	}
	public void setStudents(List<ScheduleStudentDto> students) {
		this.students = students;
	}
	public Date getTrainDate() {
		return trainDate;
	}
	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}
	
	
}
