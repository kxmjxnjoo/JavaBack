package days06;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k, sum = 0;
		System.out.printf("출력할 팩터리얼을 입력하세요: ");
		k = sc.nextInt();	 
//
//		for(fact=1; fact<k; fact++)  {
//			System.out.println(fact);
//				sum *=fact;
//			for(i=k; i<k; i++) {
//				sum = sum*i;
//			}
//		} // 내가 작성한 코드 i를 이용한 for문은 맞았으나 sum변수와 fact를 for문으로 따로 할 이유가 없었음
		// 팩터리얼을 몰라서 실수했을 수도 있음.. 수학 공부 필요할까..
		
		//
		System.out.printf("%d!= ", k);
		for(i=1; i<k; i++) {
			System.out.printf("%dx", i);
			fact = fact * i;			
		}
		System.out.printf("%d = %d", k, fact);	
		// 6을 입력했다면 6! = 1x2x3x4x5x6 = 720
	}
}
