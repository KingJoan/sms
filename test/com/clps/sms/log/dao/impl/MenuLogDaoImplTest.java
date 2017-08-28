package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.MenuLogDao;
import com.clps.sms.log.model.MenuLog;

public class MenuLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuLogDao menuLogDao=ctx.getBean(MenuLogDaoImpl.class);
		List<MenuLog> menuLogs=menuLogDao.queryAll();
		for (MenuLog menuLog : menuLogs) {
			System.out.println(menuLog);
		}
	}*/

	/*@Test
	public void testQueryMenuLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuLogDao menuLogDao=ctx.getBean(MenuLogDaoImpl.class);
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs("",	"",		"",		0, 						5);
		for (MenuLog menuLog : menuLogs) {
			System.out.println(menuLog);
		}
	}*/

	/*@Test
	public void testQueryMenuLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuLogDao menuLogDao=ctx.getBean(MenuLogDaoImpl.class);
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs("",	"",		"",		"咔咔",0, 						5);
		for (MenuLog menuLog : menuLogs) {
			System.out.println(menuLog);
		}
	}*/

	/*@Test
	public void testQueryMenuLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuLogDao menuLogDao=ctx.getBean(MenuLogDaoImpl.class);
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (MenuLog menuLog : menuLogs) {
			System.out.println(menuLog);
		}
	}*/

	@Test
	public void testQueryMenuLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuLogDao menuLogDao=ctx.getBean(MenuLogDaoImpl.class);
		List<MenuLog> menuLogs=menuLogDao.queryMenuLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (MenuLog menuLog : menuLogs) {
			System.out.println(menuLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
