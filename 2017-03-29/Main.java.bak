import java.util.Scanner;
//学生菜单
public class Main{
		static Scanner sc=new Scanner(System.in);
		static Student[] n=new Student[100];
		static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("=====选择数字=====");
		System.out.println("======1.增加======");
		System.out.println("======2.查询======");
		System.out.println("======3.更改======");
		System.out.println("======4.删除======");
		System.out.println("======5.退出======");
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		switch(flag){
			case 1 : addStudent   ();break;
			case 2 : selectStudent();break;
			case 3 : updateStudent();break;
			case 4 : deleteStudent();break;
			case 5 : System.exit(0);
			default: printMenu();
		}
	}
	public static void addStudent(){//增加学生信息
		boolean k=true;
		while (k==true){
			System.out.println("请输入学生姓名:");
			String name=sc.next();
			System.out.println("请输入学生年龄:");
			int age=sc.nextInt();
			System.out.println("请输入学生性别:");
			char sex=sc.next().charAt(0);
			Student b=new Student(name,age,sex);
			n[i]=b;
			i++;
			System.out.println("录入成功,是否继续输入");
			System.out.println("1.是");
			System.out.println("2.否");
			int m=sc.nextInt();
			if(m==1){
				k=true;
			}else if(m==2){
				k=false;
			}	
		}
		printMenu();
	}
	public static void updateStudent(){//修改学生信息
		System.out.println("请选择要修改的信息");
		System.out.println("1.姓名");
		System.out.println("2.年龄");
		System.out.println("3.性别");
		int aaa=sc.nextInt();
		if(aaa==1){
				System.out.println("请输入其他信息");
				System.out.println("姓名");
				String jj=sc.next();
				System.out.println("年龄");
				int kk=sc.nextInt();
				System.out.println("性别");
				char ll=sc.next().charAt(0);
				Student b=new Student(jj,kk,ll);
				n[i]=b;
				System.out.println();
				n[i].say();
		}
		System.out.println("是否继续修改");
		System.out.println("1.是");
		System.out.println("2.否");
		int zzz=sc.nextInt();
		if(zzz==1){
			updateStudent();
		}else{
			printMenu();
		}
	}
	public static void selectStudent(){//查询学生信息
		System.out.println("1.查询所有学生信息");
		System.out.println("2.查询单个学生信息");
		int z=sc.nextInt();
		if(z==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
					printMenu(); 
				}
			}
		}else if (z==2){
			System.out.println("请输入学生姓名");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("是否继续查询");
			System.out.println("1:继续查询");
			System.out.println("2:返回菜单");
			int v=sc.nextInt();
			if(v==1){
				selectStudent();
			}else if(v!=1){
				printMenu();
			}
		}
	}
	public static void deleteStudent(){//删除学生信息
		System.out.println("删除所有学生信息,请输入1");
		System.out.println("删除单个学生信息,请输入2");
		int y=sc.nextInt();
		if(y==1){
				for(int w=0;w<n.length;w++){
				if(n[w]!=null){
					n[w] = null;
					System.out.println("删除成功");
					printMenu();
				}
				printMenu();
			}
		}else if (y==2){
			System.out.println("请输入学生姓名");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("是否继续删除");
			System.out.println("1:继续删除");
			System.out.println("2:返回菜单");
			int x=sc.nextInt();
			if(x==1){
				deleteStudent();
			}else if(x==2){
				printMenu();
			}
		}
	}
}
/**public class Main{
	public static void main(String [] args){
		printMenu();
	}
	static Student[] students=new Student[100];
	static Scanner sc = new Scanner(System.in);
	public static void printMenu(){
		System.out.println("=====选择数字=====");
		System.out.println("======1.增加======");
		System.out.println("======2.查询======");
		System.out.println("======3.更改======");
		System.out.println("======4.删除======");
		System.out.println("======5.退出======");
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		switch(flag){
			case 1 : addStudent   ();break;
			case 2 : selectStudent();break;
			case 3 : updateStudent();break;
			case 4 : deleteStudent();break;
			case 5 : System.exit(0);
			default: printMenu();
		}
	}
	public static void addStudent(){
		int j=0;
		boolean i=true;
		while(i){
			Scanner ss = new Scanner(System.in);
			System.out.println("请输入学生姓名");
			String name = ss.next();
			System.out.println("请输入学生年龄");
			int age = ss.nextInt();
			System.out.println("请输入学生性别");
			char sex = ss.next().charAt(0);
			Student student = new Student(name,age,sex);
			students[j]  = student;
			j++
			System.out.println("录入成功,是否继续输入");
			System.out.println("1.是");
			System.out.println("2.否");
			Scanner cc = new Scanner(System.in);
			int c=ss.nextInt();
			if(c==1){
				i=true;
			}else{
				i=false;
			}
		}
		printMenu();
	}
	public static void selectStudent(){
		System.out.println("请输入要查询人的姓名");
		Scanner aa = new Scanner(System.in);
		String q=aa.next();
				if(q.equals(name)){
					System.out.println("名字"+name+",岁数"+age+",性别"+sex);
				}else{
					System.out.println("名字不正确,请重新输入");
				}
	}
	public static void updateStudent(){
			
	}
	public static void deleteStudent(){
			
	}
}*/