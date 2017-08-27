/**
 * 
 */
package com.clps.sms.util.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author erwin.wang
 *
 *         2017年8月15日下午2:12:32
 * 
 *         since v1.0
 */
public class DBConnection {

	private static Logger logger =Logger.getLogger(DBConnection.class);
	private static Connection conn;
	
	private boolean flag = false;

	Properties properties=new Properties();

	
	public DBConnection(){
		
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
			System.out.println("读取 jdbc 配置文件："+((inputStream==null)?"空":"成功"));
			properties.load(inputStream);
			String driver = properties.getProperty("jdbcDriverClassName");
			String url =properties.getProperty("jdbcUrl");
			String username = properties.getProperty("jdbcUsername");
			String password =properties.getProperty("jdbcPassword");
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, username, password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.debug("IO failed!");
		}catch (InstantiationException e) {
			e.printStackTrace();
			logger.debug("Instantiation!");
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.debug("IllegalAccess!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			logger.debug("ClassNotFound!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.debug("mysql db connection failed!");
			
		}

	}
	
	
	public boolean execUpdate(){
		return flag;
	}
	
	public boolean execQuery(){
		return flag;
	}
	
	
	public static Connection getConnection() {
		if(conn==null){
			conn=new DBConnection().getConnection();
		}
		return conn;
	}

	public void getClose(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

