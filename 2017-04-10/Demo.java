public class Demo{
	public static void main(String[]args){
		//System.out.println(Color.RED.getName());
		Color c = Color.RED;
		System.out.println(c);
	}
}
/**enum EnumClass{
	on,off
}*/
enum Color{
	RED("ºì"),GREEN("ÂÌ"),BLUE("À¶");
	private String name;
	private Color(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return this.name;
	}
}