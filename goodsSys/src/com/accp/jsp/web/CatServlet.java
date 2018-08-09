package com.accp.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.jsp.entity.Cat;
import com.accp.jsp.entity.Customers;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.service.CatService;
import com.accp.jsp.service.impl.CatServiceImpl;

/**
 * Servlet implementation class CatServlet
 */
@WebServlet("/CatServlet")
public class CatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CatService catService=new CatServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		if(method==null)
			select(request, response);
		switch (method) {
		case "select":
			select(request, response);
			break;
		case "delete":
			delete(request, response);
			break;
		case "update":
			update(request, response);
			break;
		case "doupdate":
			doupdate(request, response);
			break;
		}
	}

	protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid=(int) request.getSession().getAttribute("uid");
		
		    List<Cat> list=catService.selectCat(uid);
			request.setAttribute("list",list);
			request.getRequestDispatcher("goods-cat.jsp").forward(request, response);
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			int i=catService.delete(id);
			//System.out.println(id);
			response.sendRedirect(request.getContextPath()+"/CatServlet?method=select");
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
}
	protected void doupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cat c=new Cat();
		int cont=Integer.parseInt(request.getParameter("cont"));
		double price=Double.parseDouble(request.getParameter("price"));
		int id=Integer.parseInt(request.getParameter("id"));
		double price1=cont*price;
		c.setCont(cont);
		c.setZprice(price1);
		c.setId(id);
		int a=catService.update(cont, id, price1);
		select(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
