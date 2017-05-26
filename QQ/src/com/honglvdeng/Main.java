package com.honglvdeng;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	public  Main(){
		//ºìµÆ
		this.setLayout(null);
		JButton jButton= new JButton();
		jButton.setText("ºìµÆ");
		jButton.setBounds(100, 100, 100, 100);
		jButton.setBackground(new Color(0, 0, 0));
		this.add(jButton);
		//ÂÌµÆ
		JButton jButton2= new JButton();
		jButton2.setText("ÂÌµÆ");
		jButton2.setBounds(200, 100, 100, 100);
		jButton2.setBackground(new Color(0, 0, 0));
		this.add(jButton2);
		//»ÆµÆ
		JButton jButton3= new JButton();
		jButton3.setText("»ÆµÆ");
		jButton3.setBounds(300, 100, 100, 100);
		jButton3.setBackground(new Color(0, 0, 0));
		//×Ü¿ª¹Ø
		this.add(jButton3);
		JButton jButton4= new JButton();
		jButton4.setText("¿ªÆôºìÂÌµÆ");
		jButton4.setBounds(150, 200, 200, 200);
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true){
							try {
								//ºìµÆÁÁ
								jButton.setBackground(Color.red);
								Thread.sleep(3000);
								//»Ö¸´Ô­É«
								jButton.setBackground(Color.black);
								//ÂÌµÆÁÁ
								jButton2.setBackground(Color.green);
								Thread.sleep(5000);
								//»Ö¸´Ô­É«
								jButton2.setBackground(Color.black);
								//»ÆµÆÁÁ
								jButton3.setBackground(Color.yellow);
								Thread.sleep(1000);
								//»Ö¸´Ô­É«
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
		
		this.setTitle("ºìÂÌµÆ");
		this.setBounds(500,500,500,500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
