package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.AccountMeetingLogDao;
import com.clps.sms.log.dao.RoleMenuLogDao;
import com.clps.sms.log.model.AccountMeetingLog;
import com.clps.sms.log.model.RoleMenuLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogRoleMenuServiceImpl implements LogService {

	@Autowired
	 RoleMenuLogDao roleMenuLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryAll();
		return JSONArray.fromObject(roleMenuLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs(action, action_content, type, begin, num);
		return parseListToJson(roleMenuLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(roleMenuLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(roleMenuLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(roleMenuLogs,page);
	}

	private JSONArray parseListToJson(List<RoleMenuLog> roleMenuLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		RoleMenuLog roleMenuLog;
		int size=roleMenuLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			roleMenuLog=roleMenuLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", roleMenuLog.getRml_action());
			jsonObject.put("content", roleMenuLog.getRml_action_content());
			jsonObject.put("date", roleMenuLog.getRml_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", roleMenuLog.getAcc_name());
			jsonObject.put("type", roleMenuLog.getRml_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
