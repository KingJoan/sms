package com.clps.sms.log.factory;

import com.clps.sms.log.service.LogService;
import com.clps.sms.log.service.impl.LogAccountMeetingServiceImpl;
import com.clps.sms.log.service.impl.LogAccountServiceImpl;

/**
 * 	LogService 静态工厂
 * @author honor
 *
 * 2017年8月26日 下午9:19:18
 * 
 * @since 1.0
 */
public class LogServiceFactory {

	private static LogService logAccountService=new LogAccountServiceImpl();
	private static LogService logAccountMeetingService=new LogAccountMeetingServiceImpl();

	public static LogService getLogAccountServiceInstance(){
		return logAccountService;
	}
	
	public static LogService getLogAccountMeetingServiceInstance(){
		return logAccountMeetingService;
	}
}
