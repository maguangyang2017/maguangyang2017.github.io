public class Jiecheng{
	public static void main (String[] args) {
		int sum=0,j,k,i,a=0;
		//for
		for(i=1;i<=10;i++){
			k=1;
			for(j=1;j<=i;j++){
				k=k*j;
			}
			sum=sum+k;
		}
		System.out.println("for:1-10的阶乘和为"+sum);
		//while
		i=1;
		while(i<=10){
			k=1;
			j=1;
			while(j<=i){
				k=k*j;
				j++;
			}
			a=a+k;
			i++;
		}
		System.out.println("while:1-10的阶乘和为"+a);
		//do    while
		i=1;
		do{
			k=1;
			j=1;
			do{
				k=k*j;
				j++;
			}while(j<=i);
			i++;
		}while(i<=10);
		System.out.println("do while:1-10的阶乘和为"+a);
	}
}
//4037913