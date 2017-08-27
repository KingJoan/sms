package com.clps.sms.log.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.service.LogAccountService;

import net.sf.json.JSONArray;

public class LogServiceImplTest {
	LogAccountService logAccountService;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		logAccountService=ctx.getBean(LogAccountServiceImpl.class);
	}

	@Test
	public void testQueryAll() {
		JSONArray jsonArray=logAccountService.queryAll();
		System.out.println(jsonArray.toString());
	}

	@Test
	public void testListAccountLog() {
	}

	@Test
	public void testQueryAccountLogsStringStringStringStringIntInt() {
	}

	@Test
	public void testQueryAccountLogsStringStringStringStringStringIntInt() {
	}

	@Test
	public void testQueryAccountLogsStringStringStringStringStringStringIntInt() {
	}

}
