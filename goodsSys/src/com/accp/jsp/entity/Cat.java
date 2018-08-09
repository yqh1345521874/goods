package com.accp.jsp.entity;

public class Cat {
	private int id;
	private String goodsType;
	private String descrption;
	private String color;
	private double price;
	private String image;
	private double zprice;
	public double getZprice() {
		return zprice;
	}
	public void setZprice(double zprice) {
		this.zprice = zprice;
	}
	private int userid;
	
	private int cont;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrice() {
		return price;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
