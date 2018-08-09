package com.accp.jsp.service.Impl;

import java.util.List;

import com.accp.jsp.dao.UsersDao;
import com.accp.jsp.dao.impl.UsersDaoImpl;
import com.accp.jsp.entity.Folder;
import com.accp.jsp.entity.Share;
import com.accp.jsp.entity.Users;
import com.accp.jsp.service.UsersService;

public class UsersServiceImpl implements UsersService {
	UsersDao usersDao=new UsersDaoImpl();
	@Override
	public int zhuce(Users users) {
		// TODO Auto-generated method stub
		return usersDao.zhuce(users);
	}

	@Override
	public Users denglu(String userName, String password) {
		// TODO Auto-generated method stub
		return usersDao.denglu(userName, password);
	}

	@Override
	public List<Folder> queryfolder(String uname,int previd) {
		// TODO Auto-generated method stub
		return usersDao.queryfolder(uname,previd);
	}

	@Override
	public int addFolder(Folder folder) {
		// TODO Auto-generated method stub
		return usersDao.addFolder(folder);
	}

	@Override
	public List<Folder> queryfolderback(int previd) {
		// TODO Auto-generated method stub
		return usersDao.queryfolderback(previd);
	}

	@Override
	public int updatehsz(int folderId) {
		// TODO Auto-generated method stub
		return usersDao.updatehsz(folderId);
	}


	@Override
	public int updateName(String foldName, int folderId) {
		// TODO Auto-generated method stub
		return usersDao.updateName(foldName, folderId);
	}

	@Override
	public List<Folder> queryhsz(String userName) {
		// TODO Auto-generated method stub
		return usersDao.queryhsz(userName);
	}

	@Override
	public List<Share> queryshare(String userName) {
		// TODO Auto-generated method stub
		return usersDao.queryshare(userName);
	}




}
