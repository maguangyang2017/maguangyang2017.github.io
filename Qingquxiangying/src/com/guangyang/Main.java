package com.guangyang;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			 serverSocket = new ServerSocket(80);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true){
			try {
				//serverSocket.accept();
				Socket socket = serverSocket.accept();
				byte[] bs = new byte[1024];
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String s = bufferedReader.readLine();
				String[] ss = s.split(" ");
				String[] sss = ss[1].split("[?]");
				String[] ssss = sss[1].split("[&]");
				if(ssss[1].equals("action=delete")){
					String sql = "delete from emp where "+ssss[0];
				}
				FileInputStream fileInputStream = new FileInputStream("src/index.html");
				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
				printWriter.println("HTTP/1.1 200 OK");
				printWriter.println("Conent-Type:text/html");
				printWriter.println();
				byte[] b = new byte[fileInputStream.available()];
				fileInputStream.read(b);
				//printWriter.write("lalallalalall".getBytes());
				
				printWriter.flush();
				printWriter.close();
				serverSocket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
