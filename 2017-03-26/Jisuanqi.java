import java.util.Scanner;
public class Jisuanqi{
	public static void main (String[] args) {
		System.out.println("������1������");
		Scanner sc = new Scanner(System.in);
		float d= sc.nextFloat();
		System.out.println("������1������");
		float e= sc.nextFloat();
		System.out.println("��Ϊ"+(d+e)+"\n");
		System.out.println("��Ϊ"+(d-e)+"\n");
		System.out.println("��Ϊ"+(d*e)+"\n");
		if(e==0){
			System.out.println("��������Ϊ��");
		}else{
		System.out.println("��Ϊ"+(d/e)+"\n");
		}
	}
}