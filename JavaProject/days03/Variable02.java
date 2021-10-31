package days03;

import java.util.Scanner;
//Scanner를 사용하기 위한 util 패키지 (import 단축키 : Ctrl + Shift + o)

public class Variable02 {

	public static void main(String[] args) {
		
		int num1, num2;
		int result1; // 덧셈, 뺼셈, 곱셈의 결과를 저장 할 변수 
		double result2; //나눗셈의 결과를 저장 할 변수
		
		Scanner sc = new Scanner(System.in); //화면 입력을 위한 준비코드
		System.out.println("첫 번째 정수를 입력하세요: ");
		// 화면 입력을 위해서는 위 코드가 화면입력 동작보다 위쪽에 반드시 쓰여야 합니다
		num1 = sc.nextInt(); //화면으로 부터 정수를 입력받아 num1변수에 저장
		// sc.nextInt() -> 사용자에게서 입력이 있을 때 까지 무한정 대기함 
		
		System.out.println("입력한 정수는 " + num1 + "입니다.");

		System.out.println("두 번째 정수를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.println("입력한 정수는 " + num2 + "입니다.");
		
		result1 = num1 + num2; 
		System.out.printf("%d + %d = %d\n", num1, num2, result1);
		result1 = num1 - num2;
		System.out.printf("%d - %d = %d\n", num1, num2, result1);
		result1 = num1 * num2;
		System.out.printf("%d * %d = %d\n", num1, num2, result1);
		result2 = num1 / (double)num2;
		System.out.printf("%d / %d = %.2f\n ", num1, num2, result2);
	}
	
}