
import java.util.*;
public class Caipiao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Ĳ�Ʊ����:");
		int[] a = new int[5];
		for(int i=0;i<5;i++){
			a[i] = sc.nextInt();
		}
		int[] b = new int[5];
		for(int j=0;j<5;j++){
			b[j]=((int)(Math.random()*100));
		}
		for(int j=0;j<5;j++){
			System.out.print(b[j]+"\t");
		}
		int d=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(a[i]==b[j]){
					d++;
				}
			}
		}
		if(d==1){
			System.out.println("��ϲ������һƿ����");
		}else if(d==2){
			System.out.println("��ϲ��������ƿ����");
		}else if(d==3){
			System.out.println("��ϲ��������ƿ����");
		}else if(d==4){
			System.out.println("��ϲ��������ƿ����");
		}else if(d==5){
			System.out.println("��ϲ��������ƿ����");
		}else if(d==0){
			System.out.println("û�н�");
		}
	}
}
