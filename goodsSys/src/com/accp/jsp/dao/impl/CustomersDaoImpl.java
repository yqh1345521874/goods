package com.accp.jsp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.accp.jsp.dao.CustomersDao;
import com.accp.jsp.entity.Customers;
import com.accp.jsp.util.DbHelper;

public class CustomersDaoImpl implements CustomersDao {


	@Override
	public Customers selectUser(String userName,String userPass) {
		String sql="select * from customers where userName=? and userPass=?";
		Connection conn=null;
		try {
			conn=DbHelper.getConnection();
			QueryRunner query=new QueryRunner();
			return query.query(conn, sql,new BeanHandler<Customers>(Customers.class),userName,userPass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		return null; 
	}

	@Override
	public int insertUser(Customers customers) {
		String sql = "insert into customers values(0,?,?)";
		Connection conn = null;
		try {
			conn = DbHelper.getConnection();
			QueryRunner query = new QueryRunner();
			return query.update(conn, sql,customers.getUserName(),customers.getUserPass());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

}
