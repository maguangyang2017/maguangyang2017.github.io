public class Teather{
		String name;  //姓名
		String subject; //科目
		String time;//教学经验
		public  Teather(String name,String subject,String time){
			this.name = name;
			this.subject = subject;
			this.time = time;
		}
		public void say(){
			System.out.println("姓名——"+name+"，教学科目——"+subject+"，经验——"+time);
		}
}
/**
public void say(){
			System.out.println("saying");
		}
*/