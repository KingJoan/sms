package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:42:15
 * 
 * @since 1.0
 */
public class PermissionGrant implements Serializable {

	/**
	 * 角色菜单编号;许可编号;授予名称;授予描述;创建日期;创建人名;修改日期;修改人名;授予状态
	 */
	private static final long serialVersionUID = 820676354572721257L;
	
	private Integer pg_rm_id;//PG_RM_ID
	private Integer pg_per_id;//PG_PER_ID
	private String pg_name;//PG_NAME
	private String pg_dec;//PG_DEC
	private String pg_created_date;//PG_CREATED_DATE
	private Integer pg_created_name;//PG_CREATED_NAME
	private String pg_updated_date;//PG_UPDATED_DATE
	private String pg_updated_name;//PG_UPDATED_NAME
	private Integer pg_status;//PG_STATUS
	public PermissionGrant(Integer pg_rm_id, Integer pg_per_id, String pg_name, String pg_dec, String pg_created_date,
			Integer pg_created_name, String pg_updated_date, String pg_updated_name, Integer pg_status) {
		super();
		this.pg_rm_id = pg_rm_id;
		this.pg_per_id = pg_per_id;
		this.pg_name = pg_name;
		this.pg_dec = pg_dec;
		this.pg_created_date = pg_created_date;
		this.pg_created_name = pg_created_name;
		this.pg_updated_date = pg_updated_date;
		this.pg_updated_name = pg_updated_name;
		this.pg_status = pg_status;
	}
	public Integer getPg_rm_id() {
		return pg_rm_id;
	}
	public void setPg_rm_id(Integer pg_rm_id) {
		this.pg_rm_id = pg_rm_id;
	}
	public Integer getPg_per_id() {
		return pg_per_id;
	}
	public void setPg_per_id(Integer pg_per_id) {
		this.pg_per_id = pg_per_id;
	}
	public String getPg_name() {
		return pg_name;
	}
	public void setPg_name(String pg_name) {
		this.pg_name = pg_name;
	}
	public String getPg_dec() {
		return pg_dec;
	}
	public void setPg_dec(String pg_dec) {
		this.pg_dec = pg_dec;
	}
	public String getPg_created_date() {
		return pg_created_date;
	}
	public void setPg_created_date(String pg_created_date) {
		this.pg_created_date = pg_created_date;
	}
	public Integer getPg_created_name() {
		return pg_created_name;
	}
	public void setPg_created_name(Integer pg_created_name) {
		this.pg_created_name = pg_created_name;
	}
	public String getPg_updated_date() {
		return pg_updated_date;
	}
	public void setPg_updated_date(String pg_updated_date) {
		this.pg_updated_date = pg_updated_date;
	}
	public String getPg_updated_name() {
		return pg_updated_name;
	}
	public void setPg_updated_name(String pg_updated_name) {
		this.pg_updated_name = pg_updated_name;
	}
	public Integer getPg_status() {
		return pg_status;
	}
	public void setPg_status(Integer pg_status) {
		this.pg_status = pg_status;
	}
	
	@Override
	public String toString() {
		return "Permission_Grant [pg_rm_id=" + pg_rm_id + ", pg_per_id=" + pg_per_id + ", pg_name=" + pg_name
				+ ", pg_dec=" + pg_dec + ", pg_created_date=" + pg_created_date + ", pg_created_name=" + pg_created_name
				+ ", pg_updated_date=" + pg_updated_date + ", pg_updated_name=" + pg_updated_name + ", pg_status="
				+ pg_status + "]";
	}
	
		
}
