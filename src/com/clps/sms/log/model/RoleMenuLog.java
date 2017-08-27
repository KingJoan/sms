package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午11:08:37
 * 
 * @since 1.0
 */
public class RoleMenuLog implements Serializable {

	/**
	 * 角色菜单日志编号;角色菜单日志操作;角色菜单日志操作内容;角色菜单日志操作日期;角色菜单日志操作人名;角色菜单日志类别
	 */
	private static final long serialVersionUID = -357087914150606658L;
	
	private Integer rml_id;//RML_ID
	private String rml_action;//RML_ACTION
	private String rml_action_content;//RML_ACTION_CONTENT
	private String rml_created_date;//RML_CREATED_DATE
	private Integer rml_created_id;//RML_CREATED_ID
	private String rml_type;//RML_TYPE
	private String acc_name;//ACC_NAME
	public RoleMenuLog(Integer rml_id, String rml_action, String rml_action_content, String rml_created_date,
			Integer rml_created_id, String rml_type) {
		super();
		this.rml_id = rml_id;
		this.rml_action = rml_action;
		this.rml_action_content = rml_action_content;
		this.rml_created_date = rml_created_date;
		this.rml_created_id = rml_created_id;
		this.rml_type = rml_type;
	}
	public Integer getRml_id() {
		return rml_id;
	}
	public void setRml_id(Integer rml_id) {
		this.rml_id = rml_id;
	}
	public String getRml_action() {
		return rml_action;
	}
	public void setRml_action(String rml_action) {
		this.rml_action = rml_action;
	}
	public String getRml_action_content() {
		return rml_action_content;
	}
	public void setRml_action_content(String rml_action_content) {
		this.rml_action_content = rml_action_content;
	}
	public String getRml_created_date() {
		return rml_created_date;
	}
	public void setRml_created_date(String rml_created_date) {
		this.rml_created_date = rml_created_date;
	}
	public Integer getRml_created_id() {
		return rml_created_id;
	}
	public void setRml_created_id(Integer rml_created_id) {
		this.rml_created_id = rml_created_id;
	}
	public String getRml_type() {
		return rml_type;
	}
	public void setRml_type(String rml_type) {
		this.rml_type = rml_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Role_Menu_Log [rml_id=" + rml_id + ", rml_action=" + rml_action + ", rml_action_content="
				+ rml_action_content + ", rml_created_date=" + rml_created_date + ", rml_created_id=" + rml_created_id
				+ ", rml_type=" + rml_type + "]";
	}
	
	
	
}
