public class Computer{
		String cpu;  //cpu
		String pinpai; //Ʒ��
		String money;//�۸�
		public  Computer(String cpu,String pinpai,String money){
			this.cpu = cpu;
			this.pinpai = pinpai;
			this.money = money;
		}
		public void say(){
			System.out.println("cpu����"+cpu+"��Ʒ�ơ���"+pinpai+"���۸񡪡�"+money);
		}
}