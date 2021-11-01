package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.printf("가위(1), 바위(2), 보(3) 중 선택 - 종료(0) : ");
		int user = sc.nextInt();
		int com, i=0;

//		while(i=3) {
//			com = rd.nextInt();
//			com = com%10*-1;
//			System.out.println(com);
//			if(com>user) {
//				System.out.println("졌습니다");
//				i++;
//				System.out.printf("가위(1), 바위(2), 보(3) 중 선택 - 종료(0)\n");
//				user = sc.nextInt();
//				if(user==0) break;
//			}
//			System.out.println("프로그램 종료");
//		}
		// 컴퓨터에 난수로 발생한 숫자(1,2,3)를 저장, 사용자가 입력한 숫자와 비교해서 결과 출력
		while(user!=0) {
			com = rd.nextInt();
			if(com<0) com *= -1;
			com = com%3 +1;
			if(user!=1 && user!=2 && user!=3) {
				System.out.println("잘못된 입력입니다, 다시 시도해주세요.");
				break; }
					
				 if(com==1) {
					System.out.printf("컴퓨터 : %s", "가위");
				} if(com==2) {
					System.out.printf("컴퓨터 : %s", "바위");
				} else System.out.printf("컴퓨터 : %s", "보");
				
				if(user==1) {
					System.out.printf("\t\t나 : %s", "가위");
				} else if(user==2) {
					System.out.printf("\t\t나 : %s", "바위");
				}	else 
					System.out.printf("\t\t나: %s", "보");
				
				if(com == user) {
					System.out.println("\n무승부 입니다.");
				}else if( com==1 && user == 2) {
					System.out.println("\n이겼습니다.");
				} else if( com==2 && user == 3) {
					System.out.println("\n이겼습니다.");
				} else if( com==3 && user == 1) {
					System.out.println("\n이겼습니다.");
				}
				else 
					System.out.println("\n졌습니다.");
				
				// System.out.printf("\n계속하시겠습니까?( y(1)/n(0) )");
				// if(sc.nextInt() ==0) break;
				
				System.out.printf("\n가위(1), 바위(2), 보(3) 중 선택 - 종료(0) : ");
				user = sc.nextInt();
				//	if(user==0) {
					//	break;
				//	}   //while() user==0이면 종료로 if문이 필수 아님
		}
			System.out.println("프로그램이 종료됩니다");
		
	}
}
