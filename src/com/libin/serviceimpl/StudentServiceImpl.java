package com.libin.serviceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.libin.bean.ClassTableBean;
import com.libin.bean.ScoreBean;
import com.libin.bean.StudentBean;
import com.libin.dao.StudentDao;
import com.libin.daoimpl.StudentDaoImpl;
import com.libin.service.StudentService;

/**
 * 这是处理学生信息的业务层的具体实现类
 * @author Li
 *
 */
public class StudentServiceImpl implements StudentService {

	@Override
	public StudentBean getMessage(String id) throws SQLException {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDaoImpl();
		return dao.getMessage(id);
	}

	@Override
	public boolean alterMessage(String id, int age, String home, String hobby) throws SQLException {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDaoImpl();
		return dao.alterMessage(id, age, home, hobby);
	}

	@Override
	public List<ScoreBean> getGrade(String id, String name) throws SQLException {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDaoImpl();
		List<Object> list = dao.getScoreId(name);
		int len = list.size();
		List<ScoreBean> list_grade = new ArrayList<>();
		for(int i = 0; i < len; i++){
			Float grade = dao.getGrade(id, list.get(i).toString());
			String score_name = dao.getScoreName(list.get(i).toString());
			ScoreBean bean = new ScoreBean(score_name, grade);
			list_grade.add(bean);
		}
		return list_grade;
	}

	@Override
	public List<ClassTableBean> getClassTable(String id) throws SQLException {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDaoImpl();
		String class_id = ""+dao.getClassId(id);
		return dao.getClassTable(class_id);
	}

}
