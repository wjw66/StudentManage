package com.cmy.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;

import com.cmy.dao.RootDao;
import com.cmy.util.JDBCUtil;

/**
 * 这是处理Root处理用户信息的Dao接口的具体实现类
 * @author Li
 *
 */
public class RootDaoImpl implements RootDao {

	@Override
	public boolean ifExitStu(String stu_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from student where id=?";
		Object [] ob = run.query(sql, new ArrayHandler(),stu_id);
		return ob!=null;
	}

	@Override
	public boolean addStu(String stu_id, String name, String class_id, String dorm) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into student(id,name,class_id,dorm) values(?,?,?,?)";
		int count = run.update(sql, stu_id, name, class_id, dorm);
		return count>0;
	}

	@Override
	public boolean addStuLogin(String stu_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into student_login(id,password) values(?,'1234')";
		int count = run.update(sql, stu_id);
		return count>0;
	}

	@Override
	public boolean ifExitTea(String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from teacher where id=?";
		Object [] ob = run.query(sql, new ArrayHandler(), tea_id);
		return ob!=null;
	}

	@Override
	public boolean addTea(String tea_id, String name) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into teacher(id,name) values(?,?)";
		int count = run.update(sql, tea_id, name);
		return count>0;
	}

	@Override
	public boolean addTeaLogin(String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into teacher_login(id,password) values(?,'1234')";
		int count = run.update(sql, tea_id);
		return count>0;
	}

	@Override
	public boolean delStu(String stu_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "delete from student where id=?";
		int count = run.update(sql, stu_id);
		return count>0;
	}

	@Override
	public boolean delStuLogin(String stu_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "delete from student_login where id=?";
		int count = run.update(sql, stu_id);
		return count>0;
	}

	@Override
	public boolean delTea(String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "delete from teacher where id=?";
		int count = run.update(sql, tea_id);
		return count>0;
	}

	@Override
	public boolean delTeaLogin(String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "delete from teacher_login where id=?";
		int count = run.update(sql, tea_id);
		return count>0;
	}

	@Override
	public boolean ifExitClass(String score_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from course where id=?";
		Object [] ob = run.query(sql, new ArrayHandler(), score_id);
		return ob!=null;
	}

	@Override
	public boolean addClass(String score_id, String score_name, String tea_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into course values(?,?,?)";
		int count = run.update(sql, score_id, score_name, tea_id);
		return count>0;
	}

	@Override
	public void addGradeTab(String score_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		Statement st = conn.createStatement();
		String sql = "create table "+score_id+"_grade(id varchar(255) primary key,"
				+ "grade Float Not Null, Foreign Key (id) references student(id))";
		st.execute(sql);
	}

	@Override
	public boolean addClassTab(String score_id, String class_id, String score_name, String score_time) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "insert into "+class_id+"_course values(?,?,?)";
		int count = run.update(sql, score_id, score_name, score_time );
		return count>0;
	}

}
