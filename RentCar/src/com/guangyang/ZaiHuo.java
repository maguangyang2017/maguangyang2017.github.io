package com.guangyang;

public class ZaiHuo extends Car{
	private int Shuliang;
	public ZaiHuo(String name,int Shuliang,int money) {
		super(number,name,money);
		this.Shuliang = Shuliang;
	}
	public int getShuliang() {
		return Shuliang;
	}
	public String toString(){
		return this.getname()+"\t\t"+this.getShuliang()+"\t"+this.getmoney()+"\t";
	}
}
