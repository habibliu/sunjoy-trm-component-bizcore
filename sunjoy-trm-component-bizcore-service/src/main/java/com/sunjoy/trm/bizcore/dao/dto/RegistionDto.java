package com.sunjoy.trm.bizcore.dao.dto;

import java.util.Date;

import com.sunjoy.trm.bizcore.dao.entity.Registion;

public class RegistionDto extends Registion{
	//学员属性
	private String studentCode;
	private String studentName;
	private Date birthDate;
	private Short sex;
	private Integer height;
	private String school;
	private String phone;
	private String address;
	private String image;
	
	private String parentName;
	private Short parentSex;
	private String parentPhone;
	private String parentWx;
	//课程属性
	private String courseName;//课程名
	private Integer courseLevel;//级别
	private Integer coursePhase;//阶段
	private Integer ageGradeStart;//年龄阶段开始
	private Integer ageGradeEnd;//年龄阶段结束
	private Integer numberPerTerm;//每期节数
	private Integer pricePerTerm;//每期学费
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Short getSex() {
		return sex;
	}
	public void setSex(Short sex) {
		this.sex = sex;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public Short getParentSex() {
		return parentSex;
	}
	public void setParentSex(Short parentSex) {
		this.parentSex = parentSex;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	public String getParentWx() {
		return parentWx;
	}
	public void setParentWx(String parentWx) {
		this.parentWx = parentWx;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String name) {
		this.courseName = name;
	}
	public Integer getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(Integer level) {
		this.courseLevel = level;
	}
	public Integer getCoursePhase() {
		return coursePhase;
	}
	public void setCoursePhase(Integer phase) {
		this.coursePhase = phase;
	}
	public Integer getAgeGradeStart() {
		return ageGradeStart;
	}
	public void setAgeGradeStart(Integer ageGradeStart) {
		this.ageGradeStart = ageGradeStart;
	}
	public Integer getAgeGradeEnd() {
		return ageGradeEnd;
	}
	public void setAgeGradeEnd(Integer ageGradeEnd) {
		this.ageGradeEnd = ageGradeEnd;
	}
	public Integer getNumberPerTerm() {
		return numberPerTerm;
	}
	public void setNumberPerTerm(Integer numberPerTerm) {
		this.numberPerTerm = numberPerTerm;
	}
	public Integer getPricePerTerm() {
		return pricePerTerm;
	}
	public void setPricePerTerm(Integer pricePerTerm) {
		this.pricePerTerm = pricePerTerm;
	}

}
