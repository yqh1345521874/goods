package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Folder;
import com.accp.jsp.entity.Share;
import com.accp.jsp.entity.Users;

public interface UsersDao {
	public int zhuce(Users users);
	
	public Users denglu(String userName,String password);

	
	public int addFolder(Folder folder);//

	public List<Folder> queryfolder(String uname, int previd);//²éÑ¯ÎÄ¼þ¼Ð

	public List<Folder> queryfolderback(int previd);
	
	
	public int updatehsz(int folderId);
	
	public int updateName(String foldName,int folderId);
	
	
	public List<Folder> queryhsz(String userName);
	
	
	public List<Share> queryshare(String userName);
	
	
	
}
