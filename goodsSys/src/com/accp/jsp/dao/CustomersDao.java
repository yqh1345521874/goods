package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Customers;

public interface CustomersDao {
	public int insertUser(Customers customers);//×¢²á
	public Customers selectUser(String userName,String userPass);//µÇÂ¼
}
