package com.libin.serviceimpl;

import java.sql.SQLException;

import com.libin.bean.TeacherBean;
import com.libin.dao.TeacherDao;
import com.libin.daoimpl.TeacherDaoImpl;
import com.libin.service.TeacherService;

/**
 * 这是用于处理Teacher信息的业务层的具体实现类
 * @author Li
 *
 */
public class TeacherServiceImpl implements TeacherService{

	@Override
	public TeacherBean getMessage(String id) throws SQLException {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDaoImpl();
		return dao.getMessage(id);
	}

	@Override
	public boolean alterMessage(String id, int age, String home, String hobby) throws SQLException {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDaoImpl();
		return dao.alterMessage(id, age, home, hobby);
	}

	@Override
	public String addScore(String stu_id, String class_id, float score) throws SQLException {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDaoImpl();
		boolean flag1 = dao.ifExitStu(stu_id, class_id);
		if(flag1==true){
			return "该学生成绩已录入";
		}
		boolean flag = dao.addScore(stu_id, class_id, score);
		return flag==true ? "添加成功!" : "添加失败!";
	}

	@Override
	public String updateScore(String stu_id, String class_id, float score) throws SQLException {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDaoImpl();
		boolean flag1 = dao.ifExitStu(stu_id, class_id);
		if(flag1==false){
			return "该学生成绩没有录入";
		}
		boolean flag = dao.updateScore(stu_id, class_id, score);
		return flag==true ? "更新成功!" : "更新失败!";
	}

	@Override
	public String deleteScore(String stu_id, String class_id) throws SQLException {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDaoImpl();
		boolean flag1 = dao.ifExitStu(stu_id, class_id);
		if(flag1==false){
			return "该学生成绩没有录入";
		}
		boolean flag = dao.deleteScore(stu_id, class_id);
		return flag==true ? "删除成功!" : "删除失败!";
	}

}
