import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	static Shop[] n=new Shop[100];
	static int i=0;
	public static void main(String[] arges){
		Shuchu();
	}
	public static void Shuchu(){
		System.out.println("==��ӭ���볬�й���ϵͳ==");
		System.out.println("=====��ѡ������ѡ��=====");
		System.out.println("=========1.����=========");
		System.out.println("=========2.����=========");
		System.out.println("=======3.��ѯ���=======");
		System.out.println("=========4.�˳�=========");
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		switch(flag){
			case 1: addShop();break;
			case 2: outShop();break;
			case 3: selectShop();break;
			case 4: System.exit(0);break;
			default: Shuchu();
		}
	}
	public static void addShop (){
		boolean m=true;
		while(m){
			System.out.println("��������Ʒ����");
			String name=sc.next();
			System.out.println("��������Ʒ����");
			double inprice=sc.nextDouble();
			System.out.println("��������Ʒ�ۼ�");
			double outprice=sc.nextDouble();
			System.out.println("��������Ʒ����");
			int number=sc.nextInt();
			Shop b=new Shop(name,inprice,outprice,number);
			n[i]=b;
			i++;
			System.out.println("¼��ɹ�,�Ƿ��������");
			System.out.println("1.��");
			System.out.println("2.��");
			int j=sc.nextInt();
			if(j==1){
				m=true;
			}else if(j==2){
				m=false;
			}else{
				m=false;
				Shuchu();
			}
		}
		Shuchu();
	}
	public static void outShop (){
		System.out.println("�����뷢����Ʒ����");
		String s = sc.next();
		System.out.println("�����뷢����Ʒ����");
		int d = sc.nextInt();
		for(i=0;i<n.length;i++){
			if((n[i]!=null)&&(s.equals(n[i].name))){
				n[i].number = n[i].number-d;
				System.out.println("ʣ����Ʒ����"+n[i].number);
				if(n[i].number<0){
					System.out.println("��Ʒ���۹�");
					Shuchu();
				}
			}
			
		}
		System.out.println("�Ƿ��������");
		System.out.println("1.��������");
		System.out.println("2.���ز˵�");
		int v = sc.nextInt();
		if(v==1){
			outShop();
		}else if(v!=1){
			Shuchu();
		}
	}
	public static void selectShop(){
		System.out.println("1.��ѯ������Ʒ��Ϣ");
		System.out.println("2.��ѯ������Ʒ��Ϣ");
		int k = sc.nextInt();
		if(k==1){
			for(i=0;i<n.length;i++){
				if(n[i]!=null){
					n[i].say();
					
				}
			}
			Shuchu();
		}else if(k==2){
			System.out.println("��������Ʒ����");
			String z=sc.next();
			for(i=0;i<n.length;i++){
				if((n[i]!=null)&&(z.equals(n[i].name))){
					n[i].say();
				}
			}
			System.out.println("������Ϣ�Ƿ������ѯ");
			System.out.println("1:������ѯ");
			System.out.println("2:���ز˵�");
			int v=sc.nextInt();
			if(v==1){
				selectShop();
			}else if(v!=1){
				Shuchu();
			}
		}else{
			selectShop();
		}
	}




}