package com.wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client implements Runnable  {
	Socket socket = null;
	private String fangID;
	List<Socket> sockets;
	Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	public Client(Socket socket,List<Socket> sockets,Map<String,Socket> socketHashMap, String fangID){
		this.socket = socket;
        this.sockets = sockets;
       
        this.socketHashMap = socketHashMap;
        this.fangID = fangID;
	}
	@Override
	public void run() {
		while(true){
			ObjectInputStream objectInputStream = null;
			try {
				objectInputStream = new ObjectInputStream(socket.getInputStream());
				Object object = objectInputStream.readObject();
				Set<String> setMap = socketHashMap.keySet();
				for(String sm:setMap){
					if(socketHashMap.get(sm).equals(fangID)){
						ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
						objectOutputStream.writeObject(object);
						objectOutputStream.flush();
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
