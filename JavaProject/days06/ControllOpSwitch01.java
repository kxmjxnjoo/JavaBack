package days06;

import java.util.Scanner;

public class ControllOpSwitch01 {

public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요: ");
		a = sc.nextInt();
		
//		if(a==1) System.out.println("1을 입력하셨습니다.");
//		else if(a==2) System.out.println("2을 입력하셨습니다.");
//		else if(a==3) System.out.println("3을 입력하셨습니다.");
//		else if(a==4) System.out.println("4을 입력하셨습니다.");
		
		// switch문은 if문과 비슷한 구조이지만 변수값의 단순 참조에 의해 실행될 명령 선택이 다름
		
		switch(a) { //괄호안의 a변수값 참조, 해당값이 있는 case에 있는 명령 실행
			case 1:
				System.out.println("1을 입력하셨습니다.");
				break;
			case 2:
				System.out.println("2을 입력하셨습니다.");
				break;
			case 3:
				 System.out.println("3을 입력하셨습니다.");
				 break;
			case 4:
				System.out.println("4을 입력하셨습니다.");
				break;
			case 5:
				System.out.println("5을 입력하셨습니다.");
		}
		

	}

}
