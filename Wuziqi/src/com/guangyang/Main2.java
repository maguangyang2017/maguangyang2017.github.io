package com.guangyang;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main2 extends JFrame{
	public Main2(){
		this.setLayout(null);
		Text text = new Text(null);
		text.setBounds(0, 0, 600, 600);
		this.add(text);
		this.setTitle("Îå×ÓÆå");
		
		this.setBounds(100,100,620,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args){
		new Main2();
	}
}
