package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.RoleLogDao;
import com.clps.sms.log.model.RoleLog;

public class RoleLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleLogDao roleLogDao=ctx.getBean(RoleLogDaoImpl.class);
		List<RoleLog> roleLogs=roleLogDao.queryAll();
		for (RoleLog roleLog: roleLogs) {
			System.out.println(roleLog);
		}
	}*/

	/*@Test
	public void testQueryRoleLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleLogDao roleLogDao=ctx.getBean(RoleLogDaoImpl.class);
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs("",	"",		"",		0, 						5);
		for (RoleLog roleLog: roleLogs) {
			System.out.println(roleLog);
		}
	}*/

	/*@Test
	public void testQueryRoleLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleLogDao roleLogDao=ctx.getBean(RoleLogDaoImpl.class);
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs("",	"",		"",		"咔咔",0, 						5);
		for (RoleLog roleLog: roleLogs) {
			System.out.println(roleLog);
		}
	}*/

	/*@Test
	public void testQueryRoleLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleLogDao roleLogDao=ctx.getBean(RoleLogDaoImpl.class);
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (RoleLog roleLog: roleLogs) {
			System.out.println(roleLog);
		}
	}*/

	@Test
	public void testQueryRoleLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleLogDao roleLogDao=ctx.getBean(RoleLogDaoImpl.class);
		List<RoleLog> roleLogs=roleLogDao.queryRoleLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (RoleLog roleLog: roleLogs) {
			System.out.println(roleLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
