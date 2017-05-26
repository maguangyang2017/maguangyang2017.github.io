public class Demo2{
	public static void main(String[]args){
		System.out.println(Color.RED);
	}
}
interface I{
	void show();
}
enum Color implements I{
	RED(){
		public void show(){}
	},GREEN(){
		public void show(){}
	},BLUE(){
		public void show(){}
	};
}