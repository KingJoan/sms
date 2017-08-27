package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:07:40
 * 
 * @since 1.0
 */
public class MenuLog implements Serializable {

	/**
	 * 菜单日志编号;菜单日志操作;菜单日志操作内容;菜单日志操作日期;菜单日志操作人名;菜单日志类别
	 */
	private static final long serialVersionUID = 4083924418661820632L;
	
	private Integer ml_id;//ML_ID
	private String ml_action;//ML_ACTION
	private String ml_action_content;//ML_ACTION_CONTENT
	private String ml_created_date;//ML_CREATED_DATE
	private Integer ml_created_id;//ML_CREATED_ID
	private String ml_type;//ML_TYPE
	private String acc_name;//ACC_NAME
	public MenuLog(Integer ml_id, String ml_action, String ml_action_content, String ml_created_date,
			Integer ml_created_id, String ml_type) {
		super();
		this.ml_id = ml_id;
		this.ml_action = ml_action;
		this.ml_action_content = ml_action_content;
		this.ml_created_date = ml_created_date;
		this.ml_created_id = ml_created_id;
		this.ml_type = ml_type;
	}
	public Integer getMl_id() {
		return ml_id;
	}
	public void setMl_id(Integer ml_id) {
		this.ml_id = ml_id;
	}
	public String getMl_action() {
		return ml_action;
	}
	public void setMl_action(String ml_action) {
		this.ml_action = ml_action;
	}
	public String getMl_action_content() {
		return ml_action_content;
	}
	public void setMl_action_content(String ml_action_content) {
		this.ml_action_content = ml_action_content;
	}
	public String getMl_created_date() {
		return ml_created_date;
	}
	public void setMl_created_date(String ml_created_date) {
		this.ml_created_date = ml_created_date;
	}
	public Integer getMl_created_id() {
		return ml_created_id;
	}
	public void setMl_created_id(Integer ml_created_id) {
		this.ml_created_id = ml_created_id;
	}
	public String getMl_type() {
		return ml_type;
	}
	public void setMl_type(String ml_type) {
		this.ml_type = ml_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Menu_Log [ml_id=" + ml_id + ", ml_action=" + ml_action + ", ml_action_content=" + ml_action_content
				+ ", ml_created_date=" + ml_created_date + ", ml_created_id=" + ml_created_id + ", ml_type=" + ml_type
				+ "]";
	}
	
	
	
	
}
