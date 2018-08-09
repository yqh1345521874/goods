package com.accp.jsp.entity;

import java.util.Date;

public class Friends {
	private int friendId;
	private String thisName;
	private String friendName;
	private Date addTime;
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getThisName() {
		return thisName;
	}
	public void setThisName(String thisName) {
		this.thisName = thisName;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

}
