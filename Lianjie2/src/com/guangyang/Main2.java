package com.guangyang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Main2 {

	public static void main(String[] args) {
		Selects();
		//add(5050,"王六");
		//deletes();
		//updates();
	}
	//增加
	public static void add(int empo, String enam){
		String sql = "Insert into emp values ("+empo+",'"+enam+"')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
				String sql1 = "insert into `emp`(empno,ename) values (?,?)";
            	PreparedStatement statement =(PreparedStatement) con.prepareStatement(sql1);
            	statement.setInt(1, empo);
            	statement.setString(2, enam);
            	boolean isSuccess = statement.execute();
            	System.out.println("结果是"+isSuccess);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//删除
	public static void deletes(){
		String sql2 = "delete from emp where empno = 5050";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            	PreparedStatement statement =(PreparedStatement) con.prepareStatement(sql2);
            	boolean isSuccess = statement.execute();
            	System.out.println("结果是"+isSuccess);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//修改
	public static void updates(){
		String sql3 = "update emp set empno = 3030 where ename = '王六' ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            	PreparedStatement statement =(PreparedStatement) con.prepareStatement(sql3);
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123");
			if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            	Statement statement = con.createStatement();
            	String sql = "select * from emp";
            	ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
              int  empn = rs.getInt("empno");
              String enam = rs.getString("ename");

                //输出结果
                System.out.println(empn + "\t" + enam);
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
