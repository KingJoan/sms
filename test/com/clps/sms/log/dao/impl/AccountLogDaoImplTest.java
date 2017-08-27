package com.clps.sms.log.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.AccountLogDao;

public class AccountLogDaoImplTest {
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testAccountLogDaoImpl(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountLogDao accountLogDao=ctx.getBean(AccountLogDaoImpl.class);
		accountLogDao.queryAll();
//		accountLogDao.queryAccountLogs("改",	"",		"",		0, 						5	);
//		accountLogDao.queryAccountLogs("",		"",		"",		"咔咔",				0, 						5);
//		accountLogDao.queryAccountLogs("", 		"",		"",		"2017-08-23",		"2017-08-24",		0,						5);
//		accountLogDao.queryAccountLogs("",		"",		"",		"test",				"2017/08/22",		"2017/08/23",		0, 		5);	
		
	}
}
