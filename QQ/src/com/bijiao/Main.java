package com.bijiao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Main extends JFrame{
	

	public Main(){
		String a = "asdfa";
		String b = "123456";
		this.setLayout(null);
		JLabel jLabel = new JLabel();
		jLabel.setText("ÕÊºÅ");
		jLabel.setBounds(100, 100, 80, 40);
		this.add(jLabel);
		
		JTextArea jTextArea = new JTextArea();
		jTextArea.setText("");
		jTextArea.setBounds(180, 100, 200, 40);
		this.add(jTextArea);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("ÃÜÂë");
		jLabel2.setBounds(100, 150, 80, 40);
		this.add(jLabel2);
		
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setText("");
		jPasswordField.setBounds(180, 150, 200, 40);
		this.add(jPasswordField);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("");
		jLabel3.setBounds(140, 300, 80, 40);
		this.add(jLabel3);
		
		JButton jButton = new JButton();
		jButton.setText("µÇÂ¼");
		jButton.setBounds(140, 230, 200, 50);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String c = jTextArea.getText();
				String d = jPasswordField.getText();
					if((a.equals(c))&&(b.equals(d))){
						jLabel3.setText("µÇÂ¼³É¹¦");
					}else{
						jLabel3.setText("µÇÂ¼Ê§°Ü");
					}
				
			}
		});
		this.add(jButton);
		
		this.setBounds(500,500,500,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Main();
	}

}
