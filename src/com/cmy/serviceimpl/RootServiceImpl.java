package com.cmy.serviceimpl;

import java.sql.SQLException;

import com.cmy.dao.RootDao;
import com.cmy.daoimpl.RootDaoImpl;
import com.cmy.daoimpl.StudentDaoImpl;
import com.cmy.service.RootService;

/**
 * 这是处理Root处理用户信息的业务层的具体实现类
 * @author Li
 *
 */
public class RootServiceImpl implements RootService {

	@Override
	public String addStu(String stu_id, String name, String class_id, String dorm) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitStu(stu_id);
		String mess = null;
		if(flag==false){
			boolean flag1 = dao.addStu(stu_id, name, class_id, dorm);
			boolean flag2 = dao.addStuLogin(stu_id);
			if(flag1==true && flag2==true){
				mess = "录入成功!";
			}else{
				mess = "未知错误，请稍后重试!";
			}
		}
		else{
			mess = "该学生信息已录入!";
		}
		return mess;
	}

	@Override
	public String addTea(String tea_id, String name) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitTea(tea_id);
		String mess = null;
		if(flag==false){
			boolean flag1 = dao.addTea(tea_id, name);
			boolean flag2 = dao.addTeaLogin(tea_id);
			if(flag1==true && flag2==true){
				mess = "录入成功!";
			}else{
				mess = "未知错误，请稍后重试!";
			}
		}
		else{
			mess = "该教师信息已录入!";
		}
		return mess;
	}

	@Override
	public String delStu(String stu_id) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitStu(stu_id);
		String mess = null;
		if(flag==true){
			boolean flag1 = dao.delStu(stu_id);
			if(flag1==true){
				mess = "删除成功!";
			}else{
				mess = "未知错误，请稍后重试!";
			}
		}
		else{
			mess = "该学生信息不存在!";
		}
		return mess;
	}

	@Override
	public String delTea(String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitTea(tea_id);
		String mess = null;
		if(flag==true){
			boolean flag1 = dao.delTea(tea_id);
			if(flag1==true){
				mess = "删除成功!";
			}
			else{
				mess = "未知错误，请稍后重试!";
			}
		}
		else{
			mess = "该教师信息不存在!";
		}
		return mess;
	}

	@Override
	public String addClass(String score_id, String score_name, String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitClass(score_id);
		String mess = null;
		if(flag==false){
			boolean flag1 = dao.addClass(score_id, score_name, tea_id);
			dao.addGradeTab(score_id);
			if(flag1==true){
				mess = "添加成功!";
			}
			else{
				mess = "未知错误，请稍后重试!";
			}
		}
		else{
			mess = "该课程已经存在!";
		}
		return mess;
	}

	@Override
	public String addClassTab(String score_id, String class_id, String score_time) throws SQLException {
		// TODO Auto-generated method stub
		RootDao dao = new RootDaoImpl();
		boolean flag = dao.ifExitClass(score_id);
		String mess = null;
		String score_name = new StudentDaoImpl().getScoreName(score_id);
		if(flag==true){
			boolean flag1 = dao.addClassTab(score_id, class_id, score_name, score_time);
			if(flag1==true){
				mess = "添加成功!";
			}
			else{
				mess = "未知错误,请稍后再试!";
			}
		}
		else{
			mess = "该课程不存在!请重新输入!";
		}
		return mess;
	}

}
