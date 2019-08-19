package com.libin.serviceimpl;

import java.sql.SQLException;

import com.libin.dao.UserDao;
import com.libin.daoimpl.UserDaoImpl;
import com.libin.service.UserService;

/**
 * 这是用户信息处理的业务层的具体实现类
 * @author Li
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String username,String password,String type) throws SQLException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		String flag = null;
		switch(type){
		case "student":flag = dao.student_Login(username); break;
		case "teacher":flag = dao.teacher_Login(username); break;
		case "root":flag = dao.root_Login(username); break;
		default:break;
		}
		if(flag==null || !flag.equals(password) ){
			return false;
		}
		return true;
	}

}
