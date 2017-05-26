public class Main{
	public static void main(String[] args){
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
	}
}