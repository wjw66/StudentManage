package com.cmy.dao;

import java.sql.SQLException;

/**
 * 这是用于处理用户登陆信息的Dao接口
 * @author Chen
 *
 */
public interface UserDao {
	
	/**
	 * 根据用户名得到密码
	 * @param username
	 * @return null，则用户不存在
	 * @throws SQLException
	 */
	public String student_Login(String username)throws SQLException;
	public String teacher_Login(String username)throws SQLException;
	public String root_Login(String username)throws SQLException;
}
