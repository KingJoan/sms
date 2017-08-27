package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.PermissionGrantLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:30:54
 * 
 * @since 1.0
 */
public interface PermissionGrantLogDao {
	

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<PermissionGrantLog> queryAll();

	/**
	 * 
	 * @param pgl_action
	 *            动作 （ 增 删 改 查）
	 * @param pgl_action_content
	 *            内容 （成功）
	 * @param pgl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content, String pgl_type, int begin, int num);

	/**
	 * 
	 * @param pgl_action
	 *            动作 （ 增 删 改 查）
	 * @param pgl_action_content
	 *            内容 （成功）
	 * @param pgl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param pgl_created_id
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content, String pgl_type,
			Integer pgl_created_id, int begin, int num);

	/**
	 * 
	 * @param pgl_action
	 *            动作 （ 增 删 改 查）
	 * @param pgl_action_content
	 *            内容 （成功）
	 * @param pgl_type
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
	List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content, String pgl_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param pgl_action
	 *            动作 （ 增 删 改 查）
	 * @param pgl_action_content
	 *            内容 （成功）
	 * @param pgl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param pgl_created_id
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
	List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content, String pgl_type,
			Integer pgl_created_id, String start, String end, int begin, int num);

}
