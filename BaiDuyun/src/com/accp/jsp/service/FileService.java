package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.File;

public interface FileService {
	public int addFile(File file);
	public List<File> queryfile();
}
