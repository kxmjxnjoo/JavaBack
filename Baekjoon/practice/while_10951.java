package practice;

import java.util.Scanner;

public class while_10951 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}