package com.accp.jsp.dao.impl;

import java.util.List;

import com.accp.jsp.dao.FileDao;
import com.accp.jsp.entity.File;
import com.accp.jsp.util.DbHelper;

public class FileDaoImpl implements FileDao {

	@Override
	public int addFile(File file) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO `file`(`fileName`,`userName`,`filePath`,`folderId`,`typeId`,`uploadTime`,`isDel`,`downCount`,`fileSize`) VALUES (?,?,?,0,?,NOW(),1,0,?)";
		return DbHelper.update(sql, file.getFileName(),file.getFileName(),file.getFilePath(),file.getTypeId(),file.getFileSize());
	}

	@Override
	public List<File> queryfile() {
		// TODO Auto-generated method stu
		String sql="SELECT * FROM `file` ";
		return DbHelper.Query(File.class, sql);
	}

}
