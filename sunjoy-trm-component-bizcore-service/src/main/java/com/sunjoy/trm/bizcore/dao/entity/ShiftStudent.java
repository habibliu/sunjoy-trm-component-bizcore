package com.sunjoy.trm.bizcore.dao.entity;

import com.sunjoy.framework.dao.BaseEntity;

public class ShiftStudent extends BaseEntity{
	private String shiftId;
	private String studentId;
	private String checkingIn;
	public String getShiftId() {
		return shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCheckingIn() {
		return checkingIn;
	}
	public void setCheckingIn(String checkingIn) {
		this.checkingIn = checkingIn;
	}
}
