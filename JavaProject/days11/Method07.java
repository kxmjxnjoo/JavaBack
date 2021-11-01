package days11;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int sq = squar(num); // return되어도 다른 메소드에 있는 변수이기 때문에 다른 변수를 선언해줘야한다 
		System.out.printf("%d의 제곱은 %d 입니다.\n", num, sq); // 여기있는 sq는 squar메소드가 아니라 main에 선언한 int 변수임
		
		int max_result = max(10, 34, 67);
		System.out.printf("가장 큰 숫자는? -> %d\n", max_result);
		
	}
	// main의 num -> squar.num		
	// squar.num * squar.num -> squar.sq
	// squar.sq -> mains.sq
	public static int squar(int num) {
		int sq = num * num;
		// System.out.printf("%d의 제곱은 %d 입니다.\n", num, sq);
		return sq;
	}
	
	public static int max(int a, int b, int c) {
		int result = 0;
		
		if(a>b)
			result = a;
		else
			result = b;
		if(result < c)
			result = c;

		return result;
	}
	
}