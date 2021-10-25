package days04;

public class Variable08 {

	public static void main(String[] args) {
		// char 형 변수의 값 대입 : 하나의 글자를 다른 글자와 구분하기 위해 ('', 'A', ' ')사용
		char ch = 'A';
		System.out.printf("ch -> %c\n", ch);
		
		// char 형 데이터는 컴퓨터 저장장치에 저장 될 때 이진수 코드로 저장됨
		// 문자를 저장하기 위한 코드체계(ASCII 코드)에 의해 조합된 코드
		// 십진수로 변환하여 정수로도 변환가능하여 정수와 문자 간 호환성이 발생됨
		int intchar = ch;
		System.out.printf("ch -> 정수형 변수에 저장 %d\n", intchar);
		System.out.printf("ch -> 정수형 변수로 캐스팅 %d\n", (int)ch);
		ch = 'B';
		System.out.printf("'B' -> 정수형 변수로 캐스팅 %d\n", (int)ch);
		System.out.printf("'B' -> 정수형 변수로 캐스팅 %d\n", (int)'B');
		System.out.printf("C' -> 정수형 변수로 캐스팅 %d\n", (int)'C');
		System.out.printf("'Z' -> 정수형 변수로 캐스팅 %d\n", (int)'Z');
		System.out.printf("'a' -> 정수형 변수로 캐스팅 %d\n", (int)'a');
		System.out.printf("'z' -> 정수형 변수로 캐스팅 %d\n", (int)'z');
		System.out.printf("'0' -> %d, '9' -> %c\n", (int)'0', (int)'9');

		// 대문제 B값에 32를 더하면 소문자 b로 변경
		System.out.printf("%c + 32 -> %c\n", ch, ch + 32);
		
		// 아라비호 기호 '8'에서 아라비아 기호 '0'을 빼면 정수 8이 결과로 나옵니다
		System.out.printf(" '8'-'0' -> %d\n", '8' - '0');
		
		// 실수형 변수의 초기화
		// 자바에서 모든 실수들은 기본적으로 double 타입으로 인식
		// float 타입으로 값을 저장하기 위해서는 float 변수 선언하고 저장
		// float 변수에 double 형 데이터 입력 시 에러
		float f2 = 1.123f; //뒤에 붙이는 f,F 대소문자 상관없음
		// float 변수에 캐스팅 연산 적용한 double 데이터 입력 -> 정상실행
		float f3 = (float)1.123;
		// 용량이 큰 자료형에 작은 자료형 데이터 대입은 자동변환됨
		double f4 = 1f;
		
		// 출력형식은 double과 같은 형식이 사용됨
		System.out.printf("%.1f\t%.1f\n", f2, f4);

		//정수들의 값의 대입
		int a = 100;
		byte b1 = (byte)a; 
		byte b2 = 123; //기본형이 int라서 (byte)123이 필요할 것 같지만 정수에 한하여 생략가능
		a =b2; // 용량이 작은 자료형을 큰 자료형에 대입은 바로가능
		// 용량이 큰 변수값을 용량이 작은 변수 값으로 변환하려면 캐스팅 연산 필요, 반대경우는 필요없음
		
	}

}