package com.jilu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextArea;

public class Shou implements Runnable{
	Socket socket;
	JTextArea jTextArea;
	public Shou(Socket socket,JTextArea jTextArea){
		this.socket = socket;
		this.jTextArea = jTextArea;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
              jTextArea.setText(jTextArea.getText()+"\n"+sid+"\t"+n);
            }
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		while(true){
			
			try {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String s = bufferedReader.readLine();
				jTextArea.setText(jTextArea.getText()+"\n"+s);
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	

}
