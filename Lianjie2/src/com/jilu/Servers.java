package com.jilu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.PreparedStatement;

public class Servers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String, Socket> socketHashMap = new HashMap<String,Socket>();
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("·þÎñÆ÷Æô¶¯");
			while(true){
				socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String name = bufferedReader.readLine();
				socketHashMap.put(name, socket);
				list.add(socket);
				new Thread(new Client(socket,list,socketHashMap)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
