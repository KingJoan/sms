package com.clps.sms.log.dao.impl;

import java.util.List;

import com.clps.sms.log.dao.AccountMeetingLogDao;
import com.clps.sms.log.model.AccountMeetingLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:15:02
 * 
 * @since 1.0
 */
public class AccountMeetingLogDaoImpl extends BaseDaoImpl<AccountMeetingLog> implements AccountMeetingLogDao {
	
	private static final String HEAD="SELECT ACCOUNT_MEETING_LOG.AML_ID, ACCOUNT_MEETING_LOG.AML_ACTION, ACCOUNT_MEEETING_LOG.AML_ACTION_CONTENT, ACCOUNT_MEETING_LOG.AML_CREATED_DATE, ACCOUNT_MEETING_LOG.AML_CREATED_ID, ACCOUNT_MEETING_LOG.AML_TYPE, ACCOUNT_MEETING.AM_NAME FROM ACCOUNT_MEETING_LOG , ACCOUNT WHERE ACCOUNT_MEETING_LOG.AML_CREATED_ID = ACCOUNT_MEETING.AM_ID ";
	
	private static final String QUERYACCOUNTMEETINGLOG=HEAD+"AND ACCOUNT_MEETING_LOG.AML_ACTION LIKE ? AND ACCOUNT_MEETING_LOG.AML_ACTION_CONTENT LIKE ? AND ACCOUNT_MEETING_LOG.AML_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTMEETINGLOGSBYTIMERANGE=HEAD+"AND ACCOUNT_MEETING_LOG.AML_ACTION LIKE ? AND ACCOUNT_MEETING_LOG.AML_ACTION_CONTENT LIKE ? AND ACCOUNT_MEETING_LOG.AML_TYPE LIKE ? AND ACCOUNT_MEETING_LOG.AML_CREATED_DATE >= ? AND ACCOUNT_MEETING_LOG.AML_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTMEETINGLOGSBYCREATEDNAME=HEAD+"AND ACCOUNT_MEETING_LOG.AML_ACTION LIKE ? AND ACCOUNT_MEETING_LOG.AML_ACTION_CONTENT LIKE ? AND ACCOUNT_MEETING_LOG.AML_TYPE LIKE ? AND ACCOUNT_MEETING.AM_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYACCOUNTMEETINGLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND ACCOUNT_MEETING_LOG.AML_ACTION LIKE ? AND ACCOUNT_MEETING_LOG.AML_ACTION_CONTENT LIKE ? AND ACCOUNT_MEETING_LOG.AML_TYPE LIKE ? AND ACCOUNT_MEETING.AM_NAME = ? AND ACCOUNT_MEETING_LOG.AML_CREATED_DATE >= ? AND ACCOUNT_MEETING_LOG.AML_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<AccountMeetingLog> queryAll() {
		// TODO Auto-generated method stub
		List<AccountMeetingLog> accountMeetingLogs=query(HEAD);
		return accountMeetingLogs;
	}

	@Override
	public List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content,
			String aml_type, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+aml_action+"%",  
				 "%"+aml_action_content+"%",   
				 "%"+aml_type+"%",
				 begin,
				 num
		};
		List<AccountMeetingLog> accountMeetingLogs=query(QUERYACCOUNTMEETINGLOG, parameter);
		return accountMeetingLogs;
	}

	@Override
	public List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content,
			String aml_type, Integer aml_created_id, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+aml_action+"%",  
				 "%"+aml_action_content+"%",   
				 "%"+aml_type+"%",
				 aml_created_id,
				 begin,
				 num
		};
		List<AccountMeetingLog> accountMeetingLogs=query(QUERYACCOUNTMEETINGLOGSBYCREATEDNAME, parameter);
		return accountMeetingLogs;
	}

	@Override
	public List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content,
			String aml_type, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+aml_action+"%",  
				 "%"+aml_action_content+"%",   
				 "%"+aml_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<AccountMeetingLog> accountMeetingLogs=query(QUERYACCOUNTMEETINGLOGSBYTIMERANGE,parameter);
		return accountMeetingLogs;
	}

	@Override
	public List<AccountMeetingLog> queryAccountMeetingLogs(String aml_action, String aml_action_content,
			String aml_type, Integer aml_created_id, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
	Object[] parameter=new Object[]{
			 "%"+aml_action+"%",  
			 "%"+aml_action_content+"%",   
			 "%"+aml_type+"%",
			 aml_created_id,
			 start,
			 end,
			 begin,
			 num
	};
	List<AccountMeetingLog> accountMeetingLogs=query(QUERYACCOUNTMEETINGLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
	System.out.println("-------------------------------------");
	for (AccountMeetingLog accountMeetingLog: accountMeetingLogs){
		System.out.println(accountMeetingLog.getAml_action()+"--"+accountMeetingLog.getAcc_name());
	}
	return accountMeetingLogs;
	}

	@Override
	protected Class<AccountMeetingLog> getEntityClass() {
		// TODO Auto-generated method stub
		return AccountMeetingLog.class;
	}




}
