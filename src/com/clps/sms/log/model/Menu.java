package com.clps.sms.log.model;

import java.io.Serializable;

/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:02:03
 * 
 * @since 1.0
 */
public class Menu implements Serializable {

	/**
	 * 菜单编号;菜单名称;菜单描述;菜单父结点;创建日期;创建人名;修改日期;修改人名;菜单状态
	 */
	private static final long serialVersionUID = -5561935741226034260L;
	
	private Integer menu_id;//MENU_ID
	private String menu_name;//MENU_NAME
	private String menu_dec;//MENU_DEC
	private Integer menu_super_id;//MENU_SUPER_ID
	private String menu_created_date;//MENU_CREATED_DATE
	private Integer menu_created_name;//MENU_CREATED_NAME
	private String menu_updated_date;//MENU_UPDATED_DATE
	private Integer menu_updated_name;//MENU_UPDATED_NAME
	private Integer menu_status;//MENU_STATUS
	public Menu(Integer menu_id, String menu_name, String menu_dec, Integer menu_super_id, String menu_created_date,
			Integer menu_created_name, String menu_updated_date, Integer menu_updated_name, Integer menu_status) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_dec = menu_dec;
		this.menu_super_id = menu_super_id;
		this.menu_created_date = menu_created_date;
		this.menu_created_name = menu_created_name;
		this.menu_updated_date = menu_updated_date;
		this.menu_updated_name = menu_updated_name;
		this.menu_status = menu_status;
	}
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_dec() {
		return menu_dec;
	}
	public void setMenu_dec(String menu_dec) {
		this.menu_dec = menu_dec;
	}
	public Integer getMenu_super_id() {
		return menu_super_id;
	}
	public void setMenu_super_id(Integer menu_super_id) {
		this.menu_super_id = menu_super_id;
	}
	public String getMenu_created_date() {
		return menu_created_date;
	}
	public void setMenu_created_date(String menu_created_date) {
		this.menu_created_date = menu_created_date;
	}
	public Integer getMenu_created_name() {
		return menu_created_name;
	}
	public void setMenu_created_name(Integer menu_created_name) {
		this.menu_created_name = menu_created_name;
	}
	public String getMenu_updated_date() {
		return menu_updated_date;
	}
	public void setMenu_updated_date(String menu_updated_date) {
		this.menu_updated_date = menu_updated_date;
	}
	public Integer getMenu_updated_name() {
		return menu_updated_name;
	}
	public void setMenu_updated_name(Integer menu_updated_name) {
		this.menu_updated_name = menu_updated_name;
	}
	public Integer getMenu_status() {
		return menu_status;
	}
	public void setMenu_status(Integer menu_status) {
		this.menu_status = menu_status;
	}
	
	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_dec=" + menu_dec + ", menu_super_id="
				+ menu_super_id + ", menu_created_date=" + menu_created_date + ", menu_created_name="
				+ menu_created_name + ", menu_updated_date=" + menu_updated_date + ", menu_updated_name="
				+ menu_updated_name + ", menu_status=" + menu_status + "]";
	}
	
	
	
}
