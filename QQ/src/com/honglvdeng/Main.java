package com.honglvdeng;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	public  Main(){
		//���
		this.setLayout(null);
		JButton jButton= new JButton();
		jButton.setText("���");
		jButton.setBounds(100, 100, 100, 100);
		jButton.setBackground(new Color(0, 0, 0));
		this.add(jButton);
		//�̵�
		JButton jButton2= new JButton();
		jButton2.setText("�̵�");
		jButton2.setBounds(200, 100, 100, 100);
		jButton2.setBackground(new Color(0, 0, 0));
		this.add(jButton2);
		//�Ƶ�
		JButton jButton3= new JButton();
		jButton3.setText("�Ƶ�");
		jButton3.setBounds(300, 100, 100, 100);
		jButton3.setBackground(new Color(0, 0, 0));
		//�ܿ���
		this.add(jButton3);
		JButton jButton4= new JButton();
		jButton4.setText("�������̵�");
		jButton4.setBounds(150, 200, 200, 200);
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true){
							try {
								//�����
								jButton.setBackground(Color.red);
								Thread.sleep(3000);
								//�ָ�ԭɫ
								jButton.setBackground(Color.black);
								//�̵���
								jButton2.setBackground(Color.green);
								Thread.sleep(5000);
								//�ָ�ԭɫ
								jButton2.setBackground(Color.black);
								//�Ƶ���
								jButton3.setBackground(Color.yellow);
								Thread.sleep(1000);
								//�ָ�ԭɫ
								jButton3.setBackground(Color.black);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
			}
		});
		this.add(jButton4);
		
		this.setTitle("���̵�");
		this.setBounds(500,500,500,500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
