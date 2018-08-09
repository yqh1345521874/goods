package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.Goods;

public interface GoodsService {
	public List<Goods> selectAll();
	public Goods selectId(int id);
	public int insertCat(int uid,int gid,double jg,int cont);
}
