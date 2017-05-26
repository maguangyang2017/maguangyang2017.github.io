public class Person{
	public Phone phone;

	public Person(Phone phone){
		this.phone = phone;
	}
	public void sendPhone(){
		this.phone.send();
	}
}