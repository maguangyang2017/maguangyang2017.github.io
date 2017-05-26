package com.duihua;


import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Fuwu implements Runnable{
	Socket socket = null;
	public Fuwu(Socket socket){
		this.socket = socket;
	}
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			try {
				System.out.println("服务器端说");
				String aa = scanner.next();
				PrintWriter printWriter;
				printWriter = new PrintWriter(socket.getOutputStream());
				printWriter.write("服务器端说"+aa+"\n");
				printWriter.flush();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
