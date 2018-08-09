package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.Goods;

public interface GoodsService {
	/**
	 * 
	 * @author 13455
	 *查询所有
	 */
	public List<Goods> selectALL();
	/**6
	 * 
	 * @param goodsId
	 * 删除
	 */
	public int delete(int goodsId);
	/**
	 * 
	 * @param goods
	 * 修改
	 */
	public int update(Goods goods);
	/**
	 * 
	 * @param goods
	 * 新增
	 */
	public int insert(Goods goods);
	/**
	 * 
	 * @param goodsId
	 * 查询id
	 */
	public Goods selectById(int goodsId);
}
