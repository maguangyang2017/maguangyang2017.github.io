public class Computer{
		String cpu;  //cpu
		String pinpai; //品牌
		String money;//价格
		public  Computer(String cpu,String pinpai,String money){
			this.cpu = cpu;
			this.pinpai = pinpai;
			this.money = money;
		}
		public void say(){
			System.out.println("cpu——"+cpu+"，品牌——"+pinpai+"，价格——"+money);
		}
}