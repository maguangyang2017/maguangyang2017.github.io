package com.jiejian;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main3 extends JFrame{
	boolean flag = true;
	public Main3() throws InterruptedException{
		this.setLayout(null);
		this.setBounds(300, 300, 500, 500);
		this.setVisible(true);
		//���̵ư�ť
		JButton jButton1 = new JButton();
		jButton1.setBounds(150, 50, 100, 50);
		this.add(jButton1);
		//��ʾ�ɲ����ѹ�
		JLabel jLabel = new JLabel();
		jLabel.setBounds(170, 100, 100, 30);
		this.add(jLabel);
		//��ʼ��ť
		JButton jButton = new JButton();
		jButton.setText("��ʼ");
		jButton.setBackground(Color.black);
		jButton.setForeground(Color.white);
		jButton.setBounds(150, 150, 100, 50);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					public void run() {
						while(flag){
							try{
								jButton1.setBackground(Color.RED);
								jLabel.setText("������ͨ��");
								Thread.sleep(4000);
								jButton1.setBackground(Color.YELLOW);
								jLabel.setText("��һ��");
								Thread.sleep(2000);
								jButton1.setBackground(Color.GREEN);
								jLabel.setText("����ͨ��");
								Thread.sleep(4000);
							}catch(Exception e){
								e.getMessage();
							}	
						}
					}
				}).start();	
			}
		});
		this.add(jButton);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Main3();
	}

}




