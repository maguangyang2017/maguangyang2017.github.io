import java.util.Scanner;
public class ExceptionDemo{
	public static void main(String[]args){
		ExceptionDemo ed = new ExceptionDemo();
		ed.add();
	}
	public void add(){
		int i=0;
		Scanner sc = new Scanner(System.in);
		int [] a = new int [5];
		try{
			System.out.println("请输入五个数");
			for(i=0;i<5;i++){
				a[i] = sc.nextInt();
			}
		}catch(Exception e){
			System.out.println("请输入整数");
		}
			
	}
}