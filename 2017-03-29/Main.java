import java.util.Scanner;
//ѧ���˵�
public class Main{
		static Scanner sc=new Scanner(System.in);
		static Student[] n=new Student[100];
		static int i=0;
	public static void main(String[] arges){
		printMenu();
	}
	public static void printMenu(){
		System.out.println("=====ѡ������=====");
		System.out.println("======1.����======");
		System.out.println("======2.��ѯ======");
		System.out.println("======3.����======");
		System.out.println("======4.ɾ��======");
		System.out.println("======5.�˳�======");
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
	public static void addStudent(){//����ѧ����Ϣ
		boolean k=true;
		while (k==true){
			System.out.println("������ѧ������:");
			String name=sc.next();
			System.out.println("������ѧ������:");
			int age=sc.nextInt();
			System.out.println("������ѧ���Ա�:");
			char sex=sc.next().charAt(0);
			Student b=new Student(name,age,sex);
			n[i]=b;
			i++;
			System.out.println("¼��ɹ�,�Ƿ��������");
			System.out.println("1.��");
			System.out.println("2.��");
			int m=sc.nextInt();
			if(m==1){
				k=true;
			}else if(m==2){
				k=false;
			}	
		}
		printMenu();
	}
	public static void updateStudent(){//�޸�ѧ����Ϣ
		System.out.println("��ѡ��Ҫ�޸ĵ���Ϣ");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�Ա�");
		int aaa=sc.nextInt();
		if(aaa==1){
				System.out.println("������������Ϣ");
				System.out.println("����");
				String jj=sc.next();
				System.out.println("����");
				int kk=sc.nextInt();
				System.out.println("�Ա�");
				char ll=sc.next().charAt(0);
				Student b=new Student(jj,kk,ll);
				n[i]=b;
				System.out.println();
				n[i].say();
		}
		System.out.println("�Ƿ�����޸�");
		System.out.println("1.��");
		System.out.println("2.��");
		int zzz=sc.nextInt();
		if(zzz==1){
			updateStudent();
		}else{
			printMenu();
		}
	}
	public static void selectStudent(){//��ѯѧ����Ϣ
		System.out.println("1.��ѯ����ѧ����Ϣ");
		System.out.println("2.��ѯ����ѧ����Ϣ");
		int z=sc.nextInt();
		if(z==1){
			for(int l=0;l<n.length;l++){
				if(n[l]!=null){
					n[l].say();
					printMenu(); 
				}
			}
		}else if (z==2){
			System.out.println("������ѧ������");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("�Ƿ������ѯ");
			System.out.println("1:������ѯ");
			System.out.println("2:���ز˵�");
			int v=sc.nextInt();
			if(v==1){
				selectStudent();
			}else if(v!=1){
				printMenu();
			}
		}
	}
	public static void deleteStudent(){//ɾ��ѧ����Ϣ
		System.out.println("ɾ������ѧ����Ϣ,������1");
		System.out.println("ɾ������ѧ����Ϣ,������2");
		int y=sc.nextInt();
		if(y==1){
				for(int w=0;w<n.length;w++){
				if(n[w]!=null){
					n[w] = null;
					System.out.println("ɾ���ɹ�");
					printMenu();
				}
				printMenu();
			}
		}else if (y==2){
			System.out.println("������ѧ������");
			String mm=sc.next();
			for(int p=0;p<n.length;p++){
				if((n[p]!=null)&&(mm.equals(n[p].name))){
					n[p].say();
				}
			}
			System.out.println("�Ƿ����ɾ��");
			System.out.println("1:����ɾ��");
			System.out.println("2:���ز˵�");
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
		System.out.println("=====ѡ������=====");
		System.out.println("======1.����======");
		System.out.println("======2.��ѯ======");
		System.out.println("======3.����======");
		System.out.println("======4.ɾ��======");
		System.out.println("======5.�˳�======");
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
			System.out.println("������ѧ������");
			String name = ss.next();
			System.out.println("������ѧ������");
			int age = ss.nextInt();
			System.out.println("������ѧ���Ա�");
			char sex = ss.next().charAt(0);
			Student student = new Student(name,age,sex);
			students[j]  = student;
			j++
			System.out.println("¼��ɹ�,�Ƿ��������");
			System.out.println("1.��");
			System.out.println("2.��");
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
		System.out.println("������Ҫ��ѯ�˵�����");
		Scanner aa = new Scanner(System.in);
		String q=aa.next();
				if(q.equals(name)){
					System.out.println("����"+name+",����"+age+",�Ա�"+sex);
				}else{
					System.out.println("���ֲ���ȷ,����������");
				}
	}
	public static void updateStudent(){
			
	}
	public static void deleteStudent(){
			
	}
}*/