package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.RoleMenuLogDao;
import com.clps.sms.log.model.RoleMenuLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午7:12:59
 * 
 * @since 1.0
 */
@Component
public class RoleMenuLogDaoImpl extends BaseDaoImpl<RoleMenuLog> implements RoleMenuLogDao {
	
	private static final String HEAD="SELECT ROLE_MENU_LOG.RML_ID, ROLE_MENU_LOG.RML_ACTION, ROLE_MENU_LOG.RML_ACTION_CONTENT, ROLE_MENU_LOG.RML_CREATED_DATE, ROLE_MENU_LOG.RML_CREATED_ID, ROLE_MENU_LOG.RML_TYPE, ACCOUNT.ACC_NAME FROM ROLE_MENU_LOG , ACCOUNT WHERE ROLE_MENU_LOG.RML_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYROLEMENULOG=HEAD+"AND ROLE_MENU_LOG.RML_ACTION LIKE ? AND ROLE_MENU_LOG.RML_ACTION_CONTENT LIKE ? AND ROLE_MENU_LOG.RML_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYROLEMENULOGSBYTIMERANGE=HEAD+"AND ROLE_MENU_LOG.RML_ACTION LIKE ? AND ROLE_MENU_LOG.RML_ACTION_CONTENT LIKE ? AND ROLE_MENU_LOG.RML_TYPE LIKE ? AND ROLE_MENU_LOG.RML_CREATED_DATE >= ? AND ROLE_MENU_LOG.RML_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYROLEMENULOGSBYCREATEDNAME=HEAD+"AND ROLE_MENU_LOG.RML_ACTION LIKE ? AND ROLE_MENU_LOG.RML_ACTION_CONTENT LIKE ? AND ROLE_MENU_LOG.RML_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYROLEMENULOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND ROLE_MENU_LOG.RML_ACTION LIKE ? AND ROLE_MENU_LOG.RML_ACTION_CONTENT LIKE ? AND ROLE_MENU_LOG.RML_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND ROLE_MENU_LOG.RML_CREATED_DATE >= ? AND ROLE_MENU_LOG.RML_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<RoleMenuLog> queryAll() {
		// TODO Auto-generated method stub
		List<RoleMenuLog> roleMenuLogs=query(HEAD);
		return roleMenuLogs;
	}

	@Override
	public List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type, int begin,
			int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rml_action+"%",  
				 "%"+rml_action_content+"%",   
				 "%"+rml_type+"%",
				 begin,
				 num
		};
		List<RoleMenuLog> roleMenuLogs=query(QUERYROLEMENULOG, parameter);
		return roleMenuLogs;
	}

	@Override
	public List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type,
			String rml_created_name, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rml_action+"%",  
				 "%"+rml_action_content+"%",   
				 "%"+rml_type+"%",
				 rml_created_name,
				 begin,
				 num
		};
		List<RoleMenuLog> roleMenuLogs=query(QUERYROLEMENULOGSBYCREATEDNAME, parameter);
		return roleMenuLogs;
	}

	@Override
	public List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type,
			String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+rml_action+"%",  
				 "%"+rml_action_content+"%",   
				 "%"+rml_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<RoleMenuLog> roleMenuLogs=query(QUERYROLEMENULOGSBYTIMERANGE,parameter);
		return roleMenuLogs;
	}

	@Override
	public List<RoleMenuLog> queryRoleMenuLogs(String rml_action, String rml_action_content, String rml_type,
			String rml_created_name, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+rml_action+"%",  
				 "%"+rml_action_content+"%",   
				 "%"+rml_type+"%",
				 rml_created_name,
				 start,
				 end,
				 begin,
				 num
		};
		List<RoleMenuLog> roleMenuLogs=query(QUERYROLEMENULOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (RoleMenuLog roleMenuLog: roleMenuLogs){
			System.out.println(roleMenuLog.getRml_action()+"--"+roleMenuLog.getAcc_name());
		}
		return roleMenuLogs;
	}

	@Override
	protected Class<RoleMenuLog> getEntityClass() {
		// TODO Auto-generated method stub
		return RoleMenuLog.class;
	}

}
