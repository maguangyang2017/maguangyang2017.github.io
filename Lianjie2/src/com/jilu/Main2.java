package com.jilu;

import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextArea;

import com.mysql.jdbc.PreparedStatement;

public class Main2 {
	public static void main(String[] args) {
		Socket socket = new Socket();
		
		
		//Selects();
		//add("n","jTextArea.setText(jTextArea.getText())");
		//deletes();
		//updates();
	}
	//增加
	public static void add(int id,String nr){
		String sql = "Insert into emp values ("+id+",'"+nr+"')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lishijilu","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
				String sql1 = "insert into `jilu`(nr) values (?)";
            	PreparedStatement statement =(PreparedStatement) con.prepareStatement(sql1);
            	statement.setString(1, nr);
            	boolean isSuccess = statement.execute();
            	System.out.println("结果是"+isSuccess);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查询
	public static void Selects(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lishijilu","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            	Statement statement = con.createStatement();
            	String sql = "select * from jilu";
            	ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
              int  sid = rs.getInt("id");
              String n = rs.getString("nr");

                //输出结果
                System.out.println(sid + "\t" + n);
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
