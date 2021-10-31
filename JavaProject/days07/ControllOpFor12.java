package days07;

import java.util.Scanner;

public class ControllOpFor12 {

	public static void main(String[] args) {
		// 입력받은 두개의 공약수를 출력
		// 1부터 small 까지의 숫자로 두개의 숫자를 동시에 나눴을 때 나눠지는 숫자 -> 공약수
		// 12 36을 입력한 경우 1 2 3 4 6 12
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, k = 0, small;
		System.out.printf("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두 번째 정수 입력 : ");
		num2 = sc.nextInt();		
		
	
//		for(i=1; i<=num2; i++) {
//			if( (num1%i==0) && (num2%i==0) )		
//				System.out.println("두 정수의 공약 수 : " + i);
//			k = i;
//		} 
//		System.out.printf("\n최대 공약수 : %d \n", k);	
//		System.out.println("-----------------------");  내가 작성한 답안
		
		if(num1<num2) {
			small = num1;
		} else {
			small =num2;
		}
		for(i=1; i<=small; i++) {
			if( (num1%i==0) && (num2%i==0) ) {
				System.out.println("두 정수의 공약 수 : " + i);
			}
		} // 강사님 답안 small 변수로 더 작을 숫자 확인 후 코드 작성
		// 1부터 small 까지의 숫자로 두개의 숫자를 동시에 나눴을 때 나눠지는 숫자 -> 공약수
		// 그 중 가장 큰 숫자가 최대공약 수
		
		for(i=1; i<=small; i++) {
			if( (num1%i==0) && (num2%i==0) ) {
				System.out.println("두 정수의 공약 수 : " + i);
				k = i;
			}
		}
			System.out.printf("\n최대 공약수 : %d ", k);	

	}
}
