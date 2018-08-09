package com.accp.jsp.service.impl;

import java.util.List;

import com.accp.jsp.dao.CustomersDao;
import com.accp.jsp.dao.impl.CustomersDaoImpl;
import com.accp.jsp.entity.Customers;
import com.accp.jsp.service.CustomersService;

public class CustomersServiceImpl implements CustomersService{
		CustomersDao customersdao=new CustomersDaoImpl();
	@Override
	public Customers selectUser(String userName,String userPass) {
		return customersdao.selectUser( userName, userPass);
	}

	@Override
	public int insertUser(Customers customers) {
		return customersdao.insertUser(customers);
	}

}
