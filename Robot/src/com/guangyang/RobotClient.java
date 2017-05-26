package com.guangyang;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RobotClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.162",1234);
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(new Student("¹þ¹þ",12));
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
