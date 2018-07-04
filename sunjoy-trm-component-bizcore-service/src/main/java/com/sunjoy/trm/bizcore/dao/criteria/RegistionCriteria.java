package com.sunjoy.trm.bizcore.dao.criteria;

import java.util.Date;

import com.sunjoy.trm.bizcore.dao.entity.Registion;

/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public class RegistionCriteria extends Registion{
	private String studentCode;
	private String studentName;
	private Date birthDate;
	private Short sex;
	private Integer height;
	private String school;
	private String phone;
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
}
