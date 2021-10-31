package While;

import java.util.Scanner;

public class WhileAPlusB_5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A+B==0) break;
			System.out.println(A+B);
		}
	}
}