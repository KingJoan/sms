package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.PermissionGrantLogDao;
import com.clps.sms.log.dao.PermissionLogDao;
import com.clps.sms.log.model.PermissionLog;

public class PermissionLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			PermissionLogDao permissionLogDao=ctx.getBean(PermissionLogDaoImpl.class);
			List<PermissionLog> permissionLogs=permissionLogDao.queryAll();
			for (PermissionLog permissionLog : permissionLogs) {
				System.out.println(permissionLog);
			}
	}*/

	/*@Test
	public void testQueryPermissionLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionLogDao permissionLogDao=ctx.getBean(PermissionLogDaoImpl.class);
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs("",	"",		"",		0, 						5);
		for (PermissionLog permissionLog : permissionLogs) {
			System.out.println(permissionLog);
		}
	}*/

	/*@Test
	public void testQueryPermissionLogsStringStringStringStringIntInt() {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			PermissionLogDao permissionLogDao=ctx.getBean(PermissionLogDaoImpl.class);
			List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs("",	"",		"",		"咔咔",0, 						5);
			for (PermissionLog permissionLog : permissionLogs) {
				System.out.println(permissionLog);
			}
	}*/

	@Test
	public void testQueryPermissionLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PermissionLogDao permissionLogDao=ctx.getBean(PermissionLogDaoImpl.class);
		List<PermissionLog> permissionLogs=permissionLogDao.queryPermissionLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5	);
		for (PermissionLog permissionLog : permissionLogs) {
			System.out.println(permissionLog);
		}
	}

	@Test
	public void testQueryPermissionLogsStringStringStringStringStringStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
