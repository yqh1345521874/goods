package com.accp.jsp.service.impl;

import java.util.List;

import com.accp.jsp.dao.GoodsDao;
import com.accp.jsp.dao.impl.GoodsDaoImpl;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

	GoodsDao goodsDao=new GoodsDaoImpl();
	@Override
	public List<Goods> selectAll() {
		return goodsDao.selectAll();
	}
	public Goods selectId(int id) {
		return goodsDao.selectId(id);
	}
	@Override
	public int insertCat(int uid,int gid,double jg,int cont) {
		return goodsDao.insertCat(uid, gid, jg, cont);
	}
		

}
