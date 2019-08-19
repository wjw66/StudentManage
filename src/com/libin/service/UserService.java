package com.libin.service;

import java.sql.SQLException;

/**
 * 这是对用户信息处理的业务层
 * @author Li
 *
 */
public interface UserService {
	
	/**
	 * 处理管理员登陆
	 * @param username
	 * @param type
	 * @return
	 * @throws SQLException
	 */
	public boolean login(String username, String password, String type)throws SQLException;
}
