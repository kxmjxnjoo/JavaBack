package days04;

import java.io.PrintStream;
import java.security.KeyStore.TrustedCertificateEntry;

public class Operator04 {

	public static void main(String[] args) {
		// 논리연산자 &&(AND), ||(OR), !(NOT) 
		// 다수개의 관계(비교) 연산식 결과를 조합하여 하나의 boolean 값을 결과로 얻는 연산
		
		// 피연산자 : boolean, 연산의 결과 : boolean
		
		int a = 80;
		boolean b = true && false;
		boolean b1 = a>70;
		boolean b2 = a<100;
		b = b1 && b2;
		
		// a변수의 값이 70보다 크고 100보다 작으면 true, 아니면 false 출력
		b = (70 < a) && (a < 100);  
		System.out.println("70 < a 이면서 a < 100: " + b);
		
		a = 30;		
		// a변수의 값이 70보다 크거나 40보다 작으면 true, 아니면 false 출력
		b = (70 < a) || (a < 40);  
		System.out.println("70 < a 이면서 a < 40: " + b);
		
		// AND 연산자 (&&)
		// 좌항과 우항의 관계(비교)식 결과 boolean 값이 모두 true인 경우 true가 
		// 좌항과 우항 중 하나라도 false인 경우 false가 결과값
		// 좌항과 비교연산 결과가 false인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F && F = %b\n", false && false);
		System.out.printf("T && F = %b\n", true && false);
		System.out.printf("F && T = %b\n", false && true);
		System.out.printf("T && T = %b\n", true && true);
		
		// OR 연산자 (||)
		// 좌항과 관계식 결과 또는 boolean값이 하나라도 true인 경우 true가 결과
		// 좌항 우항 모두 false 영우 false가 결과
		// 좌항의 결과가 true인 경우 우항의 식을 비교하지 않음
		System.out.printf("F || F = %b\n", false && false);
		System.out.printf("T || F = %b\n", true && false);
		System.out.printf("F || T = %b\n", false && true);
		System.out.printf("T || T = %b\n", true && true);
		
		// NOT 연산자 (!)
		// 단항연산자(피연산자 1개임)
		// 관계식의 결과를 반대값으로 결과를 냄 true -> false, false -> true
		System.out.printf("Not-%b = %b\n", false, !false);
		System.out.printf("Not-%b = %b\n", true, !true);
		
		// 점수가 80점 이상이면서 90점 이하이면 true, 아니면 false 출력
		int number = 80;  // (이면서, 그리고, ~이고)
		boolean result = (number >= 80) && (number <= 90);
		// result = 80 <= number <= 90 X 오류
		System.out.printf("result = %b\n", result);
		
		// 점수가 100이상이거나 50미만 이면 true 아니면 false (이거나,또는)
		number = 150;
		result = (number>=100) || (number<50);
		// result= 100<= number <50 오류
		System.out.printf("result = %b\n", result);
		
		System.out.println("----------------------------------------");
		int kor = 35, eng = 98, mat=95;
		double avg;
		// 평균이 80이상이면서 영어 점수가 75점 이상이면 true 아니면 false 출력
		avg = (kor + eng + mat)/3.0;
		
		result = (eng>=75) && (avg>=80);
		System.out.printf("result = %b\n", result);
		
		// 국어: 50이상, 영어:60이상, 수학:70이상이면 true 아니면 false 출력
		result = (kor>=50) && (eng>=60) && (mat>=70);
		System.out.printf("result = %b\n", result);
		
		System.out.println();
		// 세과목 중 한 과목이라도 40미만이면 true, 모두 40이상 false
		result = (kor<40) || (eng<40) || (mat<40);
		System.out.printf("result = %b\n", result);
		result = !( (kor>=40) && (eng>=40) && (mat>=40) ); 
		System.out.printf("result = %b\n", result);
		
		// 평균 60이상 모든 과목 40이상 true, 아니면 false
		result = (avg>=60) && (kor>=40) && (eng>=40) && (mat>=40);
		System.out.printf("result = %b\n", result);
		
		// 국어점수가 짝수이면 true, 홀수이면 false
		int re = kor % 2; 
		result = kor % 2 == 0;
		System.out.printf("result = %b\n", result);
		
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		int year1 = 2020;
		int year2 = 2021;
		// 윤년의 조건 
		// 해당 년도가 4의 배수 이면서, 100의 배수가 아니거나, 400의 배수인 해
		result = (year1%4==0 && year1%100!=0 || year1% 400==0) ;
		System.out.println("2020년은 윤년이다: " + result);
		result = (year2%4==0 && year2%100!=0 || year2% 400==0) ;
		System.out.println("2021년은 윤년이다: " + result);

	
	}

}