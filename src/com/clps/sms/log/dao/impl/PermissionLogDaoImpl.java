package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.PermissionLogDao;
import com.clps.sms.log.model.PermissionLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:15:24
 * 
 * @since 1.0
 */
@Component
public class PermissionLogDaoImpl extends BaseDaoImpl<PermissionLog> implements PermissionLogDao {
	
	private static final String HEAD="SELECT PERMISSION_LOG.PL_ID, PERMISSION_LOG.PL_ACTION, PERMISSION_LOG.PL_ACTION_CONTENT, PERMISSION_LOG.PL_CREATED_DATE, PERMISSION_LOG.PL_CREATED_ID, PERMISSION_LOG.PL_TYPE, ACCOUNT.ACC_NAME FROM PERMISSION_LOG , ACCOUNT WHERE PERMISSION_LOG.PL_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYPERMISSIONLOG=HEAD+"AND PERMISSION_LOG.PL_ACTION LIKE ? AND PERMISSION_LOG.PL_ACTION_CONTENT LIKE ? AND PERMISSION_LOG.PL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONLOGSBYTIMERANGE=HEAD+"AND PERMISSION_LOG.PL_ACTION LIKE ? AND PERMISSION_LOG.PL_ACTION_CONTENT LIKE ? PERMISSION_LOG.PL_TYPE LIKE ? AND PERMISSION_LOG.PL_CREATED_DATE >= ? AND PERMISSION_LOG.PL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONLOGSBYCREATEDNAME=HEAD+"AND PERMISSION_LOG.PL_ACTION LIKE ? AND PERMISSION_LOG.PL_ACTION_CONTENT LIKE ? AND PERMISSION_LOG.PL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND PERMISSION_LOG.PL_ACTION LIKE ? AND PERMISSION_LOG.PL_ACTION_CONTENT LIKE ? AND PERMISSION_LOG.PL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND PERMISSION_LOG.PL_CREATED_DATE >= ? AND PERMISSION_LOG.PL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<PermissionLog> queryAll() {
		// TODO Auto-generated method stub
		List<PermissionLog> permissionLogs=query(HEAD);
		return permissionLogs;
	}

	@Override
	public List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+pl_action+"%",  
				 "%"+pl_action_content+"%",   
				 "%"+pl_type+"%",
				 begin,
				 num
		};
		List<PermissionLog> permissionLogs=query(QUERYPERMISSIONLOG, parameter);
		return permissionLogs;
	}

	@Override
	public List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			String pl_created_name, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+pl_action+"%",  
				 "%"+pl_action_content+"%",   
				 "%"+pl_type+"%",
				 pl_created_name,
				 begin,
				 num
		};
		List<PermissionLog> permissionLogs=query(QUERYPERMISSIONLOGSBYCREATEDNAME, parameter);
		return permissionLogs;
	}

	@Override
	public List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+pl_action+"%",  
				 "%"+pl_action_content+"%",   
				 "%"+pl_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<PermissionLog> permissionLogs=query(QUERYPERMISSIONLOGSBYTIMERANGE,parameter);
		return permissionLogs;
	}

	@Override
	public List<PermissionLog> queryPermissionLogs(String pl_action, String pl_action_content, String pl_type,
			String pl_created_name, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+pl_action+"%",  
				 "%"+pl_action_content+"%",   
				 "%"+pl_type+"%",
				 pl_created_name,
				 start,
				 end,
				 begin,
				 num
		};
		List<PermissionLog> permissionLogs=query(QUERYPERMISSIONLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (PermissionLog permissionLog: permissionLogs){
			System.out.println(permissionLog.getPl_action()+"--"+permissionLog.getAcc_name());
		}
		return permissionLogs;
	}

	@Override
	protected Class<PermissionLog> getEntityClass() {
		// TODO Auto-generated method stub
		return PermissionLog.class;
	}

}
