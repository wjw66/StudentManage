package com.libin.daoimpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.libin.bean.TeacherBean;
import com.libin.dao.TeacherDao;
import com.libin.util.JDBCUtil;

/**
 * 这是根据前面定义的Teacher的Dao接口的具体实现类
 * @author Li
 *
 */
public class TeacherDaoImpl implements TeacherDao{

	@Override
	public TeacherBean getMessage(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from teacher where id=?";
		TeacherBean tea = run.query(sql, new BeanHandler<TeacherBean>(TeacherBean.class), id);
		return tea;
	}

	@Override
	public boolean alterMessage(String id, int age, String home, String hobby) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "update teacher set age=?,home=?,hobby=? where id=?";
		int count = run.update(sql, age, home, hobby, id);
		return count>0;
	}

	@Override
	public boolean addScore(String stu_id, String class_id, float score) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into "+class_id+"_grade values(?,?)";
		int count = run.update(sql, stu_id, score);
		return count > 0;
	}

	@Override
	public boolean ifExitStu(String stu_id, String class_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from "+class_id+"_grade where id=?";
		Object [] ob = run.query(sql, new ArrayHandler(), stu_id);
		return ob==null ? false : true;
	}

	@Override
	public boolean updateScore(String stu_id, String class_id, float score) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "update "+class_id+"_grade set grade=? where id=?";
		int count = run.update(sql, score, stu_id);
		return count > 0;
	}

	@Override
	public boolean deleteScore(String stu_id, String class_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "delete from "+class_id+"_grade where id=?";
		int count = run.update(sql, stu_id);
		return count > 0;
	}

}
