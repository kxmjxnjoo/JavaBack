package Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int A=0, B=2;
		
		//80분 투입 1점-> 85분 추가 1점
		// 
		int end = 90-time;
		if(time<90) { 
			System.out.println(A + end/5);
		} else 
		System.out.println(A);
		
	}
}
