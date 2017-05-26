package com.guangyang;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		printMenu();
	}
	static Car[] cars = new Car[8];
	public static void printMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("==欢迎使用租车系统==");
		System.out.println("===您确认租车么？===");
		System.out.print("1.是\t");
		System.out.println("2.否");
		int aa = sc.nextInt();
		switch(aa){
			case 1:zuChe();break;
			case 2:System.exit(0);
			default:printMenu();
		}
	}
	public static void zuChe(){
		Scanner ss = new Scanner(System.in);
		System.out.println("=您可租车的类型及价目表=");
		cars[0] = new ZaiRen("奥迪Q7",4,500);
		cars[1] = new ZaiRen("宝马Z4",2,500);
		cars[2] = new ZaiRen("法拉利",2,600);
		cars[3] = new ZaiRen("加长林肯",3,1000);
		cars[4] = new ZaiHuo("自卸王",25,300);
		cars[5] = new ZaiRen("金杯",20,200);
		cars[6] = new ZaiRen("路虎揽胜",4,800);
		cars[7] = new RenHuo("皮卡丘",2,2,200);
		System.out.println("编号\t名字\t载人(个)\t载货(吨)\t价格(元/天)");
		for(int j=0;j<cars.length;j++){
			System.out.println((j+1)+"\t"+cars[j]);
		}
		System.out.println("=请输入您的租车数量=");
		int bb = ss.nextInt();
		Car[] a = new Car[bb];
		int price = 0;
		int zoshu = 0;
		int zozhong = 0;
		for(int i=0;i<bb;i++){
			System.out.println("=请输入第"+(i+1)+"辆车的序号=");
			int cc = ss.nextInt();
			a[i] = cars[cc-1];
		}
		System.out.println("=请输入天数=");
		int dd = ss.nextInt();
		for(int i=0;i<bb;i++){
			price = price + a[i].getmoney()*dd;
		}
		System.out.println("=您的账单=");
		System.out.println("=已选载人车=");
		for(int i=0;i<bb;i++){
			if(a[i].getRongliang()!=0){
				System.out.println(a[i].getname());
			}
			zoshu = zoshu + a[i].getRongliang();
		}
		System.out.println("=已选载货车=");
		for(int i=0;i<bb;i++){
			if(a[i].getShuliang()!=0){
				System.out.println(a[i].getname());
			}
			zozhong = zozhong + a[i].getShuliang();
		}
		System.out.println("共载人:"+zoshu+"人");
		System.out.println("共载货:"+zozhong+"吨");
		System.out.println("租车总价格:"+price+"元");
		System.out.println("=欢迎下次光临=");
	}
	
}
