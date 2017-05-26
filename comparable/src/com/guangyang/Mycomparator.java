package com.guangyang;
import java.util.*;
public class Mycomparator implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.getAge()>s2.getAge()){
			return 1;
		}
		if(s1.getAge()==s2.getAge()){
			return 0;
		}
		if(s1.getAge()<s2.getAge()){
			return -1;
		}
		return 0;
	}
}
