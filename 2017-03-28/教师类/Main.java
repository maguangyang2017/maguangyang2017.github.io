public class Main{
	public static void main(String[] args){
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
	}
}
/**

Teather teather1 = new Teather();
		teather1.say();
        
*/