package days09;

import java.util.Scanner;

public class Array08 {

	public static void main(String[] args) {
		// 점수를 입력받아서 해당 학점을 출력합니다
		// if문 이용하지 않습니다
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		
		// 아래 배열을 이용해주세요
		// 힌트 98 / 10 -> 
		char[] grade = {'F','F','F','F','F','F','D','C','B','A','A'};

		if(score==0) System.out.println("학점:" + grade[0]);
			System.out.println("학점: " + grade[score/10]);
		
		
		
		
	}
}
