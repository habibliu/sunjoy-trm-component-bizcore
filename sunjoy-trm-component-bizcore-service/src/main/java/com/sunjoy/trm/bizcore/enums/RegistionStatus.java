package com.sunjoy.trm.bizcore.enums;
/**
 *
 * @author liuganchao<740033486@qq.com>
 * @date 2018年7月5日
 */
public enum RegistionStatus {
	DRAFT("DRAFT"),
	CONFIRMED("CONFIRMED"),
	DELETED("DELETED");
	
	private String value="";
	
	RegistionStatus(String value){
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}
}
