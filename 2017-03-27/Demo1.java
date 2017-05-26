public class Demo1{
	public static void main(String[] args){
		int a = 12;
		int b = 24;
		swap(a,b);
		System.out.println("a="+a+",b="+b);
	}
	private static void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+ a+",b="+b);
	}
}