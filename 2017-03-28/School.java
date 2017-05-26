public class School{
		String name;       //学校名字
		String area;		 //所在区域
		String star;		 //级别
		String people;    //人数
		public void say(){
			System.out.println("学校名字——"+name+",所在区域——"+area+",级别——"+star+",人数——"+people);
		}
		public  School(String name,String area,String star,String people){
        this.name = name;
        this.area = area;
		this.star = star;
		this.people = people;
		}
}