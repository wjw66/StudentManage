package com.cmy.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.cmy.bean.ClassTableBean;
import com.cmy.bean.StudentBean;
import com.cmy.dao.StudentDao;
import com.cmy.util.JDBCUtil;

/**
 * 这是针对前面处理学生信息的Dao的具体实现类
 * @author Li
 *
 */
public class StudentDaoImpl implements StudentDao {

	@Override
	public StudentBean getMessage(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select * from student where id=?";
		StudentBean stu = run.query(sql, new BeanHandler<StudentBean>(StudentBean.class), id);
		return stu;
	}

	@Override
	public boolean alterMessage(String id, int age, String home, String hobby) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "update student set age=?,home=?,hobby=? where id=?";
		int count = run.update(sql, age, home, hobby, id);
		return count>0;
	}

	@Override
	public Float getGrade(String id, String score_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select grade from "+score_id+"_grade where id=?";
		float grade = run.query(sql, new ResultSetHandler<Float>() {
			public Float handle(ResultSet set) throws SQLException {
				// TODO Auto-generated method stub
				set.next();
				return set.getFloat(1);
			}	
		}, id);
		return grade;
	}

	@Override
	public List<Object> getScoreId(String name) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select id from course where name like ?";
		List<Object> list = run.query(sql, new ColumnListHandler(), ("%"+name+"%"));
		return list;
	}

	@Override
	public String getScoreName(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select name from course where id=?";
		String name = run.query(sql, new ResultSetHandler<String>() {

			@Override
			public String handle(ResultSet arg0) throws SQLException {
				// TODO Auto-generated method stub
				arg0.next();
				return arg0.getString(1);
			}
		}, id);
		return name;
	}

	@Override
	public int getClassId(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select class_id from student where id=?";
		int i = run.query(sql, new ResultSetHandler<Integer>(){

			@Override
			public Integer handle(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				rs.next();
				return rs.getInt(1);
			}
			
		}, id);
		return i;
	}

	@Override
	public List<ClassTableBean> getClassTable(String class_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner run = new QueryRunner(JDBCUtil.getDataSource());
		String sql = "select score_name,course_time from "+class_id+"_course";
		return run.query(sql, new BeanListHandler<ClassTableBean>(ClassTableBean.class));
	}

}
