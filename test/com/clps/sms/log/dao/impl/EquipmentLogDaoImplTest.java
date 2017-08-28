package com.clps.sms.log.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.dao.EquipmentLogDao;
import com.clps.sms.log.model.EquipmentLog;

public class EquipmentLogDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*@Test
	public void testQueryAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EquipmentLogDao equipmentLogDao=ctx.getBean(EquipmentLogDaoImpl.class);
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryAll();
		for (EquipmentLog equipmentLog : equipmentLogs) {
			System.out.println(equipmentLog);
		}
	}*/

	/*@Test
	public void testQueryEquipmentLogsStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EquipmentLogDao equipmentLogDao=ctx.getBean(EquipmentLogDaoImpl.class);
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs("",	"",		"",		0, 						5	);;
		for (EquipmentLog equipmentLog : equipmentLogs) {
			System.out.println(equipmentLog);
		}
	}*/

	/*@Test
	public void testQueryEquipmentLogsStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EquipmentLogDao equipmentLogDao=ctx.getBean(EquipmentLogDaoImpl.class);
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs("",		"",		"",		"咔咔",				0, 						5);
		for (EquipmentLog equipmentLog : equipmentLogs) {
			System.out.println(equipmentLog);
		}
	}*/

	/*@Test
	public void testQueryEquipmentLogsStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EquipmentLogDao equipmentLogDao=ctx.getBean(EquipmentLogDaoImpl.class);
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs("",	"",		"",		"咔咔",0, 						5);
		for (EquipmentLog equipmentLog : equipmentLogs) {
			System.out.println(equipmentLog);
		}
	}*/

	@Test
	public void testQueryEquipmentLogsStringStringStringStringStringStringIntInt() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EquipmentLogDao equipmentLogDao=ctx.getBean(EquipmentLogDaoImpl.class);
		List<EquipmentLog> equipmentLogs=equipmentLogDao.queryEquipmentLogs("",	"",		"",		"2017-08-02",		"2017-08-24",0, 						5);
		for (EquipmentLog equipmentLog : equipmentLogs) {
			System.out.println(equipmentLog);
		}
	}

	@Test
	public void testGetEntityClass() {
		fail("Not yet implemented");
	}

}
