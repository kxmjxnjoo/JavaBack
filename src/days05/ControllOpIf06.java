package days05;

import java.util.Scanner;

public class ControllOpIf06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; //기본급 저장 변수
		double b; //총 지급액 저장 변수
		System.out.print("기본급을 입력하세요: ");
		a = sc.nextInt();
		
		if(a>=1000000) {	
			b = a + (a*0.5);  // or a * 1.5도 같은 결과
			System.out.println("총 지급액은: " + (int)b + "원");
		} else if(a<1000000) {
			b = a + (a*0.6);
			System.out.println("총 지급액은: " + (int)b + "원");
		} //내가 한 방식 (이런식으로 하면 퍼센트가 바뀔 때 마다 기입해야함)
		
		// 기본급이 백만원 이상이면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총 지급액 출력
		
		// 기본급 백만원이상 -> 총 지급액의 50% 보너스
		// 기본급 백만원미만 -> 총 지급액의 60% 보너스
		double bonus, b1 = 0;
		if(a>=1000000) 	bonus = b1 * 0.5;	
		else bonus = b1 *0.6;
		
		double r;
		if(a>=1000000) r = 0.5;
		else r = 0.6;
			b1 = a * r;
			bonus = b1 * r;
		System.out.println("총 지급액: " + (int)b1 + "원"); // 강사님이 한 방법
		System.out.println("추가보너스: " + (int)bonus + "원");
	}
}
