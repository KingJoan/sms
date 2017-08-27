/**
 * 
 */
package com.clps.sms.sys.factory;

import com.clps.sms.sys.dao.AccountDao;
import com.clps.sms.sys.dao.MenuDao;
import com.clps.sms.sys.dao.RoleDao;
import com.clps.sms.sys.dao.impl.AccountDaoImpl;
import com.clps.sms.sys.dao.impl.MenuDaoImpl;
import com.clps.sms.sys.dao.impl.RoleDaoImpl;
import com.clps.sms.sys.service.AccountService;
import com.clps.sms.sys.service.impl.AccountServiceImpl;

/**
 * @author erwin.wang
 *
 * 2017年8月15日下午2:25:54
 * 
 * since v1.0
 */
public class SysFactory {
	private static AccountDao accountDao=new AccountDaoImpl();
	private static RoleDao roleDao=new RoleDaoImpl();
	private static MenuDao menuDao=new MenuDaoImpl();
	private static AccountService accountService=new AccountServiceImpl();

	/**
	 * desc:创建新建
	 * 		
	 * 
	 * @return AccountDao
	 */
	public  AccountDao getAccountInstance(){
		return accountDao;
	}
	/**
	 * 
	 * @return
	 */
	public  RoleDao getRoleInstance(){
		return roleDao;
	}
	/**
	 * 
	 * @return
	 */
	public  MenuDao getMenuInstance(){
		return menuDao;
	}
	/*public static AccountDao getAccountInstance(){
		return new AccountDaoImpl();
	}*/
	
	
	public static  AccountService getAccountServiceInstance(){
		return accountService;
	}
}
