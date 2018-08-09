package com.accp.jsp.service.impl;

import java.util.List;

import com.accp.jsp.dao.GoodsDao;
import com.accp.jsp.dao.impl.GoodsDaoimpl;
import com.accp.jsp.entity.Goods;
import com.accp.jsp.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao  k=new GoodsDaoimpl(); 
	@Override
	public List<Goods> selectALL() {
		// TODO Auto-generated method stub
		return this.k.selectALL();
	}

	@Override
	public int delete(int goodsId) {
		// TODO Auto-generated method stub
		return k.delete(goodsId);
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return k.update(goods);
	}

	@Override
	public int insert(Goods goods) {
		// TODO Auto-generated method stub
		return k.insert(goods);
	}

	@Override
	public Goods selectById(int goodsId) {
		// TODO Auto-generated method stub
		return k.selectById(goodsId);
	}

}
