package days05;

import java.util.Scanner;

public class ControllOpIf07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String level; // 직급 저장할 변수
		double pay; //판매실적금액 변수
		System.out.print("직급 입력(과장/대리/사원): ");
		level = sc.nextLine();
		System.out.print("판매 실적금액 입력: ");
		pay = sc.nextInt();
		
		// 판매실적 과장50%, 대리25% 사원15% 활동비 합산하여 출력
		
		double r, total, actMoney;

		if(level.equals("과장")) { 
			r = 0.5; 
			actMoney = pay * r;
		} else if (level.compareTo("대리") ==0 ) {
			r = 0.25;
			actMoney = pay * r;
		} else if (level.equals("사원")) {
			r = 0.15;  
			actMoney = pay * r;
		} else {
			r = 0.0;
			actMoney = pay * r;
			System.out.println("잘 못된 직급입니다.");
		}
		total = pay + pay * r;
			System.out.println("활동비: " + (int)actMoney + ", 활동비를 포함한 총 지급액: " + (int)total );
			System.out.printf("활동비: %.1f 활동비를 포함한 총 지급액: %.1f", actMoney, total);
	}
}
