package com.cmy.bean;

/**
 * 这是对学生的数据封装
 * @author Li
 *
 */
public class StudentBean {
	
	private String id;
	private String name;
	private int class_id;
	private String dorm;
	private int age;
	private String sex;
	private String home;
	private String hobby;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBean(String id, String name, int class_id, String dorm) {
		super();
		this.id = id;
		this.name = name;
		this.class_id = class_id;
		this.dorm = dorm;
	}

	public StudentBean(String id, String name, int class_id, String dorm, int age, String sex, String home, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.class_id = class_id;
		this.dorm = dorm;
		this.age = age;
		this.sex = sex;
		this.home = home;
		this.hobby = hobby;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getDorm() {
		return dorm;
	}

	public void setDorm(String dorm) {
		this.dorm = dorm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", class_id=" + class_id + ", dorm=" + dorm + ", age=" + age
				+ ", sex=" + sex + ", home=" + home +  ", hobby=" + hobby + "]";
	}

}
