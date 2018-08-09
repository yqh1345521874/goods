package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.File;

public interface FileDao {
	public int addFile(File file);
	public List<File> queryfile();
}
