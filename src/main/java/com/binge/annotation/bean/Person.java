package com.binge.annotation.bean;

/**
 * 
 * @author binge
 * @date 2018年7月24日
 */

public class Person {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		super();
		System.out.println("初始化Person...");
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
