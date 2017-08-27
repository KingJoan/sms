package com.clps.sms.sys.model;

import java.io.Serializable;

/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午9:15:09
 * 
 * @since 1.0
 */
public class Account_Meeting implements Serializable{

	/**
	 * 员工会议编号；员工会议名称；员工会议描述；员工编号；会议编号；创建日期；创建人名；修改日期；修改人名；员工会议状态
	 */
	private static final long serialVersionUID = 4464567270598951059L;
	
	private Integer am_id;//AM_ID
	private String am_name;//AM_NAME
	private String am_dec;//AM_DEC
	private Integer am_acc_id;//AM_ACC_ID
	private Integer am_mee_id;//AM_MEE_ID
	private String am_created_date;//AM_CREATED_DATE
	private Integer am_created_name;//AM_CREATED_NAME
	private String am_updated_date;//AM_UPDATED_DATE
	private Integer am_updated_name;//AM_UPDATED_NAME
	private Integer am_status;//AM_STATUS
	public Account_Meeting(Integer am_id, String am_name, String am_dec, Integer am_acc_id, Integer am_mee_id,
			String am_created_date, Integer am_created_name, String am_updated_date, Integer am_updated_name,
			Integer am_status) {
		super();
		this.am_id = am_id;
		this.am_name = am_name;
		this.am_dec = am_dec;
		this.am_acc_id = am_acc_id;
		this.am_mee_id = am_mee_id;
		this.am_created_date = am_created_date;
		this.am_created_name = am_created_name;
		this.am_updated_date = am_updated_date;
		this.am_updated_name = am_updated_name;
		this.am_status = am_status;
	}
	public Integer getAm_id() {
		return am_id;
	}
	public void setAm_id(Integer am_id) {
		this.am_id = am_id;
	}
	public String getAm_name() {
		return am_name;
	}
	public void setAm_name(String am_name) {
		this.am_name = am_name;
	}
	public String getAm_dec() {
		return am_dec;
	}
	public void setAm_dec(String am_dec) {
		this.am_dec = am_dec;
	}
	public Integer getAm_acc_id() {
		return am_acc_id;
	}
	public void setAm_acc_id(Integer am_acc_id) {
		this.am_acc_id = am_acc_id;
	}
	public Integer getAm_mee_id() {
		return am_mee_id;
	}
	public void setAm_mee_id(Integer am_mee_id) {
		this.am_mee_id = am_mee_id;
	}
	public String getAm_created_date() {
		return am_created_date;
	}
	public void setAm_created_date(String am_created_date) {
		this.am_created_date = am_created_date;
	}
	public Integer getAm_created_name() {
		return am_created_name;
	}
	public void setAm_created_name(Integer am_created_name) {
		this.am_created_name = am_created_name;
	}
	public String getAm_updated_date() {
		return am_updated_date;
	}
	public void setAm_updated_date(String am_updated_date) {
		this.am_updated_date = am_updated_date;
	}
	public Integer getAm_updated_name() {
		return am_updated_name;
	}
	public void setAm_updated_name(Integer am_updated_name) {
		this.am_updated_name = am_updated_name;
	}
	public Integer getAm_status() {
		return am_status;
	}
	public void setAm_status(Integer am_status) {
		this.am_status = am_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccountMeeting [am_id=" + am_id + ", am_name=" + am_name + ", am_dec=" + am_dec + ", am_acc_id="
				+ am_acc_id + ", am_mee_id=" + am_mee_id + ", am_created_date=" + am_created_date + ", am_created_name="
				+ am_created_name + ", am_updated_date=" + am_updated_date + ", am_updated_name=" + am_updated_name
				+ ", am_status=" + am_status + "]";
	}
	
	
	
}
