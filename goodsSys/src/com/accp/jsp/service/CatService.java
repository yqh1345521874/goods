package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.Cat;
import com.accp.jsp.entity.Goods;

public interface CatService {
	public List<Cat> selectCat(int userid);
	public int delete(int id);
	public int update(int count,int id,double zPrice);
}
