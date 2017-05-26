public class EnumDemo{
	public static void main(String[]args){
		Color[] cs = Color.values();
		for(Color c : cs){
			System.out.println(c);
		}
	}
}
enum Color{
	RED, GREEN, BLUE;
	public String toString(){
		String ret = super.toString();
		switch(this){
			case RED: ret = "��ɫ";break;
			case GREEN: ret = "��ɫ";break;
			case BLUE: ret = "��ɫ";break;
			default: ret = "û�������ɫ";break;
		}
		return ret;
	}
}