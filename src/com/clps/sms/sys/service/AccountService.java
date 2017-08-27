package com.clps.sms.sys.service;

import java.util.List;

import com.clps.sms.sys.model.Account;

public interface AccountService {
	/**
	 * 登录
	 * @param username		用户名
	 * @param password		密码
	 * @return						true：登录成功	false：登录失败
	 */
	boolean login(String username,String password);
	
	/**
	 * 查询所有账户信息
	 * @return
	 */
	List<Account> listAllAccount();
}
