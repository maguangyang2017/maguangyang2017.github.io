public class Main{
	public static void main(String[] args){
		//������
		Computer[] computers = new Computer[6];
        Computer computer1 = new Computer("i5","����","4000");
        computers[0] = computer1;
		Computer computer2 = new Computer("i7","DELL","6800");
        computers[1] = computer2;
		Computer computer3 = new Computer("i5","����","4300");
        computers[2] = computer3;
		Computer computer4 = new Computer("i7","����","7000");
        computers[3] = computer4;
		Computer computer5 = new Computer("i7","������","15000");
        computers[4] = computer5;
		Computer computer6 = new Computer("i7","С��","5999");
        computers[5] = computer6;
		
		for(int i=0;i<computers.length;i++){
		computers[i].say();
		}
		System.out.println("������");
		//����
		Train[] trains = new Train[5];
		Train train1 = new Train("����","��г��",100001,"����","����,ʯ��ׯ","�Ϻ�");
        trains[0] = train1;
		Train train2 = new Train("����","��ʹ��",100002,"���","����,ʯ��ׯ","����");
        trains[1] = train2;
		Train train3 = new Train("����","��غ�",100003,"�Ͼ�","����,�Ĵ�","����");
        trains[2] = train3;
		Train train4 = new Train("��ͨ","�ɹ���",100004,"�Ϻ�","����,����","�ຣ");
        trains[3] = train4;
		Train train5 = new Train("����","Բ����",100005,"����","����,ʯ��ׯ","��³ľ��");
        trains[4] = train5;
	    for(int i = 0;i<trains.length;i++){
            trains[i].say();
        }
		System.out.println("����");
		//��ʦ��
		Teather[] teathers = new Teather[5];
        Teather teather1 = new Teather("����","��ѧ","����");
        teathers[0] = teather1;
		Teather teather2 = new Teather("����","����","ʮ��");
        teathers[1] = teather2;
		Teather teather3 = new Teather("����","Ӣ��","��ʮ��");
        teathers[2] = teather3;
		Teather teather4 = new Teather("����","��ѧ","ʮ����");
        teathers[3] = teather4;
		Teather teather5 = new Teather("����","����","����");
        teathers[4] = teather5;
		for(int i=0;i<teathers.length;i++){
			teathers[i].say();
		}
		System.out.println("��ʦ��");
		//��ҫ��
		Rongyao[] rongyaos = new Rongyao[4];
        Rongyao rongyao1 = new Rongyao("��ľ��","ƽA","13888");
        rongyaos[0] = rongyao1;
		Rongyao rongyao2 = new Rongyao("����","ƽA","6888");
        rongyaos[1] = rongyao2;
		Rongyao rongyao3 = new Rongyao("����","ƽA","13888");
        rongyaos[2] = rongyao3;
		Rongyao rongyao4 = new Rongyao("����","ƽA","13888");
        rongyaos[3] = rongyao4;
		for(int i=0;i<rongyaos.length;i++){
			rongyaos[i].say();
		}
		System.out.println("��ҫ��");
		//�ֻ���
		Phone[] phones = new Phone[4];
        Phone phone1 = new Phone("С��","4.5��","1399");
        phones[0] = phone1;
		Phone phone2 = new Phone("��Ϊ","4.5��","1399");
        phones[1] = phone2;
		Phone phone3 = new Phone("����","4.5��","1399");
        phones[2] = phone3;
		Phone phone4 = new Phone("����","4.5��","1399");
        phones[3] = phone4;
		for(int i=0;i<phones.length;i++){
			phones[i].say();
		}
		System.out.println("�ֻ���");
		//ѧ����
		Student[] students = new Student[7];
        Student student1 = new Student("��һ",19,'��');
        students[0] = student1;
        Student student2 = new Student("����",18,'Ů');
        students[1] = student2;
		Student student3 = new Student("����",25,'��');
        students[2] = student3;
		Student student4 = new Student("����",30,'��');
        students[3] = student4;
		Student student5 = new Student("����",20,'��');
        students[4] = student5;
		Student student6 = new Student("����",19,'Ů');
        students[5] = student6;
		Student student7 = new Student("����",21,'Ů');
        students[6] = student7;
	    for(int i = 0;i<students.length;i++){
            students[i].say();
        }
		System.out.println("ѧ����");
		//ѧУ��
		School[] schools = new School[5];
		School school1 = new School("���ʵ�ʮ����ѧ","��ׯ","����","4000");
        schools[0] = school1;
		School school2 = new School("���ʵ�ʮ����ѧ","��ɽ","����","2000");
        schools[1] = school2;
		School school3 = new School("���ʵ�ʮ����ѧ","��ˮ","����","2000");
        schools[2] = school3;
		School school4 = new School("���ʵ�ʮ����ѧ","۰��","����","4000");
        schools[3] = school4;
		School school5 = new School("���ʵ�ʮ����ѧ","��ׯ","Сѧ","1000");
        schools[4] = school5;
	    for(int i = 0;i<schools.length;i++){
            schools[i].say();
        }
		System.out.println("ѧУ��");
	}
}