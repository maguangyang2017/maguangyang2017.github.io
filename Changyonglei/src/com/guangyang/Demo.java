package com.guangyang;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		System.out.println("==��ӭ������ӡ����������ӱ���==");
		for(int i=0;i<1000;i++){
		System.out.println("==�����룺1.����\t2.����\t3.����==");		
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int bb = (int)(Math.random()*3+1);
		System.out.println(aa);
		System.out.println(bb);
		/*if(aa>bb||aa!=1&&bb!=3||aa!=3&&bb!=1){
			System.out.println("ѡ��Ӯ");
		}else if(aa<bb||aa!=1&&bb!=3||aa!=3&&bb!=1){
			System.out.println("����Ӯ");
		}else if(aa==1&&bb==3){
			System.out.println("ѡ��Ӯ");
		}else if(aa==3&&aa==1){
			System.out.println("����Ӯ");
		}else if(aa==bb){
			System.out.println("ƽ��");
		}
	}*/
		if(aa==1){
			if(bb==1){
				System.out.println("ƽ��");
			}else if(bb==2){
				System.out.println("ѡ��Ӯ");
			}else if(bb==3){
				System.out.println("����Ӯ");
			}
		}else if(aa==2){
			if(bb==1){
				System.out.println("����Ӯ");
			}else if(bb==2){
				System.out.println("ƽ��");
			}else if(bb==3){
				System.out.println("ѡ��Ӯ");
			}
		}else if(aa==3){
			if(bb==1){
				System.out.println("ѡ��Ӯ");
			}else if(bb==2){
				System.out.println("����Ӯ");
			}else if(bb==3){
				System.out.println("ƽ��");
			}
		}
		}
	}
}