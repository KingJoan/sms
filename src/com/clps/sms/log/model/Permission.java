package com.clps.sms.log.model;

import java.io.Serializable;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午10:12:50
 * 
 * @since 1.0
 */
public class Permission implements Serializable {

	/**
	 * 许可编号;许可名称;许可描述;创建日期;创建人名;修改日期;修改人名;许可状态
	 */
	private static final long serialVersionUID = -5103994698093668208L;
	
	private Integer per_id;//PER_ID
	private String per_name;//PER_NAME
	private String per_dec;//PER_DEC
	private String per_created_date;//PER_CREATED_DATE
	private Integer per_created_name;//PER_CREATED_NAME
	private String per_updated_date;//PER_UPDATED_DATE
	private Integer per_updated_name;//PER_UPDATED_NAME
	private Integer PER_STATUS;//PER_STATUS
	public Permission(Integer per_id, String per_name, String per_dec, String per_created_date,
			Integer per_created_name, String per_updated_date, Integer per_updated_name, Integer pER_STATUS) {
		super();
		this.per_id = per_id;
		this.per_name = per_name;
		this.per_dec = per_dec;
		this.per_created_date = per_created_date;
		this.per_created_name = per_created_name;
		this.per_updated_date = per_updated_date;
		this.per_updated_name = per_updated_name;
		PER_STATUS = pER_STATUS;
	}
	public Integer getPer_id() {
		return per_id;
	}
	public void setPer_id(Integer per_id) {
		this.per_id = per_id;
	}
	public String getPer_name() {
		return per_name;
	}
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	public String getPer_dec() {
		return per_dec;
	}
	public void setPer_dec(String per_dec) {
		this.per_dec = per_dec;
	}
	public String getPer_created_date() {
		return per_created_date;
	}
	public void setPer_created_date(String per_created_date) {
		this.per_created_date = per_created_date;
	}
	public Integer getPer_created_name() {
		return per_created_name;
	}
	public void setPer_created_name(Integer per_created_name) {
		this.per_created_name = per_created_name;
	}
	public String getPer_updated_date() {
		return per_updated_date;
	}
	public void setPer_updated_date(String per_updated_date) {
		this.per_updated_date = per_updated_date;
	}
	public Integer getPer_updated_name() {
		return per_updated_name;
	}
	public void setPer_updated_name(Integer per_updated_name) {
		this.per_updated_name = per_updated_name;
	}
	public Integer getPER_STATUS() {
		return PER_STATUS;
	}
	public void setPER_STATUS(Integer pER_STATUS) {
		PER_STATUS = pER_STATUS;
	}
	
	@Override
	public String toString() {
		return "Permission [per_id=" + per_id + ", per_name=" + per_name + ", per_dec=" + per_dec
				+ ", per_created_date=" + per_created_date + ", per_created_name=" + per_created_name
				+ ", per_updated_date=" + per_updated_date + ", per_updated_name=" + per_updated_name + ", PER_STATUS="
				+ PER_STATUS + "]";
	}
	
	
	
}	