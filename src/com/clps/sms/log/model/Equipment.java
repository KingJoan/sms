package com.clps.sms.log.model;

import java.io.Serializable;

/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午9:32:13
 * 
 * @since 1.0
 */
public class Equipment implements Serializable {

	/**
	 * 设备编号;设备名称;设备描述;创建日期;创建人名;修改日期;修改人名;设备状态
	 */
	private static final long serialVersionUID = -6089659761284565832L;
	
	private Integer equ_id;//EQU_ID
	private String equ_name;//EQU_NAME
	private String equ_desc;//EQU_DESC
	private String equ_created_date;//EQU_CREATED_DATE
	private String equ_created_name;//EQU_CREATED_NAME
	private String equ_updated_date;//EQU_UPDATED_DATE
	private String equ_updated_name;//EQU_UPDATED_NAME
	private String equ_status;//EQU_STATUS
	public Equipment(Integer equ_id, String equ_name, String equ_desc, String equ_created_date, String equ_created_name,
			String equ_updated_date, String equ_updated_name, String equ_status) {
		super();
		this.equ_id = equ_id;
		this.equ_name = equ_name;
		this.equ_desc = equ_desc;
		this.equ_created_date = equ_created_date;
		this.equ_created_name = equ_created_name;
		this.equ_updated_date = equ_updated_date;
		this.equ_updated_name = equ_updated_name;
		this.equ_status = equ_status;
	}
	public Integer getEqu_id() {
		return equ_id;
	}
	public void setEqu_id(Integer equ_id) {
		this.equ_id = equ_id;
	}
	public String getEqu_name() {
		return equ_name;
	}
	public void setEqu_name(String equ_name) {
		this.equ_name = equ_name;
	}
	public String getEqu_desc() {
		return equ_desc;
	}
	public void setEqu_desc(String equ_desc) {
		this.equ_desc = equ_desc;
	}
	public String getEqu_created_date() {
		return equ_created_date;
	}
	public void setEqu_created_date(String equ_created_date) {
		this.equ_created_date = equ_created_date;
	}
	public String getEqu_created_name() {
		return equ_created_name;
	}
	public void setEqu_created_name(String equ_created_name) {
		this.equ_created_name = equ_created_name;
	}
	public String getEqu_updated_date() {
		return equ_updated_date;
	}
	public void setEqu_updated_date(String equ_updated_date) {
		this.equ_updated_date = equ_updated_date;
	}
	public String getEqu_updated_name() {
		return equ_updated_name;
	}
	public void setEqu_updated_name(String equ_updated_name) {
		this.equ_updated_name = equ_updated_name;
	}
	public String getEqu_status() {
		return equ_status;
	}
	public void setEqu_status(String equ_status) {
		this.equ_status = equ_status;
	}
	
	@Override
	public String toString() {
		return "Equipment [equ_id=" + equ_id + ", equ_name=" + equ_name + ", equ_desc=" + equ_desc
				+ ", equ_created_date=" + equ_created_date + ", equ_created_name=" + equ_created_name
				+ ", equ_updated_date=" + equ_updated_date + ", equ_updated_name=" + equ_updated_name + ", equ_status="
				+ equ_status + "]";
	}
	
	
	
}
