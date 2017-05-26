public class Phone{
		String name;  //品牌
		String type; //尺寸
		String money;//价格
		public  Phone(String name,String type,String money){
			this.name = name;
			this.type = type;
			this.money = money;
		}
		public void say(){
			System.out.println("品牌——"+name+"，尺寸——"+type+"，价格——"+money);
		}
}