public class Main{
	public static void main(String[] args){
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
	}
}
/**

Teather teather1 = new Teather();
		teather1.say();
        
*/