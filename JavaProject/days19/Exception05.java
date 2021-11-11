package days19;

public class Exception05 {

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		method2();
	}
	// 현재 예외처리를 해결하는 방법 #2
	public static void method2() throws Exception {
		throw new Exception(); // 강제 예외 발생
		
		// 현재 예외처리를 해결하는 방법 #1
		// try {
		// throw new Exception();
		// } catch( Exception e) {
		//}
	}

}
