public class shuixianhuashu{
	public static void main (String[] args) {
	int a=100,b,c,d;
	while(a<=999){
		b=a%10;
		c=a/10%10;
		d=a/100;
		if(a==b*b*b+c*c*c+d*d*d){
			System.out.print(a +",");
		}
		a++;
	}
	}
}
