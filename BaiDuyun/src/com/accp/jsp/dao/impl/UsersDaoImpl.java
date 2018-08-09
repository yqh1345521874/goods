package com.accp.jsp.dao.impl;

import java.util.List;

import com.accp.jsp.dao.UsersDao;
import com.accp.jsp.entity.Folder;
import com.accp.jsp.entity.Share;
import com.accp.jsp.entity.Users;
import com.accp.jsp.util.DbHelper;

public class UsersDaoImpl implements UsersDao {

	@Override
	public int zhuce(Users users) {
		String sql="INSERT INTO `users`(`userName`,`password`,`nickName`,`enrollTime`) VALUES (?,?,?,NOW())";
		return DbHelper.update(sql,users.getUserName(),users.getPassword(),users.getNickName());
	}

	@Override
	public Users denglu(String userName, String password) {
		String sql="SELECT `userName`,`password`,`nickName` FROM `users` WHERE `userName`=? AND `password`=?";
		List<Users> list=DbHelper.Query(Users.class,sql,userName,password);
		if(list!=null&&list.size()!=0)
			return list.get(0);
			return null;
	}
	
	@Override
	public List<Folder> queryfolder(String uname,int previd){//查询所有文件夹
		String sql="SELECT * FROM folder WHERE userName=? and  prevId=? and isDel=1";
		List<Folder> list=DbHelper.Query(Folder.class, sql, uname,previd);
		if(list!=null && list.size()!=0)
			return list;
		return null;
				
	}
	
	@Override
	public List<Folder> queryfolderback(int previd){//查询所有文件夹
		String sql="SELECT * FROM folder WHERE  folderId=? and isDel=1";
		List<Folder> list=DbHelper.Query(Folder.class, sql, previd);
		if(list!=null && list.size()!=0)
			return list;
		return null;	
	}
	


	@Override
	public int addFolder(Folder folder) {//新增文件夹
		String sql="INSERT  INTO `folder`(`foldName`,`prevId`,`userName`,`createTime`,`isDel`) VALUES (?,?,?,NOW(),1)";
		return DbHelper.update(sql, folder.getFoldName(),folder.getPrevId(),folder.getUserName());
	}


	@Override
	public int updatehsz(int folderId) {//删除到回收站
		String sql="UPDATE `folder` SET `isDel`=0 WHERE `folderId`=?";
		return DbHelper.update(sql,folderId);
	}

	@Override
	public int updateName(String foldName,int folderId) {//重命名
		// TODO Auto-generated method stub
		String sql="UPDATE `folder` SET `foldName`=? WHERE `folderId`=?";
		return DbHelper.update(sql,foldName, folderId);
	}

	@Override
	public List<Folder> queryhsz(String userName) {//查询回收站
		// TODO Auto-generated method stub
		String sql="SELECT * FROM `folder` WHERE  `userName`=? AND `isDel`=0";
		List<Folder> list=DbHelper.Query(Folder.class, sql, userName);
		if(list!=null && list.size()!=0)
			return list;
		return null;
	}

	@Override
	public List<Share> queryshare(String userName) { //查询分享过的文件
		// TODO Auto-generated method stub
		String sql="SELECT  `shareId`,b.`userName`,`receiveName`,`fileId`,`shareType`,`shareTime`  FROM  `folder` a JOIN `share` b ON  a.`folderId` =b.`fileId` WHERE b.userName=?";
		List<Share> list=DbHelper.Query(Share.class, sql, userName);
		if(list!=null && list.size()!=0)
			return list;
		return null;
	}
	
	




	
}
