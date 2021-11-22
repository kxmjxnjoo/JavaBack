package days03;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in); //System.in -> 키보드에서 받겠다
	
	int num1, num2;
	double result;
	
	System.out.println("삼각형의 밑변을 입력하세요: ");
	num1 = sc.nextInt();
	System.out.println("삼각형의 높이를 입력하세요: ");
	num2 = sc.nextInt();
	
	result = num1 * num2 * 0.5;
	System.out.printf("입력한 삼각형의 넓이는 %.1f입니다.", result);

	
	/* 위: 선생님 아래: 본인 작성 - 변수 선언과 동시에 값을 줬음. 위 코드가 더 정돈된 느낌
	 *  
	 * Scanner sc = new Scanner(System.in); //System.in -> 키보드에서 받겠다
	 * System.out.println("삼각형의 밑변을 입력하세요: "); int num1 = sc.nextInt();
	 * System.out.println("삼각형의 높이를 입력하세요: "); int num2 = sc.nextInt(); double
	 * result1 = num1 * num2 * 0.5; System.out.printf("입력한 삼각형의 넓이는 %.1f입니다.",
	 * result1);
	 */
	
	}

}