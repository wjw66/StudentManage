package com.libin.bean;

/**
 * 这是考试成绩的数据封装
 * @author Li
 *
 */
public class ScoreBean {

	private String name;
	private float grade;
	
	public ScoreBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreBean(String name, float grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
}
