package days07;

import java.util.Scanner;

public class ControllOpFor10 {

	public static void main(String[] args) {
		int sum=0, i, num;
		Scanner sc = new Scanner(System.in);
		// 10개의 정수를 입력받아 그들의 합계를 출력하세요
		// 10개를 입력하는 중간에 종료를 원하면 0입력하여 종료, 최종합계 출력
		//num = sc.nextInt();
		for(i=0; i<10; i++) {
			System.out.printf("입력한 정수 %d : ", i+1);
			num = sc.nextInt();
			sum += num;
			if(num == 0) break;		
		}
		System.out.printf("\n입력한 정수들의 합계: %d", sum);
	}  // 순서를 잘 못 생각함  num과 System~ 문장 순서가 바뀌어있어서 원하는대로 출력안됐음
}
