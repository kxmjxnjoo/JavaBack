package days19;

public class Exception05 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// throws Exception 꼬리표가 붙은 메소드를 호출하면
	// 호출하는 지점에 빨간줄(에러)가 표시됨
	// add throw declaration/surround with try catch 중 
	// 하나를 선택할 수 있음
	public static void method1() throws Exception {
		
		method2();
	}
	// 현재 예외처리를 해결하는 방법 #2
	// add throw declaration 메뉴 사용
	// 현재 메소드의 명령중에는 에러(예외) 발생할 가능성이 있는 명령이 포함되어있다
	// 라고 메소드에 꼬리표(throws Exception)를 붙임
	public static void method2() throws Exception {
		throw new Exception(); // 강제 예외 발생
		
		// 현재 예외처리를 해결하는 방법 #1
		// try {
		// throw new Exception();
		// } catch( Exception e) {
		//}
	}
}