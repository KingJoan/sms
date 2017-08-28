package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:59:15
 * 
 * @since 1.0
 */
public class RoleLog implements Serializable {

	/**
	 * 角色日志编号;角色日志操作;角色日志操作内容;角色日志操作日期;角色日志操作人名;角色日志类别
	 */
	private static final long serialVersionUID = -4474125666291282528L;
	
	private Integer rl_id;//RL_ID
	private String rl_action;//RL_ACTION
	private String rl_action_content;//RL_ACTION_CONTENT
	private String rl_created_date;//RL_CREATED_DATE
	private Integer rl_created_id;//RL_CREATED_ID
	private String rl_type;//RL_TYPE
	private String acc_name;//ACC_NAME
	
	
	public RoleLog() {
		super();
	}
	public RoleLog(Integer rl_id, String rl_action, String rl_action_content, String rl_created_date,
			Integer rl_created_id, String rl_type) {
		super();
		this.rl_id = rl_id;
		this.rl_action = rl_action;
		this.rl_action_content = rl_action_content;
		this.rl_created_date = rl_created_date;
		this.rl_created_id = rl_created_id;
		this.rl_type = rl_type;
	}
	public Integer getRl_id() {
		return rl_id;
	}
	public void setRl_id(Integer rl_id) {
		this.rl_id = rl_id;
	}
	public String getRl_action() {
		return rl_action;
	}
	public void setRl_action(String rl_action) {
		this.rl_action = rl_action;
	}
	public String getRl_action_content() {
		return rl_action_content;
	}
	public void setRl_action_content(String rl_action_content) {
		this.rl_action_content = rl_action_content;
	}
	public String getRl_created_date() {
		return rl_created_date;
	}
	public void setRl_created_date(String rl_created_date) {
		this.rl_created_date = rl_created_date;
	}
	public Integer getRl_created_id() {
		return rl_created_id;
	}
	public void setRl_created_id(Integer rl_created_id) {
		this.rl_created_id = rl_created_id;
	}
	public String getRl_type() {
		return rl_type;
	}
	public void setRl_type(String rl_type) {
		this.rl_type = rl_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Role_Log [rl_id=" + rl_id + ", rl_action=" + rl_action + ", rl_action_content=" + rl_action_content
				+ ", rl_created_date=" + rl_created_date + ", rl_created_id=" + rl_created_id + ", rl_type=" + rl_type
				+ "]";
	}
	
	
	
}
