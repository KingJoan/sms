package com.clps.sms.log.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.AccountMeetingLogDao;
import com.clps.sms.log.model.AccountMeetingLog;

public class AccountMeetingLogDaoImplTest {

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMeetingLogDao accountMeetingLogDao=ctx.getBean(AccountMeetingLogDaoImpl.class);
		List<AccountMeetingLog> accountMeetingLogs=accountMeetingLogDao.queryAll();
		for (AccountMeetingLog accountMeetingLog : accountMeetingLogs) {
			System.out.println(accountMeetingLog);
		}
	}*/

	/*@Test
	public void testQueryAccountMeetingLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMeetingLogDao accountMeetingLogDao=ctx.getBean(AccountMeetingLogDaoImpl.class);
		List<AccountMeetingLog> accountMeetingLogs=accountMeetingLogDao.queryAccountMeetingLogs("",	"",		"",		0, 						5	);
		
		for (AccountMeetingLog accountMeetingLog : accountMeetingLogs) {
			System.out.println(accountMeetingLog);
		}
	}*/

	/*@Test
	public void testQueryAccountMeetingLogsStringStringStringIntegerIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMeetingLogDao accountMeetingLogDao=ctx.getBean(AccountMeetingLogDaoImpl.class);
		List<AccountMeetingLog> accountMeetingLogs=accountMeetingLogDao.queryAccountMeetingLogs("",	"",		"",		"咔咔",0, 						5	);
		
		for (AccountMeetingLog accountMeetingLog : accountMeetingLogs) {
			System.out.println(accountMeetingLog);
		}
	}*/

	/*@Test
	public void testQueryAccountMeetingLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMeetingLogDao accountMeetingLogDao=ctx.getBean(AccountMeetingLogDaoImpl.class);
		List<AccountMeetingLog> accountMeetingLogs=accountMeetingLogDao.queryAccountMeetingLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 		5	);
		
		for (AccountMeetingLog accountMeetingLog : accountMeetingLogs) {
			System.out.println(accountMeetingLog);
		}
	}*/

	@Test
	public void testQueryAccountMeetingLogsStringStringStringIntegerStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMeetingLogDao accountMeetingLogDao=ctx.getBean(AccountMeetingLogDaoImpl.class);
		List<AccountMeetingLog> accountMeetingLogs=accountMeetingLogDao.queryAccountMeetingLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		
		for (AccountMeetingLog accountMeetingLog : accountMeetingLogs) {
			System.out.println(accountMeetingLog);
		}
	}

	/*@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}*/
}
