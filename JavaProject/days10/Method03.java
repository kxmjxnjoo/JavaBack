package days10;

public class Method03 {
	
	public static void updateValue(int num) {
		num = 100;
		System.out.printf("updateValue의 num -> %d\n", num);
	}
	// 1. 메소드 호출할 때 저전달 인수로 넣어주는 변수와 updateValue 영역의 
			// 매개변수로 쓰이는 변수의 이름 같아도 상관없음
			// 언급한 두 변수는 지역변수라고 부르며 서로 다른 변수로 사용됨
			
			// 2. 전달인수의 변수값이 매개변수 변수로 '값'만 전달되는 방식을 Call by Value라고 부름
	public static void main(String[] args) {
		int num = 10;
		System.out.printf("main의 num -> %d\n", num);
		// 전달인수로 변수를 사용하는 건, 변수를 전달x, 변수에 저장된 값으 전달한다는 뜻
		updateValue(num);
		System.out.printf("main의 num -> %d\n", num);
		}
		// 지역변수: { } 중괄호 안에 선언된 변수를 지역변수라고 함
		// 지역변수를 자신을 생성하는 명령이 감싸진{ } 중괄호를 벗어나면 소멸됨
}
