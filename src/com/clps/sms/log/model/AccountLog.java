package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午6:27:28
 * 
 * @since 1.0
 */
public class AccountLog implements Serializable{

	/**
	 * 账户日志编号;账户日志操作;账户日志操作内容;账户日志操作日期;账户日志操作人名;账户日志类别	 
	 */
	private static final long serialVersionUID = -1930929850702903985L;
	
	private Integer al_id;//AL_ID
	private String al_action;//AL_ACTION
	private String al_action_content;//AL_ACTION_CONTENT
	private String al_created_date;//AL_CREATED_DATE
	private Integer al_created_id;//AL_CREATED_ID
	private String al_type;//AL_TYPE
	private String acc_name;//ACC_NAME
	
	
	public AccountLog() {
		super();
	}
	public AccountLog(Integer al_id, String al_action, String al_action_content, String al_created_date,
			Integer al_created_id, String al_type) {
		super();
		this.al_id = al_id;
		this.al_action = al_action;
		this.al_action_content = al_action_content;
		this.al_created_date = al_created_date;
		this.al_created_id = al_created_id;
		this.al_type = al_type;
	}
	public Integer getAl_id() {
		return al_id;
	}
	public void setAl_id(Integer al_id) {
		this.al_id = al_id;
	}
	public String getAl_action() {
		return al_action;
	}
	public void setAl_action(String al_action) {
		this.al_action = al_action;
	}
	public String getAl_action_content() {
		return al_action_content;
	}
	public void setAl_action_content(String al_action_content) {
		this.al_action_content = al_action_content;
	}
	public String getAl_created_date() {
		return al_created_date;
	}
	public void setAl_created_date(String al_created_date) {
		this.al_created_date = al_created_date;
	}
	public Integer getAl_created_id() {
		return al_created_id;
	}
	public void setAl_created_id(Integer al_created_id) {
		this.al_created_id = al_created_id;
	}
	public String getAl_type() {
		return al_type;
	}
	public void setAl_type(String al_type) {
		this.al_type = al_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	@Override
	public String toString() {
		return "Account_Log [al_id=" + al_id + ", al_action=" + al_action + ", al_action_content=" + al_action_content
				+ ", al_created_date=" + al_created_date + ", al_created_id=" + al_created_id + ", al_type=" + al_type
				+ "]";
	}
	
	
}
