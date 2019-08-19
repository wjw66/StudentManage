package com.libin.dao;

import java.sql.SQLException;

/**
 * 
 * 这是处理Root处理用户信息的Dao层
 * @author Li
 *
 */
public interface RootDao {

	/**
	 * 是否存在该教师
	 * @param stu_id
	 * @param class_id
	 * @return
	 * @throws SQLException
	 */
	public boolean ifExitTea(String tea_id)throws SQLException;
	
	/**
	 * 是否存在该学生
	 * @param stu_id
	 * @param class_id
	 * @return
	 * @throws SQLException
	 */
	public boolean ifExitStu(String stu_id)throws SQLException;
	
	/**
	 * 是否存在该课程
	 * @param score_id
	 * @return
	 * @throws SQLException
	 */
	public boolean ifExitClass(String score_id)throws SQLException;
	
	/**
	 * 添加学生
	 * @param stu_id
	 * @param name
	 * @param class_id
	 * @param dorm
	 * @return
	 * @throws SQLException
	 */
	public boolean addStu(String stu_id, String name, String class_id, String dorm)throws SQLException;
	
	/**
	 * 
	 * 添加学生登陆账号
	 * @param stu_id
	 * @return
	 * @throws SQLException
	 */
	public boolean addStuLogin(String stu_id)throws SQLException;
	/**
	 * 添加教师
	 * @param stu_id
	 * @param name
	 * @param class_id
	 * @param dorm
	 * @return
	 * @throws SQLException
	 */
	public boolean addTea(String stu_id, String name)throws SQLException;
	
	/**
	 * 
	 * 添加教师登陆账号
	 * @param stu_id
	 * @return
	 * @throws SQLException
	 */
	public boolean addTeaLogin(String stu_id)throws SQLException;
	
	/**
	 * 删除学生
	 * @param stu_id
	 * @return
	 * @throws SQLException
	 */
	public boolean delStu(String stu_id)throws SQLException;
	
	
	/**
	 * 删除学生登陆账号
	 * @param stu_id
	 * @return
	 * @throws SQLException
	 */
	public boolean delStuLogin(String stu_id)throws SQLException;
	
	/**
	 * 删除教师
	 * @param tea_id
	 * @return
	 * @throws SQLException
	 */
	public boolean delTea(String tea_id)throws SQLException;
	
	/**
	 * 删除教师登陆账号
	 * @param tea_id
	 * @return
	 * @throws SQLException
	 */
	public boolean delTeaLogin(String tea_id)throws SQLException;
	
	/**
	 * 添加新课程
	 * @param score_id
	 * @param score_name
	 * @param tea_id
	 * @return
	 * @throws SQLException
	 */
	public boolean addClass(String score_id, String score_name, String tea_id)throws SQLException;
	
	/**
	 * 增加成绩表
	 * @param score_id
	 * @return
	 * @throws SQLException
	 */
	public void addGradeTab(String score_id)throws SQLException;
	
	/**
	 * 在课表中加入课程
	 * @param score_id
	 * @param class_id
	 * @param score_time
	 * @return
	 * @throws SQLException
	 */
	public boolean addClassTab(String score_id, String class_id, String score_name, String score_time)throws SQLException;
	
}
