package com.jiejian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class JshiBen extends JFrame
{
	public JshiBen(){
		this.setLayout(null);
		
		JMenuBar jb = new JMenuBar();//菜单条
		JMenu caidan = new JMenu();
		caidan.setText("文件");
		JMenu bianji = new JMenu();
		bianji.setText("编辑");
		JMenu chakan = new JMenu();
		chakan.setText("查看");
		JMenuItem xinjian = new JMenuItem();
		xinjian.setText("新建");
		JMenuItem baocun = new JMenuItem();
		baocun.setText("保存");
		caidan.add(xinjian);
		caidan.add(baocun);
		jb.add(caidan);
		jb.add(bianji);
		jb.add(chakan);
		this.setJMenuBar(jb);
		
		JTextArea wenben = new JTextArea();
		wenben.setBounds(0,0,500,500);
		wenben.setLineWrap(true);

		xinjian.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e2){
				JshiBen.this.add(wenben);
				JshiBen.this.repaint();//刷新界面
			}
		});
		
		baocun.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				File file = new File("D:/Program Files/Java/java/QQ/src/com/jiejian/text.txt");
				try{
					file.createNewFile();
					String s = wenben.getText();
					FileWriter fw = new FileWriter(file);
					fw.write(s);
					fw.close();
					System.out.println(s);
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
			}
		});


		this.setTitle("记事本");
		this.setBounds(100,100,500,500);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new JshiBen();
	}
}