package com.jiejian;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FivChese  extends JFrame{


    CheseGame CG;
    FivChese ()
    {
        this.CG= new CheseGame();
        addMouseListener(CG);
        add(CG);
       
    }
    public static void main(String[] args) {
        FivChese  fivechese= new FivChese ();
        fivechese.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fivechese.setSize(900, 700);
        fivechese.setTitle("������");
        fivechese.setVisible(true);
        fivechese.setResizable(true);
    }
}

class CheseGame extends JPanel  implements MouseListener,ItemListener
{

    int [][]map = new int[20][20];
    Color []color = {Color.BLACK,Color.WHITE,Color.LIGHT_GRAY};
    //��������
    int x = -1;
    int y = -1;
    //�ж��ǰ��廹�Ǻ���
    int flag = 1;
    //�ж�ʤ��
    int winner = 3;
    
    JButton btn1 = new JButton("Start"); //��Ϸ��ʼ
    JButton btn2 = new JButton("again");//��Ϸ����
    //ȷ�������Ȼ��Ǻ�����
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox  chb1 = new Checkbox("Black First",cbg,true);
    Checkbox  chb2 = new Checkbox("White First",cbg,false);
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        if(chb1.getState())
        {
            flag = 1;
        }
        else
        {
            flag = 2;
        }
    }
    class GameStart implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
             if(ae.getSource() == btn1)//str.equals("Start")
             {
                 start();
                 repaint();
                 btn1.setEnabled(false);
                 btn2.setEnabled(true);
                 chb1.setEnabled(false);
                 chb2.setEnabled(false);
             }
             if(ae.getSource() == btn2)
             {
                 start();
                 repaint();
                 chb1.setEnabled(true);
                 chb2.setEnabled(true);
             }
        }
    }
    CheseGame()
    {  
        this.setLayout(null);
        chb1.setBounds(650, 50, 100, 30);
        chb2.setBounds(650, 100, 100, 30);
        chb1.addItemListener(this);
        chb2.addItemListener(this);
        btn1.setBounds(650,150,100,30);
        btn1.addActionListener(new GameStart()); 
        btn2.setBounds(650, 200, 100, 30);
        btn2.addActionListener(new GameStart());
        btn2.setEnabled(false);
        this.add(btn1);
        this.add(btn2);
        this.add(chb1);
        this.add(chb2);
    }
    void start()
    {
        for(int i = 0;i < 20;i++)
            for(int j = 0;j < 20;j++)
                map[i][j] = 0;
        winner = 0;
    }
    Boolean win(int x,int y)
    {
        int score = 1;
             for(int i = x;i < x+4;)//����x++
             {
                 if(i == 19)
                     break;
                 if(map[i][y] != map[++i][y])
                    break;
                 score++;
                 
             }
             for(int i = x;i > x-4;)//����x--
             {
                 if(i == 0)
                     break;
                 if(map[i][y] != map[--i][y])
                    break;
                 score++;
               
             } 
            if(score >= 5)
                 return true;
            else
                 score = 1;

             
             
            for(int j = y; j < y+4;)//����y++
            {
                if(j == 19)
                    break;
                if(map[x][j] != map[x][++j])
                    break;
                score++;
               
            }
            for(int j = y; j > y-4;)//����y--
            {
                if(j == 0)
                    break;
                if(map[x][j] != map[x][--j])
                    break;
                score++;
               
            } 
            if(score >= 5)
                 return true;
            else
                 score = 1;

             
             
            for(int i = x;i < x+4;)//б��x++��y++
                for(int j = y;j < y+4;)
                {
                    if(i == 19 || y == 19)
                    {i = x+4; break;}
                    if(map[i][j] != map[++i][++j])
                    {
                        i = x+4;
                        break;
                    }
                    score++;
                   
                }
              for(int i = x;i > x-4;)//б��x--��y--
                for(int j = y;j > y-4;)
                {
                    if(i == 0||j==0)
                    {i = x-4; break;}
                    if(map[i][j] != map[--i][--j])
                    {
                        i = x-4;
                        break;
                    }
                    score++;
                   
                } 
              if(score >= 5)
                 return true;
             else
                 score = 1;

             
             
            for(int i = x;i > x-4;)//б��x--��y++
                for(int j = y;j < y+4;)
                {
                    if(i==0 || j==19)
                    { i = x-4;break;}
                    if(map[i][j] != map[--i][++j])
                    {
                        i = x-4;
                        break;
                    }
                    score++;
                  
                }  
            for(int i = x;i < x+4;)//б��x++��y--
                for(int j = y;j > y-4;)
                {
                    if(i==19||j==0)
                    { i = x+4;break;}
                    if(map[i][j] != map[++i][--j])
                    {
                        i = x + 4;
                        break;
                    }
                    score++;
                   
                } 
            if(score >= 5)
                 return true;
            else
                 return false;
    }
    public void paintComponent(Graphics g)
     {
           super.paintComponent(g);
           setBackground(color[2]);
           //������
           for(int i = 1;i <= 20;i++)
           {
               g.setColor(color[0]);
               g.drawLine(30, i*30 ,600 , i*30);
               g.drawLine(i*30,30, i*30, 600);
           }
           //������
           for(int i = 0;i < 20;i++)
               for(int j = 0;j < 20;j++)
               {
                  
                   if(map[i][j] == 1)
                   { 
                       g.setColor(color[0]);
                       g.fillOval((i+1)*30-15, (j+1)*30-15, 30, 30);
                   }
                   if(map[i][j] == 2)
                   {
                       g.setColor(color[1]);
                       g.fillOval((i+1)*30-15, (j+1)*30-15, 30, 30);
                   }
               }
           //�ж�ʤ��
           Font font = new Font("",30,50);
           g.setFont(font);
          
           if(winner == 1)
           {
               g.setColor(color[0]);
               g.drawString("����ʤ", 650, 300);
           }
           if(winner == 2)
           { 
               g.setColor(color[1]);
               g.drawString("����ʤ", 650, 300);
           }
               
     }
    @Override
    public void mouseClicked(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
        if(winner == 0)
        {
            x = me.getX();
            y = me.getY();
            chb1.setEnabled(false);
            chb2.setEnabled(false);
        }
       
        x = (int)(x/30)-1;
        y = (int)((y-15)/30)-1;
        if(x>=0&&x<=19&&y>=0&&y<=19)
        {
            if(flag == 1&&map[x][y] == 0)
            {
                map[x][y] = 1;
                if(win(x,y))
                    winner = 1;
                flag = 2;
            }
            else
                if(flag == 2&&map[x][y] == 0)
            {
                map[x][y] = 2;
                 if(win(x,y))
                     winner = 2;
                flag = 1;
            }
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
//int dongxi = 0;
////��
//for(int nowX = currentX,i=0;i<5&&nowX<=520;nowX+=50,i++){
//	Point point = findPoint(nowX,currentY);
//	if(point!=null){
//		//��ǰ����ʱ����
//		if(isHei!=true){
//			if(point.getColor()==Color.black){
//				dongxi++;
//			}else{
//				break;
//			}
//		}
//		//��ǰ����ʱ����
//		if(isHei!=false){
//			if(point.getColor()==Color.white){
//				dongxi++;
//			}else{
//				break;
//			}
//		}
//	}else{
//		break;
//	}
//}
////��
//for(int nowX = currentX-50,i=0;i<5&&nowX>=0;nowX-=50,i++){
//	Point point = findPoint(nowX,currentY);
//	if(point!=null){
//		//��ǰ����ʱ����
//		if(isHei!=true){
//			if(point.getColor()==Color.black){
//				dongxi++;
//			}else{
//				break;
//			}
//		}
//		//��ǰ����ʱ����
//		if(isHei!=false){
//			if(point.getColor()==Color.white){
//				dongxi++;
//			}else{
//				break;
//			}
//		}
//	}else{
//		break;
//	}
//}
//if(isHei!=true){
//	System.out.println("����������Ӹ���"+dongxi);
//}else{
//	System.out.println("����������Ӹ���"+dongxi);
//}
//
//if(dongxi>=5){
//	isWinNow = true;
//	if(isHei != true){
//		System.out.println("����Ӯ��");
//	}else{
//		System.out.println("����Ӯ��");
//	}
//}
