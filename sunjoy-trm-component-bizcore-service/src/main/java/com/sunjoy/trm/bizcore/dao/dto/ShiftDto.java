package com.sunjoy.trm.bizcore.dao.dto;

import java.util.List;

import com.sunjoy.trm.bizcore.dao.entity.Shift;

public class ShiftDto extends Shift{
	private String courseName;
	private String coachName;
	private String venueName;
	private Integer studentCount;//学员数量
	
	private List<ShiftStudentDto> students;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public List<ShiftStudentDto> getStudents() {
		return students;
	}
	public void setStudents(List<ShiftStudentDto> students) {
		this.students = students;
	}
	public Integer getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}
}
