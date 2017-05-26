public class Student{
/**
	学生类:
		姓名
		年龄
		性别
		
*/
		String name;    //姓名属性
		int age;		//年龄属性
		char sex;		//性别属性
		public void say(){
			System.out.println("我叫"+name+","+age+","+sex);
		}
		public  Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
		//public void say(){
			//System.out.println("saying");
		//}
		//public Student(String n){
			///name = n;
		//}