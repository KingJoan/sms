package com.clps.sms.log.service;

import net.sf.json.JSONArray;

public interface LogAccountService {
	
	/**
	 * 查询所有
	 * @return JSONArray
	 */
	JSONArray queryAll();
	
	/**
	 * 
	 * @param al_action						动作			（ 增 删 改 查）
	 * @param al_action_content			内容			（成功）
	 * @param al_type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param begin							查询起点	（）
	 * @param num								数量			（）	
	 * @return JSONArray
	 */
	JSONArray listAccountLog(String al_action, String al_action_content, String al_type,int begin, int num);
	
	/**
	 * 
	 * @param al_action						动作			（ 增 删 改 查）
	 * @param al_action_content			内容			（成功）
	 * @param al_type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param al_created_name			创建人名	（）
	 * @param begin							查询起点	（）
	 * @param num								数量			（）	
	 * @return JSONArray
	 */
	JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type,Integer al_created_id,int begin, int num);
	
	/**
	 * 
	 * @param al_action						动作			（ 增 删 改 查）
	 * @param al_action_content			内容			（成功）
	 * @param al_type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param start								时间范围	（）
	 * @param end								时间范围	（）	
	 * @param begin							查询起点	（）
	 * @param num								数量			（）	
	 * @return JSONArray
	 */
	JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type,String start,String end,int begin, int num);
	
	/**
	 * 
	 * @param al_action						动作			（ 增 删 改 查）
	 * @param al_action_content			内容			（成功）
	 * @param al_type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param al_created_name			创建人名	（）
	 * @param start								时间范围	（）
	 * @param end								时间范围	（）	
	 * @param begin							查询起点	（）
	 * @param num								数量			（）	
	 * @return JSONArray
	 */
	JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type,Integer al_created_id,String start,String end,int begin, int num);

}
