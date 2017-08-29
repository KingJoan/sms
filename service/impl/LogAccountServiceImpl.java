package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.AccountLogDao;
import com.clps.sms.log.model.AccountLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogAccountServiceImpl implements LogService{

	@Autowired
	private  AccountLogDao accountLogDao;

	@Override
	public JSONArray listAll() {
		List<AccountLog> accountLogs=accountLogDao.queryAll();
		return JSONArray.fromObject(accountLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String al_action, String al_action_content, String al_type, int page) {
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountLog> accountLogs=accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, begin, num);
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String al_action, String al_action_content, String al_type,
			String al_created_name, int page) {
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountLog> accountLogs=accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, al_created_name, begin, num);
		System.err.println("name-------------"+accountLogs.size());
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String al_action, String al_action_content, String al_type, String start,
			String end, int page) {
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountLog> accountLogs=accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, start, end, begin, num);
		return parseListToJson(accountLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String al_action, String al_action_content, String al_type,
			String al_created_name, String start, String end, int page) {
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<AccountLog> accountLogs=accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, al_created_name, start, end, begin, num);
		return parseListToJson(accountLogs,page);
	}
	
	private JSONArray parseListToJson(List<AccountLog> accountLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		AccountLog accountLog;
		int size=accountLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			accountLog=accountLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", accountLog.getAl_action());
			jsonObject.put("content", accountLog.getAl_action_content());
			jsonObject.put("date", accountLog.getAl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", accountLog.getAcc_name());
			jsonObject.put("type", accountLog.getAl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
