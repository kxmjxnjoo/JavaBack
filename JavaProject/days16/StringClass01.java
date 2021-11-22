package days16;

public class StringClass01 {

	public static void main(String[] args) {
		// 0.
		// 가용한 Heap 공간에 Hello를 저장하고 그 주소를 s에 전달
		String s = "Hello";
		// 이미 저장된 Hello 가 있다면 그 주소를 전달
		// System.out.println("0." + s.toString());
		System.out.println("0. " + s);
		// 단점 : 같은 문자열 Hello를 다른 변수에 저장하려 한다면 새로운 공간 할당X

		// 1. 
		// new에 의해 새로운 Heap공간에 Hello를 저장, 그 주소를 s에 전달
		s = new String("Hello");
		System.out.println("1. " + s);
		// String 클래스는 Object 클래스를 상속받고
		// 이미 toString과 equals가 자신에게 적합하게 오버라이딩 되어있음
		
		// 2.
		// 한글자만을 하나의 데이터로 갖는 char형 배ㅕㅇㄹ
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		String s2 = new String(c); // 배열주소를 초기값으로 문자열 구성
		System.out.println("2. " + s2);
	}
}