package days08;

import java.util.Scanner;

public class ControllOpWhile03 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 정수의 팩터리얼 출력
		// while문 사용 6! = 1x2x3x4x5x6 = 720
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n팩터리얼을 계산할 정수 입력: ");
		int n = sc.nextInt();
//		System.out.printf("%d!= ", num);	
		int i=1, fact=1;
//		
//		while(i<=num) {
//			fact = fact * i;
//			i++;
//			System.out.printf("%d!= ", num);	
//			if(i==num) break;
//		}
//		
		
		while(i<n) {
			System.out.printf("%dx", i);
			fact = fact*1;
			i++;
		}
		System.out.printf("%d = %d\n", n, fact*n);
		
		
		System.out.println("//----------------------------------");;
		fact = 1;
		System.out.printf("%d!= ", n);
		while(i<n) {
			System.out.printf("%dx", i);
			fact = fact * 1;
			i--;
		}
		System.out.printf("%d = %d\n", n, fact*n);
		
	}

}
