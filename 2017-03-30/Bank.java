public class Bank{
	String  name;//�ͻ�����
	double inprice;//�ͻ����
	double outprice;//�ͻ����
	double outtprice;//�ͻ�ȡ��
	public Bank(String name,double inprice,double outprice){
		this.name = name;
		this.inprice = inprice;
		this.outprice = outprice+this.inprice;
	}
	public void say(){
		System.out.println("�ͻ���������"+name+",�ͻ����δ���"+inprice+",�ͻ����"+outprice);
	}
	public Bank(String name,double outprice){
		this.name = name;
		this.outprice = outprice-outtprice;
	}
	public void says(){
		System.out.println("�ͻ���������"+name+",�ͻ�����ȡ���"+inprice+",�ͻ����"+outprice);
	}
}