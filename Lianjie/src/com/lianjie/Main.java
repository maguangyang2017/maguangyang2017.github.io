package com.lianjie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
				Statement statement = con.createStatement();
				String sql = "select * from emp";
				ResultSet rs = statement.executeQuery(sql);
				while(rs.next()){
	                 int empo = rs.getInt("empno");
	                 String enam = rs.getString("ename");
	                 System.out.println(empo + "\t" + enam);
	             }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	//增加
//	public static void add(int empo,String enam){
	
//	}
	//删除
	//修改
	//查询

}
