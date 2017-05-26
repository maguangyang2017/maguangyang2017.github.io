package com.caidan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class JshiBen extends JFrame
{
	public JshiBen(){
		this.setLayout(null);
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu = new JMenu();
		jMenu.setText("文件(F)");
		JMenu jMenu2 = new JMenu();
		jMenu2.setText("编辑(E)");
		JMenu jMenu3 = new JMenu();
		jMenu3.setText("格式(O)");
		JMenu jMenu4 = new JMenu();
		jMenu4.setText("查看(V)");
		JMenu jMenu5 = new JMenu();
		jMenu5.setText("帮助(H)");
		JMenuItem jMenuItem = new JMenuItem();
		jMenuItem.setText("新建");
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setText("打开");
		JMenuItem jMenuItem3 = new JMenuItem();
		jMenuItem3.setText("保存");
		JMenuItem jMenuItem4 = new JMenuItem();
		jMenuItem4.setText("撤销");
		JMenuItem jMenuItem5 = new JMenuItem();
		jMenuItem5.setText("自动换行");
		JMenuItem jMenuItem6 = new JMenuItem();
		jMenuItem6.setText("状态栏");
		JMenuItem jMenuItem7 = new JMenuItem();
		jMenuItem7.setText("查看帮助");
		
		jMenu.add(jMenuItem);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);
		jMenu2.add(jMenuItem4);
		jMenu3.add(jMenuItem5);
		jMenu4.add(jMenuItem6);
		jMenu5.add(jMenuItem7);
		jMenuBar.add(jMenu);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);
		jMenuBar.add(jMenu4);
		jMenuBar.add(jMenu5);
		this.setJMenuBar(jMenuBar);
		
		JTextArea jTextArea = new JTextArea();
		jTextArea.setText("");
		jTextArea.setBounds(0, 0, 500, 500);
		jTextArea.setLineWrap(true);//文本换行
		
		jMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JshiBen.this.add(jTextArea);//新建画布
				JshiBen.this.repaint();//刷新画布
			}
		});
		
		jMenuItem3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File file = new File("D:/Program Files/Java/java/QQ/src/com/caidan/text.txt");
				try {
					file.createNewFile();
					String s = jTextArea.getText();
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(s);
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

		this.setTitle("记事本");
		this.setBounds(0,0,500,500);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new JshiBen();
	}
}