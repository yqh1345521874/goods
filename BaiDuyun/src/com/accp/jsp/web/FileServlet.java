package com.accp.jsp.web;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.accp.jsp.entity.Users;
import com.accp.jsp.service.FileService;
import com.accp.jsp.service.Impl.FileServiceImpl;

/**
 * Servlet implementation class FileServlet
 */
@WebServlet("/FileServlet")
@MultipartConfig
public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    FileService fileservice=new FileServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(1111);
		//获得所有上传的文件 
		//上传路径
		//String	pathfolder=request.getParameter("pathFolder");
		//所属文件夹Id
		String folderId=request.getParameter("folderId");
		
		String newfilename=null;
		Collection<Part> parts = request.getParts();
		 for (Part part : parts) {
			 if(part.getSubmittedFileName()==null)
				 continue;
			 //获得原始的文件名
			String  filename = part.getSubmittedFileName();
			//System.out.println(filename);
			//为上传的文件名进行重命名(必须)
			String ext = filename.substring(filename.lastIndexOf("."));
			newfilename = UUID.randomUUID().toString()+ext;
			HttpSession session=request.getSession();
			String user= (String) session.getAttribute("userName");
			
			String path = request.getServletContext().getRealPath("/temp");
			
			
			part.write(path+"/"+filename);
			
			//当前时间

			
			int typeId=0;
			com.accp.jsp.entity.File fileMy=new com.accp.jsp.entity.File();
			fileMy.setFileName(filename);
			fileMy.setUserName(user);
			fileMy.setFilePath(user+"\\"+newfilename);
		//	fileMy.setFolderId(Integer.parseInt(folderId));
			if(ext.toUpperCase().equals(".PNG"))
				typeId=1;
			if(ext.toUpperCase().equals(".TXT"))
				typeId=2;
			if(ext.toUpperCase().equals(".MP4"))
				typeId=3;
			if(ext.toUpperCase().equals(".MP3"))
				typeId=4; 	
			fileMy.setTypeId(typeId);
			fileMy.setIsDel(1);
			fileMy.setDownCount(0);
			fileMy.setFileSize(part.getSize());
			this.fileservice.addFile(fileMy);
		}
		response.getWriter().append(newfilename);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				doGet(request, response);
	}

}
