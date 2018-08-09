package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.GoodsClass;

public interface GoodsClassDao {
	/**
	 * 
	 *查询所有类型
	 */
	public List<GoodsClass> selectAll();
}
