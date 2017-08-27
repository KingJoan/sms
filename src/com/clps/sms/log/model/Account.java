package com.clps.sms.log.model;

import java.io.Serializable;

/**
 *
 * @author dell
 *
 * 2017年8月24日 下午6:16:32
 * 
 * @since 1.0
 */
public class Account implements Serializable{
	/**
	 *账户编号;账户名称;账户密码;账户人名;账户邮箱;账户电话;账户描述;角色编号;创建日期;创建人名;修改日期;修改人名;账户状态	 *
	 */
	private static final long serialVersionUID = 6910679447197118282L;
	
	private Integer acc_id;//ACC_ID
	private String acc_logon_name;//ACC_LOGON_NAME
	private String acc_password;//ACC_PASSWORD
	private String acc_name;//ACC_NAME
	private String acc_email;//ACC_EMAIL
	private String acc_mobile;//ACC_MOBILE
	private String acc_dec;//ACC_DEC
	private Integer acc_role_id;//ACC_ROLE_ID
	private String acc_created_date;//ACC_CREATED_DATE
	private Integer acc_created_name;//ACC_CREATED_NAME
	private String acc_updated_date;//ACC_UPDATED_DATE
	private Integer acc_updated_name;//ACC_UPDATED_NAME
	private Integer acc_status;//ACC_STATUS
	
	
	
	public Account(Integer acc_id, String acc_logon_name, String acc_password, String acc_name, String acc_email,
			String acc_mobile, String acc_dec, Integer acc_role_id, String acc_created_date, Integer acc_created_name,
			String acc_updated_date, Integer acc_updated_name, Integer acc_status) {
		super();
		this.acc_id = acc_id;
		this.acc_logon_name = acc_logon_name;
		this.acc_password = acc_password;
		this.acc_name = acc_name;
		this.acc_email = acc_email;
		this.acc_mobile = acc_mobile;
		this.acc_dec = acc_dec;
		this.acc_role_id = acc_role_id;
		this.acc_created_date = acc_created_date;
		this.acc_created_name = acc_created_name;
		this.acc_updated_date = acc_updated_date;
		this.acc_updated_name = acc_updated_name;
		this.acc_status = acc_status;
	}
	public Integer getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(Integer acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_logon_name() {
		return acc_logon_name;
	}
	public void setAcc_logon_name(String acc_logon_name) {
		this.acc_logon_name = acc_logon_name;
	}
	public String getAcc_password() {
		return acc_password;
	}
	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_email() {
		return acc_email;
	}
	public void setAcc_email(String acc_email) {
		this.acc_email = acc_email;
	}
	public String getAcc_mobile() {
		return acc_mobile;
	}
	public void setAcc_mobile(String acc_mobile) {
		this.acc_mobile = acc_mobile;
	}
	public String getAcc_dec() {
		return acc_dec;
	}
	public void setAcc_dec(String acc_dec) {
		this.acc_dec = acc_dec;
	}
	public Integer getAcc_role_id() {
		return acc_role_id;
	}
	public void setAcc_role_id(Integer acc_role_id) {
		this.acc_role_id = acc_role_id;
	}
	public String getAcc_created_date() {
		return acc_created_date;
	}
	public void setAcc_created_date(String acc_created_date) {
		this.acc_created_date = acc_created_date;
	}
	public Integer getAcc_created_name() {
		return acc_created_name;
	}
	public void setAcc_created_name(Integer acc_created_name) {
		this.acc_created_name = acc_created_name;
	}
	public String getAcc_updated_date() {
		return acc_updated_date;
	}
	public void setAcc_updated_date(String acc_updated_date) {
		this.acc_updated_date = acc_updated_date;
	}
	public Integer getAcc_updated_name() {
		return acc_updated_name;
	}
	public void setAcc_updated_name(Integer acc_updated_name) {
		this.acc_updated_name = acc_updated_name;
	}
	public Integer getAcc_status() {
		return acc_status;
	}
	
	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", acc_logon_name=" + acc_logon_name + ", acc_password=" + acc_password
				+ ", acc_name=" + acc_name + ", acc_email=" + acc_email + ", acc_mobile=" + acc_mobile + ", acc_dec="
				+ acc_dec + ", acc_role_id=" + acc_role_id + ", acc_created_date=" + acc_created_date
				+ ", acc_created_name=" + acc_created_name + ", acc_updated_date=" + acc_updated_date
				+ ", acc_updated_name=" + acc_updated_name + ", acc_status=" + acc_status + "]";
	}
	
	
	
}
