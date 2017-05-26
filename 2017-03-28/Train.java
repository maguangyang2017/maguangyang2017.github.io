public class Train{
/**火车类
		火车类型
		火车名字
		火车编号
		火车始发点
		火车途经点
		火车终点
*/
		String type;    //火车类型
		String name;       //火车名字
		int number;		 //火车编号
		String start;		 //火车始发点
		String pathway;    //火车途经点
		String end;          //火车终点
		public void say(){
			System.out.println("火车类型——"+type+",火车名字——"+name+",火车编号——"+number+",火车始发点——"+start+",火车途经点——("+pathway+"),火车终点——"+end);
		}
		public  Train(String type,String name,int number,String start,String pathway,String end){
        this.type = type;
        this.name = name;
        this.number = number;
		this.start = start;
		this.pathway = pathway;
		this.end = end;
		}
}