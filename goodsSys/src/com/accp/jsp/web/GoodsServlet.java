package com.accp.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.jsp.entity.Customers;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.service.GoodsService;
import com.accp.jsp.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GoodsService goodsService=new GoodsServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsServlet() {
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
		case "selectDetail":
			selectDetail(request, response);
			break;
		case "addcat":
			addcat(request, response);
			break;
		}
	}
protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Goods> list=goodsService.selectAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("goods-index.jsp").forward(request, response);
}
protected void selectDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int idd=Integer.parseInt(request.getParameter("idd"));
			Goods go=new Goods();
			go.setId(idd);
			Goods goods=goodsService.selectId(idd);
			System.out.println(goods);
			request.setAttribute("goods", goods);
			request.getRequestDispatcher("goods-detail.jsp").forward(request, response);	
}


protected void addcat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int uid=(int) request.getSession().getAttribute("uid");
	goodsService.insertCat(uid, Integer.parseInt(request.getParameter("id")), Double.parseDouble(request.getParameter("jg")) * 1, 1);	
	request.getRequestDispatcher("CatServlet?method=select").forward(request, response);
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
