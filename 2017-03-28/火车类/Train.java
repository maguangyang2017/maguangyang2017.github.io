public class Train{
/**����
		������
		������
		�𳵱��
		��ʼ����
		��;����
		���յ�
*/
		String type;    //������
		String name;       //������
		int number;		 //�𳵱��
		String start;		 //��ʼ����
		String pathway;    //��;����
		String end;          //���յ�
		public void say(){
			System.out.println("�����͡���"+type+",�����֡���"+name+",�𳵱�š���"+number+",��ʼ���㡪��"+start+",��;���㡪��("+pathway+"),���յ㡪��"+end);
		}
		public  Train(String type,String name,int number,String start,String pathway,String end){
        this.type = type;
        this.name = name;
        this.number = number;
		this.start = start;
		this.pathway = pathway;
		this.end = end;
		}
}