package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Goods;

public interface GoodsDao {
	public List<Goods> selectAll();
	public Goods selectId(int id);
	public int insertCat(int uid,int gid,double jg,int cont);
}
