import java.util.Scanner;
public class Jisuanji2{
	public static void main (String[] args) {
		System.out.println("������1������");
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		System.out.println("�����������");
		String as = sc.next();
		System.out.println("������1������");
		double b= sc.nextDouble();
		switch(as){
		case("+"):System.out.println("��Ϊ"+(a+b)+"\n");break;
		case("-"):System.out.println("��Ϊ"+(a-b)+"\n");break;
		case("*"):System.out.println("��Ϊ"+(a*b)+"\n");break;
		case("/"):System.out.println("��Ϊ"+(a/b)+"\n");break;
		}
	}
}
/**
	if("+".equals(flag))
*/