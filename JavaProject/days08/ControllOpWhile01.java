package days08;

import java.util.Scanner;

public class ControllOpWhile01 {

	public static void main(String[] args) {
		// for 명령을 이용한 일반 반복실행 : 10번 반복
		int i;
		for( i=1; i<=10; i++) {
			System.out.printf("for ");
		}
		System.out.println();
		// 위 for문을 while문으로 변경한 예
		i = 1;
		while(i<=10) {
			System.out.printf("while ");
			i++;
		}
		//다르게 사용가능한 for의 예
//		i=1;
//		for(;;) {
//			i++;
//			if( i>10) break;
//		}
		Scanner sc = new Scanner(System.in);
		System.err.println("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		int input = sc.nextInt();
		
		while (input!=3) { // 위에 input 생략하고 아래로 간다음, while(true) 로도 사용가능
			//필요한 명령들 ex) switch case 1:.....
			System.err.println("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			if(input==3) break;
			}
			System.out.println("프로그램 종료");
//	---------------------------위 아래 while, if 사용 조금 다르나 같은 결과--------------------------	
			while (true) { 
				System.err.println("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
				input = sc.nextInt();
				if(input==3) break;
				switch(input) {
					case 1:
					case 2:
						
				}
			}
				System.out.println("프로그램 종료");
		
		
		
		
	}
}
