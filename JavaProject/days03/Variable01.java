package days03;

public class Variable01 {

	public static void main(String[] args) {
		// 35 + 38 = 73
		System.out.println(35 + " + " + 38 + " = " + (35 + 38));
		System.out.println(35 + " - " + 38 + " = " + (35 - 38));
		System.out.println(35 + " x " + 38 + " = " + (35 * 38));
		System.out.println(35 + " / " + 38 + " = " + (35 / 38));
		System.out.println(35 + " % " + 38 + " = " + (35 % 38));
		
		int a; // a 라는 이름의 변수를 생성
		int b; // b 라는 이름의 변수를 생성
		int plusResult, minusResult, multiplyResult; //한 번에 여러변수를 생성
		double divideResult; // divideResult 라는 이름의 변수 생성(실수를 저장할 변수)
		
		//a = 10.25; 실수 -> 정수로 소수점 아래 데이터 손실에 의한 에러
		divideResult = 10;
		boolean b1; // true, false 저장하는 논리형 변수
		b1 = true;
		System.out.printf("변수 b1의 값 : %b/n", b1);
		System.out.println("변수 b1의 값 : " + b1);
		//boolean 자료를 printf로 출력할때 %b를 사용
		
		char c;
		c = 'A';
		System.out.printf("변수 c의 값 : %c\n", c);
		System.out.println("변수 c의 값 : " + c);
		
		String s;
		s = "ABCD";
		System.out.printf("변수 s의 값 : %s\n", s);
		System.out.println("변수 s의 값 : " + s);
		
		a = 15;
		b = 11;
		c = '+';
		plusResult = a + b;
		minusResult = a - b;
		multiplyResult = a * b;
		divideResult = a / b;
		
		System.out.printf("%d %c %d = %d\n", a, c, b, plusResult);
		c = '-';
		System.out.printf("%d %c %d = %d\n", a, c, b, minusResult);
		c = 'x';
		System.out.printf("%d %c %d = %d\n", a, c, b, multiplyResult);
		c = '/';
		System.out.printf("%d %c %d = %.2f\n", a, c, b, divideResult); 
		//정수/정수는 정수임
		
		divideResult = a / (double)b; //(Casting) 현재 위치에서만 잠시 double로 타입 변환, 이 명령이 지나면 int로 돌아감 
		System.out.printf("%d %c %d = %f\n", a, c, b, divideResult); 
		
		System.out.println();
		// 위 네개의 출력을 println으로 바꿔서 출력하세요
		c = '+';
		//System.out.println('A' + 10);
		System.out.println( a + " " + c + " " +b + " = " + plusResult); 
		c = '-';
		System.out.println(a + " " + c + " " + b + " = " + minusResult);
		c = 'x';
		System.out.println(a + " " + c + " " +b + " = " + multiplyResult);
		c = '/';
		System.out.println(a + " " + c + " " + b  + " = " + divideResult);
		//c와 b사이의 " "는 작성할 필요 없었으나 띄어쓰기를 위해 작성함
	}
}