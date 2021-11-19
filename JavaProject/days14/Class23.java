package days14;
class MemberCall {
	int iv = 10;
	// 인스턴스 변수 : 객체가 생성될 때 iv변수가 생성 -> 10으로 초기화
	static int sv = 20;
	// 스태틱 변수: 프로그램이 시작할 때 sv가 생성 -> 20으로 초기화
	int iv2 = sv;
	// 인스턴스 변수: 객체가 생성될 때 iv2가 생성 -> 이미 만들어진 20을 저장하고 있는 sv값으로 초기화 가능
	
	// static int sv2 = iv; -> 스태틱 변수 값을 인스턴스 변수 값으로 초기화 할 수 없음
	// iv가 언제 생성될 지 모르므로 sv2에 값 전달 불가능
	
	static int sv2 = new MemberCall().iv;
	// 임시방편으로 객체 생성 후 변수를 사용하는 예
	// 억지로라도 인스턴스(멤버) 변수로 스태틱 변수의 값을 초기화 하고자 한다면
	// 위와 같은 방법을 씀. 레퍼런스 변수 없는 new 인스턴스를 만들어서 멤버변수 사용
	
	void intstanceMethod1() {
		System.out.println(sv);
		System.out.println(iv);
	}
	static void staticMethod() {
		System.out.println(sv); // 스태틱 메소드는 스태틱 필드를 사용할 수 있음
		// System.out.println(iv); 는 에러m 스태틱 메소드는 인스턴스 변수를 사용할 수 없음
		System.out.println(new MemberCall().iv );
		// 억지로라도 스태틱 메소드가 인스턴스 필드를 사용하려면 객체를 만들고 사용가능 
		
		// intstanceMethod1 () {
		// 스태틱 메소드는 인스턴스 메소드를 호출 할 수 없음
		new MemberCall().intstanceMethod1(); 
		// 억지로라도 스태틱 메소드가 멤버 메소드를 호출하려면 객체를 만들고 사용가능 
	}
		void instanceMethod2() {
		staticMethod();
		intstanceMethod1();
	}
}
public class Class23 {

	public static void main(String[] args) {

	}
}
