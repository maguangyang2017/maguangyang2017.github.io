import java.util.Scanner;
public class Jisuanqi{
	public static void main (String[] args) {
		System.out.println("请输入1个数字");
		Scanner sc = new Scanner(System.in);
		float d= sc.nextFloat();
		System.out.println("请输入1个数字");
		float e= sc.nextFloat();
		System.out.println("和为"+(d+e)+"\n");
		System.out.println("差为"+(d-e)+"\n");
		System.out.println("积为"+(d*e)+"\n");
		if(e==0){
			System.out.println("除数不能为零");
		}else{
		System.out.println("商为"+(d/e)+"\n");
		}
	}
}