package com.accp.jsp.service;


import java.util.List;

import com.accp.jsp.entity.Customers;

public interface CustomersService {
	public Customers selectUser(String userName,String userPass);
	public int insertUser(Customers customers);
}
