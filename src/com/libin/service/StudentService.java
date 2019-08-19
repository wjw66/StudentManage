package com.libin.service;

import java.sql.SQLException;
import java.util.List;

import com.libin.bean.ClassTableBean;
import com.libin.bean.ScoreBean;
import com.libin.bean.StudentBean;

/**
 * 这是处理学生信息的业务层
 * @author Li
 *
 */
public interface StudentService {
	
	/**
	 * 返回该学生信息
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public StudentBean getMessage(String id)throws SQLException;
	
	/**
	 * 修改学生信息
	 * @param id
	 * @param age
	 * @param home
	 * @param hobby
	 * @return
	 * @throws SQLException
	 */
	public boolean alterMessage(String id, int age, String home, String hobby)throws SQLException;
	
	/**
	 * 返回成绩的封装
	 * @param id
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public List<ScoreBean> getGrade(String id, String name)throws SQLException;
	
	/**
	 * 返回课表
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<ClassTableBean> getClassTable(String id)throws SQLException;
}
