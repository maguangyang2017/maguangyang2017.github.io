
public class Fanhui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=10;
			int b=0;
			System.out.println(a/b);
			//return 0;不能用
		}catch(Exception e){
			System.out.println("不对");
		}finally{
			System.out.println("就不对");
		}
	}
}
