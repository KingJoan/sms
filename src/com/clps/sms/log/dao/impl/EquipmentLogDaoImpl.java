package com.clps.sms.log.dao.impl;

import java.util.List;

import com.clps.sms.log.dao.EquipmentLogDao;
import com.clps.sms.log.model.EquipmentLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:14:57
 * 
 * @since 1.0
 */
public class EquipmentLogDaoImpl extends BaseDaoImpl<EquipmentLog>implements EquipmentLogDao {
	
	private static final String HEAD="SELECT EQUIPMENT_LOG.EL_ID, EQUIPMENTLOG.EL_ACTION, EQUIPMENT_LOG.EL_ACTION_CONTENT, EQUIPMENT_LOG.EL_CREATED_DATE, EQUIPMENT_LOG.EL_CREATED_ID, EQUIPMENT_LOG.EL_TYPE, EQUIPMENT_.EQU_NAME FROM EQUIPMENT_LOG , EQUIPMENT WHERE EQUIPMENT_LOG.EL_CREATED_ID = EQUIPMENT.EQU_ID ";
	
	private static final String QUERYMEQUIPMENTLOG=HEAD+"AND EQUIPMENT_LOG.EL_ACTION LIKE ? AND EQUIPMENT_LOG.EL_ACTION_CONTENT LIKE ? AND EQUIPMENT_LOG.EL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYEQUIPMENTLOGSBYTIMERANGE=HEAD+"AND EQUIPMENT_LOG.EL_ACTION LIKE ? AND EQUIPMENT_LOG.EL_ACTION_CONTENT LIKE ? AND EQUIPMENT_LOG.EL_TYPE LIKE ? AND EQUIPMENT_LOG.EL_CREATED_DATE >= ? AND EQUIPMENT_LOG.EL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYMEETINGLOGSBYCREATEDNAME=HEAD+"AND EQUIPMENT_LOG.EL_ACTION LIKE ? AND EQUIPMENT_LOG.EL_ACTION_CONTENT LIKE ? AND EQUIPMENT_LOG.RL_TYPE LIKE ? AND EQUIPMENT.EQU_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYEQUIPMENTLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND EQUIPMENT_LOG.EL_ACTION LIKE ? AND EQUIPMENT_LOG.EL_ACTION_CONTENT LIKE ? AND EQUIPMENT_LOG.EL_TYPE LIKE ? AND EQUIPMENT.EQU_NAME = ? AND EQUIPMENT_LOG.EL_CREATED_DATE >= ? AND EQUIPMENT_LOG.EL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<EquipmentLog> queryAll() {
		// TODO Auto-generated method stub
		List<EquipmentLog> equipmentLogs=query(HEAD);
		return equipmentLogs;
	}

	@Override
	public List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type, int begin,
			int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+el_action+"%",  
				 "%"+el_action_content+"%",   
				 "%"+el_type+"%",
				 begin,
				 num
		};
		List<EquipmentLog> EquipmentLogs=query(QUERYMEQUIPMENTLOG, parameter);
		return EquipmentLogs;
	}

	@Override
	public List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type,
			Integer el_created_id, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+el_action+"%",  
				 "%"+el_action_content+"%",   
				 "%"+el_type+"%",
				 el_created_id,
				 begin,
				 num
		};
		List<EquipmentLog> EquipmentLogs=query(QUERYMEETINGLOGSBYCREATEDNAME, parameter);
		return EquipmentLogs;
	}

	@Override
	public List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type,
			String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+el_action+"%",  
				 "%"+el_action_content+"%",   
				 "%"+el_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<EquipmentLog> EquipmentLogs=query(QUERYEQUIPMENTLOGSBYTIMERANGE,parameter);
		return EquipmentLogs;
	}

	@Override
	public List<EquipmentLog> queryEquipmentLogs(String el_action, String el_action_content, String el_type,
			Integer el_created_id, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+el_action+"%",  
				 "%"+el_action_content+"%",   
				 "%"+el_type+"%",
				 el_created_id,
				 start,
				 end,
				 begin,
				 num
		};
		List<EquipmentLog> EquipmentLogs=query(QUERYEQUIPMENTLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (EquipmentLog EquipmentLog: EquipmentLogs){
			System.out.println(EquipmentLog.getEl_action()+"--"+EquipmentLog.getAcc_name());
		}
		return EquipmentLogs;
	}

	@Override
	protected Class<EquipmentLog> getEntityClass() {
		// TODO Auto-generated method stub
		return EquipmentLog.class;
	}

}
