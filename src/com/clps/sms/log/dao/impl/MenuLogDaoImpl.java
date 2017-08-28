package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.MenuLogDao;
import com.clps.sms.log.model.MenuLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:14:45
 * 
 * @since 1.0
 */
@Component
public class MenuLogDaoImpl extends BaseDaoImpl<MenuLog>implements MenuLogDao {
	
private static final String HEAD="SELECT MENU_LOG.ML_ID, MENU_LOG.ML_ACTION, MENU_LOG.ML_ACTION_CONTENT, MENU_LOG.ML_CREATED_DATE, MENU_LOG.ML_CREATED_ID, MENU_LOG.ML_TYPE, ACCOUNT.ACC_NAME FROM MENU_LOG , ACCOUNT WHERE MENU_LOG.ML_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYMENULOG=HEAD+"AND MENU_LOG.ML_ACTION LIKE ? AND MENU_LOG.ML_ACTION_CONTENT LIKE ? AND MENU_LOG.ML_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYMENULOGSBYTIMERANGE=HEAD+"AND MENU_LOG.ML_ACTION LIKE ? AND MENU_LOG.ML_ACTION_CONTENT LIKE ? AND MENU_LOG.ML_TYPE LIKE ? AND MENU_LOG.ML_CREATED_DATE >= ? AND MENU_LOG.ML_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYMENULOGSBYCREATEDNAME=HEAD+"AND MENU_LOG.ML_ACTION LIKE ? AND MENU_LOG.ML_ACTION_CONTENT LIKE ? AND MENU_LOG.ML_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYMENULOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND MENU_LOG.ML_ACTION LIKE ? AND MENU_LOG.ML_ACTION_CONTENT LIKE ? AND MENU_LOG.ML_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND MENU_LOG.ML_CREATED_DATE >= ? AND MENU_LOG.ML_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<MenuLog> queryAll() {
		// TODO Auto-generated method stub
		List<MenuLog> menuLogs=query(HEAD);
		return menuLogs;
	}

	@Override
	public List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+ml_action+"%",  
				 "%"+ml_action_content+"%",   
				 "%"+ml_type+"%",
				 begin,
				 num
		};
		List<MenuLog> menuLogs=query(QUERYMENULOG, parameter);
		return menuLogs;
	}

	@Override
	public List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type,
			String ml_created_name, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+ml_action+"%",  
				 "%"+ml_action_content+"%",   
				 "%"+ml_type+"%",
				 ml_created_name,
				 begin,
				 num
		};
		List<MenuLog> menuLogs=query(QUERYMENULOGSBYCREATEDNAME, parameter);
		return menuLogs;
	}

	@Override
	public List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type, String start,
			String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+ml_action+"%",  
				 "%"+ml_action_content+"%",   
				 "%"+ml_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<MenuLog> menuLogs=query(QUERYMENULOGSBYTIMERANGE,parameter);
		return menuLogs;
	}

	@Override
	public List<MenuLog> queryMenuLogs(String ml_action, String ml_action_content, String ml_type,
			String ml_created_name, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+ml_action+"%",  
				 "%"+ml_action_content+"%",   
				 "%"+ml_type+"%",
				 ml_created_name,
				 start,
				 end,
				 begin,
				 num
		};
		List<MenuLog> menuLogs=query(QUERYMENULOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (MenuLog menuLog: menuLogs){
			System.out.println(menuLog.getMl_action()+"--"+menuLog.getAcc_name());
		}
		return menuLogs;
	}

	@Override
	protected Class<MenuLog> getEntityClass() {
		// TODO Auto-generated method stub
		return MenuLog.class;
	}

}
