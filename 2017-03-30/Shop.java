public class Shop{
	String  name;//��Ʒ����
	double inprice;//��Ʒ����
	double outprice;//��Ʒ�ۼ�
	int number;//��Ʒ����
	public  Shop(String name,double inprice,double outprice,int number){
		this.name = name;
		this.inprice = inprice;
		this.outprice = outprice;
		this.number = number;
	}
	public void say(){
		System.out.println("��Ʒ���ơ���"+name+",��Ʒ���ۡ���"+inprice+",��Ʒ�ۼۡ���"+outprice+"��Ʒ��������"+number);
	}
}