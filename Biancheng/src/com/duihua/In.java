package com.duihua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class In implements Runnable{
	Socket socket = null;
	public In(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		while(true){
			try {
				// TODO Auto-generated method stub
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String fanhui;
				
					fanhui = bufferedReader.readLine();
					System.out.println("¿Í»§¶Ë\n"+fanhui);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
