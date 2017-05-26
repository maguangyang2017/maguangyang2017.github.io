package com.duihua;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Write implements Runnable{
	Socket socket = null;
	public Write(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		while(true){
			try {
				Scanner sc = new Scanner(System.in);
				// TODO Auto-generated method stub
				System.out.println("«Î ‰»Îƒ⁄»›");
				String neirong = sc.next();
				PrintWriter printWriter;
				printWriter = new PrintWriter(socket.getOutputStream());
				printWriter.write(neirong+"\n");
				printWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}
	
}
