package com.guangyang;

public class ZaiRen extends Car {
	private int Rongliang;
	public ZaiRen(String name,int Rongliang,int money) {
		super(number,name,money);
		this.Rongliang = Rongliang;
	}
	public int getRongliang() {
		return Rongliang;
	}
	public String toString(){
		return this.getname()+"\t"+this.getRongliang()+"\t\t"+this.getmoney()+"\t";
	}
}
