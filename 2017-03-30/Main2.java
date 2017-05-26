import java.util.Scanner;
public class Main2{
	static Scanner sc=new Scanner(System.in);
	static Bank[] n=new Bank[100];
	static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("==欢迎进入银行管理系统==");
		System.out.println("=====请选择以下选项=====");
		System.out.println("=========1.存款=========");
		System.out.println("=========2.取钱=========");
		System.out.println("=========3.查询=========");
		System.out.println("=========4.退出=========");
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
			System.out.println("请输入存款人");
			String name=sc.next();
			System.out.println("请输入存款金额");
			double inprice=sc.nextInt();
			System.out.println("请输入余额");
			double outprice=sc.nextInt();
			Bank b = new Bank(name,inprice,outprice);
			n[i]=b;
			i++;
			boolean m=true;
			while(m){
				System.out.println("是否继续存款");
				System.out.println("1.继续存款");
				System.out.println("2.返回菜单");
				int a=sc.nextInt();
				if(a==1){
					addMoney();
				}else if(a==2){
					printMenu();
					m=false;
				}else{
					System.out.println("输入错误请重新输入");
					m=true;
				}
			}
	}
	public static void deleteMoney(){
		System.out.println("请输入客户姓名");
		String name=sc.next();
		System.out.println("请输入支出金额");
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
			System.out.println("请输入存款人");
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
