package days07;

import java.util.Scanner;

public class ControllOpFor09 {

	public static void main(String[] args) {
		// 정수 하나를 입력 받아서
		// 2부터 입력받은 정수까지 짝수의 합을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요:");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=2; i<=num; i+=2) {
				sum = sum + i;
		}
		System.out.println("2부터 " + num + "까지의 짝수들의 총 합: " + sum);
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) continue; //현재 반복 실행이 끝나기 전에 다음 반복으로 이동
				sum +=i;
		}
		System.out.println("2부터 " + num + "까지 짝수들의 총 합: " + sum); //내가 한 방법 조금 덜 간단한듯
	}
}
