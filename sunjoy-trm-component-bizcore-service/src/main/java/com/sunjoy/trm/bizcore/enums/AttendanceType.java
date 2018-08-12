package com.sunjoy.trm.bizcore.enums;

/**
 * 考勤类型
 * @author habibliu
 *
 */
public enum AttendanceType {
	
	NORMAL("NORMAL"),
	LEAVE("LEAVE"),
	ABSENT("ABSENT");
	
	private String value="";
	
	AttendanceType(String value){
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}
}
