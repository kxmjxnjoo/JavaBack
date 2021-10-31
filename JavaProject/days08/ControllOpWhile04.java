package days08;

import java.util.Scanner;

public class ControllOpWhile04 {

	public static void main(String[] args) {
		// 사용자에게서 단을 입력 받아 구구단 출력
		// 사용자가 0을 입력할 때 까지 출력할 단을 연이어 입력받고 구구단 출력
		// while문 사용  입력-출력-입력-출력
		int g, i;
		Scanner sc = new Scanner(System.in);
		System.out.printf("입력할 구구단의 단을 입력하세요: ");
		g = sc.nextInt();
		
		while(g!=0) {
			for(i=1; i<=9; i++) // 입력한 단의 구구단 출력
			System.out.printf("%d x %d = %d\n", g, i, g*i);
			// 다음 출력할 구구단의 단 입력 
			System.out.printf("출력할 구구단의 단 입력(종료-0) : ");
			g = sc.nextInt();
		}
		System.out.println("프로그램 종료");
	}

}
