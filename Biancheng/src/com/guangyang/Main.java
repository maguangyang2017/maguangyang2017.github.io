package com.guangyang;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		try {
			//���������
			while(true){
			ServerSocket serverSocket = new ServerSocket(8989);
			System.out.println("�����������ɹ�");
			Socket sockect = serverSocket.accept();
			System.out.println("���ڼ����˿�");
			String address =new String( sockect.getInetAddress().getAddress());
			System.out.println("���������ʵ�ַ"+address);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
