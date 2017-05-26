class Snake{
	private String name = "外部类属性";
	private class Node{
		private String name = "内部变量";
		public void add2Tail (){
			String name = "局部变量";
			System.out.println("把"+name+"添加到尾巴");
			System.out.println("把"+this.name+"添加到尾巴");
			System.out.println("把"+Snake.this.name+"添加到尾巴");
		}
	}
	public void show(){
		new Node ().add2Tail ();
	}
}
public class SnakeDemo{
	public static void main(String [] args){
		new Snake().show();
	}
}
