package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.MenuLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:30:46
 * 
 * @since 1.0
 */
public interface MenuLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<MenuLog> queryAll();

	/**
	 * 
	 * @param ml_action
	 *            动作 （ 增 删 改 查）
	 * @param ml_action_content
	 *            内容 （成功）
	 * @param ml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type, int begin, int num);

	/**
	 * 
	 * @param ml_action
	 *            动作 （ 增 删 改 查）
	 * @param ml_action_content
	 *            内容 （成功）
	 * @param ml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param ml_created_id
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type,
			Integer ml_created_id, int begin, int num);

	/**
	 * 
	 * @param ml_action
	 *            动作 （ 增 删 改 查）
	 * @param ml_action_content
	 *            内容 （成功）
	 * @param ml_type
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
	List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param ml_action
	 *            动作 （ 增 删 改 查）
	 * @param ml_action_content
	 *            内容 （成功）
	 * @param ml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param ml_created_id
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
	List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type,
			Integer ml_created_id, String start, String end, int begin, int num);

}
