package com.example.demo.entity;

public class Goods {
	private int goodsId;
	private String	goodsName;
	private String	goodsType;
	private int	goodsClassId;
	private double goodsPrice;
	
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public int getGoodsClassId() {
		return goodsClassId;
	}
	public void setGoodsClassId(int goodsClassId) {
		this.goodsClassId = goodsClassId;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/*@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsType=" + goodsType + ", goodsClassId="
				+ goodsClassId + ", goodsPrice=" + goodsPrice + "]";
	}*/
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsType=" + goodsType + ", goodsClassId="
				+ goodsClassId + ", goodsPrice=" + goodsPrice + "]";
	}

	
	
}
