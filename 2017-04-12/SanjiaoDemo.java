import java.util.Scanner;
public class SanjiaoDemo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = sc.nextInt();
		System.out.println("������ڶ�����");
		int b = sc.nextInt();
		System.out.println("�������������");
		int c = sc.nextInt();
		SanjiaoDemo ss = new SanjiaoDemo();
		try{
			ss.sanJiao(a,b,c);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void sanJiao(int a,int b,int c){
			if(a+b>c && a+c>b && c+b>a){
				System.out.println("��");
			}else{
				System.out.println("��������֮�ͱ�����ڵ�����");
			}
	}
}