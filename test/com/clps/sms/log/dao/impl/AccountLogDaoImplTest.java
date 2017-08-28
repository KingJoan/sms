package com.clps.sms.log.dao.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.AccountLogDao;
import com.clps.sms.log.model.AccountLog;

public class AccountLogDaoImplTest {
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testAccountLogDaoImpl(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountLogDao accountLogDao=ctx.getBean(AccountLogDaoImpl.class);
		/*List<AccountLog> accountLogs=accountLogDao.queryAll();
		for (AccountLog accountLog : accountLogs) {
			System.out.println(accountLog);
		}*/
		/*List<AccountLog> accountLogs2=accountLogDao.queryAccountLogs("改",	"",		"",		0, 						5	);
		for (AccountLog accountLog : accountLogs2) {
			System.out.println(accountLog);
		}*/
		/*List<AccountLog> accountLogs3=accountLogDao.queryAccountLogs("",		"",		"",		"咔咔",				0, 						5);
		for (AccountLog accountLog : accountLogs3) {
			System.out.println(accountLog);
		}*/
		/*List<AccountLog> accountLogs4=accountLogDao.queryAccountLogs("", 		"",		"",		"2017-08-09",		"2017-08-24",		0,						5);
		for (AccountLog accountLog : accountLogs4) {
			System.out.println(accountLog);
		}*/
		List<AccountLog> accountLogs5=accountLogDao.queryAccountLogs("",		"",		"",		"咔咔",				"2017/08/09",		"2017/08/23",		0, 		5);	
		for (AccountLog accountLog : accountLogs5) {
			System.out.println(accountLog);
		}
	}	
}
