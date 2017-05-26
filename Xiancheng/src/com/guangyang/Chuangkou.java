package com.guangyang;

public class Chuangkou extends Thread{
	private static int number = 50;
	private String name;
	private static int a;
	private static int b;
	private static int c;
	public Chuangkou(int number,String name){
		this.name=name;
	}
	public void mai(){
		while(true){
			
			if(number<1){
				System.out.println(name+"票卖光了\n");
				switch(name){
					case "一号窗口": System.out.println("一号窗口卖出了"+Chuangkou.a+"张票");break;
					case "二号窗口": System.out.println("二号窗口卖出了"+Chuangkou.b+"张票");break;
					case "三号窗口": System.out.println("三号窗口卖出了"+Chuangkou.c+"张票");break;
				}
				break;
			}
			switch(name){
				case "一号窗口":a=a+1;break;
				case "二号窗口":b=b+1;break;
				case "三号窗口":c=c+1;break;
			}
			
			System.out.println(name+"卖出了第"+number+"张");	
			--number;
		}		
	}
}
