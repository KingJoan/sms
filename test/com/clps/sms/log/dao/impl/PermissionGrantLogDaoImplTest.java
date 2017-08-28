package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.PermissionGrantLogDao;
import com.clps.sms.log.model.PermissionGrantLog;

public class PermissionGrantLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionGrantLogDao permissionGrantLogDao=ctx.getBean(PermissionGrantLogDaoImpl.class);
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryAll();
		for (PermissionGrantLog permissionGrantLog : permissionGrantLogs) {
			System.out.println(permissionGrantLog);
		}
	}*/

	/*@Test
	public void testQueryPermissionGrantLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionGrantLogDao permissionGrantLogDao=ctx.getBean(PermissionGrantLogDaoImpl.class);
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs("",	"",		"",		0, 						5);
		for (PermissionGrantLog permissionGrantLog : permissionGrantLogs) {
			System.out.println(permissionGrantLog);
		}
	}*/

	/*@Test
	public void testQueryPermissionGrantLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionGrantLogDao permissionGrantLogDao=ctx.getBean(PermissionGrantLogDaoImpl.class);
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs("",	"",		"",		"咔咔",0, 						5);
		for (PermissionGrantLog permissionGrantLog : permissionGrantLogs) {
			System.out.println(permissionGrantLog);
		}
	}*/

	/*@Test
	public void testQueryPermissionGrantLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionGrantLogDao permissionGrantLogDao=ctx.getBean(PermissionGrantLogDaoImpl.class);
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (PermissionGrantLog permissionGrantLog : permissionGrantLogs) {
			System.out.println(permissionGrantLog);
		}
	}*/
	

	@Test
	public void testQueryPermissionGrantLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionGrantLogDao permissionGrantLogDao=ctx.getBean(PermissionGrantLogDaoImpl.class);
		List<PermissionGrantLog> permissionGrantLogs=permissionGrantLogDao.queryPermissionGrantLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (PermissionGrantLog permissionGrantLog : permissionGrantLogs) {
			System.out.println(permissionGrantLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
