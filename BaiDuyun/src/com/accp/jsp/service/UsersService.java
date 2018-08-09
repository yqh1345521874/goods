package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.Folder;
import com.accp.jsp.entity.Share;
import com.accp.jsp.entity.Users;

public interface UsersService {
	public int zhuce(Users users);
	public Users denglu(String userName, String password);
	public List<Folder> queryfolder(String uname,int previd);
	public int addFolder(Folder folder);
	public List<Folder> queryfolderback(int previd);
	public int updatehsz(int folderId);
	public int updateName(String foldName,int folderId);
	public List<Folder> queryhsz(String userName);

	public List<Share> queryshare(String userName);
	
}
