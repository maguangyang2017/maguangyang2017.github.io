public class Demo2{
	public static void main(String[] args){
		int[] arr = {6,9};
		System.out.println("前,第一个="+ arr[0]+",第二个="+arr[1]);
		swap(arr,0,1);
		System.out.println("main,第一个="+arr[0]+",第二个="+arr[1]);
	}
	private static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		System.out.println("swap,第一个="+arr[0]+",第二个="+arr[1]);
	}
}