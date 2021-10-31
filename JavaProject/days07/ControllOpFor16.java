package days07;

import java.util.Scanner;

public class ControllOpFor16 {

	public static void main(String[] args) {
		// 1부터 100사이의 소수(prime number)를 출력
		// 소수(prime number) :1과 자기 자신의 숫자로만 나누어 떨어지는 수
		// 방법은 숫자가 소수인지 알아보기 위해..1 부터 자기자신 사이의 모든 숫자로 나눠보고
		// 나누어 떨어진 횟수가 2회면 소수로 간주, 아니면 다음 숫자(다음 반복) 넘어감
		// 이중 반복문이 사용되며 중간에 if문도 사용됨
		// cnt 변수생성하여, 나눠 떨어질 때 마다 cnt++ 연산하고 값이 2일 떄 소수인걸로 판단
//		 1 1부터 100까지 매번 판단하는 것이 어렵다면 숫자 하나를 입력받아
//		 그 숫자가 소수인지 아닌지 판단하여 출력해보고
//		 대상을 1부터 100으로 늘리는 방식을 이용하면 도움될 수 있음
			int i, cnt=0;
			for(i = 1; i<=100; i++) {
				cnt = 0;
				for(int a=1; a<=i; a++) {
						if(i%a==0) cnt++; 
				}
				if (cnt ==2) System.out.printf("%d ", i);
					}    // 강사님 답안
			
//			for(i = 1; i<=100; i++) {
//				cnt = 0;
//				for(int a=2; 2<=i-1; a++) {
//					if(i%a ==0) cnt++;
//				}
//				if(cnt ==0) System.out.printf("%d ", i);
//			}
			//  강사님 답안22
//  ----------------- 내가 작성한 코드 ----------------------
			
//		for( i = 1; i<=100; i++) {
//			for(int a=1; a<=i; a++) {
//					if(i%a!=0) 
//						if(i%a==0) System.out.println(i);
//						else 
//				}
//			}
		
// ----------------- 숫자 하나 입력받아 소수인지 아닌지 판단하는 코드 ----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("소수인지 판단 할 숫자를 입력하세요: ");
//		int num = sc.nextInt();
//		int i = 0;
//		for( i=1; i<=num; i++) {
//			if(num % i ==0 ) cnt++;
//		}
//		if(cnt==2) { 
//			System.out.println("입력한 정수는 소수입니다."); 
//		} else { System.out.println("입력한 정수는 소수가 아닙니다");
//		}
	}
}
