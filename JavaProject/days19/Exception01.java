package days19;
//### Exception(예외) 처리
//
//- 에러(Error) → 잘못된 것, 에러가 존재하는 경우 실행 될 수 없음
//- 예외(Exception) → 잘못된 것, 특정 상호아 또는 조건이 만족되는 경우 프로그램이 종료되는 현상
//    - 예외는 다양한 상황에 대해서 발생하는 현상으로 모든 예외를 대처할 수 없음
//    - 다만 예외가 발생한 경우 프로그램이 종료되지 않고 저장과 같은 기능을 제공할 수 있어야함
//    (예외가 발생해도 프로그램이 강제종료 되지않고 사용자에게 선택권 또는 처리기회를 주는 것을 말함)
//- 예외처리 : 예외가 발생한 경우 프로그램이 강제 종료되지 않도록 방지하는 것
public class Exception01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		int k = (int)(Math.random()*10);
		
			try {
				int result = 100/ k;
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눴습니다");
			} 
			// 에러가 발생하면 catch구문 안의 명령을 대신 실행하고 프로그램 실행을 계속함
		}
	}
}