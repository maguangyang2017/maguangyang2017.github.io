package com.guangyang;

public class Student {
	private String name;
	private int age;
	private int chengji;
	public Student(String name,int age,int chengji){
		this.name=name;
		this.age=age;
		this.chengji=chengji;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getChengji() {
		return chengji;
	}
	public void setChengji(int chengji) {
		this.chengji = chengji;
	}
}
