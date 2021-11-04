package days14;

import java.util.Random;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class Class21 {
	
	public static void main(String[] args) {
		abc(); // 클래스 내부에서 사용되는 것
		
		// java.lang 패키지에 있는 클래스의 static 메소드 실제 사용 예
	}
	
	public static void abc() {
		Random rd = new Random();
		int a = rd.nextInt();
		// Math 클래스에 있는 random() 메소드는 static 메소드들이므로
		// Math.random()으로 사용
		double b = Math.random();
		
		// abs의 사용
		int num = -10;
		System.out.printf("num = %d, num 변수의 절대값 = %d\n", num, Math.abs(num));
		// sqrt의 사용
		num = 9;
		System.out.printf("num 변수의 제곱근 = %.2f\n", Math.sqrt(num));
		
		// random의 사용
		System.out.println("Math 클래스 난수발생 static 메소드 값: " + Math.random());
		
		System.out.println("0~32 난수발생 static 메소드 값: " + (int)(Math.random()*33) );
		// Integer 클래스 (int 타입과 매핑되는 클래스)
		// Integer 클래스의 parseInt 메소드는 문자열로 되어있는 정수값을 int 타입으로 변환
		String strNum1 = "123";
		String strNum2 = "456";
		System.out.println("String 문자연산 : " + strNum1 + strNum2);
		System.out.println("정수 변환 후 연산 : " + Integer.parseInt(strNum1) + Integer.parseInt(strNum2));
		// String 클래스
		// int 또는 double형 자료를 String 으로 변환 - valueOf()
		int intNum1 = 456;
		int intNum2 = 789;
		System.out.println("정수 연산: " + (intNum1 + intNum2));
		System.out.println("문자 변환 후 연산: " + String.valueOf(intNum1) + String.valueOf(intNum2));
		
		// 만약 char 타입의 경우
		//(strNum1.charAt(0) - '0') * 100
		//(strNum1.charAt(1) - '0') * 10
		//(strNum1.charAt(2) - '0') * 1
		// 'A' - 'B' : 변환이 없어도 아스키코드로 연산됨
		
		// Double 클래스 (double 타입과 매핑되는 클래스)
		// Double 클래스의 parseDouble 메소드는 문자열로 되어있는 실수값을 double타입으로 변환
		strNum1 = "10.75";
		strNum2 = "5.2";
		//문자열 결합
		System.out.println("문자 연산: " + (strNum1 + strNum2));
		// 문자열 값을 실수로 변환한 후 연산 
		System.out.println("실수 변환 후 연산: " + (Double.parseDouble(strNum1)+Double.parseDouble(strNum2)));
	}
}

// 만약 클래스 외부에서 사용한다면 -> Class21.abc();
