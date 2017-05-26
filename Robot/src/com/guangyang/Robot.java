package com.guangyang;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//78d9913020434825a4b6eb04d77463ca
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(1234);
			socket = serverSocket.accept();
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			Student s =(Student) objectInputStream.readObject();
			System.out.println("客户端发来对象"+s);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
