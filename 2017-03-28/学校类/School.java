public class School{
		String name;       //ѧУ����
		String area;		 //��������
		String star;		 //����
		String people;    //����
		public void say(){
			System.out.println("ѧУ���֡���"+name+",�������򡪡�"+area+",���𡪡�"+star+",��������"+people);
		}
		public  School(String name,String area,String star,String people){
        this.name = name;
        this.area = area;
		this.star = star;
		this.people = people;
		}
}