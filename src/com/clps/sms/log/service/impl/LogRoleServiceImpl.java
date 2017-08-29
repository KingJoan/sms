package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.RoleLogDao;
import com.clps.sms.log.model.RoleLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogRoleServiceImpl implements LogService {
	
	@Autowired
	 RoleLogDao roleLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<RoleLog> roleLogs=roleLogDao.queryAll();
		return JSONArray.fromObject(roleLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs(action, action_content, type, begin, num);
		return parseListToJson(roleLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(roleLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(roleLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(roleLogs,page);
	}
	
	private JSONArray parseListToJson(List<RoleLog> roleLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		RoleLog roleLog;
		int size=roleLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			roleLog=roleLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", roleLog.getRl_action());
			jsonObject.put("content", roleLog.getRl_action_content());
			jsonObject.put("date", roleLog.getRl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", roleLog.getAcc_name());
			jsonObject.put("type", roleLog.getRl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
