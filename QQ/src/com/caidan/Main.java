package com.caidan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	public Main () {
		this.setLayout(null);
		//�˵���
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
		
		JTextField jTextField3 = new JTextField();
		jTextField3.setText("");
		jTextField3.setBounds(10, 10, 200, 50);
		this.add(jTextField3);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("����");
		jLabel2.setBounds(100, 100, 50, 50);
		this.add(jLabel2);
		
		JTextField jTextField2 = new JTextField();
		jTextField2.setText("�������ʺ�");
		jTextField2.setBounds(150, 100, 200, 50);
		this.add(jTextField2);
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setText("123456");
		jPasswordField.setBounds(150, 150, 200, 50);
		this.add(jPasswordField);
			
		JButton jButton = new JButton();
		jButton.setText("��¼");
		jButton.setBounds(150, 250, 200, 50);
		jButton.setBackground(new Color(110,110,110));
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton jButton2 = (JButton) e.getSource();
				jButton2.setText("���ڵ�¼");
				jLabel2.setText(jPasswordField.getText());
				
			}
		});
		this.add(jButton);
		
		this.setTitle("�ı��ĵ�");
		this.setBounds(500,500,500,500);
		this.setVisible(true);
	//	File file = new File("D:/Program Files/Java/java/QQ/src/com/caidan/text.txt");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
//D:/Program Files/Java/java/QQ/src/com/caidan/text.txt