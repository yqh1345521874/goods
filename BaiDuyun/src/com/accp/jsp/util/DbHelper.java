package com.accp.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.management.Query;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class DbHelper {
	
	private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/baiduyun";
	private static final String USER="root";
	private static final String PASSWORD="123456";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	/**
	 * ��ѯ 
	 * @param clazz ʲôʵ������
	 * @param sql sql���
	 * @param params  ����
	 * @return ʵ����󼯺�
	 */
	public static <T> List<T> Query(Class<T> clazz,String sql,Object...params){
		Connection connection = null;
		try {
			connection = getConnection();
			QueryRunner qr = new QueryRunner();
			return qr.query(connection, sql, new BeanListHandler<T>(clazz), params);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
		
	}
	
	/**
	 * ִ����ɾ��
	 * @param sql
	 * @param params
	 * @return ��Ӱ�������
	 */
	public static int update(String sql,Object...params) {
		Connection connection = null;
		try {
			connection = getConnection();
			QueryRunner qr = new QueryRunner();
			return qr.update(connection, sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
}
