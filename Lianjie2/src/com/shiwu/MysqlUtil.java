package com.shiwu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;

public class MysqlUtil {
	private static LinkedList<Connection> connections = new LinkedList<Connection>();
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i=0;i<20;i++){
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiwu","root","123");
				if(!connection.isClosed()){
	                System.out.println("初始化链接");
	                connections.add(connection);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private MysqlUtil(){}
	public static Connection getInstance(){
		while(true){
			synchronized (connections) {
				if(connections.size()>0){
					System.out.println("有线程借走了一条连接，当前有"+connections.size()+"条");
					return connections.removeFirst();
				}else{
					try {
						System.out.println("链接用光了，等待链接");
						connections.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	public static void freeconnect(Connection con){
		synchronized (connections) {
			System.out.println("有人换回了一个链接，当前有"+connections.size());
			connections.add(con);
			connections.notifyAll();
		}
		
	}
}
