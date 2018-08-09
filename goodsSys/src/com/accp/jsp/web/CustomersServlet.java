package com.accp.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.jsp.entity.Customers;
import com.accp.jsp.service.CustomersService;
import com.accp.jsp.service.impl.CustomersServiceImpl;

/**
 * Servlet implementation class CustomersServlet
 */
@WebServlet("/CustomersServlet")
public class CustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomersService customersService=new CustomersServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		if(method==null)
			select(request, response);
		switch (method) {
		case "select":
			select(request, response);
			break;
		case "insert":
			insert(request, response);
		case "doinsert":
			doinsert(request, response);
			}
		}
	
	protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		
		Customers c=customersService.selectUser(userName,userPass);
		if(c==null) {
			request.getRequestDispatcher("goods-login.jsp").forward(request, response);  	
		}else {
			request.getSession().setAttribute("uid", c.getId());
		request.getRequestDispatcher("GoodsServlet?method=select").forward(request, response);
	   }
	}	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doinsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customers cu=new Customers();
		String userName=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		cu.setUserName(userName);
		cu.setUserPass(userPass);
		int i=customersService.insertUser(cu);
		response.sendRedirect(request.getContextPath()+"/CustomersServlet?method=select");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
