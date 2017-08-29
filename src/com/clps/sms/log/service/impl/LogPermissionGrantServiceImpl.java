package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.PermissionGrantLogDao;
import com.clps.sms.log.model.PermissionGrantLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogPermissionGrantServiceImpl implements LogService {
	
	@Autowired
	 PermissionGrantLogDao permissionGrantLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryAll();
		return JSONArray.fromObject(permissionGrantLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs(action, action_content, type, begin, num);
		return parseListToJson(permissionGrantLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(permissionGrantLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(permissionGrantLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(permissionGrantLogs,page);
	}
	
	private JSONArray parseListToJson(List<PermissionGrantLog> permissionGrantLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		PermissionGrantLog permissionGrantLog;
		int size=permissionGrantLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			permissionGrantLog=permissionGrantLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", permissionGrantLog.getPgl_action());
			jsonObject.put("content", permissionGrantLog.getPgl_action_content());
			jsonObject.put("date", permissionGrantLog.getPgl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", permissionGrantLog.getAcc_name());
			jsonObject.put("type", permissionGrantLog.getPgl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
