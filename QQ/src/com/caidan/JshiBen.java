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
		jMenu.setText("�ļ�(F)");
		JMenu jMenu2 = new JMenu();
		jMenu2.setText("�༭(E)");
		JMenu jMenu3 = new JMenu();
		jMenu3.setText("��ʽ(O)");
		JMenu jMenu4 = new JMenu();
		jMenu4.setText("�鿴(V)");
		JMenu jMenu5 = new JMenu();
		jMenu5.setText("����(H)");
		JMenuItem jMenuItem = new JMenuItem();
		jMenuItem.setText("�½�");
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setText("��");
		JMenuItem jMenuItem3 = new JMenuItem();
		jMenuItem3.setText("����");
		JMenuItem jMenuItem4 = new JMenuItem();
		jMenuItem4.setText("����");
		JMenuItem jMenuItem5 = new JMenuItem();
		jMenuItem5.setText("�Զ�����");
		JMenuItem jMenuItem6 = new JMenuItem();
		jMenuItem6.setText("״̬��");
		JMenuItem jMenuItem7 = new JMenuItem();
		jMenuItem7.setText("�鿴����");
		
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
		jTextArea.setLineWrap(true);//�ı�����
		
		jMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JshiBen.this.add(jTextArea);//�½�����
				JshiBen.this.repaint();//ˢ�»���
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

		this.setTitle("���±�");
		this.setBounds(0,0,500,500);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new JshiBen();
	}
}