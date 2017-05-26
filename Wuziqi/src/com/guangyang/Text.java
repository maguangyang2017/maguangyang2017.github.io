package com.guangyang;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Text extends JComponent implements MouseListener{
	@SuppressWarnings("unused")
	private String s;
	@SuppressWarnings("unused")
	private Graphics gg;
	int i=0;
	int [] a = new int[1024];
	int [] b = new int[1024];
	public Text(String s){
		this.addMouseListener(this);
		this.s = s;
	}
	@Override
	
	
	public void paint(Graphics g) {
		gg =g;
		//横线
		for(int i=0;i<20;i++){
			g.drawLine(0, (i*30+30), 600, (i*30+30));
		}
		//竖线
		for(int i=0;i<20;i++){
			g.drawLine((i*30+30),0 , (i*30+30), 600);
		}
		//点击下棋
		for(int i=0;i<361;i++){
			if(a[i]!=0&&b[i]!=0){
				if(i%2==0){
					g.setColor(Color.white);
				}else{
					g.setColor(Color.black);
				}
				//画圆
				g.fillOval(a[i], b[i], 20, 20);
			}
		}
		
//		// TODO Auto-generated method stub
//		super.paint(g);
//		g.drawLine(0, 0, 100, 100);
//		g.drawString(s, 100, 100);
//		g.drawOval(100, 100, 100, 100);
//		g.drawRect(100, 100, 100, 100);
//		g.fillOval(100, 100, 100, 100);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("点了"+e.getX()+" "+e.getY());
		int s = i++;
		a[s] = e.getX();
		b[s] = e.getY();
		//gg.drawOval(e.getX(), e.getY(), 20, 20);
		this.repaint();
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
