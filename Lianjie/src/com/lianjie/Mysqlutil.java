package com.lianjie;

import java.sql.Connection;
import java.sql.DriverManager;
public class Mysqlutil {
	private static Connection connection = null;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Mysqlutil(){
		
	}
	public Connection getInstace(){
		
		return connection;		
	}
}
