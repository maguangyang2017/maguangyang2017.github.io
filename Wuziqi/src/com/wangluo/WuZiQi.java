package com.wangluo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WuZiQi extends JFrame{
	public  WuZiQi(Socket socket){
		this.setLayout(null);
		Text text = new Text();
		text.setBounds(30, 30, 550, 5500);
		WuZiQi.this.add(text);
		this.setTitle("五子棋");
		
		JButton jButton = new JButton("开始");
		jButton.setBounds(600, 100, 100, 40);
		this.add(jButton);
		
		
		
		JButton jButton2 = new JButton("重新开始");
		jButton2.setBounds(600, 180, 100, 40);
		jButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text.isWinNow = false;
				text.pointList.clear();
				text.isHei=true;
				text.repaint();

			}
		});
		this.add(jButton2);
		
		this.setBounds(200,200,750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.43.216",8989);
			
			
			new WuZiQi(socket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
