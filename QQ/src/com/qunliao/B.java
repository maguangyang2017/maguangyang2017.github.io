package com.qunliao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

public class B {
	public static void main(String[] args){
	
		ServerSocket ses = null;
		Socket so = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String,Socket> socketMap = new HashMap<String,Socket>();
		try{
			ses = new ServerSocket(11000);
			
			System.out.println("服务器启动");
			
			while(true){
				so = ses.accept();
				BufferedReader bfr = new BufferedReader(new InputStreamReader(so.getInputStream()));
				String name = bfr.readLine();
				socketMap.put(name,so);
				list.add(so);
				//new Thread(new Runnable(so,list,socketMap)).start();
				
				/*BufferedReader buf = new BufferedReader(new InputStreamReader(so.getInputStream()));
				String xiaoxi = buf.readLine();
				System.out.println("客户端发送消息为："+xiaoxi);
				String s = "服务器返回"+xiaoxi;
				PrintWriter pw = new PrintWriter(so.getOutputStream());
				pw.write(s+"\n");
				pw.flush();*/
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}