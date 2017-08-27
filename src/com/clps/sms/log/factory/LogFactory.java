package com.clps.sms.log.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.log.service.LogAccountService;
import com.clps.sms.log.service.impl.LogAccountServiceImpl;

public class LogFactory {
	@Autowired
	LogAccountServiceImpl logAccountService;
	
//	private static ApplicationContext ctx;
//
//	private void getApplicationContext (){
//		if(ctx==null){
//			ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		}
//	}
//	
//	public LogAccountService getLogAccountServiceInstance(){
//		getApplicationContext();
//		return ctx.getBean(LogAccountServiceImpl.class);
//	}
	public void test(){
		if(logAccountService==null){
			System.out.println("null");
		}else{
			System.out.println("true");
		}
	}
}
