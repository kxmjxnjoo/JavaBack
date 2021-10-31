package days06;

import java.util.Scanner;

public class ControllOpQuestionMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요: ");
		int score = sc.nextInt();
		//점수가 70점 이상 합격, 아니면 불합격
		
		String prnText;
//		if( score>= 70) prnText = "합격";
//		else prnText = "불합격";
		// 아래 물음표 연산은 if-else 두가지의 경우만 분류할 수 있음
		prnText = (score>=70)?"합격" : "불합격"; //true : false 
		System.out.println("입력한 점수는 " + prnText + "입니다.");
		
		System.out.printf("기본급을 입력하세요: ");
		int a = sc.nextInt();
		// 기본급 100만원 이상이면 50%, 미만이면 60%가산하여 지급액 출력
		double b1 = 0.5, b2 = 0.6;
		double total; //실수 곱하는데 total을 정수로 선언해서 오류났었음 주의*
		total = (a>=1000000) ? a+a*0.5 : a+a*0.6;	
		System.out.println("총 지급액: " + total);
		
		
		//코드1
		double per = ( a>= 100000) ? 0.5 : 0.6;
		System.out.println("총 지급액: " + (int)(a+a*per) );
		//코드2
		double b = ( a>= 1000000 )? a+a*0.5 : a+a*0.6;
		System.out.println("총 지급액: "+ (int)b);
		
	}
}
