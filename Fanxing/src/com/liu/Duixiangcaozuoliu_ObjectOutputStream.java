package com.liu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Duixiangcaozuoliu_ObjectOutputStream {

	public static void main(String[] args) {
		String path = "D:/obj.txt";
		try (ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream(path));
		) {
		oos.writeObject(new Student("will", 99));
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
