package com.clps.sms.log.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clps.sms.log.constant.Log;
import com.clps.sms.log.dao.EquipmentLogDao;
import com.clps.sms.log.model.EquipmentLog;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class LogEquipmentServiceImpl implements LogService {
	@Autowired
	EquipmentLogDao equipmentLogDao;
	
	@Override
	public JSONArray listAll() {
		// TODO Auto-generated method stub
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryAll();
		return JSONArray.fromObject(equipmentLogs);
	}

	@Override
	public JSONArray listLogsGeneral(String action, String action_content, String type, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs(action, action_content, type, begin, num);
		return parseListToJson(equipmentLogs,page);
	}

	@Override
	public JSONArray listLogsByName(String action, String action_content, String type, String created_name, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs(action, action_content, type, created_name, begin, num);
		System.err.println("name-------------"+equipmentLogs.size());
		return parseListToJson(equipmentLogs,page);
	}

	@Override
	public JSONArray listLogsByTimeRange(String action, String action_content, String type, String start, String end,
			int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs(action, action_content, type, start, end, begin, num);
		return parseListToJson(equipmentLogs,page);
	}

	@Override
	public JSONArray listLogsByNameAndTimeRange(String action, String action_content, String type, String created_name,
			String start, String end, int page) {
		// TODO Auto-generated method stub
		int num=Log.PAGESIZE;
		int begin=page*Log.PAGESIZE;	
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs(action, action_content, type, created_name, start, end, begin, num);
		return parseListToJson(equipmentLogs,page);
	}
	
	private JSONArray parseListToJson(List<EquipmentLog> equipmentLogs,int page){
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject;
		EquipmentLog equipmentLog;
		int size=equipmentLogs.size();
		for(int i=0;i<size;i++){
			jsonObject=new JSONObject();
			equipmentLog=equipmentLogs.get(i);
			jsonObject.put("id",page*Log.PAGESIZE+i+1);
			jsonObject.put("action", equipmentLog.getEl_action());
			jsonObject.put("content", equipmentLog.getEl_action_content());
			jsonObject.put("date", equipmentLog.getEl_created_date().replaceAll("[.]0",""));
			jsonObject.put("name", equipmentLog.getAcc_name());
			jsonObject.put("type", equipmentLog.getEl_type());
			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}

}
