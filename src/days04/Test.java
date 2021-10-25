package days04;

import javax.naming.spi.DirStateFactory.Result;

public class Test {

	public static void main(String[] args) {
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		int year1 = 2020, year2 = 2021;
		boolean result, result2;
		// 윤년의 조건 
		// 해당 년도가 4의 배수 이면서, 100의 배수가 아니거나, 400의 배수인 해

		result = (year1%4==0 && year1%100!=0 && year1%400==0); 
		System.out.printf("2020년이 윤년이면 true = %b\n", result);
		result2 = (result) || (year1%400==0);
		System.out.printf("2020년이 윤년이면 true = %b\n", result2);
		
	
		result = (year1%4==0) && (year1%100!=0) || (year1% 400==0) ;
		System.out.printf("2020년이 윤년이면 true = %b\n", result);
		
		result = (year1%4==0 || year1% 400==0 && year1% 100!=0) ;
		System.out.printf("2020년이 윤년이면 true = %b\n", result);
		
		
		if (year1%4==0 && year1%100!=0 || year1% 400==0) {
			System.out.println("2020년은 윤년입니다");
		} else { 
			System.out.println("2020년은 평년입니다");
			
		if (!(year2%4==0 && year2%100!=0 || year2% 400==0)) {
			System.out.println("2021년은 윤년입니다");
		} else { 
			System.out.println("2021년은 평년입니다");
			}
		}
	}
}
