package com.jiejian;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main2 extends JFrame{
	int flag = 0;
	public Main2(){
		this.setLayout(null);
		
		//�������
		JTextArea jtextarea = new JTextArea();
		//jtextarea.setText("");
		jtextarea.setBounds(100,50,200,30);
		this.add(jtextarea);
		
		JLabel jlabel = new JLabel();
		jlabel.setText("�������");
		jlabel.setBounds(30, 50, 100, 30);
		this.add(jlabel);
		
		//�û������
		JTextArea jtextarea1 = new JTextArea();
		//jtextarea1.setText("");
		jtextarea1.setBounds(100,100,200,30);
		this.add(jtextarea1);
		
		JLabel jlabe2 = new JLabel();
		jlabe2.setText("�û������");
		jlabe2.setBounds(30, 100, 100, 30);
		this.add(jlabe2);
		
		//�жϿ�
		JTextArea jtextarea2 = new JTextArea();
		jtextarea2.setText("");
		jtextarea2.setBounds(100,150,200,30);
		this.add(jtextarea2);
		
		JLabel jlabe3 = new JLabel();
		jlabe3.setText("�жϿ�");
		jlabe3.setBounds(30, 150, 100, 30);
		this.add(jlabe3);
		
		//��ʼ��ť
				JButton jButton = new JButton();
				jButton.setText("��ʼ");
				jButton.setBounds(100, 200, 200, 30);
				//������
				jButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						flag=2;
						jtextarea2.setText("");
				          new Thread(new Runnable(){
							public void run() {
								while(flag==2){
									jtextarea.setText((int)(Math.random()*5+1)+"");
								}
							}
						}).start();
					}
				});
				this.add(jButton);
		//������ť
				JButton jButton1 = new JButton();
				jButton1.setText("����");
				jButton1.setBounds(100, 250, 200, 30);
				//������
				jButton1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ee) {
						flag=1;
						String a = jtextarea.getText();
						String aa = jtextarea1.getText();
						if(a.equals(aa)){
							jtextarea2.setText("��ͬ");
						}else{
							jtextarea2.setText("����ͬ");
						}
					}
				});
				this.add(jButton1);
				
		
		//�ܴ���
		this.setBounds(200,200,435,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main2();
	}

}
