package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.PermissionLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:31:01
 * 
 * @since 1.0
 */
public interface PermissionLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<PermissionLog> queryAll();

	/**
	 * 
	 * @param pl_action
	 *            动作 （ 增 删 改 查）
	 * @param pl_action_content
	 *            内容 （成功）
	 * @param pl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type, int begin, int num);

	/**
	 * 
	 * @param pl_action
	 *            动作 （ 增 删 改 查）
	 * @param pl_action_content
	 *            内容 （成功）
	 * @param pl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param pl_created_name
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			String pl_created_name, int begin, int num);

	/**
	 * 
	 * @param pl_action
	 *            动作 （ 增 删 改 查）
	 * @param pl_action_content
	 *            内容 （成功）
	 * @param pl_type
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
	List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param pl_action
	 *            动作 （ 增 删 改 查）
	 * @param pl_action_content
	 *            内容 （成功）
	 * @param pl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param pl_created_name
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
	List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			String pl_created_name, String start, String end, int begin, int num);

}
