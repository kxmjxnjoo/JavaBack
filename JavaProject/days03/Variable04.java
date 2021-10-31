package days03;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		double result1, result2;
		
		System.out.println("반 지름을 입력하세요: ");
		num1 = sc.nextInt();

		result1 = num1 * num1 * 3.141592;
		result2 = 2 * num1 * 3.141592;
		System.out.printf("입력한 원의 넓이는 %.1f 입니다.\n입력한 원의 둘레는 %.1f 입니다.", result1, result2);
		System.out.println();;
		// 아래는 println로 출력하고 소수점 두 자리 남기는 방법
		System.out.println("입력한 원의 넓이는 " + (int)(result1*100) /100.0 + "입니다."); 
		System.out.println("입력한 원의 둘레는 " + (int)(result2*100) /100.0 + "입니다.");
		// 123.1234
		// 123.1234 * 100 -> 12312.34
		// (int)12312.34 -> 12312
		//12312 / 100.0 -> 123.12
	}
}