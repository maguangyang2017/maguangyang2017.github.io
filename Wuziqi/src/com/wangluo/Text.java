package com.wangluo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Text extends JComponent implements MouseListener{
	
	java.util.List<Point> pointList = new ArrayList<Point>();
	Socket socket;
	boolean isHei = true;
	private int currentX = 0;
	private int currentY = 0;
	boolean isWinNow = false;
	public Text(){
		this.addMouseListener(this);
	}

	public void paint(Graphics g) {
		//横线 竖线
		for(int i=-1;i<10;i++){
			g.drawLine(20, (i*50+70), 520, (i*50+70));
			g.drawLine((i*50+70),20 , (i*50+70), 520);
		}
		for(Point p:pointList){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), Point.SIZE, Point.SIZE);
		}
		isWin();
		if(isWinNow==true){
			g.setFont(new Font("楷体",Font.ITALIC,100));
			g.drawString("赢", 300, 300);
		}
		
	}
	public void isWin(){
		
		int dongxi = 0;
		//东
		for(int nowX = currentX,i=0;nowX<=520&&i<5;nowX+=50,i++){
			Point point = findPoint(nowX, currentY);
			System.out.println(point);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西
		for(int nowX = currentX-50,i=0;nowX>=0&&i<5;nowX-=50,i++){
			Point point = findPoint(nowX, currentY);
			System.out.println(point);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
//		if(isHei!=true){
//			System.out.println("东西方向黑子个数"+dongxi);
//		}else{
//			System.out.println("东西方向白子个数"+dongxi);
//		}
		if(dongxi>=5){
			if(isHei!=true){
				isWinNow = true;
				System.out.println("黑子赢");
			}else{
				isWinNow = true;
				System.out.println("白子赢");
			}
		}
		//南
		int nanbei = 0;
		for(int nowY = currentY,i=0;nowY<=520&&i<5;nowY+=50,i++){
			Point point = findPoint(currentX,nowY );
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}
				}
			}else{
				break;
			}
		}
		//北
		for(int nowY = currentY-50,i=0;nowY>=0&&i<5;nowY-=50,i++){
			Point point = findPoint(currentX, nowY);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}
				}
			}else{
				break;
			}
		}
		if(nanbei>=5){
			if(isHei!=true){
				isWinNow = true;
				System.out.println("黑子赢");
			}else{
				isWinNow = true;
				System.out.println("白子赢");
			}
		}
		//东北
		//西南
		int dongbeixinan = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY>=0&&i<5&&nowX<=520;nowX+=50,nowY-=50,i++){
			Point point = findPoint(nowX, nowY);
			if(point!=null){
				if(isHei!=true){
				if(point.getColor()==Color.black){
					dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		for(int nowX = currentX-50,nowY = currentY-50,i=0;nowY<=520&&i<5&&nowX>=0;nowX-=50,nowY+=50,i++){
			Point point = findPoint(nowX, nowY);
			if(point!=null){
				if(isHei!=true){
				if(point.getColor()==Color.black){
					dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongbeixinan>=5){
			if(isHei!=true){
				isWinNow = true;
				System.out.println("黑子赢");
			}else{
				isWinNow = true;
				System.out.println("白子赢");
			}
		}
		//东南
		//西北
		int dongnanxibei = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY<=520&&i<5&&nowX<=520;nowX+=50,nowY+=50,i++){
			Point point = findPoint(nowX, nowY);
			if(point!=null){
				if(isHei!=true){
				if(point.getColor()==Color.black){
					dongnanxibei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongnanxibei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		for(int nowX = currentX-50,nowY = currentY-50,i=0;nowY>=0&&i<5&&nowX>=0;nowX-=50,nowY-=50,i++){
			Point point = findPoint(nowX, nowY);
			if(point!=null){
				if(isHei!=true){
				if(point.getColor()==Color.black){
					dongnanxibei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongnanxibei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongnanxibei>=5){
			if(isHei!=true){
				isWinNow = true;
				System.out.println("黑子赢");
			}else{
				isWinNow = true;
				System.out.println("白子赢");
			}
		}
	}
	public Point findPoint(int x,int y){
		for(Point p:pointList){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		return null;
	}
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("点了"+e.getX()+" "+e.getY());
		
		int x = e.getX();
		int y = e.getY();
		double xianX = Math.round((x-20)/50.0);
		double xianY = Math.round((y-20)/50.0);
		x =((int) xianX)*50;
		y =((int) xianY)*50;
		currentX = x;
		currentY = y;
		boolean isHave = false;
		for(Point p:pointList){
			if(p.getX()==x&&p.getY()==y){
				isHave = true;
			}
		}
		
		if(!isHave){
			Point point = new Point(x,y);
			if(isHei == true){
				point.setColor(Color.black);
				isHei = false;
			}else{
				point.setColor(Color.white);
				isHei = true;
			}
			if(isWinNow==false){
				pointList.add(point);
			}
			
			this.repaint();
		}
		System.out.println("棋子数"+pointList.size());
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(pointList);
			objectOutputStream.flush();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		new Thread(new Runnable() {
			public void run() {
				while(true){
					Point point = null; 
					try {
						ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
						point =(Point) objectInputStream.readObject();
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}).start();
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
