package com.neusoft.po;

//import com.neusoft.elmboot.util.CommonUtil;

public class User {
	private String userId;
	private String password;
	
//	private String passwordMd5  =   CommonUtil.getMd5(password);

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public int getDelTag() {
		return delTag;
	}

	
	
	public void setDelTag(int delTag) {
		this.delTag = delTag;
	}

//	public String getPasswordMd5() {
//		return passwordMd5;
//	}

//	public void setPasswordMd5(String password) {
//		this.passwordMd5 = commonUtil.getMd5(password);
//	}

	private String userName;
	private String userImg;
	private int userSex;
	private int delTag;

}
