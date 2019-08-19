package com.libin.service;

import java.sql.SQLException;

import com.libin.bean.TeacherBean;

/**
 * 这是用于处理Teacher信息的业务层
 * @author Li
 *
 */
public interface TeacherService {
	
	/**
	 * 查询教师信息
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
	public String addScore(String stu_id, String class_id, float score)throws SQLException;
	
	/**
	 * 更新学生成绩
	 * @param stu_id
	 * @param class_id
	 * @param score
	 * @return
	 * @throws SQLException
	 */
	public String updateScore(String stu_id, String class_id, float score)throws SQLException;
	
	/**
	 * 删除学生成绩
	 * @param stu_id
	 * @param class_id
	 * @param score
	 * @return
	 * @throws SQLException
	 */
	public String deleteScore(String stu_id, String class_id)throws SQLException;
}
