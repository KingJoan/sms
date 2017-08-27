package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午11:24:13
 * 
 * @since 1.0
 */
public class SysParameter implements Serializable {

	/**
	 * 参数编号;参数名称;参数描述;参数类别;创建日期;创建人名;修改日期;修改人名;参数状态
	 */
	private static final long serialVersionUID = 1676429439081171591L;
	
	private Integer sp_id;//SP_ID
	private  String sp_name;//SP_NAME
	private  String sp_dec;//SP_DEC
	private Integer sp_type;//SP_TYPE
	private  String sp_created_date;//SP_CREATED_DATE
	private Integer sp_created_name;//SP_CREATED_NAME
	private  String sp_updated_date;//SP_UPDATED_DATE
	private Integer sp_updated_name;//SP_UPDATED_NAME
	private Integer sp_status;//SP_STATUS
	public SysParameter(Integer sp_id, String sp_name, String sp_dec, Integer sp_type, String sp_created_date,
			Integer sp_created_name, String sp_updated_date, Integer sp_updated_name, Integer sp_status) {
		super();
		this.sp_id = sp_id;
		this.sp_name = sp_name;
		this.sp_dec = sp_dec;
		this.sp_type = sp_type;
		this.sp_created_date = sp_created_date;
		this.sp_created_name = sp_created_name;
		this.sp_updated_date = sp_updated_date;
		this.sp_updated_name = sp_updated_name;
		this.sp_status = sp_status;
	}
	public Integer getSp_id() {
		return sp_id;
	}
	public void setSp_id(Integer sp_id) {
		this.sp_id = sp_id;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public String getSp_dec() {
		return sp_dec;
	}
	public void setSp_dec(String sp_dec) {
		this.sp_dec = sp_dec;
	}
	public Integer getSp_type() {
		return sp_type;
	}
	public void setSp_type(Integer sp_type) {
		this.sp_type = sp_type;
	}
	public String getSp_created_date() {
		return sp_created_date;
	}
	public void setSp_created_date(String sp_created_date) {
		this.sp_created_date = sp_created_date;
	}
	public Integer getSp_created_name() {
		return sp_created_name;
	}
	public void setSp_created_name(Integer sp_created_name) {
		this.sp_created_name = sp_created_name;
	}
	public String getSp_updated_date() {
		return sp_updated_date;
	}
	public void setSp_updated_date(String sp_updated_date) {
		this.sp_updated_date = sp_updated_date;
	}
	public Integer getSp_updated_name() {
		return sp_updated_name;
	}
	public void setSp_updated_name(Integer sp_updated_name) {
		this.sp_updated_name = sp_updated_name;
	}
	public Integer getSp_status() {
		return sp_status;
	}
	public void setSp_status(Integer sp_status) {
		this.sp_status = sp_status;
	}
	
	@Override
	public String toString() {
		return "Sys_Parameter [sp_id=" + sp_id + ", sp_name=" + sp_name + ", sp_dec=" + sp_dec + ", sp_type=" + sp_type
				+ ", sp_created_date=" + sp_created_date + ", sp_created_name=" + sp_created_name + ", sp_updated_date="
				+ sp_updated_date + ", sp_updated_name=" + sp_updated_name + ", sp_status=" + sp_status + "]";
	}
	
	
}
