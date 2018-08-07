package com.sunjoy.trm.bizcore.dao.dto;


public class ScheduleStudentDto {
	private String id;
	private String code;
	private String name;
	private Short sex;
	private String phone;
	/**
	 * 总课程节数
	 */
	private Integer totalSections;
	/**
	 * 已排期节数
	 */
	private Integer arrangedSections;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Short getSex() {
		return sex;
	}
	public void setSex(Short sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
