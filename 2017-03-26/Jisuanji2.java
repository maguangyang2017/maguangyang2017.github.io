import java.util.Scanner;
public class Jisuanji2{
	public static void main (String[] args) {
		System.out.println("请输入1个数字");
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		System.out.println("请输入运算符");
		String as = sc.next();
		System.out.println("请输入1个数字");
		double b= sc.nextDouble();
		switch(as){
		case("+"):System.out.println("和为"+(a+b)+"\n");break;
		case("-"):System.out.println("差为"+(a-b)+"\n");break;
		case("*"):System.out.println("积为"+(a*b)+"\n");break;
		case("/"):System.out.println("商为"+(a/b)+"\n");break;
		}
	}
}
/**
	if("+".equals(flag))
*/