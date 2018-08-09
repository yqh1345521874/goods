package com.accp.jsp.dao;

import java.util.List;

import com.accp.jsp.entity.Goods;


public interface GoodsDao {
	/**
	 * 
	 * @author 13455
	 *��ѯ����
	 */
	public List<Goods> selectALL();
	/**
	 * 
	 * @param goodsId
	 * ɾ��
	 */
	public int delete(int goodsId);
	/**
	 * 
	 * @param goods
	 * �޸�
	 */
	public int update(Goods goods);
	/**
	 * 
	 * @param goods
	 * ����
	 */
	public int insert(Goods goods);
	/**
	 * 
	 * @param goodsId
	 * ��ѯid
	 */
	public Goods selectById(int goodsId);
}
