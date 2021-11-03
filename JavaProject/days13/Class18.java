package days13;

class StaticA{
	int num; // 인스턴스 변수-멤버변수지만 static이냐 아니야에따라 인스턴스 변수로도 불림
	// 인스턴스 변수라고도 불림 (동적 멤버 변수)
	static int number = 100; // static(정적 멤버 변수)
	// static 변수는 프로그램 실행 전 먼저 생성되어 사용 할 준비가 완료되는 변수
}
public class Class18 {

	public static void main(String[] args) {
		// 동적멤버변수(인스턴스멤버변수)는 반드시 객체가 생성되어야 그 변수 사용 가능
		StaticA a = new StaticA();
		a.num = 100;
		System.out.println("a 객체의 동적 멤버변수 값: " + a.num);
		
		StaticA a2 = new StaticA();
		a2.num = 200;
		System.out.println("a 객체의 동적 멤버변수 값: " + a2.num);
		StaticA a3 = new StaticA();
		a3.num = 300;
		System.out.println("a 객체의 동적 멤버변수 값: " + a3.num);
		System.out.println(StaticA.number);
	}
}
