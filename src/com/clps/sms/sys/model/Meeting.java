package com.clps.sms.sys.model;

import java.io.Serializable;

/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午9:50:05
 * 
 * @since 1.0
 */
public class Meeting implements Serializable{

	/**
	 * 会议编号;会议名称;会议起始时间;会议结束时间;会议描述;会议室编号;设备编号;创建日期;创建人名;修改日期;修改人名;会议状态
	 */
	private static final long serialVersionUID = 8155371201154891807L;
	
	private Integer mee_id;//MEE_ID
	private String mee_name;//MEE_NAME
	private String mee_start_date;//MEE_START_DATE
	private String mee_end_date;//MEE_END_DATE
	private String mee_room_id;//MEE_ROOM_ID
	private String mee_host;//MEE_HOST
	private String mee_equ_ids;//MEE_EQU_IDS
	private String mee_desc;//MEE_DESC
	private String mee_created_date;//MEE_CREATED_DATE
	private Integer mee_created_name;//MEE_CREATED_NAME
	private String mee_updated_date;//MEE_UPDATED_DATE
	private Integer mee_updated_name;//MEE_UPDATED_NAME
	private Integer mee_status;//MEE_STATUS
	public Meeting(Integer mee_id, String mee_name, String mee_start_date, String mee_end_date, String mee_room_id,
			String mee_host, String mee_equ_ids, String mee_desc, String mee_created_date, Integer mee_created_name,
			String mee_updated_date, Integer mee_updated_name, Integer mee_status) {
		super();
		this.mee_id = mee_id;
		this.mee_name = mee_name;
		this.mee_start_date = mee_start_date;
		this.mee_end_date = mee_end_date;
		this.mee_room_id = mee_room_id;
		this.mee_host = mee_host;
		this.mee_equ_ids = mee_equ_ids;
		this.mee_desc = mee_desc;
		this.mee_created_date = mee_created_date;
		this.mee_created_name = mee_created_name;
		this.mee_updated_date = mee_updated_date;
		this.mee_updated_name = mee_updated_name;
		this.mee_status = mee_status;
	}
	public Integer getMee_id() {
		return mee_id;
	}
	public void setMee_id(Integer mee_id) {
		this.mee_id = mee_id;
	}
	public String getMee_name() {
		return mee_name;
	}
	public void setMee_name(String mee_name) {
		this.mee_name = mee_name;
	}
	public String getMee_start_date() {
		return mee_start_date;
	}
	public void setMee_start_date(String mee_start_date) {
		this.mee_start_date = mee_start_date;
	}
	public String getMee_end_date() {
		return mee_end_date;
	}
	public void setMee_end_date(String mee_end_date) {
		this.mee_end_date = mee_end_date;
	}
	public String getMee_room_id() {
		return mee_room_id;
	}
	public void setMee_room_id(String mee_room_id) {
		this.mee_room_id = mee_room_id;
	}
	public String getMee_host() {
		return mee_host;
	}
	public void setMee_host(String mee_host) {
		this.mee_host = mee_host;
	}
	public String getMee_equ_ids() {
		return mee_equ_ids;
	}
	public void setMee_equ_ids(String mee_equ_ids) {
		this.mee_equ_ids = mee_equ_ids;
	}
	public String getMee_desc() {
		return mee_desc;
	}
	public void setMee_desc(String mee_desc) {
		this.mee_desc = mee_desc;
	}
	public String getMee_created_date() {
		return mee_created_date;
	}
	public void setMee_created_date(String mee_created_date) {
		this.mee_created_date = mee_created_date;
	}
	public Integer getMee_created_name() {
		return mee_created_name;
	}
	public void setMee_created_name(Integer mee_created_name) {
		this.mee_created_name = mee_created_name;
	}
	public String getMee_updated_date() {
		return mee_updated_date;
	}
	public void setMee_updated_date(String mee_updated_date) {
		this.mee_updated_date = mee_updated_date;
	}
	public Integer getMee_updated_name() {
		return mee_updated_name;
	}
	public void setMee_updated_name(Integer mee_updated_name) {
		this.mee_updated_name = mee_updated_name;
	}
	public Integer getMee_status() {
		return mee_status;
	}
	public void setMee_status(Integer mee_status) {
		this.mee_status = mee_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Meeting [mee_id=" + mee_id + ", mee_name=" + mee_name + ", mee_start_date=" + mee_start_date
				+ ", mee_end_date=" + mee_end_date + ", mee_room_id=" + mee_room_id + ", mee_host=" + mee_host
				+ ", mee_equ_ids=" + mee_equ_ids + ", mee_desc=" + mee_desc + ", mee_created_date=" + mee_created_date
				+ ", mee_created_name=" + mee_created_name + ", mee_updated_date=" + mee_updated_date
				+ ", mee_updated_name=" + mee_updated_name + ", mee_status=" + mee_status + "]";
	}

	
}
