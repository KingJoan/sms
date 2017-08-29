package com.clps.sms.log.service;

import net.sf.json.JSONArray;

public interface LogService{
	
	/**
	 * 查询所有
	 * @return JSONArray
	 */
	JSONArray listAll();
	
	/**
	 * 
	 * @param action						动作			（ 增 删 改 查）
	 * @param action_content			内容			（成功）
	 * @param type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param page							页				（）
	 * @return JSONArray
	 */
	JSONArray listLogsGeneral(String action, String action_content, String type,int page);
	
	/**
	 * 
	 * @param action						动作			（ 增 删 改 查）
	 * @param action_content			内容			（成功）
	 * @param type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param created_name			创建人名	（）
	 * @param page							页				（）
	 * @return JSONArray
	 */
	JSONArray listLogsByName(String action, String action_content, String type,String created_name,int page);
	
	/**
	 * 
	 * @param action						动作			（ 增 删 改 查）
	 * @param action_content			内容			（成功）
	 * @param type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param start								时间范围	（）
	 * @param end								时间范围	（）	
	 * @param page							页				（）
	 * @return JSONArray
	 */
	JSONArray listLogsByTimeRange(String action, String action_content, String type,String start,String end,int page);
	
	/**
	 * 
	 * @param action						动作			（ 增 删 改 查）
	 * @param action_content			内容			（成功）
	 * @param type							类型			（DEBUG,INFO,WARN,ERROR）
	 * @param created_name			创建人名	（）
	 * @param start								时间范围	（）
	 * @param end								时间范围	（）	
	 * @param page							页				（）
	 * @return JSONArray
	 */
	JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type,String created_name,String start,String end,int page);

}
