public class Phone{
		String name;  //Ʒ��
		String type; //�ߴ�
		String money;//�۸�
		public  Phone(String name,String type,String money){
			this.name = name;
			this.type = type;
			this.money = money;
		}
		public void say(){
			System.out.println("Ʒ�ơ���"+name+"���ߴ硪��"+type+"���۸񡪡�"+money);
		}
}