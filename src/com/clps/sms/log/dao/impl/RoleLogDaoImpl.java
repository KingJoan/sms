package com.clps.sms.log.dao.impl;

import java.util.List;

import com.clps.sms.log.dao.RoleLogDao;
import com.clps.sms.log.model.RoleLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午6:54:43
 * 
 * @since 1.0
 */
public class RoleLogDaoImpl extends BaseDaoImpl<RoleLog> implements RoleLogDao {
	
	private static final String HEAD="SELECT ROLE_LOG.RL_ID, ROLE_LOG.RL_ACTION, ROLE_LOG.RL_ACTION_CONTENT, ROLE_LOG.RL_CREATED_DATE, ROLE_LOG.RL_CREATED_ID, ROLE_LOG.RL_TYPE, ROLE.ROLE_NAME FROM ROLE_LOG , ROLE WHERE ROLE_LOG.RL_CREATED_ID = ROLE.ROLE_ID ";
	
	private static final String QUERYROLELOG=HEAD+"AND ROLE_LOG.RL_ACTION LIKE ? AND ROLE_LOG.RL_ACTION_CONTENT LIKE ? AND ROLE_LOG.RL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYROLELOGSBYTIMERANGE=HEAD+"AND ROLE_LOG.RL_ACTION LIKE ? AND ROLE_LOG.RL_ACTION_CONTENT LIKE ? ROLE_LOG.RL_TYPE LIKE ? AND ROLE_LOG.RL_CREATED_DATE >= ? AND ROLE_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYROLELOGSBYCREATEDNAME=HEAD+"AND ROLE_LOG.RL_ACTION LIKE ? AND ROLE_LOG.RL_ACTION_CONTENT LIKE ? AND ROLE_LOG.RL_TYPE LIKE ? AND ROLE.ROLE_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYROLELOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND ROLE_LOG.RL_ACTION LIKE ? AND ROLE_LOG.RL_ACTION_CONTENT LIKE ? AND ROLE_LOG.RL_TYPE LIKE ? AND ROLE.ROLE_NAME = ? AND ROLE_LOG.RL_CREATED_DATE >= ? AND ROLE_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<RoleLog> queryAll() {
		// TODO Auto-generated method stub
		List<RoleLog> roleLogs=query(HEAD);
		return roleLogs;
	}

	@Override
	public List<RoleLog> queryRoleLogs(String rl_action, String rl_action_content, String rl_type, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 begin,
				 num
		};
		List<RoleLog> roleLogs=query(QUERYROLELOG, parameter);
		return roleLogs;
	}

	@Override
	public List<RoleLog> queryRoleLogs(String rl_action, String rl_action_content, String rl_type,
			Integer rl_created_id, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 rl_created_id,
				 begin,
				 num
		};
		List<RoleLog> roleLogs=query(QUERYROLELOGSBYTIMERANGE, parameter);
		return roleLogs;
	}

	@Override
	public List<RoleLog> queryRoleLogs(String rl_action, String rl_action_content, String rl_type, String start,
			String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<RoleLog> roleLogs=query(QUERYROLELOGSBYCREATEDNAME,parameter);
		return roleLogs;
	}

	@Override
	public List<RoleLog> queryRoleLogs(String rl_action, String rl_action_content, String rl_type,
			Integer rl_created_id, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 rl_created_id,
				 start,
				 end,
				 begin,
				 num
		};
		List<RoleLog> roleLogs=query(QUERYROLELOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (RoleLog roleLog: roleLogs){
			System.out.println(roleLog.getRl_action()+"--"+roleLog.getAcc_name());
		}
		return roleLogs;
	}

	@Override
	protected Class<RoleLog> getEntityClass() {
		// TODO Auto-generated method stub
		return RoleLog.class;
	}

}
