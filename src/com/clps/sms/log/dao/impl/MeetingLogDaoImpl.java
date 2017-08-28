package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.MeetingLogDao;
import com.clps.sms.log.model.MeetingLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午5:14:50
 * 
 * @since 1.0
 */
@Component
public class MeetingLogDaoImpl extends BaseDaoImpl<MeetingLog> implements MeetingLogDao {

	private static final String HEAD="SELECT MEETING_LOG.RL_ID, MEETING_LOG.RL_ACTION, MEETING_LOG.RL_ACTION_CONTENT, MEETING_LOG.RL_CREATED_DATE, MEETING_LOG.RL_CREATED_ID, MEETING_LOG.RL_TYPE, ACCOUNT.ACC_NAME FROM MEETING_LOG , ACCOUNT WHERE MEETING_LOG.RL_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYMEETINGLOG=HEAD+"AND MEETING_LOG.RL_ACTION LIKE ? AND MEETING_LOG.RL_ACTION_CONTENT LIKE ? AND MEETING_LOG.RL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYMEETINGLOGSBYTIMERANGE=HEAD+"AND MEETING_LOG.RL_ACTION LIKE ? AND MEETING_LOG.RL_ACTION_CONTENT LIKE ? AND MEETING_LOG.RL_TYPE LIKE ? AND MEETING_LOG.RL_CREATED_DATE >= ? AND MEETING_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYMEETINGLOGSBYCREATEDNAME=HEAD+"AND MEETING_LOG.RL_ACTION LIKE ? AND MEETING_LOG.RL_ACTION_CONTENT LIKE ? AND MEETING_LOG.RL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYMEETINGLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND MEETING_LOG.RL_ACTION LIKE ? AND MEETING_LOG.RL_ACTION_CONTENT LIKE ? AND MEETING_LOG.RL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND MEETING_LOG.RL_CREATED_DATE >= ? AND MEETING_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<MeetingLog> queryAll() {
		// TODO Auto-generated method stub
		List<MeetingLog> meetingLogs=query(HEAD);
		return meetingLogs;
	}

	@Override
	public List<MeetingLog> queryMeetingLogs(String rl_action, String rl_action_content, String rl_type, int begin,
			int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 begin,
				 num
		};
		List<MeetingLog> MeetingLogs=query(QUERYMEETINGLOG, parameter);
		return MeetingLogs;
	}

	@Override
	public List<MeetingLog> queryMeetingLogs(String rl_action, String rl_action_content, String rl_type,
			String rl_created_name, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 rl_created_name,
				 begin,
				 num
		};
		List<MeetingLog> MeetingLogs=query(QUERYMEETINGLOGSBYCREATEDNAME, parameter);
		return MeetingLogs;
	}

	@Override
	public List<MeetingLog> queryMeetingLogs(String rl_action, String rl_action_content, String rl_type, String start,
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
		List<MeetingLog> MeetingLogs=query(QUERYMEETINGLOGSBYTIMERANGE,parameter);
		return MeetingLogs;
	}

	@Override
	public List<MeetingLog> queryMeetingLogs(String rl_action, String rl_action_content, String rl_type,
			String rl_created_name, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 rl_created_name,
				 start,
				 end,
				 begin,
				 num
		};
		List<MeetingLog> MeetingLogs=query(QUERYMEETINGLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (MeetingLog MeetingLog: MeetingLogs){
			System.out.println(MeetingLog.getRl_action()+"--"+MeetingLog.getAcc_name());
		}
		return MeetingLogs;
	}

	@Override
	protected Class<MeetingLog> getEntityClass() {
		// TODO Auto-generated method stub
		return MeetingLog.class;
	}

	
}
