public class Student{
		 String name;    //姓名
		 int age;		//年龄
		 char sex;		//性别
		public  Student(String name,int age,char sex){
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		public void say(){
			System.out.println("我叫"+name+",今年"+age+",我是"+sex+"生");
		}
}