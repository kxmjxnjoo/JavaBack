package days14;
class SingletonEx {
	int n1;
	int n2;
	
	// 1. 생성자를 private로 보호함
	private SingletonEx() {
	}
	// 2. 클래스 내부에서 생성자를 호출해서 객체하나(new 인스턴스)를 생성함
	// 	   이 역시도 private으로 생성 & static으로 생성
	private static SingletonEx itc = new SingletonEx();
	// 3. 생성해놓은 객체의 참조변수값을 리턴하는 public형의 메소드를 생성
	// 메소드 이름 getInstance() - static으로 리턴
	public static SingletonEx getInstance() {
		return itc;
	}    // 이 부분 시험에 나옴 ★
}
class MultitoneEx{
	
}
public class Class26 {

	public static void main(String[] args) {
		MultitoneEx m1 = new MultitoneEx();
		MultitoneEx m2 = new MultitoneEx();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();
		// SingletonEx s1 = new SingletonEx();
		// SingletonEx s2 = new SingletonEx();
		// 싱클톤 방식이란 위의 s1, s2의 레퍼런스 변수가 같은 주소를 같게하는 방식을 말함
		// 현재는 new 연산자 사용했기 때문에 다른 주소를 가지고 있음 
		
		// SingletonEx s3 = new SingletonEx(); 
		// SingletonEx s4 = s3;		하나의 인스턴스를 공유해서 쓰는 것과 비슷함
		// 다만 s3,s4는 같은 영역({})안에 있는 변수기 때문에 주소 전달이 가능하지만 만약 다른 메소드상에서
		// 사용하는 레퍼런스 변수도 같은 주소를 갖게 하려면 위와 같은 방법으론 적절하지 않음
		// abc(s3); // 해당 메소드를 호출할 때 마다 객체주소를 전달해야하는 불편함이 있음
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// 객체 참조 변수를 println으로 출력하면 클래스이름과 해시코드가 출력됨
		// 해시코드 : 각 객체들을 서로 구분할 수 있는 고유값 -> 새로운 저장장소의 주소를 계산하는 피연산자이기도 함
		
		s1.n1 = 150;
		System.out.println(s2.n1);
		s2.n2 = 200;
		System.out.println(s2.n2);
	}
	public static void abc() {
		// SingletonEx s5 = new SingletonEx();
		// 이 명령이 실행됨으로 이미 두개의 인스턴스가 만들어진거나 마찬가지
	}
}
