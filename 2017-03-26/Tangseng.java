import java.util.*;
public class Tangseng{
	public static void main (String[] args) {
		System.out.println("数学王国");
		Scanner sc = new Scanner(System.in);
		int m;
		while(true){

			m = sc.nextInt();
			int sum=0,a=0,b=0,c=0;
			long d=0;
			for(int i=1;i<=m;i++){
					sum=sum+i;
			}
			System.out.println(m+"以内正整数和为"+sum);
			//int a=0;
			for(int j=1;j<=m/4;j++){
				a=a+j;
			}
			System.out.println("唐僧的的数为"+a);
			//int b=0;
			for(int k=((m/4)+1);k<=m/2;k++){
				b=b+k;
			}
			System.out.println("悟空的的数为"+b);
			//int c=0;
			for(int l=((m/2)+1);l<=((m/4)+(m/2));l++){
				c=c+l;
			}
			System.out.println("八戒的的数为"+c);
			//int d=0;
			for(int o=((m/4)+1+(m/2));o<=m;o++){
				d=d+o;
			}
			System.out.println("沙僧的的数为"+d);
		}
	}
}