//
////import java.awt.*;
////import java.awt.event.*;
////import javax.swing.*;
//////��Բ���࣬��JPanel����
////class PaintovalPane extends JPanel
////{
////	Color color;
////	PaintovalPane(Color colorOfPanel)
////	{color=colorOfPanel;}
////	 public void paintComponent(Graphics g)
////	 {
////		  super.paintComponent(g);//���ø��๹�췽��
////		  g.setColor(color);//����Բ��������ɫ
////		  g.fillOval(50, 10, 30, 30);//��30Ϊ�뾶��Բ�����  
////	 }
////}
////public class Main3 extends JApplet
////{
////	public void init()
////	{
////		//����������ѡ��ť
////		JRadioButton Red=new JRadioButton("Red");
////		JRadioButton Yellow=new JRadioButton("yellow");
////		JRadioButton Green=new JRadioButton("Green");
////		//��������Բ����壬����ʼ����ɫΪ��ɫ
////		final PaintovalPane oval1=new PaintovalPane(Color.white);
////		final PaintovalPane oval2=new PaintovalPane(Color.white);
////		final PaintovalPane oval3=new PaintovalPane(Color.white);
////		//����������ǩ
////		JLabel messagePanel1=new JLabel("Red");
////		JLabel messagePanel2=new JLabel("Yellow");
////		JLabel messagePanel3=new JLabel("Green");		
////		JPanel ovalgroup=new JPanel();
////		//����һ�����ovalgroup���������䲼��Ϊ3*2���������Բ����������������ǩ���
////		ovalgroup.setLayout(new GridLayout(3,2));
////		ovalgroup.add(oval1);
////		ovalgroup.add(messagePanel1);
////		ovalgroup.add(oval2);
////		ovalgroup.add(messagePanel2);
////		ovalgroup.add(oval3);		
////		ovalgroup.add(messagePanel3);
////		//����һ�����buttonPanel������Ϊ1*3�����������ѡ��ť���
////		JPanel buttonPanel=new JPanel();
////		buttonPanel.setLayout(new GridLayout(1,3));	
////		buttonPanel.add(Red);
////		buttonPanel.add(Yellow);
////		buttonPanel.add(Green);
////		//��������ѡ��ť��ӵ���ť��group�У�ʵ��������ť����
////		ButtonGroup group=new ButtonGroup();
////		group.add(Green);
////		group.add(Red);
////		group.add(Yellow);
////		//���ÿ�ܵĲ���2*1������������������
////		setLayout(new GridLayout(2,1));
////		add(ovalgroup);
////		add(buttonPanel);
////		//Ϊ����Բ��������Action������
////		Red.addActionListener(new ActionListener()
////		{
////			public void actionPerformed(ActionEvent e)
////			{
////				oval1.color=Color.RED;
////				oval2.color=Color.white;
////				oval3.color=Color.white;
////				repaint();
////			}
////		});
////		Yellow.addActionListener(new ActionListener()
////		{
////			public void actionPerformed(ActionEvent e)
////			{
////				oval2.color=Color.yellow;
////				oval1.color=Color.white;
////				oval3.color=Color.white;
////				repaint();
////			}
////		});
////		Green.addActionListener(new ActionListener()
////		{
////			public void actionPerformed(ActionEvent e)
////			{
////				oval3.color=Color.green;
////				oval2.color=Color.white;
////				oval1.color=Color.white;
////				repaint();
////			}
////		});
////		setVisible(true);
////     }
////}
//
//
//
//
//
//
//
///*���̵Ƴ���
// * �õ�������awtͼ�ν��棬���߳�
// * 
// * ���������ѧԺ
// * ��ϵ��wolf.dlut@gmail.com*/
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//public class Main3 extends Frame implements WindowListener, ActionListener,
//		MouseListener {
//	int k = 0, k2 = 0;
//	Frame frm;
//	Button btnStart, btnStop;
//	TextField txt1, txt2, txt3;
//	int n, n1, n2, n3;
//	boolean isRunning = true;
//	TimeChangLight change = new TimeChangLight();
//
//	public Main3() {
//		super("  ���̵���ʾ");
//		initUI();
//		addWindowListener(this);
//		addMouseListener(this);
//
//	}
//
//	//���ƽ���
//	public void initUI() {
//
//		txt1 = new TextField("3");
//		txt1.setSize(50, 25);
//		txt1.setLocation(100, 285);
//
//		txt2 = new TextField("3");
//		txt2.setSize(50, 25);
//		txt2.setLocation(100, 315);
//
//		txt3 = new TextField("3");
//		txt3.setSize(50, 25);
//		txt3.setLocation(100, 345);
//
//		btnStart = new Button("��ʼ");
//		btnStart.setLocation(200, 350);
//		btnStart.setSize(50, 25);
//		btnStart.addActionListener(this);
//
//		btnStop = new Button("ֹͣ");
//		btnStop.setLocation(300, 350);
//		btnStop.setSize(50, 25);
//		btnStop.addActionListener(this);
//
//		this.setLayout(null);
//		this.setResizable(false);
//		this.add(txt1);
//		this.add(txt2);
//		this.add(txt3);
//		this.add(btnStart);
//		this.add(btnStop);
//		this.setSize(600, 400);
//		this.setVisible(true);
//
//	}
//
//	public void paint(Graphics g) {
//		g.setColor(Color.DARK_GRAY);
//		g.fillRoundRect(80, 80, 400, 180, 100, 100);
//		g.setColor(Color.gray);
//		if (k == 0)
//			g.setColor(Color.green);
//		g.fillOval(115, 120, 100, 100);
//		g.setColor(Color.gray);
//		if (k == 1)
//			g.setColor(Color.yellow);
//		g.fillOval(235, 120, 100, 100);
//		g.setColor(Color.gray);
//		if (k == 2)
//			g.setColor(Color.red);
//		g.fillOval(355, 120, 100, 100);
//
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == btnStart) {
//
//			n1 = Integer.parseInt(txt1.getText());
//			;
//
//			n2 = Integer.parseInt(txt2.getText());
//
//			n3 = Integer.parseInt(txt3.getText());
//
//			isRunning = true;
//			if (k2 == 0) {
//
//				change.start();
//				k2 = 1;
//			}
//
//		}
//
//		if (e.getSource() == btnStop) {
//			isRunning = false;
//			// change.interrupt();
//		}
//	}
//
//	public void windowClosing(WindowEvent e) {
//		System.exit(0); // ��ֹ��ǰ�������е� Java ��������˳�ϵͳ��
//	}
//
//	public void windowClosed(WindowEvent e) {
//	}
//
//	public void windowOpened(WindowEvent e) {
//	}
//
//	public void windowIconified(WindowEvent e) {
//	}
//
//	public void windowDeiconified(WindowEvent e) {
//	}
//
//	public void windowActivated(WindowEvent e) {
//	}
//
//	public void windowDeactivated(WindowEvent e) {
//	}
//
//	// ����¼�����
//	public void mousePressed(MouseEvent e) {
//		if ((115 < e.getX() && e.getX() < 215)
//				&& (120 < e.getY() && e.getY() < 220)) {// System.out.println(e.getX()+","+e.getY());
//			k = 0;
//			repaint();
//		}
//
//		if ((235 < e.getX() && e.getX() < 335)
//				&& (120 < e.getY() && e.getY() < 220)) {// System.out.println(e.getX()+","+e.getY());
//			k = 1;
//			repaint();
//		}
//		if ((355 < e.getX() && e.getX() < 455)
//				&& (120 < e.getY() && e.getY() < 220)) {// System.out.println(e.getX()+","+e.getY());
//			k = 2;
//			repaint();
//		}
//	}
//
//	public void mouseReleased(MouseEvent e) {
//	}
//
//	public void mouseEntered(MouseEvent e) {
//	}
//
//	public void mouseExited(MouseEvent e) {
//	}
//
//	public void mouseClicked(MouseEvent e) {
//	}
//
//	class TimeChangLight extends Thread {
//
//		public TimeChangLight() {
//
//			n = n1;
//
//			// start();
//		}
//
//		public void run() {
//
//			try {
//				while (true)
//					while (isRunning) {
//
//						if (k == 3) {
//							k = 0;
//							n = n1;
//						}
//
//						Thread.sleep(1000);
//						System.out.print("now light:" + k + "  ");
//						System.out.println("after " + n
//								+ " seconds will change color");
//						if (n <= 0) {
//							// isOn=false;
//							System.out.println("change light color");
//							k++;
//							if (k == 0)
//								n = n1;
//							if (k == 1)
//								n = n2;
//							if (k == 2)
//								n = n3;
//							repaint();
//						}
//						n--;
//					}
//				// }
//			} catch (Exception e) {
//			}
//
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Main3 mywin = new Main3();
//		
//
//	}
//
//}
