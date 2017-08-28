package com.clps.sms.log.model;

import java.io.Serializable;

/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午9:26:50
 * 
 * @since 1.0
 */
public class AccountMeetingLog implements Serializable{

	/**
	 * 员工会议日志编号;员工会议日志操作;员工会议日志操作内容;员工会议日志操作日期;员工会议日志操作人名;员工会议日志类别
	 *
	 */
	private static final long serialVersionUID = 4842468091379332004L;
	
	private Integer aml_id;//AML_ID
	private String aml_action;//AML_ACTION
	private String aml_action_content;//AML_ACTION_CONTENT
	private String aml_created_date;//AML_CREATED_DATE
	private Integer aml_created_id;//AML_CREATED_ID
	private String aml_type;//AML_TYPE
	private String acc_name;//ACC_NAME
	
	
	
	public AccountMeetingLog() {
		super();
	}
	public AccountMeetingLog(Integer aml_id, String aml_action, String aml_action_content, String aml_created_date,
			Integer aml_created_id, String aml_type) {
		super();
		this.aml_id = aml_id;
		this.aml_action = aml_action;
		this.aml_action_content = aml_action_content;
		this.aml_created_date = aml_created_date;
		this.aml_created_id = aml_created_id;
		this.aml_type = aml_type;
	}
	public Integer getAml_id() {
		return aml_id;
	}
	public void setAml_id(Integer aml_id) {
		this.aml_id = aml_id;
	}
	public String getAml_action() {
		return aml_action;
	}
	public void setAml_action(String aml_action) {
		this.aml_action = aml_action;
	}
	public String getAml_action_content() {
		return aml_action_content;
	}
	public void setAml_action_content(String aml_action_content) {
		this.aml_action_content = aml_action_content;
	}
	public String getAml_created_date() {
		return aml_created_date;
	}
	public void setAml_created_date(String aml_created_date) {
		this.aml_created_date = aml_created_date;
	}
	public Integer getAml_created_id() {
		return aml_created_id;
	}
	public void setAml_created_id(Integer aml_created_id) {
		this.aml_created_id = aml_created_id;
	}
	public String getAml_type() {
		return aml_type;
	}
	public void setAml_type(String aml_type) {
		this.aml_type = aml_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Account_Meeting_Log [aml_id=" + aml_id + ", aml_action=" + aml_action + ", aml_action_content="
				+ aml_action_content + ", aml_created_date=" + aml_created_date + ", aml_created_id=" + aml_created_id
				+ ", aml_type=" + aml_type + "]";
	}
	
	
}
