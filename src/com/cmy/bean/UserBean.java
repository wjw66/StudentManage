package com.cmy.bean;

/**
 * 这是对用户登陆的数据封装
 * @author Li
 *
 */
public class UserBean {

	private String id;
	private String password;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
