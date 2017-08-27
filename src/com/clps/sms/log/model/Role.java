package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:53:14
 * 
 * @since 1.0
 */
public class Role implements Serializable {

	/**
	 * 角色编号;角色名称;角色描述;角色父结点;创建日期;创建人名;修改日期;修改人名;角色状态
	 */
	private static final long serialVersionUID = -8857325865058599542L;
	
	private Integer role_id;//ROLE_ID
	private String  role_name;//ROLE_NAME
	private String  role_desc;//ROLE_DESC
	private Integer role_super_id;//ROLE_SUPER_ID
	private String  role_created_date;//ROLE_CREATED_DATE
	private Integer role_created_name;//ROLE_CREATED_NAME
	private String  role_updated_date;//ROLE_UPDATED_DATE
	private Integer role_updated_name;//ROLE_UPDATED_NAME
	private Integer role_status;//ROLE_STATUS
	public Role(Integer role_id, String role_name, String role_desc, Integer role_super_id, String role_created_date,
			Integer role_created_name, String role_updated_date, Integer role_updated_name, Integer role_status) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.role_desc = role_desc;
		this.role_super_id = role_super_id;
		this.role_created_date = role_created_date;
		this.role_created_name = role_created_name;
		this.role_updated_date = role_updated_date;
		this.role_updated_name = role_updated_name;
		this.role_status = role_status;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	public Integer getRole_super_id() {
		return role_super_id;
	}
	public void setRole_super_id(Integer role_super_id) {
		this.role_super_id = role_super_id;
	}
	public String getRole_created_date() {
		return role_created_date;
	}
	public void setRole_created_date(String role_created_date) {
		this.role_created_date = role_created_date;
	}
	public Integer getRole_created_name() {
		return role_created_name;
	}
	public void setRole_created_name(Integer role_created_name) {
		this.role_created_name = role_created_name;
	}
	public String getRole_updated_date() {
		return role_updated_date;
	}
	public void setRole_updated_date(String role_updated_date) {
		this.role_updated_date = role_updated_date;
	}
	public Integer getRole_updated_name() {
		return role_updated_name;
	}
	public void setRole_updated_name(Integer role_updated_name) {
		this.role_updated_name = role_updated_name;
	}
	public Integer getRole_status() {
		return role_status;
	}
	public void setRole_status(Integer role_status) {
		this.role_status = role_status;
	}
	
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", role_desc=" + role_desc + ", role_super_id="
				+ role_super_id + ", role_created_date=" + role_created_date + ", role_created_name="
				+ role_created_name + ", role_updated_date=" + role_updated_date + ", role_updated_name="
				+ role_updated_name + ", role_status=" + role_status + "]";
	}
	
	
}
