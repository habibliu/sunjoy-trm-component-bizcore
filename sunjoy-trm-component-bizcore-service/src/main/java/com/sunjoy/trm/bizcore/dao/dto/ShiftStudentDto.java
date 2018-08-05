package com.sunjoy.trm.bizcore.dao.dto;

import java.util.Date;

import com.sunjoy.trm.bizcore.dao.entity.ShiftStudent;

public class ShiftStudentDto extends ShiftStudent{
	private Date trainDate;

	public Date getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(Date trainDate) {
		this.trainDate = trainDate;
	}
}
