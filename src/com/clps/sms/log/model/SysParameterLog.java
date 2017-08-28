package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午11:30:31
 * 
 * @since 1.0
 */
public class SysParameterLog implements Serializable {

	/**
	 * 系统参数日志编号;系统参数日志操作;系统参数日志操作内容;系统参数日志操作日期;系统参数日志操作人名;系统参数日志类别
	 */
	private static final long serialVersionUID = -4123449813672500910L;
	
	private Integer spl_id;//SPL_ID
	private String spl_action;//SPL_ACTION
	private String spl_action_content;//SPL_ACTION_CONTENT
	private String spl_created_date;//SPL_CREATED_DATE
	private Integer spl_created_id;//SPL_CREATED_ID
	private String spl_type;//SPL_TYPE
	private String acc_name;//ACC_NAME
	
	
	public SysParameterLog() {
		super();
	}
	public SysParameterLog(Integer spl_id, String spl_action, String spl_action_content, String spl_created_date,
			Integer spl_created_id, String spl_type) {
		super();
		this.spl_id = spl_id;
		this.spl_action = spl_action;
		this.spl_action_content = spl_action_content;
		this.spl_created_date = spl_created_date;
		this.spl_created_id = spl_created_id;
		this.spl_type = spl_type;
	}
	public Integer getSpl_id() {
		return spl_id;
	}
	public void setSpl_id(Integer spl_id) {
		this.spl_id = spl_id;
	}
	public String getSpl_action() {
		return spl_action;
	}
	public void setSpl_action(String spl_action) {
		this.spl_action = spl_action;
	}
	public String getSpl_action_content() {
		return spl_action_content;
	}
	public void setSpl_action_content(String spl_action_content) {
		this.spl_action_content = spl_action_content;
	}
	public String getSpl_created_date() {
		return spl_created_date;
	}
	public void setSpl_created_date(String spl_created_date) {
		this.spl_created_date = spl_created_date;
	}
	public Integer getSpl_created_id() {
		return spl_created_id;
	}
	public void setSpl_created_id(Integer spl_created_id) {
		this.spl_created_id = spl_created_id;
	}
	public String getSpl_type() {
		return spl_type;
	}
	public void setSpl_type(String spl_type) {
		this.spl_type = spl_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Sys_Parameter_Log [spl_id=" + spl_id + ", spl_action=" + spl_action + ", spl_action_content="
				+ spl_action_content + ", spl_created_date=" + spl_created_date + ", spl_created_id=" + spl_created_id
				+ ", spl_type=" + spl_type + "]";
	}
	
	
	
}
