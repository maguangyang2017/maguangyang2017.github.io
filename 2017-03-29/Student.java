public class Student{
		 String name;    //����
		 int age;		//����
		 char sex;		//�Ա�
		public  Student(String name,int age,char sex){
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		public void say(){
			System.out.println("�ҽ�"+name+",����"+age+",����"+sex+"��");
		}
}