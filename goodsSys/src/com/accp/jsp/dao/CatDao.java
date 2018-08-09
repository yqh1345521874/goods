package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Cat;
import com.accp.jsp.entity.Goods;

public interface CatDao {
	public List<Cat> selectCat(int userid);
	public int delete(int id);
	public int update(int count,int id,double zPrice);
	public Cat selectByid(int id);
}
