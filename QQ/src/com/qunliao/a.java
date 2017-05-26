package com.qunliao;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class a implements Runnable {
	Socket soc = null;
	List<Socket> sockets;
	Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	public a(Socket soc,List<Socket> sockets,Map<String,Socket> socketHashMap){
		this.soc = soc;
		this.sockets = sockets;
		this.socketHashMap = socketHashMap;
	}
	public void run(){
		PrintWriter pw = null;
		while(true){
			try {
				pw = new PrintWriter(soc.getOutputStream());
				BufferedReader buf = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				String xiaoxi;
				xiaoxi = buf.readLine();
				System.out.println("正在接受客户端数据");
				System.out.println("客户端发送消息为："+xiaoxi);
				String name="";
				String fh = "";
				Set<String> keys = socketHashMap.keySet(); 
				for(String s:keys){
					Socket socket = socketHashMap.get(s);
					if(soc==socket){
						name=s;
						fh = name+"说："+xiaoxi;
					}
					pw.write(fh);
				}
				for(Socket socket1:sockets){
					if(socket1.isConnected()){
						pw = new PrintWriter(socket1.getOutputStream());
						pw.write(fh+"\n");
						pw.flush();
					}else{
						System.out.println("离线请留言");
					}
				}
				System.out.println("服务器返回消息--->"+fh);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}