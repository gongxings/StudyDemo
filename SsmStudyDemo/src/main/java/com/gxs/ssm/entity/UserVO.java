package com.gxs.ssm.entity;

/**
 * 用户实体
 * 
 * @author gxs
 * @date 2018-03-24
 */
public class UserVO {
	private String id;
	private String userName;
	private String usercode;
	private String passWord;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
