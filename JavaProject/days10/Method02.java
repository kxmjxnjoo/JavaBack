package days10;

public class Method02 {

	public static void main(String[] args) {	// String[] args : main 메소드의 매개변수
		// 매개 변수의 선언
		// public static void 메소드 이름(자료형 매개변수, 자료형 매개변수...){ }
		// 매개 변수 또한 필요한 갯수 만큼 선언해서 사용 가능
		myPrint(100);
		// 100: ()괄호 안 : 전달 인수 -> 괄호 안에 전달된 인수는 메소드가 실행 될 떄
		// 메소드 정의영역 괄호안에 선언된 n변수에 저장
		myPrint(200);
		myPrintWith2Int(300, 400);
	}
	public static void myPrint(int n) {
		System.out.println("전달받은 매개변수의 값 n -> " + n);
	}
	public static void myPrintWith2Int(int n1, int n2) { // 타입 변수, 타입 변수 식으로 작성
		System.out.println("전달받은 매개변수의 값 n1 -> " + n1 + " n2 -> " + n2);
	}
}
