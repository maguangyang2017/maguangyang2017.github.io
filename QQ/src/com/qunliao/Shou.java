package com.qunliao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

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
