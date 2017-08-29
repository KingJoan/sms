package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.RoomLogDao;
import com.clps.sms.log.model.RoomLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogRoomServiceImpl implements LogService {

	@Autowired
	 RoomLogDao roomLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<RoomLog> roomLogs=roomLogDao.queryAll();
		return JSONArray.fromObject(roomLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs(action, action_content, type, begin, num);
		return parseListToJson(roomLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs(action, action_content, type, created_name, begin, num);
		return parseListToJson(roomLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(roomLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(roomLogs,page);
	}

	private JSONArray parseListToJson(List<RoomLog> roomLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		RoomLog roomLog;
		int size=roomLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			roomLog=roomLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", roomLog.getRl_action());
			jsonObject.put("content", roomLog.getRl_action_content());
			jsonObject.put("date", roomLog.getRl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", roomLog.getAcc_name());
			jsonObject.put("type", roomLog.getRl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
}
