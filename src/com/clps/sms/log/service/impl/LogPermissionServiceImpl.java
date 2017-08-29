package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.PermissionLogDao;
import com.clps.sms.log.model.PermissionLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogPermissionServiceImpl implements LogService {
	
	@Autowired
	 PermissionLogDao permissionLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<PermissionLog> permissionLogs=permissionLogDao.queryAll();
		return JSONArray.fromObject(permissionLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs(action, action_content, type, begin, num);
		return parseListToJson(permissionLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(permissionLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(permissionLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(permissionLogs,page);
	}
	
	private JSONArray parseListToJson(List<PermissionLog> permissionLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		PermissionLog permissionLog;
		int size=permissionLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			permissionLog=permissionLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", permissionLog.getPl_action());
			jsonObject.put("content", permissionLog.getPl_action_content());
			jsonObject.put("date", permissionLog.getPl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", permissionLog.getAcc_name());
			jsonObject.put("type", permissionLog.getPl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
