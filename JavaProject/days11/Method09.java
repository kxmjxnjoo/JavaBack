package days11;

import java.util.Scanner;

public class Method09 {

	public static void main(String[] args) {
		int year;
		boolean a;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		year = sc.nextInt();
		// 년도를 전달인수로 전달하여 윤년 true, 아니면 false 리턴
		a = yoon(year);
		prn(a); //변수 a값을 전달받아 윤년 또는 평년을 출력하는 메소드
	}
	public static boolean yoon(int year) {
		//boolean a;
		if(year%4==0 && year%100!=0 || year%400==0) {
			return true;//a = true; 주석처리한 건 내가 입력했던 코드
		} else  
		return false;
	}	
	public static void prn(boolean a) {
		//System.out.printf("입력한 년도는 윤년이다 : %b", a);
		// true false라고 출력되는 것보다 강사님 코드가 출력이 더 명확하다
		 if(a) System.out.println("윤년입니다");
		 else System.out.println("평년입니다");
	}

}
