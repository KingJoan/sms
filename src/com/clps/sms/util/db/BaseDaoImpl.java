/**
 * Project Name:clps_sms_201708
 * File Name:BaseDao.java
 * Package Name:com.clps.sms.sys.dao.impl
 * Date:2017年8月16日下午2:03:01
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.clps.sms.util.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName:BaseDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年8月16日 下午2:03:01 <br/>
 * 
 * @author wqeq
 * @version
 * @since JDK 1.8
 * @see
 */
public abstract class BaseDaoImpl <T>{

	/**
	 * 通用的dao，自己写的所有的dao都继承此类; 此类定义了2个通用的方法： 1. 更新 2. 查询
	 * 
	 * @author Charlie.chen
	 *
	 */

	// 初始化参数
	@Autowired
	private BasicDataSource dataSource;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static boolean flag = false;
	private static int row = 0;

	protected Class<T> clazz = getEntityClass();  
    protected abstract Class<T> getEntityClass();  
	
	/**
	 * 查询的通用方法
	 * 
	 * @param sql
	 * @param paramsValue
	 */
	public List<T> query(String sql, Object[] paramsValue) {

		try {
			// 返回的集合
			List<T> list = new ArrayList<T>();
			// 对象
			T t = null;

			// 1. 获取连接
			// 2. 创建stmt对象
			pstmt = dataSource.getConnection().prepareStatement(sql);
			// 3. 获取占位符参数的个数， 并设置每个参数的值
//			int count = pstmt.getParameterMetaData().getParameterCount();
			if (paramsValue != null && paramsValue.length > 0) {
				for (int i = 0; i < paramsValue.length; i++) {
					pstmt.setObject(i + 1, paramsValue[i]);
				}
			}
			// 4. 执行查询
			rs = pstmt.executeQuery();
			// 5. 获取结果集元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			// ---> 获取列的个数
			int columnCount = rsmd.getColumnCount();

			// 6. 遍历rs
			while (rs.next()) {
				// 要封装的对象
				t = (T) clazz.newInstance();

				// 7. 遍历每一行的每一列, 封装数据
				for (int i = 0; i < columnCount; i++) {
					// 获取每一列的列名称
					String columnName = rsmd.getColumnName(i + 1);
					// 获取每一列的列名称, 对应的值
					Object value = rs.getObject(columnName);

					// 封装： 设置到t对象的属性中 【BeanUtils组件】
					BeanUtils.copyProperty(t, columnName.toLowerCase(), value);
				}

				// 把封装完毕的对象，添加到list集合中
				list.add(t);
			}
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			close();
		}
	}

	/**
	 * 更新的通用方法
	 * 
	 * @param sql
	 *            更新的sql语句(update/insert/delete)
	 * @param paramsValue
	 *            sql语句中占位符对应的值(如果没有占位符，传入null)
	 */
	public  boolean update(String sql, Object[] paramsValue) {

		try {
			// 创建执行命令的stmt对象
			pstmt = dataSource.getConnection().prepareStatement(sql);
			// 参数元数据： 得到占位符参数的个数
			int count = pstmt.getParameterMetaData().getParameterCount();

			// 设置占位符参数的值
			if (paramsValue != null && paramsValue.length > 0) {
				// 循环给参数赋值
				for (int i = 0; i < count; i++) {
					pstmt.setObject(i + 1, paramsValue[i]);
				}
			}
			// 执行更新
			row = pstmt.executeUpdate();
			flag = showopreult(row);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally {
			close();
		}
		return flag;
	}

	/**
	 * 
	 * showflag:判断返回值是true还是false
	 *
	 * @author wqeq
	 * @param row
	 * @return
	 * @since JDK 1.8
	 */
	public boolean showopreult(int row) {
		if (row > 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;

	}

	/**
	 *
	 * desc:验证手机和用户名是否已存在
	 * 
	 * @author wqeq
	 * @return
	 * @throws SQLException
	 * @since JDK 1.8
	 */
	public boolean showcheckres(List<T> list) {
		if (list.size() == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	/**
	 * 查询的通用方法
	 * 
	 * @param sql
	 * @param paramsValue
	 */
	public List<T> query(String sql) {

		try {
			// 返回的集合
			List<T> list = new ArrayList<T>();
			// 对象
			T t = null;

			// 1. 获取连接
			// 2. 创建stmt对象
			pstmt = dataSource.getConnection().prepareStatement(sql);
			// 3. 获取占位符参数的个数， 并设置每个参数的值
//			int count = pstmt.getParameterMetaData().getParameterCount();
			// 4. 执行查询
			rs = pstmt.executeQuery();
			// 5. 获取结果集元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			// ---> 获取列的个数
			int columnCount = rsmd.getColumnCount();

			// 6. 遍历rs
			while (rs.next()) {
				// 要封装的对象
				t = (T) clazz.newInstance();

				// 7. 遍历每一行的每一列, 封装数据
				for (int i = 0; i < columnCount; i++) {
					// 获取每一列的列名称
					String columnName = rsmd.getColumnName(i + 1);
					// 获取每一列的列名称, 对应的值
					Object value = rs.getObject(columnName);

					// 封装： 设置到t对象的属性中 【BeanUtils组件】
					BeanUtils.copyProperty(t, columnName.toLowerCase(), value);
				}

				// 把封装完毕的对象，添加到list集合中
				list.add(t);
			}
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			close();
		}
	}
	
	public void close(){
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
