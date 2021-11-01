package days11;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력
		int a, b;
		double c;
		a = myInput(1); // 밑변을 입력받음 
		b = myInput(2); // 높이를 입력받음
		c = calcualte(a, b); //넓이를 계산
		prn(c); //넓이 출력
	}

	public static int myInput(int n) {
		if(n==1) System.out.printf("밑변 입력: "); // ()안에 int타입 하나 받았기 때문에 메소드 하나를 구분하여 사용
		else System.out.printf("높이 입력: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a; // return sc.nextIne();
	}
	
	public static double calcualte(int a, int b) {
		double c= a * b * 0.5;
		return c;
	}
	
	public static void prn(double c) {
		System.out.println("입력하신 삼각형의 넓이: " + c);
	}

}
