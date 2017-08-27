package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.AccountMeetingLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:30:21
 * 
 * @since 1.0
 */
public interface AccountMeetingLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<AccountMeetingLog> queryAll();

	/**
	 * 
	 * @param aml_action
	 *            动作 （ 增 删 改 查）
	 * @param aml_action_content
	 *            内容 （成功）
	 * @param aml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content, String aml_type, int begin, int num);

	/**
	 * 
	 * @param aml_action
	 *            动作 （ 增 删 改 查）
	 * @param aml_action_content
	 *            内容 （成功）
	 * @param aml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param aml_created_name
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content, String aml_type,
			Integer aml_created_id, int begin, int num);

	/**
	 * 
	 * @param aml_action
	 *            动作 （ 增 删 改 查）
	 * @param aml_action_content
	 *            内容 （成功）
	 * @param aml_type
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
	List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content, String aml_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param aml_action
	 *            动作 （ 增 删 改 查）
	 * @param aml_action_content
	 *            内容 （成功）
	 * @param aml_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param aml_created_id
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
	List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content, String aml_type,
			Integer aml_created_id, String start, String end, int begin, int num);

}
