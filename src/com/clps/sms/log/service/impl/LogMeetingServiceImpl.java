package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.MeetingLogDao;
import com.clps.sms.log.model.MeetingLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogMeetingServiceImpl implements LogService {
	@Autowired
	 MeetingLogDao meetingLogDao;

	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<MeetingLog> meetingLogs=meetingLogDao.queryAll();
		return JSONArray.fromObject(meetingLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs(action, action_content, type, begin, num);
		return parseListToJson(meetingLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs(action, action_content, type, created_name, begin, num);
		System.err.println("name-------------"+meetingLogs.size());
		return parseListToJson(meetingLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(meetingLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(meetingLogs,page);
	}
	
	private JSONArray parseListToJson(List<MeetingLog> meetingLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		MeetingLog meetingLog;
		int size=meetingLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			meetingLog=meetingLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", meetingLog.getRl_action());
			jsonObject.put("content", meetingLog.getRl_action_content());
			jsonObject.put("date", meetingLog.getRl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", meetingLog.getAcc_name());
			jsonObject.put("type", meetingLog.getRl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}

}
