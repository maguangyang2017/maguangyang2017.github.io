public class Main{
	public static void main(String[] args){
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
	}
}