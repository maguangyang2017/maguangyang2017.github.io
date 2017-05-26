public class Main{
	public static void main(String[] args){
		//电脑类
		Computer[] computers = new Computer[6];
        Computer computer1 = new Computer("i5","惠普","4000");
        computers[0] = computer1;
		Computer computer2 = new Computer("i7","DELL","6800");
        computers[1] = computer2;
		Computer computer3 = new Computer("i5","联想","4300");
        computers[2] = computer3;
		Computer computer4 = new Computer("i7","炫龙","7000");
        computers[3] = computer4;
		Computer computer5 = new Computer("i7","外星人","15000");
        computers[4] = computer5;
		Computer computer6 = new Computer("i7","小米","5999");
        computers[5] = computer6;
		
		for(int i=0;i<computers.length;i++){
		computers[i].say();
		}
		System.out.println("电脑类");
		//火车类
		Train[] trains = new Train[5];
		Train train1 = new Train("动车","和谐号",100001,"北京","临沂,石家庄","上海");
        trains[0] = train1;
		Train train2 = new Train("高铁","天使号",100002,"天津","临沂,石家庄","海南");
        trains[1] = train2;
		Train train3 = new Train("高铁","天地号",100003,"南京","临沂,四川","云南");
        trains[2] = train3;
		Train train4 = new Train("普通","成功号",100004,"上海","临沂,河南","青海");
        trains[3] = train4;
		Train train5 = new Train("动车","圆满号",100005,"海南","临沂,石家庄","乌鲁木齐");
        trains[4] = train5;
	    for(int i = 0;i<trains.length;i++){
            trains[i].say();
        }
		System.out.println("火车类");
		//教师类
		Teather[] teathers = new Teather[5];
        Teather teather1 = new Teather("王丽","数学","六年");
        teathers[0] = teather1;
		Teather teather2 = new Teather("李丽","语文","十年");
        teathers[1] = teather2;
		Teather teather3 = new Teather("晓晓","英语","二十年");
        teathers[2] = teather3;
		Teather teather4 = new Teather("莉莉","化学","十五年");
        teathers[3] = teather4;
		Teather teather5 = new Teather("东东","生物","三年");
        teathers[4] = teather5;
		for(int i=0;i<teathers.length;i++){
			teathers[i].say();
		}
		System.out.println("教师类");
		//荣耀类
		Rongyao[] rongyaos = new Rongyao[4];
        Rongyao rongyao1 = new Rongyao("花木兰","平A","13888");
        rongyaos[0] = rongyao1;
		Rongyao rongyao2 = new Rongyao("后羿","平A","6888");
        rongyaos[1] = rongyao2;
		Rongyao rongyao3 = new Rongyao("赵云","平A","13888");
        rongyaos[2] = rongyao3;
		Rongyao rongyao4 = new Rongyao("黄忠","平A","13888");
        rongyaos[3] = rongyao4;
		for(int i=0;i<rongyaos.length;i++){
			rongyaos[i].say();
		}
		System.out.println("荣耀类");
		//手机类
		Phone[] phones = new Phone[4];
        Phone phone1 = new Phone("小米","4.5寸","1399");
        phones[0] = phone1;
		Phone phone2 = new Phone("华为","4.5寸","1399");
        phones[1] = phone2;
		Phone phone3 = new Phone("联想","4.5寸","1399");
        phones[2] = phone3;
		Phone phone4 = new Phone("魅族","4.5寸","1399");
        phones[3] = phone4;
		for(int i=0;i<phones.length;i++){
			phones[i].say();
		}
		System.out.println("手机类");
		//学生类
		Student[] students = new Student[7];
        Student student1 = new Student("王一",19,'男');
        students[0] = student1;
        Student student2 = new Student("王二",18,'女');
        students[1] = student2;
		Student student3 = new Student("王三",25,'男');
        students[2] = student3;
		Student student4 = new Student("王四",30,'男');
        students[3] = student4;
		Student student5 = new Student("王五",20,'男');
        students[4] = student5;
		Student student6 = new Student("王六",19,'女');
        students[5] = student6;
		Student student7 = new Student("王七",21,'女');
        students[6] = student7;
	    for(int i = 0;i<students.length;i++){
            students[i].say();
        }
		System.out.println("学生类");
		//学校类
		School[] schools = new School[5];
		School school1 = new School("临沂第十九中学","罗庄","高中","4000");
        schools[0] = school1;
		School school2 = new School("临沂第十八中学","兰山","初中","2000");
        schools[1] = school2;
		School school3 = new School("临沂第十七中学","沂水","初中","2000");
        schools[2] = school3;
		School school4 = new School("临沂第十六中学","郯城","高中","4000");
        schools[3] = school4;
		School school5 = new School("临沂第十五中学","罗庄","小学","1000");
        schools[4] = school5;
	    for(int i = 0;i<schools.length;i++){
            schools[i].say();
        }
		System.out.println("学校类");
	}
}