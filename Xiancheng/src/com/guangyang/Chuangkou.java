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
				System.out.println(name+"Ʊ������\n");
				switch(name){
					case "һ�Ŵ���": System.out.println("һ�Ŵ���������"+Chuangkou.a+"��Ʊ");break;
					case "���Ŵ���": System.out.println("���Ŵ���������"+Chuangkou.b+"��Ʊ");break;
					case "���Ŵ���": System.out.println("���Ŵ���������"+Chuangkou.c+"��Ʊ");break;
				}
				break;
			}
			switch(name){
				case "һ�Ŵ���":a=a+1;break;
				case "���Ŵ���":b=b+1;break;
				case "���Ŵ���":c=c+1;break;
			}
			
			System.out.println(name+"�����˵�"+number+"��");	
			--number;
		}		
	}
}
