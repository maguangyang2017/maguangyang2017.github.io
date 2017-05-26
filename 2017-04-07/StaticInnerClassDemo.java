public class StaticInnerClassDemo{
	public static void main(String[]args){
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.show();
	}
	class Outer{
		class Inner{
			public void show(){
				System.out.println("非静态内部类方法");
			}
		}
	}
}