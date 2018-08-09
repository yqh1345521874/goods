package com.accp.jsp.service.Impl;

import java.util.List;

import com.accp.jsp.dao.FileDao;
import com.accp.jsp.dao.impl.FileDaoImpl;
import com.accp.jsp.entity.File;
import com.accp.jsp.service.FileService;

public class FileServiceImpl  implements FileService{
	FileDao filedao=new FileDaoImpl();
	@Override
	public int addFile(File file) {
		// TODO Auto-generated method stub
		return filedao.addFile(file) ;
	}
	@Override
	public List<File> queryfile() {
		// TODO Auto-generated method stub
		return filedao.queryfile();
	}
	
}
