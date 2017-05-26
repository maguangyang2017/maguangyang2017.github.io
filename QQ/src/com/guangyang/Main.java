package com.guangyang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame{
	int  flag = 0;
	public Main () {
		
		this.setLayout(null);
		JLabel jLabel = new JLabel();
		jLabel.setText("输入数");
		jLabel.setBounds(100,100, 100, 40);
		this.add(jLabel);
		
		JTextArea jTextArea = new JTextArea();
		jTextArea.setBounds(150, 100, 200, 40);
		this.add(jTextArea);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("随机数");
		jLabel2.setBounds(100, 150, 100, 40);
		this.add(jLabel2);
		
		JTextArea jTextArea2 = new JTextArea();
		jTextArea2.setBounds(150, 150, 200, 40);
		this.add(jTextArea2);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("判断框");
		jLabel3.setBounds(100, 200, 100, 40);
		this.add(jLabel3);
		
		JTextArea jTextArea3 = new JTextArea();
		jTextArea3.setText("");
		jTextArea3.setBounds(150, 200, 200, 40);
		this.add(jTextArea3);
		
		JButton jButton = new JButton();
		jButton.setText("开始");
		jButton.setBounds(100, 300, 100, 50);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = 2; 
				jTextArea3.setText("");
				new Thread(new Runnable() {
					public void run() {
						while(flag==2){
							jTextArea2.setText((int)(Math.random()*9999+1)+"");
						}
					}
				}).start();
			}
		});
		this.add(jButton);
		JButton jButton2 = new JButton();
		jButton2.setText("停止");
		jButton2.setBounds(200, 300, 100, 50);
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = 1;
				String a= jTextArea.getText();
				String s= jTextArea2.getText();
					if(a.equals(s)){
						jTextArea3.setText("相同");
					}else{
						jTextArea3.setText("不相同");
					}
				}
		});
		this.add(jButton2);
		
		
		this.setBounds(500,500,500,500);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
