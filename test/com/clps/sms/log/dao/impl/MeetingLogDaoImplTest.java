package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.MeetingLogDao;
import com.clps.sms.log.model.MeetingLog;

public class MeetingLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MeetingLogDao meetingLogDao=ctx.getBean(MeetingLogDaoImpl.class);
		List<MeetingLog> meetingLogs=meetingLogDao.queryAll();
		for (MeetingLog meetingLog : meetingLogs) {
			System.out.println(meetingLog);
		}
	}*/

	/*@Test
	public void testQueryMeetingLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MeetingLogDao meetingLogDao=ctx.getBean(MeetingLogDaoImpl.class);
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs("",	"",		"",		0, 						5	);
		for (MeetingLog meetingLog : meetingLogs) {
			System.out.println(meetingLog);
		}
	}*/

	/*@Test
	public void testQueryMeetingLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MeetingLogDao meetingLogDao=ctx.getBean(MeetingLogDaoImpl.class);
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs("",	"",		"",		"咔咔",0, 						5	);
		for (MeetingLog meetingLog : meetingLogs) {
			System.out.println(meetingLog);
		}
	}*/

	/*@Test
	public void testQueryMeetingLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MeetingLogDao meetingLogDao=ctx.getBean(MeetingLogDaoImpl.class);
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (MeetingLog meetingLog : meetingLogs) {
			System.out.println(meetingLog);
		}
	}*/

	@Test
	public void testQueryMeetingLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MeetingLogDao meetingLogDao=ctx.getBean(MeetingLogDaoImpl.class);
		List<MeetingLog> meetingLogs=meetingLogDao.queryMeetingLogs("",		"",		"",		"咔咔",				"2017/08/02",		"2017/08/23",		0, 		5);
		for (MeetingLog meetingLog : meetingLogs) {
			System.out.println(meetingLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
