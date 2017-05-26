package com.guangyang;

import java.io.IOException;
import java.net.Socket;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("192.168.199.165",4399);
			System.out.println("是否连接成功"+socket.isConnected());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
