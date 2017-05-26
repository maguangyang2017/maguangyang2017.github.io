package com.jilu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JTextArea;

public class Client implements Runnable  {
	Socket socket = null;
	List<Socket> sockets;
	Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	public Client(Socket socket,List<Socket> sockets,Map<String,Socket> socketHashMap){
		this.socket = socket;
        this.sockets = sockets;
        this.socketHashMap = socketHashMap;
	}
	@Override
	public void run() {
		PrintWriter printWriter = null;
		// TODO Auto-generated method stub
		while(true){
			try {
				printWriter = new PrintWriter(socket.getOutputStream());
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = null;
				xiaoxi = bufferedReader.readLine();
				System.out.println("正在接受客户端数据");
				System.out.println("客户端发送消息为："+xiaoxi);
				String name = "";
				Set<String> keys = socketHashMap.keySet();
				for(String m:keys){
					Socket so = socketHashMap.get(m);
					if(socket==so){
						name = m;
					}
				}
				int id = 1;
				Main2 main2 = new Main2();
				main2.add(id, xiaoxi);
				System.out.println("客户端返回内容" + xiaoxi);
                String s = name+"说" + xiaoxi;
                for(Socket socket1:sockets){
                	printWriter = new PrintWriter(socket1.getOutputStream());
                	printWriter.write(s+"\n");
                	printWriter.flush();
                }
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
