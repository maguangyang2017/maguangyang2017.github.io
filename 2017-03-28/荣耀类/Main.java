public class Main{
	public static void main(String[] args){
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
	}
}