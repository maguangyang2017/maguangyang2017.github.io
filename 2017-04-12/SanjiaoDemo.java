import java.util.Scanner;
public class SanjiaoDemo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("请输入第三个数");
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
				System.out.println("能");
			}else{
				System.out.println("任意两边之和必须大于第三边");
			}
	}
}