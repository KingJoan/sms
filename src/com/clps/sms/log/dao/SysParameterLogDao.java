package com.clps.sms.log.dao;

import java.util.List;

import com.clps.sms.log.model.SysParameterLog;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午12:31:47
 * 
 * @since 1.0
 */
public interface SysParameterLogDao {
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<SysParameterLog> queryAll();

	/**
	 * 
	 * @param rl_action
	 *            动作 （ 增 删 改 查）
	 * @param rl_action_content
	 *            内容 （成功）
	 * @param rl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type, int begin, int num);

	/**
	 * 
	 * @param rl_action
	 *            动作 （ 增 删 改 查）
	 * @param rl_action_content
	 *            内容 （成功）
	 * @param rl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param rl_created_id
	 *            创建人名 （）
	 * @param begin
	 *            查询起点 （）
	 * @param num
	 *            数量 （）
	 * @return
	 */
	List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			Integer spl_created_id, int begin, int num);

	/**
	 * 
	 * @param rl_action
	 *            动作 （ 增 删 改 查）
	 * @param rl_action_content
	 *            内容 （成功）
	 * @param rl_type
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
	List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type, String start,
			String end, int begin, int num);

	/**
	 * 
	 * @param rl_action
	 *            动作 （ 增 删 改 查）
	 * @param rl_action_content
	 *            内容 （成功）
	 * @param rl_type
	 *            类型 （DEBUG,INFO,WARN,ERROR）
	 * @param rl_created_id
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
	List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			Integer spl_created_id, String start, String end, int begin, int num);

}
