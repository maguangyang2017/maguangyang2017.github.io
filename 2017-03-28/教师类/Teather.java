public class Teather{
		String name;  //����
		String subject; //��Ŀ
		String time;//��ѧ����
		public  Teather(String name,String subject,String time){
			this.name = name;
			this.subject = subject;
			this.time = time;
		}
		public void say(){
			System.out.println("��������"+name+"����ѧ��Ŀ����"+subject+"�����顪��"+time);
		}
}
/**
public void say(){
			System.out.println("saying");
		}
*/