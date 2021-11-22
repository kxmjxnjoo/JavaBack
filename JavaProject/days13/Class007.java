package days13;
class Std{
	private int bun;
	private String name;
	private int[] scores;
	public 
	Std() {
		bun = 1;
		name = "홍길동";
		scores = new int[3];
		scores[0] = 100; scores[1] = 100; scores[2] = 100;
	}
	
	Std (String n) {
		bun = 2;
		name = n;
		scores = new int[3];
		scores[0] = 100; scores[1] = 100; scores[2] = 100;
	}	

	Std (String n, int a, int b, int c) {
		bun = 3;
		this.name = n;
		scores = new int[3];
		scores[0] = a; scores[1] = b; scores[2] = c;
	}
	Std (Std s) {
		this.bun = s.bun;
		this.name = s.name;
		this.scores = new int[3];
		this.scores[0] = s.scores[0]; 	this.scores[1] = s.scores[1]; 	this.scores[2] = s.scores[2];
	}
	void prn() {
		System.out.println(bun + " 이름: " + name + "  점수: " + scores[0] + " " + scores[1]+ " " + scores[2]);
	}
}
// 각각 호출되는 생성자에서 scores 변수에 3개 짜리 배열의 주소를 저장하는 명령을 공통으로 넣어주세요 
// 매개변수가 없는 생성자는 모든 변수값을 임의의 값으로 이름과 점수가 전달되는 생성자는 전달값으로 변수 대입
// prn(); 메소드는 멤버변수들의 값을 출력하되 양식은 임의로 설정
// 전달인수가 객체인 경우 새객체에 각 멤버변수 값을 복사한 객체가 만들어지게 하세요

public class Class007 {

	public static void main(String[] args) {
		Std std1 = new Std();
		Std std2 = new Std("홍길서");
		Std std3 = new Std("홍길남", 98,69,87);
		Std std4 = new Std(std3);
		std1.prn();	 	std2.prn();		std3.prn();		std4.prn();
	}

}
