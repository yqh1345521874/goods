package com.accp.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.bouncycastle.cert.ocsp.Req;

import com.accp.jsp.entity.File;
import com.accp.jsp.entity.Folder;
import com.accp.jsp.entity.Share;
import com.accp.jsp.entity.Users;
import com.accp.jsp.service.FileService;
import com.accp.jsp.service.UsersService;
import com.accp.jsp.service.Impl.FileServiceImpl;
import com.accp.jsp.service.Impl.UsersServiceImpl;
import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersService usersService=new UsersServiceImpl();
	FileService fileService=new FileServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
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
		/*
		int pid=Integer.parseInt(request.getParameter("prevId"));*/
		switch (method) {
		case "denglu":
			denglu(request, response);
			break;
		case "zhuce":
			zhuce(request, response);
			break;
		case "addFolder":
			addFolder(request, response);
			break;
		case "queryfolder":
			queryfolder(request, response);
			break;
		case "back":
			queryfolderback(request, response);
			break;
		case "updatehsz":
			updatehsz(request, response);
			break;
		case "updateName":
			updateName(request, response);
			break;
		case "queryhsz":
			queryhsz(request, response);
			break;
		case "queryshare":
			queryshare(request, response);
			break;
		case "queryfile":
			queryfile(request, response);
			break;
		default:
			break;
		}
	}
	protected void denglu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password"); 
		Users list=usersService.denglu(userName, password);
		if(list==null) {
			response.sendRedirect(request.getContextPath()+"login.jsp");
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("userName", userName);
			session.setAttribute("nickName",list.getNickName());
			request.setAttribute("flolist",usersService.queryfolder(list.getUserName(),0));
			List<File> wjlist=fileService.queryfile();
			request.setAttribute("wjlist", wjlist);
			/*List<Folder> flist=usersService.queryfolder(list.getUserName(), 0);
			request.setAttribute("flist", flist);
*/			request.setAttribute("previd", 0);
			session.setAttribute("previd", 0);
			session.setAttribute("pd", 1);
			request.getRequestDispatcher("NewFile.jsp").forward(request,response);
		}
	}
	
	protected void queryfolder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession();
			String userName=(String) session.getAttribute("userName");
			int prevId=Integer.parseInt(request.getParameter("prevId"));
			request.setAttribute("flolist",usersService.queryfolder(userName,prevId));
			request.setAttribute("previd", prevId);
			session.setAttribute("previd", prevId);
			session.setAttribute("pd", 1);
			request.getRequestDispatcher("index.jsp").forward(request,response);
	}
	
	protected void refresh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String userName=(String) session.getAttribute("userName");
		int prevId=Integer.parseInt(session.getAttribute("previd").toString());
		request.setAttribute("flolist",usersService.queryfolder(userName,prevId));
		request.setAttribute("previd", prevId);
		session.setAttribute("previd", prevId);
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}
	
	protected void queryfolderback(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();

		String userName=(String) session.getAttribute("userName");
		int prevId=Integer.parseInt(request.getParameter("prevId"));
		int prevId1=usersService.queryfolderback(prevId).get(0).getPrevId();
		request.setAttribute("flolist",usersService.queryfolder(userName,prevId1));
		request.setAttribute("previd", prevId1);
		request.getRequestDispatcher("index.jsp").forward(request,response);
	
	}
	
	protected void zhuce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String nickName=request.getParameter("nickName");
		String password=request.getParameter("password");
		Users users=new Users();
		users.setUserName(userName);
		users.setNickName(nickName);
		users.setPassword(password);
		int i=usersService.zhuce(users);
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
	
	protected void addFolder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String fileJiaName=request.getParameter("fileJiaName");
			HttpSession session=request.getSession();  
			String userName=(String) session.getAttribute("userName");
			int prevId=Integer.parseInt(request.getParameter("prevId"));
			Folder folder=new Folder();
			folder.setFoldName(fileJiaName);
			folder.setUserName(userName);
			folder.setPrevId(prevId);
			if(fileJiaName!=null) {
				 this.usersService.addFolder(folder);  
			}
			refresh(request, response);
//			response.sendRedirect(request.getContextPath()+"UsersServlet?method=queryfolder");
/*			
			request.setAttribute("flolist",usersService.queryfolder(userName,prevId));
		
			request.getRequestDispatcher("/index.jsp").forward(request, response);*/
			
	}
	protected void updatehsz(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int folderId=Integer.parseInt(request.getParameter("folderId"));
			//System.out.println(folderId);
			int i=usersService.updatehsz(folderId);
			refresh(request, response);
			
	}
	
	protected void fz(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int folderId=Integer.parseInt(request.getParameter("folderId"));
		int pd=Integer.parseInt(request.getParameter("folderId"));
	
		refresh(request, response);
		
	}
	
	protected void updateName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int folderId=Integer.parseInt(request.getParameter("folderId"));
			String foldName=request.getParameter("foldName");
			int i=usersService.updateName(foldName, folderId);
			refresh(request, response);
	}
	
	protected void queryhsz(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession();
			String userName=(String) session.getAttribute("userName");
			request.setAttribute("flolist",usersService.queryhsz(userName));
			session.setAttribute("pd", 2);
			request.getRequestDispatcher("index.jsp").forward(request,response);	
	}
		
	protected void queryshare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession();
			String userName=(String) session.getAttribute("userName");
		/*	session.getAttribute("nickName");
		*/	List<Share> slist=usersService.queryshare(userName);
			request.setAttribute("slist", slist);
			request.getRequestDispatcher("index2.jsp").forward(request, response);
}
	
	protected void queryfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(111);
			List<File> wjlist=fileService.queryfile();
			request.setAttribute("wjlist", wjlist);
			request.getRequestDispatcher("queryfile.jsp").forward(request, response);
}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
