package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.SysParameterLogDao;
import com.clps.sms.log.model.SysParameterLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogSysParameterServiceImpl implements LogService {

	@Autowired
	 SysParameterLogDao sysParameterLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.queryAll();
		return JSONArray.fromObject(sysParameterLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs(action, action_content, type, begin, num);
		return parseListToJson(sysParameterLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(sysParameterLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(sysParameterLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(sysParameterLogs,page);
	}

	private JSONArray parseListToJson(List<SysParameterLog> sysParameterLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		SysParameterLog sysParameterLog;
		int size=sysParameterLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			sysParameterLog=sysParameterLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", sysParameterLog.getSpl_action());
			jsonObject.put("content", sysParameterLog.getSpl_action_content());
			jsonObject.put("date", sysParameterLog.getSpl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", sysParameterLog.getAcc_name());
			jsonObject.put("type", sysParameterLog.getSpl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
