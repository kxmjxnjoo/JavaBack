package days05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		int b = a % 2;

		if( b==0 ) {
			System.out.println("입력한 정수는 짝수(even)입니다.");
		}
		if( b==1 ) {
			System.out.println("입력한 정수는 홀수(odd)입니다.");
		}
		
		// 위의 두 if문은 상호간 독립적입니다.
	}
}
