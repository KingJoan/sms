package com.clps.sms.sys.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午11:12:04
 * 
 * @since 1.0
 */
public class Room implements Serializable {

	/**
	 * 会议室编号;会议室名称;会议室描述;创建日期;创建人名;修改日期;修改人名;会议室状态
	 */
	private static final long serialVersionUID = 4009847532770950446L;
	
	private Integer room_id;//ROOM_ID
	private String  room_num;//ROOM_NUM
	private String  room_desc;//ROOM_DESC
	private Integer room_capacity;//ROOM_CAPACITY
	private Integer room_userid;//ROOM_USERID
	private String  room_created_date;//ROOM_CREATED_DATE
	private Integer room_created_name;//ROOM_CREATED_NAME
	private String  room_updated_date;//ROOM_UPDATED_DATE
	private Integer room_updated_name;//ROOM_UPDATED_NAME
	private Integer room_status;//ROOM_STATUS
	public Room(Integer room_id, String room_num, String room_desc, Integer room_capacity, Integer room_userid,
			String room_created_date, Integer room_created_name, String room_updated_date, Integer room_updated_name,
			Integer room_status) {
		super();
		this.room_id = room_id;
		this.room_num = room_num;
		this.room_desc = room_desc;
		this.room_capacity = room_capacity;
		this.room_userid = room_userid;
		this.room_created_date = room_created_date;
		this.room_created_name = room_created_name;
		this.room_updated_date = room_updated_date;
		this.room_updated_name = room_updated_name;
		this.room_status = room_status;
	}
	public Integer getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}
	public String getRoom_num() {
		return room_num;
	}
	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}
	public String getRoom_desc() {
		return room_desc;
	}
	public void setRoom_desc(String room_desc) {
		this.room_desc = room_desc;
	}
	public Integer getRoom_capacity() {
		return room_capacity;
	}
	public void setRoom_capacity(Integer room_capacity) {
		this.room_capacity = room_capacity;
	}
	public Integer getRoom_userid() {
		return room_userid;
	}
	public void setRoom_userid(Integer room_userid) {
		this.room_userid = room_userid;
	}
	public String getRoom_created_date() {
		return room_created_date;
	}
	public void setRoom_created_date(String room_created_date) {
		this.room_created_date = room_created_date;
	}
	public Integer getRoom_created_name() {
		return room_created_name;
	}
	public void setRoom_created_name(Integer room_created_name) {
		this.room_created_name = room_created_name;
	}
	public String getRoom_updated_date() {
		return room_updated_date;
	}
	public void setRoom_updated_date(String room_updated_date) {
		this.room_updated_date = room_updated_date;
	}
	public Integer getRoom_updated_name() {
		return room_updated_name;
	}
	public void setRoom_updated_name(Integer room_updated_name) {
		this.room_updated_name = room_updated_name;
	}
	public Integer getRoom_status() {
		return room_status;
	}
	public void setRoom_status(Integer room_status) {
		this.room_status = room_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", room_num=" + room_num + ", room_desc=" + room_desc + ", room_capacity="
				+ room_capacity + ", room_userid=" + room_userid + ", room_created_date=" + room_created_date
				+ ", room_created_name=" + room_created_name + ", room_updated_date=" + room_updated_date
				+ ", room_updated_name=" + room_updated_name + ", room_status=" + room_status + "]";
	}
	
	
}
