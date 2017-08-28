package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.RoleMenuLogDao;
import com.clps.sms.log.model.RoleMenuLog;

public class RoleMenuLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMenuLogDao roleMenuLogDao=ctx.getBean(RoleMenuLogDaoImpl.class);
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryAll();
		for (RoleMenuLog roleMenuLog : roleMenuLogs) {
			System.out.println(roleMenuLog);
		}
	}*/

	/*@Test
	public void testQueryRoleMenuLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMenuLogDao roleMenuLogDao=ctx.getBean(RoleMenuLogDaoImpl.class);
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs("",	"",		"",		0, 						5);
		for (RoleMenuLog roleMenuLog : roleMenuLogs) {
			System.out.println(roleMenuLog);
		}
	}*/

	@Test
	public void testQueryRoleMenuLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMenuLogDao roleMenuLogDao=ctx.getBean(RoleMenuLogDaoImpl.class);
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs("",	"",		"",		"咔咔",0, 						5);
		for (RoleMenuLog roleMenuLog : roleMenuLogs) {
			System.out.println(roleMenuLog);
		}
	}

	/*@Test
	public void testQueryRoleMenuLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMenuLogDao roleMenuLogDao=ctx.getBean(RoleMenuLogDaoImpl.class);
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (RoleMenuLog roleMenuLog : roleMenuLogs) {
			System.out.println(roleMenuLog);
		}
	}*/

	/*@Test
	public void testQueryRoleMenuLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMenuLogDao roleMenuLogDao=ctx.getBean(RoleMenuLogDaoImpl.class);
		List<RoleMenuLog> roleMenuLogs=roleMenuLogDao.queryRoleMenuLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (RoleMenuLog roleMenuLog : roleMenuLogs) {
			System.out.println(roleMenuLog);
		}
	}*/

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
