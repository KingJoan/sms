package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.RoleMenuLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:31:28
 * 
 * @since 1.0
 */
public interface RoleMenuLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<RoleMenuLog> queryAll();

	/**
	 * 
	 * @param per_action
	 *            动作 （ 增 删 改 查）
	 * @param per_action_content
	 *            内容 （成功）
	 * @param per_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type, int begin, int num);

	/**
	 * 
	 * @param per_action
	 *            动作 （ 增 删 改 查）
	 * @param per_action_content
	 *            内容 （成功）
	 * @param per_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param per_created_id
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type,
			Integer rml_created_id, int begin, int num);

	/**
	 * 
	 * @param per_action
	 *            动作 （ 增 删 改 查）
	 * @param per_action_content
	 *            内容 （成功）
	 * @param per_type
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
	List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param per_action
	 *            动作 （ 增 删 改 查）
	 * @param per_action_content
	 *            内容 （成功）
	 * @param per_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param per_created_id
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
	List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type,
			Integer rml_created_id, String start, String end, int begin, int num);

}
