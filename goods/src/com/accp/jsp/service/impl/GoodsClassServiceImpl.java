package com.accp.jsp.service.impl;

import java.util.List;

import com.accp.jsp.dao.GoodsClassDao;
import com.accp.jsp.dao.impl.GoodsClassDaoimpl;
import com.accp.jsp.entity.GoodsClass;
import com.accp.jsp.service.GoodsClassService;

public class GoodsClassServiceImpl implements GoodsClassService{

	GoodsClassDao goodsClassDao=new GoodsClassDaoimpl();
	@Override
	public List<GoodsClass> selectAll() {
		return goodsClassDao.selectAll();
	}

}
