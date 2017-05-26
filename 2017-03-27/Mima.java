import java.util.*;
public class Mima{
	public static void main(String[] args){	
		Scanner m = new Scanner(System.in);
		System.out.println("请输入密码");
		String str = m.next();
		int z = str.length();
		char [] sz;
		sz = str.toCharArray();
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<z ;i++){
			if(sz[i]>=48 && sz[i]<=57){
				a=1;
			}else if(sz[i]>=65 && sz[i]<=90){
				b=1;
			}else if(sz[i]>=97 && sz[i]<=122){
				c=1;
			}else{
				d=1;
			}
		}
		int sum;
		sum=a+b+c+d;
		switch(sum){
			case 1:System.out.println("小菜鸡");	break;
			case 2:System.out.println("大公鸡");	break;
			case 3:System.out.println("战斗鸡");    break;
			case 4:System.out.println("超级战斗鸡");break;
		}
	}
}