package com.clps.sms.sys.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午11:03:01
 * 
 * @since 1.0
 */
public class Role_Menu implements Serializable {

	/**
	 * 角色菜单编号;角色菜单名称;角色菜单描述;角色编号;菜单编号;创建日期;创建人名;修改日期;修改人名;角色菜单状态
	 */
	private static final long serialVersionUID = 8461715313559638967L;
	
	private Integer rm_id;//RM_ID
	private String rm_name;//RM_NAME
	private String rm_dec;//RM_DEC
	private Integer rm_role_id;//RM_ROLE_ID
	private Integer rm_menu_id;//RM_MENU_ID
	private String rm_created_date;//RM_CREATED_DATE
	private Integer rm_created_name;//RM_CREATED_NAME
	private String rm_updated_date;//RM_UPDATED_DATE
	private Integer rm_updated_name;//RM_UPDATED_NAME
	private Integer rm_status;//RM_STATUS
	public Role_Menu(Integer rm_id, String rm_name, String rm_dec, Integer rm_role_id, Integer rm_menu_id,
			String rm_created_date, Integer rm_created_name, String rm_updated_date, Integer rm_updated_name,
			Integer rm_status) {
		super();
		this.rm_id = rm_id;
		this.rm_name = rm_name;
		this.rm_dec = rm_dec;
		this.rm_role_id = rm_role_id;
		this.rm_menu_id = rm_menu_id;
		this.rm_created_date = rm_created_date;
		this.rm_created_name = rm_created_name;
		this.rm_updated_date = rm_updated_date;
		this.rm_updated_name = rm_updated_name;
		this.rm_status = rm_status;
	}
	public Integer getRm_id() {
		return rm_id;
	}
	public void setRm_id(Integer rm_id) {
		this.rm_id = rm_id;
	}
	public String getRm_name() {
		return rm_name;
	}
	public void setRm_name(String rm_name) {
		this.rm_name = rm_name;
	}
	public String getRm_dec() {
		return rm_dec;
	}
	public void setRm_dec(String rm_dec) {
		this.rm_dec = rm_dec;
	}
	public Integer getRm_role_id() {
		return rm_role_id;
	}
	public void setRm_role_id(Integer rm_role_id) {
		this.rm_role_id = rm_role_id;
	}
	public Integer getRm_menu_id() {
		return rm_menu_id;
	}
	public void setRm_menu_id(Integer rm_menu_id) {
		this.rm_menu_id = rm_menu_id;
	}
	public String getRm_created_date() {
		return rm_created_date;
	}
	public void setRm_created_date(String rm_created_date) {
		this.rm_created_date = rm_created_date;
	}
	public Integer getRm_created_name() {
		return rm_created_name;
	}
	public void setRm_created_name(Integer rm_created_name) {
		this.rm_created_name = rm_created_name;
	}
	public String getRm_updated_date() {
		return rm_updated_date;
	}
	public void setRm_updated_date(String rm_updated_date) {
		this.rm_updated_date = rm_updated_date;
	}
	public Integer getRm_updated_name() {
		return rm_updated_name;
	}
	public void setRm_updated_name(Integer rm_updated_name) {
		this.rm_updated_name = rm_updated_name;
	}
	public Integer getRm_status() {
		return rm_status;
	}
	public void setRm_status(Integer rm_status) {
		this.rm_status = rm_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Role_Menu [rm_id=" + rm_id + ", rm_name=" + rm_name + ", rm_dec=" + rm_dec + ", rm_role_id="
				+ rm_role_id + ", rm_menu_id=" + rm_menu_id + ", rm_created_date=" + rm_created_date
				+ ", rm_created_name=" + rm_created_name + ", rm_updated_date=" + rm_updated_date + ", rm_updated_name="
				+ rm_updated_name + ", rm_status=" + rm_status + "]";
	}
	
	
	
}
