public class Rongyao{
		String name;  //Ӣ��
		String type; //����
		String money;//�۸�
		public  Rongyao(String name,String type,String money){
			this.name = name;
			this.type = type;
			this.money = money;
		}
		public void say(){
			System.out.println("Ӣ�ۡ���"+name+"�����ɡ���"+type+"���۸񡪡�"+money);
		}
}