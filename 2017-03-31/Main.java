import java.util.Scanner;
public class Main{
	public static void main(String[] arges){
		String letter = "����";
		Card card = new Card(letter);
		Phone phone = new Phone(card);
		Person person = new Person(phone);
		person.sendPhone();
	}
	/**public static void Shuru(){
			System.out.println("�������������");
			Scanner sc = new Scanner(System.in);
			String f = sc.next();
	}*/
}