package com.clps.sms.sys.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import com.clps.sms.sys.dao.AccountDao;
import com.clps.sms.sys.dao.impl.AccountDaoImpl;
import com.clps.sms.sys.model.Account;
import com.clps.sms.sys.service.AccountService;
import com.clps.sms.util.MD5Utils;

public class AccountServiceImpl implements AccountService{
	AccountDao accountDao;
	static Logger logger=Logger.getLogger("login");
	
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
		accountDao=new AccountDaoImpl();
	}


	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
//		
//		return true;
		
		try {
			Account account=accountDao.getAccountByName(username);
			if(account==null){
				return false;
			}
			if(account.getAcc_password().equals(MD5Utils.getPwd(password))){
				MDC.put("userid",account.getAcc_id());
				logger.info(username);
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	
	}


	@Override
	public List<Account> listAllAccount() {
		// TODO Auto-generated method stub
		List<Account> accounts;
		try {
			accounts = accountDao.queryAllAccounts();
			logger.info("查询所有信息");
			return accounts;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("发送未知错误，查询失败！");
		}
		return null;
	}
}
