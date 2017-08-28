package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.SysParameterLogDao;
import com.clps.sms.log.model.SysParameterLog;

public class SysParameterLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParameterLogDao sysParameterLogDao=ctx.getBean(SysParameterLogDaoImpl.class);
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.queryAll();
		for (SysParameterLog sysParameterLog: sysParameterLogs) {
			System.out.println(sysParameterLog);
		}
	}*/

	/*@Test
	public void testQuerySysParameterLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParameterLogDao sysParameterLogDao=ctx.getBean(SysParameterLogDaoImpl.class);
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs("",	"",		"",		0, 						5);
		for (SysParameterLog sysParameterLog: sysParameterLogs) {
			System.out.println(sysParameterLog);
		}
	}*/

	/*@Test
	public void testQuerySysParameterLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParameterLogDao sysParameterLogDao=ctx.getBean(SysParameterLogDaoImpl.class);
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs("",	"",		"",		"咔咔",0, 						5);
		for (SysParameterLog sysParameterLog: sysParameterLogs) {
			System.out.println(sysParameterLog);
		}
	}*/

	/*@Test
	public void testQuerySysParameterLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParameterLogDao sysParameterLogDao=ctx.getBean(SysParameterLogDaoImpl.class);
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 		5);
		for (SysParameterLog sysParameterLog: sysParameterLogs) {
			System.out.println(sysParameterLog);
		}
	}*/

	@Test
	public void testQuerySysParameterLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParameterLogDao sysParameterLogDao=ctx.getBean(SysParameterLogDaoImpl.class);
		List<SysParameterLog> sysParameterLogs=sysParameterLogDao.querySysParameterLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (SysParameterLog sysParameterLog: sysParameterLogs) {
			System.out.println(sysParameterLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
