package com.guangyang;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		System.out.println("==欢迎进入剪子、包扶、锤子比赛==");
		for(int i=0;i<1000;i++){
		System.out.println("==请输入：1.剪子\t2.包扶\t3.锤子==");		
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int bb = (int)(Math.random()*3+1);
		System.out.println(aa);
		System.out.println(bb);
		/*if(aa>bb||aa!=1&&bb!=3||aa!=3&&bb!=1){
			System.out.println("选手赢");
		}else if(aa<bb||aa!=1&&bb!=3||aa!=3&&bb!=1){
			System.out.println("电脑赢");
		}else if(aa==1&&bb==3){
			System.out.println("选手赢");
		}else if(aa==3&&aa==1){
			System.out.println("电脑赢");
		}else if(aa==bb){
			System.out.println("平手");
		}
	}*/
		if(aa==1){
			if(bb==1){
				System.out.println("平手");
			}else if(bb==2){
				System.out.println("选手赢");
			}else if(bb==3){
				System.out.println("电脑赢");
			}
		}else if(aa==2){
			if(bb==1){
				System.out.println("电脑赢");
			}else if(bb==2){
				System.out.println("平手");
			}else if(bb==3){
				System.out.println("选手赢");
			}
		}else if(aa==3){
			if(bb==1){
				System.out.println("选手赢");
			}else if(bb==2){
				System.out.println("电脑赢");
			}else if(bb==3){
				System.out.println("平手");
			}
		}
		}
	}
}