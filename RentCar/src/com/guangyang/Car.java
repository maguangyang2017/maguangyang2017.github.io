package com.guangyang;

public class Car {
	private static final int Shuliang = 0;
	private static final int Rongliang = 0;
	public static int number;//���
	public String name;//����
	public int rongliang;//������
	public int shuliang;//������
	public int money;//���
	public  Car(int number,String name,int money){
		this.number = number;
		this.name = name;
		this.money = money;
	}
	public int getnumber() {
		return number;
	}
	public String getname() {
		return name;
	}
	public int getmoney() {
		return money;
	}
	public int getRongliang() {
		return Rongliang;
	}
	public int getShuliang() {
		return Shuliang;
	}
	
}

