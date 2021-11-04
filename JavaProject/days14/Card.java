package days14;
	
public class Card {
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	
	private int kind; // 1.Clover  	2.Heart		3.diamond		4.Spade
	private int number;

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	Card() { // 디폴트 생성자
		this(spade, 1);
	}
	public String toString() { 
		// toString: 호출되면 호출객체의 무늬와 숫자를 String으로 리턴해주는 멤버메소드
		// ex) kind: 4,number: 13이라면 문자열"[Spade:K]"라고 리턴해줌
		String[] kinds = {"", "Clover", "Heart", "Diamond", "Spade"};
		String[] numbers = {"", "A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String result = "[" + kinds[this.kind] + ":" + numbers[this.number] + "]";
		// 만약 [0] 인덱스를 ""로 비워두지 않으려면 this.~에 -1을 해서 적용해야함
		return result; 
	}
}
