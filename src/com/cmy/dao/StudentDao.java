package com.cmy.dao;

import java.sql.SQLException;
import java.util.List;

import com.cmy.bean.ClassTableBean;
import com.cmy.bean.StudentBean;

/**
 * 这是对学生信息处理的Dao接口
 * @author Li
 *
 */
public interface StudentDao {
	
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
	 * 返回<课程名,分数>键值对
	 * @param id
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public Float getGrade(String id, String score_id)throws SQLException;
	
	/**
	 * 根据课程名查询课程id
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<Object> getScoreId(String name)throws SQLException;
	
	/**
	 * 根据课程ID查询课程名
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public String getScoreName(String id)throws SQLException;
	
	/**
	 * 根据学生ID查询该学生所在班级ID
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int getClassId(String id)throws SQLException;
	
	/**
	 * 返回该班级课表
	 * @param class_id
	 * @return
	 * @throws SQLException
	 */
	public List<ClassTableBean> getClassTable(String class_id)throws SQLException;
	
}
