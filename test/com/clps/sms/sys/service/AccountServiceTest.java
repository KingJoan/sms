package com.clps.sms.sys.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.clps.sms.sys.service.impl.AccountServiceImpl;

public class AccountServiceTest {
	AccountService accountService;

	@Before
	public void setUp() throws Exception {
		accountService=new AccountServiceImpl();
	}

	@Test
	public void testLogin() {
		boolean result=accountService.login("123", "213");
		System.out.println("登录："+result);
	}

}
