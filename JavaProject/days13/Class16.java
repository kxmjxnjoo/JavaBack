package days13;
// this의 용도 #1 
// 멤버메소드내에 존재하며 메소드를 호출하는 호출 객체의 레퍼런스 값을 저장하는 숨어있는 레퍼런스 변수

// this의 용도# 2
// 오버로딩 되어 있는 생성자들 간 서로를 재호출 하기위한 이름으로 사용
// 호출하는 형태(매개변수의 형태)대로 생성자가 오버라이딩 되어 있어야 사용가능


class ThisB{
	private int num1;
	private int num2;
	private int num3;
	
	ThisB(int n) {
		num1 = n;
		System.out.println("ThisB클래스의 생성자1이 호출되었습니다");
	}
	ThisB(int n1, int n2) {
		// ThisB(n1); 아래 this와 같이 자신의 형제 생성자를 호출(생성자 가장 첫줄에 실행코드로만 사용가능)
		this(n1); 
		num2 = n2;
		System.out.println("ThisB클래스의 생성자2이 호출되었습니다");
	}
	ThisB(int n1, int n2, int n3) {
		this(n1, n2); 
		this.num3 = n3;
		System.out.println("ThisB클래스의 생성자3이 호출되었습니다");
	}
	// 오버로딩된 생성자들이 갖고 있는 공통 코드들을 한 쪽으로 일임하고 실행을 위해 형제 생성자 호출용도
}
public class Class16 {

	public static void main(String[] args) {
		ThisB t1 = new ThisB(10);
		System.out.println();
		ThisB t2 = new ThisB(10, 20);
		System.out.println();
		ThisB t3 = new ThisB(10, 20, 30);
	}
}
