package com.clps.sms.log.model;

import java.io.Serializable;

public class PermissionLog implements Serializable {

	/**
	 * 许可日志编号;许可日志操作;许可日志操作内容;许可日志操作日期;许可日志操作人名;许可日志类别
	 */
	private static final long serialVersionUID = -8044085582989425935L;
	
	private Integer pl_id;//PL_ID
	private String pl_action;//PL_ACTION
	private String pl_action_content;//PL_ACTION_CONTENT
	private String pl_created_date;//PL_CREATED_DATE
	private Integer pl_created_id;//PL_CREATED_ID
	private String pl_type;//PL_TYPE
	private String acc_name;//ACC_NAME
	public PermissionLog(Integer pl_id, String pl_action, String pl_action_content, String pl_created_date,
			Integer pl_created_id, String pl_type) {
		super();
		this.pl_id = pl_id;
		this.pl_action = pl_action;
		this.pl_action_content = pl_action_content;
		this.pl_created_date = pl_created_date;
		this.pl_created_id = pl_created_id;
		this.pl_type = pl_type;
	}
	public Integer getPl_id() {
		return pl_id;
	}
	public void setPl_id(Integer pl_id) {
		this.pl_id = pl_id;
	}
	public String getPl_action() {
		return pl_action;
	}
	public void setPer_action(String pl_action) {
		this.pl_action = pl_action;
	}
	public String getPl_action_content() {
		return pl_action_content;
	}
	public void setPl_action_content(String pl_action_content) {
		this.pl_action_content = pl_action_content;
	}
	public String getPl_created_date() {
		return pl_created_date;
	}
	public void setPl_created_date(String pl_created_date) {
		this.pl_created_date = pl_created_date;
	}
	public Integer getPl_created_id() {
		return pl_created_id;
	}
	public void setPl_created_id(Integer pl_created_id) {
		this.pl_created_id = pl_created_id;
	}
	public String getPl_type() {
		return pl_type;
	}
	public void setPl_type(String pl_type) {
		this.pl_type = pl_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PermissionLog [pl_id=" + pl_id + ", per_action=" + pl_action + ", pl_action_content="
				+ pl_action_content + ", pl_created_date=" + pl_created_date + ", pl_created_id=" + pl_created_id
				+ ", pl_type=" + pl_type + ", acc_name=" + acc_name + "]";
	}
	
	

	
}
