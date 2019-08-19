package com.cmy.service;

import java.sql.SQLException;

/**
 * 
 * 这是用于处理Root处理用户信息的业务层
 * @author Li
 *
 */
public interface RootService {

	/**
	 * 添加学生
	 * @param stu_id
	 * @param name
	 * @param class_id
	 * @param dorm
	 * @return
	 * @throws SQLException
	 */
	public String addStu(String stu_id, String name, String class_id, String dorm)throws SQLException;
	
	/**
	 * 添加教师
	 * @param tea_id
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public String addTea(String tea_id, String name)throws SQLException;
	
	/**
	 * 删除学生
	 * @param stu_id
	 * @return
	 * @throws SQLException
	 */
	public String delStu(String stu_id)throws SQLException;
	
	/**
	 * 删除教师
	 * @param tea_id
	 * @return
	 * @throws SQLException
	 */
	public String delTea(String tea_id)throws SQLException;
	
	/**
	 * 增加新课程
	 * @param score_id
	 * @param score_name
	 * @param tea_id
	 * @return
	 * @throws SQLException
	 */
	public String addClass(String score_id, String score_name, String tea_id)throws SQLException;
	
	/**
	 * 加入课程到课表
	 * @param score_id
	 * @param class_id
	 * @param score_time
	 * @return
	 * @throws SQLException
	 */
	public String addClassTab(String score_id, String class_id, String score_time)throws SQLException;
}
