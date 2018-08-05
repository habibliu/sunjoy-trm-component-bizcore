package com.sunjoy.trm.bizcore.dao.entity;

import java.util.Date;

import com.sunjoy.framework.dao.BaseEntity;

/**
 * 课程登记
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
public class Registion  extends BaseEntity{
	/**
	 * 登记号码
	 */
	private String registionNo;
	
	/**
	 * 登记日期
	 */
	private Date registerDate;
	
	/**
	 * 学员ID
	 */
	private String studentId;
	
	/**
	 * 课程ID
	 */
	private String courseId;
	/**
	 * 报读期数
	 */
	private Integer periods;
	/**
	 * 总节数
	 */
	private Integer totalSections;
	/**
	 * 赠送课程
	 */
	private Integer attachSections;
	/**
	 * 总费用
	 */
	private Integer totalFee;
	/**
	 * 是否已支付
	 */
	private Integer payoff;
	/**
	 * 支付方式
	 */
	private String paymentMode;
	/**
	 * 支付日期
	 */
	private Date paymentDate;
	/**
	 * 备注
	 */
	private String memo;
	
	private String status;
	/**
	 * 已排班节数
	 */
	private Integer arrangedSections;
	
	
	public String getRegistionNo() {
		return registionNo;
	}
	public void setRegistionNo(String registionNo) {
		this.registionNo = registionNo;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Integer getPeriods() {
		return periods;
	}
	public void setPeriods(Integer periods) {
		this.periods = periods;
	}
	public Integer getTotalSections() {
		return totalSections;
	}
	public void setTotalSections(Integer totalSections) {
		this.totalSections = totalSections;
	}
	public Integer getAttachSections() {
		return attachSections;
	}
	public void setAttachSections(Integer attachSections) {
		this.attachSections = attachSections;
	}
	public Integer getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}
	public Integer isPayoff() {
		return payoff;
	}
	public void setPayoff(Integer payoff) {
		this.payoff = payoff;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getArrangedSections() {
		return arrangedSections;
	}
	public void setArrangedSections(Integer arrangedSections) {
		this.arrangedSections = arrangedSections;
	}
}
