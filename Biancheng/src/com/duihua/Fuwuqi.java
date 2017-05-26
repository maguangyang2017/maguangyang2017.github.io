package com.duihua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fuwuqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		List <Socket> list = new ArrayList<Socket>();
		Map<String, Socket> socketHashmap = new HashMap<String,Socket>();
		try {
			serverSocket = new ServerSocket(8999);
			
			
			while(true){
				
				socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String name = bufferedReader.readLine();
				socketHashmap.put(name, socket);
				list.add(socket);
				new Thread(new Arunnable(socket,list,socketHashmap)).start();
				//new Thread(new Fuwu(socket)).start();
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
