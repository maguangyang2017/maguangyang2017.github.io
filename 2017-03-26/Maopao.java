import java.util.*;
public class Maopao{
	public static void main (String[] args) {
		int[] a = new int[11];
		System.out.println("请输入十个数字");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		} 
		for(int j=0;j<10;j++){
			for(int k=0;k<10;k++){
				int m;
				if(a[k]>a[k+1]){
					m=a[k];
					a[k]=a[k+1];
					a[k+1]=m;
				}
			}
		}
		//输出
		for(int l=1;l<11;l++){
			System.out.print(a[l]+",");
		}
	}
}