package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.MenuLogDao;
import com.clps.sms.log.model.MenuLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogMenuServiceImpl implements LogService {
	
	@Autowired
	 MenuLogDao menuLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<MenuLog> menuLogs=menuLogDao.queryAll();
		return JSONArray.fromObject(menuLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs(action, action_content, type, begin, num);
		return parseListToJson(menuLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs(action, action_content, type, created_name, begin, num);
		System.err.println("name-------------"+menuLogs.size());
		return parseListToJson(menuLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(menuLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(menuLogs,page);
	}
	
	private JSONArray parseListToJson(List<MenuLog> menuLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		MenuLog menuLog;
		int size=menuLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			menuLog=menuLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", menuLog.getMl_action());
			jsonObject.put("content", menuLog.getMl_action_content());
			jsonObject.put("date", menuLog.getMl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", menuLog.getAcc_name());
			jsonObject.put("type", menuLog.getMl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
