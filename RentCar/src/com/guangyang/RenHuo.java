package com.guangyang;

public class RenHuo extends Car{
	private int Shuliang;
	private int Rongliang;
	public RenHuo(String name,int Rongliang,int Shuliang,int money) {
		super(number,name,money);
		this.Shuliang = Shuliang;
		this.Rongliang = Rongliang;
	}
	public int getRongliang() {
		return Rongliang;
	}
	public int getShuliang() {
		return Shuliang;
	}
	public String tostring(){
		return this.getname()+"\t"+this.getRongliang()+"\t"+this.getShuliang()+"\t"+this.getmoney()+"\t";
	}
}
