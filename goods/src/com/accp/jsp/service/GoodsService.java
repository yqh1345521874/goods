package com.accp.jsp.service;

import java.util.List;

import com.accp.jsp.entity.Goods;

public interface GoodsService {
	/**
	 * 
	 * @author 13455
	 *��ѯ����
	 */
	public List<Goods> selectALL();
	/**6
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
