package com.guangyang;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Set set = new TreeSet(new Mycomparator());
		set.add(new Student("张飞",20,100));
		set.add(new Student("程咬金",19,90));
		set.add(new Student("墨子",22,90));
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Student s = (Student)iterator.next();
			System.out.println("姓名:"+s.getName()+"\t年龄:"+s.getAge()+"\t成绩:"+s.getChengji());
		}
	}

}
