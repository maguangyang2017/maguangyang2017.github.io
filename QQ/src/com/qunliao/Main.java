package com.qunliao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	public Main(Socket socket){
		this.setLayout(null);
		JTextArea jTextArea = new JTextArea();
		jTextArea.setOpaque(true);
		jTextArea.setBackground(Color.white);
		jTextArea.setBounds(0, 0, 500, 400);
		jTextArea.setEditable(false);
		this.add(jTextArea);
		
		JTextField jTextField = new JTextField();
		jTextField.setText("");
		jTextField.setBounds(0, 410, 500, 30);
		this.add(jTextField);
		
		JButton jButton = new JButton();
		jButton.setText("·¢ËÍ");
		jButton.setBounds(400, 450, 100, 30);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = jTextField.getText();
				if(!"".equals(s)){
					try {
						PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
						printWriter.write(s+"\n");
						printWriter.flush();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				jTextField.setText("");
			}
		});
		this.add(jButton);
		new Thread(new Shou(socket,jTextArea)).start();
		
		this.setBounds(200,200,520,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.163",8888);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.write("gaoxin3£º\n");
			printWriter.flush();
			
			new Main(socket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
