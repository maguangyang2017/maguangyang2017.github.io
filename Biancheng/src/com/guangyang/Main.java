package com.guangyang;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		try {
			//创建服务端
			while(true){
			ServerSocket serverSocket = new ServerSocket(8989);
			System.out.println("服务器创建成功");
			Socket sockect = serverSocket.accept();
			System.out.println("正在监听端口");
			String address =new String( sockect.getInetAddress().getAddress());
			System.out.println("有人来访问地址"+address);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
