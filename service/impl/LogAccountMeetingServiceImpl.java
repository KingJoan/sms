package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.AccountMeetingLogDao;
import com.clps.sms.log.model.AccountMeetingLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogAccountMeetingServiceImpl implements LogService{
	@Autowired
	 AccountMeetingLogDao accountMeetingLogDao;

	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<AccountMeetingLog> accountLogs=accountMeetingLogDao.queryAll();
		return JSONArray.fromObject(accountLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountMeetingLog> accountLogs=accountMeetingLogDao.queryAccountMeetingLogs(action, action_content, type, begin, num);
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountMeetingLog> accountLogs=accountMeetingLogDao.queryAccountMeetingLogs(action, action_content, type, created_name, begin, num);
		System.err.println("name-------------"+accountLogs.size());
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountMeetingLog> accountLogs=accountMeetingLogDao.queryAccountMeetingLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountMeetingLog> accountLogs=accountMeetingLogDao.queryAccountMeetingLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(accountLogs,page);
	}
	
	private JSONArray parseListToJson(List<AccountMeetingLog> accountMeetingLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		AccountMeetingLog accountMeetingLog;
		int size=accountMeetingLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			accountMeetingLog=accountMeetingLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", accountMeetingLog.getAml_action());
			jsonObject.put("content", accountMeetingLog.getAml_action_content());
			jsonObject.put("date", accountMeetingLog.getAml_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", accountMeetingLog.getAcc_name());
			jsonObject.put("type", accountMeetingLog.getAml_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
	
}
