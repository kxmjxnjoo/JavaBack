package days18;
// 자바언어에서 제공하는 상속 기능은 단일 상속만을 지원함
// 하나의 클래스는 하나의 부모클래스를 가질 수 있음

// 다중 상속을 위해 만들어진 interface
// 인터페이스도 클래스, 다만 제약이 있는 클래스임
// 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있음
// 추상 클래스처럼 일반 멤버변수와 일반 멤버메소드를 가질 수 없음
// 인터페이스는 멤버메소드로 public abstract 메소드만 가질 수 있음
// 다중상속 가능

// class 만들듯이 생성하며, class란 키워드 대신 interface라는 키워드 사용하여 생성
interface InterA {
	// int n1; -> 에러, 일반 변수 생성 불가
	// InterA() {} -> 에러, 추상메소드만 생성자 생성가능하여 
	// 인터페이스는 일반메소드와 생성자조차도 생성 불가
	// public void print() {} 에러, 일반 메소드 선언불가(추상메소드만 가능)
	
	// 인터페이스 내부에 선언할 수 있는 요소
	public static final int num = 10;
	public abstract void test();
}
// 인터페이스를 상속(구현) 하는 클래스는 상속(구현)할 클래스 앞에
// extends 대신 implements 를 사용
class SubA implements InterA{
	@Override
	public void test() {
		System.out.println("SubA 클래스의 test메소드 실행");
	}
}
public class Extends11_interface01 {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성 불가능
		// 생성자가 없으므로 객체 생성불가, 추상메소드를 포함할 수 있기 때문
		// InterA a \ new InterA(); 에러
		// 상속을 통한 다형성 구현에만 인터페이스 활용
		// 부모 인터페이스의 레퍼런스를 사용하여 자식 클래스의 객체를 참조 가능
		InterA s = new SubA();
		// 부모 인터페이스의 레퍼런스를 사용하여 자식 클래스의 오버라이딩된 메소드 호출
		s.test();
	}
}
