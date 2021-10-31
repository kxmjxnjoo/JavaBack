package days04;

// 산술-사(오)칙연산자) +, -, /, *, %
// 관계연산자-비교연산자) >, <, >=< <=< ==< !=
// 논리연산자) &&(And), ||(Or), !(Not)
public class Operator01 {

	public static void main(String[] args) {

		int n1 = 10, n2 = 7, result1;
		double result2;
		result1 = n1 + n2;
		System.out.println(n1 + "+" + n2 + " = " + result1);
		result1 = n1 - n2;
		System.out.println(n1 + "-" + n2 + " = " + result1);
		result1 = n1 * n2;
		System.out.println(n1 + "*" + n2 + " = " + result1);
		result2 = n1 / (double)n2;
		System.out.println(n1 + "/" + n2 + " = " + result2);
		double result3 = (int)(result2*100)/100.0;
		System.out.println(n1 + "/" + n2 + " = " + result3);
		// 1.4285714285714286 * 100 > 142.85714285714286
		// (int)142.85714285714286 -> 142
		// 142 / 100.0 -> 1.42
		
		// 자료형과 산술연사
		byte b1 = 10;
		byte b2 = 5;
		// 정수(byte, short..)와 정수의 산술 연산 결과값은 int값이 되야함
		byte b3 = (byte)(b1 + b2);
		
		// 캐스팅 연산은 서로 호환이 가능한 자료끼리만 사용 가능
		// 아래는 캐스팅 되는 경우와 에러 모음
		
		double d1 = 1.233456;
		int a = (int)d1; // a 변수에 1저장됨
		double d2 = (double)a; //d2변수에 1.0이 저장
		
		// 잘못된 예 (String->int)
		String str = "123456";
		//int a = (int)str; //에러
		
		// 잘못된 예 (int->String)
		int a2 = 123456;
		//String str2 = (String)a2; //에러
		
		// 호환되지 않는 자료들간의 형 변환은 별도의 도구(메소드)가 필요
		String str4 = "123456";
		int b4 = Integer.parseInt(str); // String -> int
		// 별도의 형변환 도구는 메소드 이후 단원에서 학습예정
		
		int b5 = 123456;
		String str5 = String.valueOf(b5); // int->String
		
		// double -> String
		double d3 = 123.1234;
		//String s3 = (String)d3; //에러
		String s3 = String.valueOf(d3);
		
		// String -> double
		String s4 = "123.1234";
		// double d4 = (double)s4; //에러
		double d4 = Double.parseDouble(s4);
		
		// String -> char
		String s5 = "ABCDEFG";
		// char c5 = (char)s5; //에러
		char c5 = s5.charAt(0); //정상실행 0부터 첫글자 1 두번째 2 세번째..
		
		// char -> String
		char c6 = 'A';
		//String s6 = (char)c6; //에러
		String s6 = String.valueOf(c6);
		
	}

}