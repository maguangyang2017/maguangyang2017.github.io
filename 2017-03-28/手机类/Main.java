public class Main{
	public static void main(String[] args){
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
	}
}