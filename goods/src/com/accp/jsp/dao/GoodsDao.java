package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Goods;


public interface GoodsDao {
	/**
	 * 
	 * @author 13455
	 *查询所有
	 */
	public List<Goods> selectALL();
	/**
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
