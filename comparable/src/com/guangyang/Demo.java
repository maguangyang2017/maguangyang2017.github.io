package com.guangyang;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Set set = new TreeSet(new Mycomparator());
		set.add(new Student("�ŷ�",20,100));
		set.add(new Student("��ҧ��",19,90));
		set.add(new Student("ī��",22,90));
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Student s = (Student)iterator.next();
			System.out.println("����:"+s.getName()+"\t����:"+s.getAge()+"\t�ɼ�:"+s.getChengji());
		}
	}

}
