public class Rongyao{
		String name;  //英雄
		String type; //技巧
		String money;//价格
		public  Rongyao(String name,String type,String money){
			this.name = name;
			this.type = type;
			this.money = money;
		}
		public void say(){
			System.out.println("英雄——"+name+"，技巧——"+type+"，价格——"+money);
		}
}