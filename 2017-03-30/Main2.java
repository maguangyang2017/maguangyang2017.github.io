import java.util.Scanner;
public class Main2{
	static Scanner sc=new Scanner(System.in);
	static Bank[] n=new Bank[100];
	static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("==��ӭ�������й���ϵͳ==");
		System.out.println("=====��ѡ������ѡ��=====");
		System.out.println("=========1.���=========");
		System.out.println("=========2.ȡǮ=========");
		System.out.println("=========3.��ѯ=========");
		System.out.println("=========4.�˳�=========");
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		switch(flag){
			case 1: addMoney();break;
			case 2:deleteMoney();break;
			case 3:selectMoney();break;
			case 4:System.exit(0);break;
			default:printMenu();
		}
	}
	public static void addMoney(){
			System.out.println("����������");
			String name=sc.next();
			System.out.println("����������");
			double inprice=sc.nextInt();
			System.out.println("���������");
			double outprice=sc.nextInt();
			Bank b = new Bank(name,inprice,outprice);
			n[i]=b;
			i++;
			boolean m=true;
			while(m){
				System.out.println("�Ƿ�������");
				System.out.println("1.�������");
				System.out.println("2.���ز˵�");
				int a=sc.nextInt();
				if(a==1){
					addMoney();
				}else if(a==2){
					printMenu();
					m=false;
				}else{
					System.out.println("�����������������");
					m=true;
				}
			}
	}
	public static void deleteMoney(){
		System.out.println("������ͻ�����");
		String name=sc.next();
		System.out.println("������֧�����");
		double outprice=sc.nextDouble();
		boolean r=true;
		while(r){
			for(i=0;i<n.length;i++){
				if((n[i]!=null)&&(name.equals(n[i].name))){
					n[i].says();
					r=false;
					printMenu();
				}
			}
		}
	}
	public static void selectMoney(){
			System.out.println("����������");
			String name=sc.next();
			boolean q=true;
			while(q){
				for(i=0;i<n.length;i++){
					if((n[i]!=null)&&(name.equals(n[i].name))){
						n[i].say();
						q=false;
						printMenu();
					}
				}
			}
	}
}
