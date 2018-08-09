package com.accp.jsp.service.impl;

import java.util.List;

import com.accp.jsp.dao.CatDao;
import com.accp.jsp.dao.impl.CatDaoImpl;
import com.accp.jsp.entity.Cat;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.service.CatService;

public class CatServiceImpl  implements CatService{
	CatDao catdao=new CatDaoImpl();
	@Override
	public List<Cat> selectCat(int userid) {
		return catdao.selectCat(userid);
	}
	@Override
	public int delete(int id) {
		return catdao.delete(id);
	}
	@Override
	public int update(int count,int id,double zPrice) {
		return catdao.update(count, id, zPrice);
	}

}
