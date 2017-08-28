package com.clps.sms.log.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.clps.sms.log.dao.SysParameterLogDao;
import com.clps.sms.log.model.SysParameterLog;
import com.clps.sms.util.db.BaseDaoImpl;
/**
 * 
 * @author dell
 *
 * 2017年8月26日 下午7:54:06
 * 
 * @since 1.0
 */
@Component
public class SysParameterLogDaoImpl extends BaseDaoImpl<SysParameterLog> implements SysParameterLogDao {
	
	private static final String HEAD="SELECT SYS_PARAMETER_LOG.SPL_ID, SYS_PARAMETER_LOG.SPL_ACTION, SYS_PARAMETER_LOG.SPL_ACTION_CONTENT, SYS_PARAMETER_LOG.SPL_CREATED_DATE, SYS_PARAMETER_LOG.SPL_CREATED_ID, SYS_PARAMETER_LOG.SPL_TYPE, ACCOUNT.ACC_NAME FROM SYS_PARAMETER_LOG , ACCOUNT WHERE SYS_PARAMETER_LOG.SPL_CREATED_ID = ACCOUNT.ACC_ID ";
	
	private static final String QUERYSYSPARAMETERLOG=HEAD+"AND SYS_PARAMETER_LOG.SPL_ACTION LIKE ? AND SYS_PARAMETER_LOG.SPL_ACTION_CONTENT LIKE ? AND SYS_PARAMETER_LOG.SPL_TYPE LIKE ? LIMIT ?,  ?";
	
	private static final String QUERYSYSPARAMETERLOGSBYTIMERANGE=HEAD+"AND SYS_PARAMETER_LOG.SPL_ACTION LIKE ? AND SYS_PARAMETER_LOG.SPL_ACTION_CONTENT LIKE ? AND SYS_PARAMETER_LOG.SPL_TYPE LIKE ? AND SYS_PARAMETER_LOG.SPL_CREATED_DATE >= ? AND SYS_PARAMETER_LOG.SPL_CREATED_DATE <= ? LIMIT ?,  ?";
	
	private static final String QUERYSYSPARAMETERLOGSBYCREATEDNAME=HEAD+"AND SYS_PARAMETER_LOG.SPL_ACTION LIKE ? AND SYS_PARAMETER_LOG.SPL_ACTION_CONTENT LIKE ? AND SYS_PARAMETER_LOG.SPL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? LIMIT ?,  ?";
	
	private static final String QUERYSYSPARAMETERLOGSBYCREATEDNAMEANDTIMERANGE=HEAD+"AND SYS_PARAMETER_LOG.SPL_ACTION LIKE ? AND SYS_PARAMETER_LOG.SPL_ACTION_CONTENT LIKE ? AND SYS_PARAMETER_LOG.SPL_TYPE LIKE ? AND ACCOUNT.ACC_NAME = ? AND SYS_PARAMETER_LOG.SPL_CREATED_DATE >= ? AND SYS_PARAMETER_LOG.SPL_CREATED_DATE <= ? LIMIT ?,  ?";

	@Override
	public List<SysParameterLog> queryAll() {
		// TODO Auto-generated method stub
		List<SysParameterLog> sysParameterLogs=query(HEAD);
		return sysParameterLogs;
	}

	@Override
	public List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+spl_action+"%",  
				 "%"+spl_action_content+"%",   
				 "%"+spl_type+"%",
				 begin,
				 num
		};
		List<SysParameterLog> sysParameterLogs=query(QUERYSYSPARAMETERLOG, parameter);
		return sysParameterLogs;
	}

	@Override
	public List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			String spl_created_name, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				"%"+spl_action+"%",  
				 "%"+spl_action_content+"%",   
				 "%"+spl_type+"%",
				 spl_created_name,
				 begin,
				 num
		};
		List<SysParameterLog> sysParameterLogs=query(QUERYSYSPARAMETERLOGSBYCREATEDNAME, parameter);
		return sysParameterLogs;
	}

	@Override
	public List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+spl_action+"%",  
				 "%"+spl_action_content+"%",   
				 "%"+spl_type+"%",
				 start,
				 end,
				 begin,
				 num
		};
		List<SysParameterLog> sysParameterLogs=query(QUERYSYSPARAMETERLOGSBYTIMERANGE,parameter);
		return sysParameterLogs;
	}

	@Override
	public List<SysParameterLog> querySysParameterLogs(String spl_action, String spl_action_content, String spl_type,
			String spl_created_name, String start, String end, int begin, int num) {
		// TODO Auto-generated method stub
		Object[] parameter=new Object[]{
				 "%"+spl_action+"%",  
				 "%"+spl_action_content+"%",   
				 "%"+spl_type+"%",
				 spl_created_name,
				 start,
				 end,
				 begin,
				 num
		};
		List<SysParameterLog> sysParameterLogs=query(QUERYSYSPARAMETERLOGSBYCREATEDNAMEANDTIMERANGE,parameter);
		System.out.println("-------------------------------------");
		for (SysParameterLog sysParameterLog: sysParameterLogs){
			System.out.println(sysParameterLog.getSpl_action()+"--"+sysParameterLog.getAcc_name());
		}
		return sysParameterLogs;
	}

	@Override
	protected Class<SysParameterLog> getEntityClass() {
		// TODO Auto-generated method stub
		return SysParameterLog.class;
	}

}
