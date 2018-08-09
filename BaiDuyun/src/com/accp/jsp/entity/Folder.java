package com.accp.jsp.entity;

import java.util.Date;

public class Folder {
	private int folderId;
	private String foldName;
	private int prevId;
	private String userName;
	private Date createTime;
	private int isDel;
	private Date delTime;
	public int getFolderId() {
		return folderId;
	}
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}
	public String getFoldName() {
		return foldName;
	}
	public void setFoldName(String foldName) {
		this.foldName = foldName;
	}
	public int getPrevId() {
		return prevId;
	}
	public void setPrevId(int prevId) {
		this.prevId = prevId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	public Date getDelTime() {
		return delTime;
	}
	public void setDelTime(Date delTime) {
		this.delTime = delTime;
	}

}
