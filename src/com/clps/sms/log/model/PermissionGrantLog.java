package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:48:46
 * 
 * @since 1.0
 */
public class PermissionGrantLog implements Serializable {

	/**
	 * 授予日志编号;授予日志操作;授予日志操作内容;授予日志操作日期;授予日志操作人名;授予日志类别
	 */
	private static final long serialVersionUID = 257978911800999727L;
	private Integer pgl_id;//PGL_ID
	private String  pgl_action;//PGL_ACTION
	private String  pgl_action_content;//PGL_ACTION_CONTENT
	private String  pgl_created_date;//PGL_CREATED_DATE
	private Integer  pgl_created_id;//PGL_CREATED_ID
	private String  pgl_type;//PGL_TYPE
	private String acc_name;//ACC_NAME
	
	
	public PermissionGrantLog() {
		super();
	}
	public PermissionGrantLog(Integer pgl_id, String pgl_action, String pgl_action_content, String pgl_created_date,
			Integer pgl_created_id, String pgl_type) {
		super();
		this.pgl_id = pgl_id;
		this.pgl_action = pgl_action;
		this.pgl_action_content = pgl_action_content;
		this.pgl_created_date = pgl_created_date;
		this.pgl_created_id = pgl_created_id;
		this.pgl_type = pgl_type;
	}
	public Integer getPgl_id() {
		return pgl_id;
	}
	public void setPgl_id(Integer pgl_id) {
		this.pgl_id = pgl_id;
	}
	public String getPgl_action() {
		return pgl_action;
	}
	public void setPgl_action(String pgl_action) {
		this.pgl_action = pgl_action;
	}
	public String getPgl_action_content() {
		return pgl_action_content;
	}
	public void setPgl_action_content(String pgl_action_content) {
		this.pgl_action_content = pgl_action_content;
	}
	public String getPgl_created_date() {
		return pgl_created_date;
	}
	public void setPgl_created_date(String pgl_created_date) {
		this.pgl_created_date = pgl_created_date;
	}
	public Integer getPgl_created_id() {
		return pgl_created_id;
	}
	public void setPgl_created_id(Integer pgl_created_id) {
		this.pgl_created_id = pgl_created_id;
	}
	public String getPgl_type() {
		return pgl_type;
	}
	public void setPgl_type(String pgl_type) {
		this.pgl_type = pgl_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Permission_Grant_Log [pgl_id=" + pgl_id + ", pgl_action=" + pgl_action + ", pgl_action_content="
				+ pgl_action_content + ", pgl_created_date=" + pgl_created_date + ", pgl_created_id=" + pgl_created_id
				+ ", pgl_type=" + pgl_type + "]";
	}
	
	
	
}
