package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.AccountLogDao;
import com.clps.sms.log.model.AccountLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:15:08
 * 
 * @since 1.0
 */
@Component
public class AccountLogDaoImpl extends BaseDaoImpl<AccountLog> implements AccountLogDao {
	
	private static final String HEAD="SELECT ACCOUNT_LOG.AL_ID, ACCOUNT_LOG.AL_ACTION, ACCOUNT_LOG.AL_ACTION_CONTENT, ACCOUNT_LOG.AL_CREATED_DATE, ACCOUNT_LOG.AL_CREATED_ID, ACCOUNT_LOG.AL_TYPE, ACCOUNT.ACC_NAME FROM ACCOUNT_LOG , ACCOUNT WHERE ACCOUNT_LOG.AL_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYACCOUNTLOG=HEAD+"AND ACCOUNT_LOG.AL_ACTION LIKE ? AND ACCOUNT_LOG.AL_ACTION_CONTENT LIKE ? AND ACCOUNT_LOG.AL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTLOGSBYTIMERANGE=HEAD+"AND ACCOUNT_LOG.AL_ACTION LIKE ? AND ACCOUNT_LOG.AL_ACTION_CONTENT LIKE ? AND ACCOUNT_LOG.AL_TYPE LIKE ? AND ACCOUNT_LOG.AL_CREATED_DATE >= ? AND ACCOUNT_LOG.AL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTLOGSBYCREATEDNAME=HEAD+"AND ACCOUNT_LOG.AL_ACTION LIKE ? AND ACCOUNT_LOG.AL_ACTION_CONTENT LIKE ? AND ACCOUNT_LOG.AL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND ACCOUNT_LOG.AL_ACTION LIKE ? AND ACCOUNT_LOG.AL_ACTION_CONTENT LIKE ? AND ACCOUNT_LOG.AL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND ACCOUNT_LOG.AL_CREATED_DATE >= ? AND ACCOUNT_LOG.AL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	@Override
	protected Class<AccountLog> getEntityClass() {
		// TODO Auto-generated method stub
		return AccountLog.class;
	}

	@Override
	public List<AccountLog> queryAll() {
		// TODO Auto-generated method stub
		List<AccountLog> accountLogs=query(HEAD);
		return accountLogs;
	}

	@Override
	public List<AccountLog> queryAccountLogs(String al_action, String al_action_content, String al_type, int begin,
			int num) {
		Object[] parameter=new Object[]{
				 "%"+al_action+"%",  
				 "%"+al_action_content+"%",   
				 "%"+al_type+"%",
				 begin,
				 num
		};
		List<AccountLog> accountLogs=query(QUERYACCOUNTLOG,parameter);
		return accountLogs;
	}
	
	@Override
	public List<AccountLog> queryAccountLogs(String al_action, String al_action_content, String al_type,
			String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+al_action+"%",  
				 "%"+al_action_content+"%",   
				 "%"+al_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<AccountLog> accountLogs=query(QUERYACCOUNTLOGSBYTIMERANGE,parameter);
		return accountLogs;
	}
	
	@Override
	public List<AccountLog> queryAccountLogs(String al_action, String al_action_content, String al_type,
			Integer al_created_id, int begin, int num) {
		Object[] parameter=new Object[]{
				 "%"+al_action+"%",  
				 "%"+al_action_content+"%",   
				 "%"+al_type+"%",
				 al_created_id,
				 begin,
				 num
		};
		List<AccountLog> accountLogs=query(QUERYACCOUNTLOGSBYCREATEDNAME,parameter);
		return accountLogs;
	}
	
	@Override
	public List<AccountLog> queryAccountLogs(String al_action, String al_action_content,
			String al_type, Integer al_created_id, String start, String end, int begin, int num) {
		Object[] parameter=new Object[]{
				 "%"+al_action+"%",  
				 "%"+al_action_content+"%",   
				 "%"+al_type+"%",
				 al_created_id,
				 start,
				 end,
				 begin,
				 num
		};
		List<AccountLog> accountLogs=query(QUERYACCOUNTLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (AccountLog accountLog: accountLogs){
			System.out.println(accountLog.getAl_action()+"--"+accountLog.getAcc_name());
		}
		return accountLogs;
	}
}
