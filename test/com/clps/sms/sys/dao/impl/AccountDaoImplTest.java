/**
 * 
 */
package com.clps.sms.sys.dao.impl;

import static org.junit.Assert.*;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.sms.sys.dao.AccountDao;
import com.clps.sms.sys.factory.SysFactory;
import com.clps.sms.sys.model.Account;
import com.clps.sms.util.date.StringtoDate;
import com.clps.sms.util.db.DBConnection;

/**
 * @author erwin.wang
 *
 * 2017年8月15日下午3:00:20
 * 
 * since v1.0
 */
public class AccountDaoImplTest {
	private ApplicationContext ctx = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#queryAllAccounts()}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryAllAccounts() throws Exception {
		
		SysFactory sysFactory=ctx.getBean("sysFactory",SysFactory.class);
		List<Account> accounts=sysFactory.getAccountInstance().queryAllAccounts();
		System.out.println("----------"+accounts.size());
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#queryAllAccountByCondition(com.clps.sms.sys.model.Account)}.
	 * @throws SQLException 
	 */
	@Test
	public void testQueryAllAccountByCondition() throws SQLException {
		Account acc=new Account();
		acc.setAcc_status(0);
		AccountDao accountDao=new AccountDaoImpl();
		List<Account> list=accountDao.queryAllAccountByCondition(0);
		for(Account ac:list){
			System.out.println(ac.getAcc_created_date());
		}
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#queryAccountByMobile(java.lang.String)}.
	 * @throws SQLException 
	 */
	@Test
	public void testQueryAccountByMobile() throws SQLException {
		AccountDao accountDao=new AccountDaoImpl();
		boolean bool=accountDao.queryAccountByMobile("152305351659");
		System.out.println(bool);
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#queryAccountByName(java.lang.String)}.
	 * @throws SQLException 
	 */
	@Test
	public void testQueryAccountByName() throws SQLException {
		AccountDao accountDao=new AccountDaoImpl();
		boolean bool=accountDao.queryAccountByName("asd");
		System.out.println(bool);
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#updateAccountById(com.clps.sms.sys.model.Account, java.lang.Integer)}.
	 * @throws SQLException 
	 */
	@Test
	public void testUpdateAccountById() throws SQLException {
		
		Account acc=new Account();
		
		acc.setAcc_name("咔咔");
		acc.setAcc_password("234567");
		acc.setAcc_email("123456789@qq.com");
		acc.setAcc_mobile("15230535656");
		acc.setAcc_dec("huhuihihiuhiuhi");
		acc.setAcc_status(0);
		String date=StringtoDate.datetoString(new Date());
		acc.setAcc_updated_date(date);
		acc.setAcc_updated_name(1);
		acc.setAcc_role_id(2);
		
		AccountDao accountDao=new AccountDaoImpl();
		boolean bool=accountDao.updateAccountById(acc, 13);
		System.out.println(bool);
	}

	/**
	 * Test method for {@link com.clps.sms.sys.dao.impl.AccountDaoImpl#deleteAccountById(java.lang.Integer)}.
	 * @throws SQLException 
	 */
	@Test
	public void testDeleteAccountById() throws SQLException {
		Account acc=new Account();
		acc.setAcc_id(15);
		AccountDao accountDao=new AccountDaoImpl();
		boolean bool= accountDao.deleteAccountById(acc.getAcc_id());
		System.out.println(bool);
	}
	
	@Test
	public void insertAccount() throws SQLException{
		Account acc=new Account();
		
		acc.setAcc_name("啦啦");
		acc.setAcc_password("12313");
		acc.setAcc_email("12345677");
		acc.setAcc_mobile("1111111111");
		acc.setAcc_dec("啦啦啦啦啦啦啦");
		acc.setAcc_status(1);
		String date=StringtoDate.datetoString(new Date());
		acc.setAcc_created_date(date);
		acc.setAcc_created_name(1);
		acc.setAcc_role_id(1);
		
		AccountDao accountDao=new AccountDaoImpl();
		
		boolean flag=accountDao.insertAccount(acc);
		
		System.out.println(flag);	
	}
}
