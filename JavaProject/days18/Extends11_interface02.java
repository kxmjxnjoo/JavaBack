package days18;
// 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있음
// 인터페이스는 멤버메소드로 public abstract 메소드만 가질 수 있음
interface InterB{
	public static final int n1 = 1;
	public static final int n2= 2;
	// 인터페이스 내부에 선언되는 멤버필드는 public static final을 생략할 수 있음
	int n3 = 3;
	// public static final이 생략된 변수와 일반 멤버 변수의 구분은 초기값 유무에 따라 구분
	// int n3; 값이 초기화 되지 않는 변수는 일밥 멤버 변수로 인식되 에러난 것
	public abstract void test1();
	public abstract void test2();
	// 인터페이스 내부에 선언되는 메소드는 public abstract 생략 가능
	void test3();
	// public abstract 가 생략된 메소드와 허용되지 않는 일반 메소드 구분은 
	// 중괄호의 유무에 따라 구분
}
public class Extends11_interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}