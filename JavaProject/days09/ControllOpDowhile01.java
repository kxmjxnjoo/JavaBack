package days09;

import java.util.Scanner;

public class ControllOpDowhile01 {

	public static void main(String[] args) {
		int i;
		for(i=11; i<=10; i++) //()의 값이 false 이기 때문에 실행안됨
			System.out.printf("%d ", i); 
		System.out.println("\nfor 반복 종류 후 i 변수 값 : " + i);
		System.out.println("--------------------------------------");
		i=i;
		while(i<=10); { // ;클론 중간에 넣으면 그 뒤에 관련 실행안함
			i++;
			System.out.printf("%d ", i); 
		}
		System.out.println("\nwhile 반복 종류 후 i 변수 값 : " + i);
		System.out.println("--------------------------------------");
		
		i=11;
		do {
			System.out.printf("%d ", i);
			i++;
		} while(i<=10);  // do while은 while에 ;을 꼭 기입해야함 -> 이미 do { }에서 명령이 나왔기 때문
		System.out.println("\ndo-while 반복 종류 후 i 변수 값 : " + i);	
		
		System.out.println("--------------------------------------");
		// do while 반복문 활용 사용자가 100을 입력할 때 까지 반복해서 입력받으세요
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.print("정수를 입력:");
			input = sc.nextInt();
		} while(input != 100);
		System.out.println("프로그램 종료");
		
		
		
	}

}
