public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void send(){
		System.out.println("�ҷ����ŵ�����Ϊ"+Card.letter);
	}
}