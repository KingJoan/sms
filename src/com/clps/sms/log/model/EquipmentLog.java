package com.clps.sms.log.model;

import java.io.Serializable;

public class EquipmentLog implements Serializable {

	/**
	 * 设备日志编号;设备日志操作;设备日志操作内容;设备日志操作日期;设备日志操作人名;设备日志类别
	 */
	private static final long serialVersionUID = 1763974094773819391L;
	
	private Integer el_id;//EL_ID
	private String el_action;//EL_ACTION
	private String el_action_content;//EL_ACTION_CONTENT
	private String el_created_date;//EL_CREATED_DATE
	private Integer el_created_id;//EL_CREATED_ID
	private String el_type;//EL_TYPE
	private String acc_name;//ACC_NAME
	
	
	public EquipmentLog() {
		super();
	}
	public EquipmentLog(Integer el_id, String el_action, String el_action_content, String el_created_date,
			Integer el_created_id, String el_type) {
		super();
		this.el_id = el_id;
		this.el_action = el_action;
		this.el_action_content = el_action_content;
		this.el_created_date = el_created_date;
		this.el_created_id = el_created_id;
		this.el_type = el_type;
	}
	public Integer getEl_id() {
		return el_id;
	}
	public void setEl_id(Integer el_id) {
		this.el_id = el_id;
	}
	public String getEl_action() {
		return el_action;
	}
	public void setEl_action(String el_action) {
		this.el_action = el_action;
	}
	public String getEl_action_content() {
		return el_action_content;
	}
	public void setEl_action_content(String el_action_content) {
		this.el_action_content = el_action_content;
	}
	public String getEl_created_date() {
		return el_created_date;
	}
	public void setEl_created_date(String el_created_date) {
		this.el_created_date = el_created_date;
	}
	public Integer getEl_created_id() {
		return el_created_id;
	}
	public void setEl_created_id(Integer el_created_id) {
		this.el_created_id = el_created_id;
	}
	public String getEl_type() {
		return el_type;
	}
	public void setEl_type(String el_type) {
		this.el_type = el_type;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Equipment_Log [el_id=" + el_id + ", el_action=" + el_action + ", el_action_content=" + el_action_content
				+ ", el_created_date=" + el_created_date + ", el_created_id=" + el_created_id + ", el_type=" + el_type
				+ "]";
	}
	
	
	
}
