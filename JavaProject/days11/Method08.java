package days11;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		int ban;
		double n ,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반 지름을 입력하세요: ");
		ban = sc.nextInt();
		n = calculate1(ban); // 원의 넓이를 구하는 
		d = calculate2(ban); // 원의 둘레를 구하는
		prn(n,d); // 넓이와 둘레를 출력하는
	}
	public static double calculate1 (int b) {
		//double n;
		//n = b * b * 3.141592;
		//return n;
		return b*b*3.141592; // 이렇게 간단하게 작성할 수도 있음
	}
	public static double calculate2 (int b) {
		double d;
		d = 2 * b * b * 3.14;
		return d;
	}
	public static void prn(double n, double d) {
		System.out.printf("입력한 원의 넓이: %.2f\n", n);
		System.out.printf("입력한 원의 둘레: %.2f\n", d);
	}
 
	
}
