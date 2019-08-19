package com.libin.bean;

/**
 * 这是课表的数据封装
 * @author Li
 *
 */
public class ClassTableBean {

	private String score_name;
	private String course_time;
	
	public ClassTableBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassTableBean(String score_name, String course_time) {
		super();
		this.score_name = score_name;
		this.course_time = course_time;
	}

	public String getScore_name() {
		return score_name;
	}

	public void setScore_name(String score_name) {
		this.score_name = score_name;
	}

	public String getCourse_time() {
		return course_time;
	}

	public void setCourse_time(String course_time) {
		this.course_time = course_time;
	}

	@Override
	public String toString() {
		return "ClassTableBean [score_name=" + score_name + ", course_time=" + course_time + "]";
	}
	
	
}
