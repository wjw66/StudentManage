package com.libin.bean;

/**
 * 这是对Teacher的数据封装
 * @author Li
 *
 */
public class TeacherBean {
	
	private String id;
	private String name;
	private String sex;
	private int age;
	private String home;
	private String hobby;
	
	public TeacherBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherBean(String id, String name, String sex, int age, String home, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "TeacherBean [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", home=" + home
				+ ", hobby=" + hobby + "]";
	}
}
