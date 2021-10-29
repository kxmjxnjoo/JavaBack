package days10;

public class Method01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		myPrint(); // 메소드의 이름을 불러서 호출
		// 메소드가 호출되면 해당 메소드 몸체로 이동한 뒤 
		// 내부 내용을 실행 후 원래 자리로 돌아옴
		System.out.println("프로그램 실행 중");
		myPrint();
		System.out.println("프로그램 실행 중");
		myPrint();
		System.out.println("프로그램 종료");
	}
		// 메소드의 정의(difine)
	public static void myPrint() { 	// public static void : 문법		myPrint : 메소드의 이름
		System.out.printf("내가 만든 ");
		System.out.println("Print 메소드 실행~~!!");
	}

	
	
	
	
}
