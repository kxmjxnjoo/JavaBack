package src.Baekjoon;

import java.util.Scanner;

public class For_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int num1 = 0, num2 = 0;
		for(int i=1; i<=c; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			for(int b=1; b<=c; b++) {
			}
			System.out.printf("Case #%d: %d + %d = %d\n", i, num1, num2, num1+num2);  
		}
	}
}
