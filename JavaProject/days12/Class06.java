package days12;

import java.util.Scanner;

class AccountWithPermission {
	private double balance;
	public void initBanance(int money) {balance = money;}
	
	public void withraw() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("출금 할 금액을 입력하세요 ");
		int money = Integer.parseInt(sc.nextLine());
		
		System.out.printf("비밀번호 네자리를 입력하세요 ");
		int pass = Integer.parseInt(sc.nextLine());
		
		if(pass!= 1234) {
			System.out.println("비밀번호가 맞지 않습니다");
			return;
		}
		// void 메소드의 return은 반환될 값 없이 사용되며
		// 메소드를 현위치에서 종료하라는 명령
		if(money > balance) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		balance -= money;
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n", balance);
		}
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("입급할 금액을 입력하세요 ");
		int money = Integer.parseInt(sc.nextLine());
		
		if(money <= 0) {
			System.out.println("입금액 오류. 관리자에게 문의하세요");
			return;
		}
		balance += money;
		System.out.printf("%d원, 입금이 완료되었습니다\n", money);
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n", balance);
	}
	public void display() {
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n", balance);
	}
}

public class Class06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectMenu;
		AccountWithPermission awp = new AccountWithPermission();
		awp.initBanance(50000); // 잔액 초기화
		
		System.out.printf("메뉴선택 : 1.입금   2.출금   3.잔액확인   4.종료 -> ");
		selectMenu = sc.nextInt();
		while(selectMenu!=4) {
			
			switch(selectMenu) {
			case 1:
				awp.deposit();
				break;
			case 2:
				awp.withraw();
				break;
			case 3:
				awp.display();
				break;
			}
			
			System.out.printf("메뉴선택 : 1.입금   2.출금   3.잔액확인   4.종료 -> ");
			selectMenu = sc.nextInt();
			
		}
		System.out.println("프로그램이 종료되었습니다");
	}

}
