package com.fanshe;

import java.lang.reflect.Constructor;
import java.sql.Connection;

import org.w3c.dom.UserDataHandler;

public class TestReflect3 {

	public static void main(String[] args) throws Exception{
		Class<?> class1 = null;
		class1 = Class.forName("com.fanshe.User");
		User user = (User) class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
		System.out.println(user);
		Constructor<?> cons[] = class1.getConstructors();
		for(int i=0;i< cons.length;i++){
					
		}
	}
	class User{
		private int age;
		private String name;
		
		public User(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "User [age=" + age + ", name=" + name + "]";
		}
		
		
	}
}
