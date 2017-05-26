package com.duihua;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arunnable implements Runnable{
	Socket socket = null;
	List <Socket> sockets;
	Map<String, Socket> socketHashMap = new HashMap<String , Socket>();
	
	public Arunnable(Socket socket,List<Socket> sockets,Map<String,Socket> socketHashMap){
		this.socket = socket;
		this.sockets = sockets;
		this.socketHashMap = socketHashMap;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = null;
				xiaoxi = bufferedReader.readLine();
				Set<String> keys = socketHashMap.keySet();
				String name = "";
				for(String s:keys){
					Socket so = socketHashMap.get(s);
					if(socket==so){
						name = s;
					}
				}
				
				
				
				
				
				
				System.out.println("服务器端返回内容为"+xiaoxi);
				String s =name+ "说"+xiaoxi;
				for(Socket socket1:sockets){
					PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
					printWriter.write(s+"\n");
					printWriter.flush();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
