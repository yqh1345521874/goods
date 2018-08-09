package com.accp.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.jsp.dao.GoodsDao;
import com.accp.jsp.dao.impl.GoodsDaoimpl;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.entity.GoodsClass;
import com.accp.jsp.service.GoodsClassService;
import com.accp.jsp.service.GoodsService;
import com.accp.jsp.service.impl.GoodsClassServiceImpl;
import com.accp.jsp.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	GoodsService goodsService = new GoodsServiceImpl();
	GoodsClassService goodsClassService=new GoodsClassServiceImpl();
	

	// GoodsClassService goodsClassService=new GoodsClassServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GoodsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		switch (method) {
		case "select":
			select(request, response);
			break;
		case "insert":
			insert(request, response);
			break;
		case "doInsert":
			doInsert(request, response);
			break;
		case "delete":
			delete(request, response);
			break;
		case "doUpdate":
			doUpdate(request, response);
			break;
		case "update":
			update(request, response);
			break;
		case "selectById":
			selectById(request, response);
			break;
		default:
			select(request, response);
			break;
		
		}
			
	}

	protected void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	protected void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Goods> list= goodsService.selectALL();
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/goods/goods-select.jsp").forward(request, response);
	}

	protected void doInsert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Goods g=new Goods();
		String goodsName=request.getParameter("goodsName");
		String goodsType=request.getParameter("goodsType");
		int goodsClassId=Integer.parseInt(request.getParameter("goodsClassId"));
		double goodsPrice=Double.parseDouble(request.getParameter("goodsPrice"));
		g.setGoodsName(goodsName);
		g.setGoodsType(goodsType);
		g.setGoodsClassId(goodsClassId);
		g.setGoodsPrice(goodsPrice);
		int i=goodsService.insert(g);
		response.sendRedirect(request.getContextPath()+"/GoodsServlet?method=select");
		
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		int i=goodsService.delete(goodsId);
		//System.out.println(i);
		response.sendRedirect(request.getContextPath()+"/GoodsServlet?method=select");
		
	}

	protected void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Goods go=new Goods();
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		String goodsName=request.getParameter("goodsName");
		String goodsType=request.getParameter("goodsType");
		int goodsClassId=Integer.parseInt(request.getParameter("goodsClassId"));
		double goodsPrice=Double.parseDouble(request.getParameter("goodsPrice"));
		go.setGoodsId(goodsId);
		go.setGoodsName(goodsName);
		go.setGoodsType(goodsType);
		go.setGoodsClassId(goodsClassId);
		go.setGoodsPrice(goodsPrice);
		int a=goodsService.update(go);
		//System.out.println(a);
		//÷ÿ∂®œÚ
		response.sendRedirect(request.getContextPath()+"/GoodsServlet?method=select");
	}
		

	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String goodsId=request.getParameter("goodsId");
		Goods goods=goodsService.selectById(Integer.parseInt(goodsId));
		request.setAttribute("goods",goods);
		request.getRequestDispatcher("goods-update.jsp").forward(request, response);
		
		
	
	}

	protected void selectById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
