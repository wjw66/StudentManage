package com.cmy.dao;

import java.sql.SQLException;

import com.cmy.bean.TeacherBean;

/**
 * 这是用于处理Teacher信息的Dao层
 * @author Li
 *
 */
public interface TeacherDao {

	/**
	 * 返回教师信息
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public TeacherBean getMessage(String id)throws SQLException;
	
	/**
	 * 修改教师信息
	 * @param id
	 * @param age
	 * @param home
	 * @param hobby
	 * @return
	 * @throws SQLException
	 */
	public boolean alterMessage(String id, int age, String home, String hobby)throws SQLException;
	
	/**
	 * 添加学生成绩
	 * @param stu_id
	 * @param class_id
	 * @param score
	 * @return
	 * @throws SQLException
	 */
	public boolean addScore(String stu_id, String class_id, float score)throws SQLException;
	
	/**
	 * 
	 * 查询该课程中该学生成绩是否已经录入
	 * @param stu_id
	 * @param class_id
	 * @return
	 * @throws SQLException
	 */
	public boolean ifExitStu(String stu_id, String class_id)throws SQLException;
	
	/**
	 * 更新学生成绩
	 * @param stu_id
	 * @param class_id
	 * @param score
	 * @return
	 * @throws SQLException
	 */
	public boolean updateScore(String stu_id, String class_id, float score)throws SQLException;
	
	/**
	 * 删除学生成绩
	 * @param stu_id
	 * @param class_id
	 * @param score
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteScore(String stu_id, String class_id)throws SQLException;
}
