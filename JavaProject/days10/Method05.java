package days10;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		// 아래 실행이 정상 동작하도록 해당 메소드를 제작하세요
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 단을 입력하세요 : ");
		int k = sc.nextInt();
		gugudan(k);
	}
	public static void gugudan(int k) {
	for(int i=1; i<=9; i++) {
		System.out.printf("%d x %d = %d\n", k, i, i*k);
		}

	
	}
}
