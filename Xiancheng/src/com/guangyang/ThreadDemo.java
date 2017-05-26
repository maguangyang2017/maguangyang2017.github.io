package com.guangyang;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Chuangkou chuangkou1 = new Chuangkou(50,"一号窗口");
		Chuangkou chuangkou3 = new Chuangkou(50,"二号窗口");
		Chuangkou chuangkou2 = new Chuangkou(50,"三号窗口");
		Piao piao1 = new Piao(chuangkou1);
		Piao piao2 = new Piao(chuangkou2);
		Piao piao3 = new Piao(chuangkou3);
		piao1.start();
		piao2.start();
		piao3.start();
		
	}

}
