package days06;

import java.util.Scanner;

public class ControllOpFor05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, a, b;
		System.out.printf("첫 번째 정수 입력: ");
		a = sc.nextInt();
		System.out.printf("두 번째 정수 입력: ");
		b = sc.nextInt();
//		for(i=a; i>=b; i--) {
//			System.out.println(i);
//			if(a>b) 
//				for(i=a; i<=b; i++) {
//					System.out.println(i);
//				}
//			}  // 내가 작성한 것, 큰 숫자에서 역순으로 밖에 안됨..
				// if문으로 먼저 조건 확인해야해서 처음 쓰고 안에 for를 넣었어야함. -- ++ 집착금지
		if(a<b) {
				for(i=a; i<=b; i++) 
				System.out.printf("%d ", i);
		} else { 
				for(i=b; i<=a; i++) 
				System.out.printf("%d ", i); //a가 작으면 a부터 b까지/ b가 작으면 b부터 a까지... 
			}
		// 입력받은 숫자 중 작은 숫자부터 큰 숫자까지 정수를 출력하세요
		// 8과 3을 입력했다면 3 4 5 6 7 8		
		System.out.println();
		int min, max;
		if(a<b) {
			min =a; max =b;
		}else {
			min =b; max =a;
		}
		for(i=min; i<=max; i++) 
			System.out.printf("%d ", i); //위와 같은 결과 출력 다른 코드
	}

}
