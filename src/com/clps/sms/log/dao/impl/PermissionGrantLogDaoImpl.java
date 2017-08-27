package com.clps.sms.log.dao.impl;

import java.util.List;

import com.clps.sms.log.dao.PermissionGrantLogDao;
import com.clps.sms.log.model.PermissionGrantLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:14:34
 * 
 * @since 1.0
 */
public class PermissionGrantLogDaoImpl extends BaseDaoImpl<PermissionGrantLog>implements PermissionGrantLogDao {
	
	private static final String HEAD="SELECT PERMISSION_GRANT_LOG.PGL_ID, PERMISSION_GRANT_LOG.PGL_ACTION, PERMISSION_GRANT_LOG.PGL_ACTION_CONTENT, PERMISSION_GRANT_LOG.PGL_CREATED_DATE, PERMISSION_GRANT_LOG.PGL_CREATED_ID, PERMISSION_GRANT_LOG.PGL_TYPE, PERMISSION_GRANT.PG_NAME FROM PERMISSION_GRANT_LOG , PERMISSION_GRANT WHERE PERMISSION_GRANT_LOG.PGL_CREATED_ID = PERMISSION.PG_ID ";
	
	private static final String QUERYPERMISSIONGRANTLOG=HEAD+"AND PERMISSION_GRANT_LOG.PGL_ACTION LIKE ? AND PERMISSION_GRANT_LOG.PGL_ACTION_CONTENT LIKE ? AND PERMISSION_GRANT_LOG.PGL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONGRANTLOGSBYTIMERANGE=HEAD+"AND PERMISSION_GRANT_LOG.PGL_ACTION LIKE ? AND PERMISSION_GRANT_LOG.PGL_ACTION_CONTENT LIKE ? PERMISSION_GRANT_LOG.PGL_TYPE LIKE ? AND PERMISSION_GRANT_LOG.PGL_CREATED_DATE >= ? AND PERMISSION_GRANT_LOG.PGL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONGRANTLOGSBYCREATEDNAME=HEAD+"AND PERMISSION_GRANT_LOG.PGL_ACTION LIKE ? AND PERMISSION_GRANT_LOG.PGL_ACTION_CONTENT LIKE ? AND PERMISSION_GRANT_LOG.PGL_TYPE LIKE ? AND PERMISSION.PG_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYPERMISSIONGRANTLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND PERMISSION_GRANT_LOG.PGL_ACTION LIKE ? AND PERMISSION_GRANT_LOG.PGL_ACTION_CONTENT LIKE ? AND PERMISSION_GRANT_LOG.PGL_TYPE LIKE ? AND PERMISSION_GRANT.PG_NAME = ? AND PERMISSION_GRANT_LOG.PGL_CREATED_DATE >= ? AND PERMISSION_GRANT_LOG.PGL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<PermissionGrantLog> queryAll() {
		// TODO Auto-generated method stub
		List<PermissionGrantLog> permissionGrantLogs=query(HEAD);
		return permissionGrantLogs;
	}

	@Override
	public List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content,
			String pgl_type, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+pgl_action+"%",  
				 "%"+pgl_action_content+"%",   
				 "%"+pgl_type+"%",
				 begin,
				 num
		};
		List<PermissionGrantLog> permissionGrantLogs=query(QUERYPERMISSIONGRANTLOG, parameter);
		return permissionGrantLogs;
	}

	@Override
	public List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content,
			String pgl_type, Integer pgl_created_id, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+pgl_action+"%",  
				 "%"+pgl_action_content+"%",   
				 "%"+pgl_type+"%",
				 pgl_created_id,
				 begin,
				 num
		};
		List<PermissionGrantLog> permissionGrantLogs=query(QUERYPERMISSIONGRANTLOGSBYTIMERANGE, parameter);
		return permissionGrantLogs;
	}

	@Override
	public List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content,
			String pgl_type, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+pgl_action+"%",  
				 "%"+pgl_action_content+"%",   
				 "%"+pgl_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<PermissionGrantLog> permissionGrantLogs=query(QUERYPERMISSIONGRANTLOGSBYCREATEDNAME,parameter);
		return permissionGrantLogs;
	}

	@Override
	public List<PermissionGrantLog> queryPermissionGrantLogs(String pgl_action, String pgl_action_content,
			String pgl_type, Integer pgl_created_id, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+pgl_action+"%",  
				 "%"+pgl_action_content+"%",   
				 "%"+pgl_type+"%",
				 pgl_created_id,
				 start,
				 end,
				 begin,
				 num
		};
		List<PermissionGrantLog> permissionGrantLogs=query(QUERYPERMISSIONGRANTLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (PermissionGrantLog permissionGrantLog: permissionGrantLogs){
			System.out.println(permissionGrantLog.getPgl_action()+"--"+permissionGrantLog.getAcc_name());
		}
		return permissionGrantLogs;
	}

	@Override
	protected Class<PermissionGrantLog> getEntityClass() {
		// TODO Auto-generated method stub
		return PermissionGrantLog.class;
	}

}
