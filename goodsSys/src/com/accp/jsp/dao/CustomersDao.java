package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Customers;

public interface CustomersDao {
	public int insertUser(Customers customers);//ע��
	public Customers selectUser(String userName,String userPass);//��¼
}
