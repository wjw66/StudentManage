package com.libin.daoimpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.libin.bean.UserBean;
import com.libin.dao.UserDao;
import com.libin.util.JDBCUtil;

/**
 * 这是根据前面定义的对用户信息处理的规范的具体实现类
 * @author Li
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public String student_Login(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from student_login where id=?";
		UserBean user = run.query(sql, new BeanHandler<UserBean>(UserBean.class), username);
		if(user==null){
			return null;
		}
		return user.getPassword();
	}
	public String teacher_Login(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from teacher_login where id=?";
		UserBean user = run.query(sql, new BeanHandler<UserBean>(UserBean.class), username);
		if(user==null){
			return null;
		}
		return user.getPassword();
	}
	public String root_Login(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from root_login where id=?";
		UserBean user = run.query(sql, new BeanHandler<UserBean>(UserBean.class), username);
		if(user==null){
			return null;
		}
		return user.getPassword();
	}

}
