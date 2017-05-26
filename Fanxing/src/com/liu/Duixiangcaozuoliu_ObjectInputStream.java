package com.liu;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Duixiangcaozuoliu_ObjectInputStream {

	public static void main(String[] args) {
		String path = "D:/obj.txt";
		try (ObjectInputStream ois = new ObjectInputStream(
		new FileInputStream(path));
		) {
		Object o = ois.readObject();
		System.out.println(o);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
