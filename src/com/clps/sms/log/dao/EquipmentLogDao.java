package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.EquipmentLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:30:30
 * 
 * @since 1.0
 */
public interface EquipmentLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<EquipmentLog> queryAll();

	/**
	 * 
	 * @param el_action
	 *            动作 （ 增 删 改 查）
	 * @param el_action_content
	 *            内容 （成功）
	 * @param el_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type, int begin, int num);

	/**
	 * 
	 * @param el_action
	 *            动作 （ 增 删 改 查）
	 * @param el_action_content
	 *            内容 （成功）
	 * @param el_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param el_created_name
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type,
			String el_created_name, int begin, int num);

	/**
	 * 
	 * @param el_action
	 *            动作 （ 增 删 改 查）
	 * @param el_action_content
	 *            内容 （成功）
	 * @param el_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param start
	 *            时间范围 （）
	 * @param end
	 *            时间范围 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param el_action
	 *            动作 （ 增 删 改 查）
	 * @param el_action_content
	 *            内容 （成功）
	 * @param el_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param el_created_name
	 *            创建人名 （）
	 * @param start
	 *            时间范围 （）
	 * @param end
	 *            时间范围 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type,
			String el_created_name, String start, String end, int begin, int num);

}
