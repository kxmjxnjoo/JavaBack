package days06;

import java.util.Scanner;

public class ControllOpFor04 {

	public static void main(String[] args) {
		int k, i;
		k = 5;
		i = 2;
		System.out.printf("%d x %d = %d\n", k,i,k*i);

		Scanner sc = new Scanner(System.in);
		int dan;
		int result;
		System.out.printf("출력할 단을 입력하세요: ");
		dan = sc.nextInt();
		// 입력한 숫자의 구구단을 출력하세요
		for(i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		// 활용하여 전체 구구단 출력해봄
		for(i=2; i<=9; i++) {
			System.out.println("---------" + i + "단 구구단---------");
			for(k=1; k<=9; k++) {
			System.out.println(i + " x " + k + " = " + (i*k));
			}
		}
		
	}

}
