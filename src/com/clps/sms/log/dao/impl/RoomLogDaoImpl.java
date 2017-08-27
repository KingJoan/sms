package com.clps.sms.log.dao.impl;

import java.util.List;

import com.clps.sms.log.dao.RoomLogDao;
import com.clps.sms.log.model.RoomLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午7:39:52
 * 
 * @since 1.0
 */
public class RoomLogDaoImpl extends BaseDaoImpl<RoomLog> implements RoomLogDao {
	
	private static final String HEAD="SELECT ROOM_LOG.RL_ID, ROOM_LOG.RL_ACTION, ROOM_LOG.RL_ACTION_CONTENT, ROOM_LOG.RL_CREATED_DATE, ROOM_LOG.RL_CREATED_ID, ROOM_LOG.RL_TYPE, ROOM.ROOM_NAME FROM ROOM_LOG , ROOM WHERE ROOM_LOG.RL_CREATED_ID = ROOM.ROOM_ID ";
	
	private static final String QUERYROOMLOG=HEAD+"AND ROOM_LOG.RL_ACTION LIKE ? AND ROOM_LOG.RL_ACTION_CONTENT LIKE ? AND ROOM_LOG.RL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYROOMLOGSBYTIMERANGE=HEAD+"AND ROOM_LOG.RL_ACTION LIKE ? AND ROOM_LOG.RL_ACTION_CONTENT LIKE ? ROOM_LOG.RL_TYPE LIKE ? AND ROOM_LOG.RL_CREATED_DATE >= ? AND ROOM_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYROOMLOGSBYCREATEDNAME=HEAD+"AND ROOM_LOG.RL_ACTION LIKE ? AND ROOM_LOG.RL_ACTION_CONTENT LIKE ? AND ROOM_LOG.RL_TYPE LIKE ? ROOM.ROOM_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYROOMLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND ROOM_LOG.RL_ACTION LIKE ? AND ROOM_LOG.RL_ACTION_CONTENT LIKE ? AND ROOM_LOG.RL_TYPE LIKE ? AND ROOM.ROOM_NAME = ? AND ROOM_LOG.RL_CREATED_DATE >= ? AND ROOM_LOG.RL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<RoomLog> queryAll() {
		// TODO Auto-generated method stub
		List<RoomLog> roomLogs=query(HEAD);
		return roomLogs;
	}

	@Override
	public List<RoomLog> queryRoomLogs(String rl_action, String rl_action_content, String rl_type, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+rl_action+"%",  
				 "%"+rl_action_content+"%",   
				 "%"+rl_type+"%",
				 begin,
				 num
		};
		List<RoomLog> roomLogs=query(QUERYROOMLOG, parameter);
		return roomLogs;
	}

	@Override
	public List<RoomLog> queryRoomLogs(String rl_action, String rl_action_content, String rl_type,
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
		List<RoomLog> roomLogs=query(QUERYROOMLOGSBYTIMERANGE, parameter);
		return roomLogs;
	}

	@Override
	public List<RoomLog> queryRoomLogs(String rl_action, String rl_action_content, String rl_type, String start,
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
		List<RoomLog> roomLogs=query(QUERYROOMLOGSBYCREATEDNAME,parameter);
		return roomLogs;
	}

	@Override
	public List<RoomLog> queryRoomLogs(String rl_action, String rl_action_content, String rl_type,
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
		List<RoomLog> roomLogs=query(QUERYROOMLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (RoomLog roomLog: roomLogs){
			System.out.println(roomLog.getRl_action()+"--"+roomLog.getAcc_name());
		}
		return roomLogs;
	}

	@Override
	protected Class<RoomLog> getEntityClass() {
		// TODO Auto-generated method stub
		return RoomLog.class;
	}

}
