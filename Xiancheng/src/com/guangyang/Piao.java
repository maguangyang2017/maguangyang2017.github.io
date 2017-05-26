package com.guangyang;

public class Piao extends Thread{
	Chuangkou chuangkou;
	public Piao(Chuangkou chuangkou1){
		this.chuangkou = chuangkou1;
	}
	public void run(){
		chuangkou.mai();
	}
}
