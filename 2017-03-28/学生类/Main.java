public class Main{
	public static void main(String[] args){
		Student[] students = new Student[7];
        Student student1 = new Student("王一",19,'男');
        students[0] = student1;
        Student student2 = new Student("王二",18,'女');
        students[1] = student2;
		Student student3 = new Student("王三",25,'男');
        students[2] = student3;
		Student student4 = new Student("王四",30,'男');
        students[3] = student4;
		Student student5 = new Student("王五",20,'男');
        students[4] = student5;
		Student student6 = new Student("王六",19,'女');
        students[5] = student6;
		Student student7 = new Student("王七",21,'女');
        students[6] = student7;
	    for(int i = 0;i<students.length;i++){
            students[i].say();
        }
	}
}