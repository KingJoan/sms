package com.clps.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.sms.log.dao.AccountLogDao;
import com.clps.sms.log.service.LogAccountService;

import net.sf.json.JSONArray;

@Service
public class LogAccountServiceImpl implements LogAccountService{
	
	public LogAccountServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("-------------------------------\n\n\n\n\n\n\n\nLogAccountServiceImpl\n\n\n\n\n-----------------------------");
	}

	@Autowired
	private  AccountLogDao accountLogDao;

	@Override
	public JSONArray queryAll() {
		JSONArray jsonArray=JSONArray.fromObject(accountLogDao.queryAll());
		return jsonArray;
	}

	@Override
	public JSONArray listAccountLog(String al_action, String al_action_content, String al_type, int begin, int num) {
		JSONArray jsonArray=JSONArray.fromObject(accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, begin, num));
		return jsonArray;
	}

	@Override
	public JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type,
			String al_created_name, int begin, int num) {
		JSONArray jsonArray=JSONArray.fromObject(accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, al_created_name, begin, num));
		return jsonArray;
	}

	@Override
	public JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type, String start,
			String end, int begin, int num) {
		JSONArray jsonArray=JSONArray.fromObject(accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, start, end, begin, num));
		return jsonArray;
	}

	@Override
	public JSONArray queryAccountLogs(String al_action, String al_action_content, String al_type,
			String al_created_name, String start, String end, int begin, int num) {
		JSONArray jsonArray=JSONArray.fromObject(accountLogDao.queryAccountLogs(al_action, al_action_content, al_type, al_created_name, start, end, begin, num));
		return jsonArray;
	}
}
