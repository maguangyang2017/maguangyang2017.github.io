package com.guangyang;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		printMenu();
	}
	static Car[] cars = new Car[8];
	public static void printMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("==��ӭʹ���⳵ϵͳ==");
		System.out.println("===��ȷ���⳵ô��===");
		System.out.print("1.��\t");
		System.out.println("2.��");
		int aa = sc.nextInt();
		switch(aa){
			case 1:zuChe();break;
			case 2:System.exit(0);
			default:printMenu();
		}
	}
	public static void zuChe(){
		Scanner ss = new Scanner(System.in);
		System.out.println("=�����⳵�����ͼ���Ŀ��=");
		cars[0] = new ZaiRen("�µ�Q7",4,500);
		cars[1] = new ZaiRen("����Z4",2,500);
		cars[2] = new ZaiRen("������",2,600);
		cars[3] = new ZaiRen("�ӳ��ֿ�",3,1000);
		cars[4] = new ZaiHuo("��ж��",25,300);
		cars[5] = new ZaiRen("��",20,200);
		cars[6] = new ZaiRen("·����ʤ",4,800);
		cars[7] = new RenHuo("Ƥ����",2,2,200);
		System.out.println("���\t����\t����(��)\t�ػ�(��)\t�۸�(Ԫ/��)");
		for(int j=0;j<cars.length;j++){
			System.out.println((j+1)+"\t"+cars[j]);
		}
		System.out.println("=�����������⳵����=");
		int bb = ss.nextInt();
		Car[] a = new Car[bb];
		int price = 0;
		int zoshu = 0;
		int zozhong = 0;
		for(int i=0;i<bb;i++){
			System.out.println("=�������"+(i+1)+"���������=");
			int cc = ss.nextInt();
			a[i] = cars[cc-1];
		}
		System.out.println("=����������=");
		int dd = ss.nextInt();
		for(int i=0;i<bb;i++){
			price = price + a[i].getmoney()*dd;
		}
		System.out.println("=�����˵�=");
		System.out.println("=��ѡ���˳�=");
		for(int i=0;i<bb;i++){
			if(a[i].getRongliang()!=0){
				System.out.println(a[i].getname());
			}
			zoshu = zoshu + a[i].getRongliang();
		}
		System.out.println("=��ѡ�ػ���=");
		for(int i=0;i<bb;i++){
			if(a[i].getShuliang()!=0){
				System.out.println(a[i].getname());
			}
			zozhong = zozhong + a[i].getShuliang();
		}
		System.out.println("������:"+zoshu+"��");
		System.out.println("���ػ�:"+zozhong+"��");
		System.out.println("�⳵�ܼ۸�:"+price+"Ԫ");
		System.out.println("=��ӭ�´ι���=");
	}
	
}
