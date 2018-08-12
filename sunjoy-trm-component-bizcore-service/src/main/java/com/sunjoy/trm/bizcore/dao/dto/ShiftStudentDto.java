package com.sunjoy.trm.bizcore.dao.dto;

import java.util.Date;

import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;

public class ShiftStudentDto extends ShiftStudent{
	private Date trainDate;
	
	private String studentName;
	
	/**
	 * 总课程节数
	 */
	private Integer totalSections;
	/**
	 * 已排期节数
	 */
	private Integer arrangedSections;
	
	public Date getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getTotalSections() {
		return totalSections;
	}

	public void setTotalSections(Integer totalSections) {
		this.totalSections = totalSections;
	}

	public Integer getArrangedSections() {
		return arrangedSections;
	}

	public void setArrangedSections(Integer arrangedSections) {
		this.arrangedSections = arrangedSections;
	}

}
