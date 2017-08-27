package com.clps.sms.log.model;

import java.io.Serializable;

public class LoginLogs implements Serializable {

	/**
	 * ID;IP地址;地址;登陆时间;退出时间;保留域1;保留域2;用户ID
	 */
	private static final long serialVersionUID = 7242766677267104769L;
	
	private Integer logs_id;//LOGS_ID
	private String ip;//IP
	private String ip_area;//IP_AREA
	private String session;//SESSION
	private String login_time;//LOGIN_TIME
	private String cancel_time;//CANCEL_TIME
	private String default1;//DEFAULT1
	private String default2;//DEFAULT2
	private String user_id;//USER_ID
	private String acc_name;//ACC_NAME
	public LoginLogs(Integer logs_id, String ip, String ip_area, String session, String login_time, String cancel_time,
			String default1, String default2, String user_id) {
		super();
		this.logs_id = logs_id;
		this.ip = ip;
		this.ip_area = ip_area;
		this.session = session;
		this.login_time = login_time;
		this.cancel_time = cancel_time;
		this.default1 = default1;
		this.default2 = default2;
		this.user_id = user_id;
	}
	public Integer getLogs_id() {
		return logs_id;
	}
	public void setLogs_id(Integer logs_id) {
		this.logs_id = logs_id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp_area() {
		return ip_area;
	}
	public void setIp_area(String ip_area) {
		this.ip_area = ip_area;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public String getCancel_time() {
		return cancel_time;
	}
	public void setCancel_time(String cancel_time) {
		this.cancel_time = cancel_time;
	}
	public String getDefault1() {
		return default1;
	}
	public void setDefault1(String default1) {
		this.default1 = default1;
	}
	public String getDefault2() {
		return default2;
	}
	public void setDefault2(String default2) {
		this.default2 = default2;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	@Override
	public String toString() {
		return "Login_Logs [logs_id=" + logs_id + ", ip=" + ip + ", ip_area=" + ip_area + ", session=" + session
				+ ", login_time=" + login_time + ", cancel_time=" + cancel_time + ", default1=" + default1
				+ ", default2=" + default2 + ", user_id=" + user_id + "]";
	}
	
	
}
