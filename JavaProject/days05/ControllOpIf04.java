package days05;

import java.util.Scanner;

public class ControllOpIf04 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		a = sc.nextInt();

		
		// 90이상 A학점, 80~89 B학점, 70~79 C학점 60~69 D학점, 60미만 F학점
		
		if(a>=90) System.out.println("A학점"); 
		else if (a>=80 && a<=89) System.out.println("B학점");
		else if (a>=70 && a<=79) System.out.println("C학점");
		else if (a>=60 && a<=69) System.out.println("D학점");
		else System.out.println("F학점");
		//잘못된 예------------------------------------------------------------------------------
		if(a<60) System.out.println("F학점"); 
		else if (a>=60) System.out.println("D학점");
		else if (a>=70) System.out.println("C학점");
		else if (a>=80) System.out.println("B학점");
		else System.out.println("A학점"); // 위 부터 실행되기 때문에 D학점에서 이미 조건 달성하여 출력되어버림
		//------------------------------------------------------------------------------
		if(a<60) System.out.println("F학점"); 
		else if (a<70) System.out.println("D학점");
		else if (a<80) System.out.println("C학점");
		else if (a<90) System.out.println("B학점");
		else System.out.println("A학점"); //미만으로 시작했으면 끝까지 미만으로 작성한다

	}

}
