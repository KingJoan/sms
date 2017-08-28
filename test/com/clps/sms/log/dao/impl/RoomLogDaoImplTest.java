package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.RoomLogDao;
import com.clps.sms.log.model.RoomLog;

public class RoomLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoomLogDao roomLogDao=ctx.getBean(RoomLogDaoImpl.class);
		List<RoomLog> roomLogs=roomLogDao.queryAll();
		for (RoomLog roomLog: roomLogs) {
			System.out.println(roomLog);
		}
	}*/

	/*@Test
	public void testQueryRoomLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoomLogDao roomLogDao=ctx.getBean(RoomLogDaoImpl.class);
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs("",	"",		"",		0, 						5);
		for (RoomLog roomLog: roomLogs) {
			System.out.println(roomLog);
		}
	}*/

	/*@Test
	public void testQueryRoomLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoomLogDao roomLogDao=ctx.getBean(RoomLogDaoImpl.class);
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs("",	"",		"",		"咔咔",0, 						5);
		for (RoomLog roomLog: roomLogs) {
			System.out.println(roomLog);
		}
	}*/

	/*@Test
	public void testQueryRoomLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoomLogDao roomLogDao=ctx.getBean(RoomLogDaoImpl.class);
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 		5);
		for (RoomLog roomLog: roomLogs) {
			System.out.println(roomLog);
		}
	}*/

	@Test
	public void testQueryRoomLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoomLogDao roomLogDao=ctx.getBean(RoomLogDaoImpl.class);
		List<RoomLog> roomLogs=roomLogDao.queryRoomLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (RoomLog roomLog: roomLogs) {
			System.out.println(roomLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
