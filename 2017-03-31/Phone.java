public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void send(){
		System.out.println("我发短信的内容为"+Card.letter);
	}
}