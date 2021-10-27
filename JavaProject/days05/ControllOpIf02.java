package days05;

import java.util.Scanner;

public class ControllOpIf02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		int b = a % 2;
		
		sc.close();

		//if( b==0 ) {
		//	System.out.println("입력한 정수는 짝수(even)입니다.");
		//}
		//if( b==1 ) {
		//	System.out.println("입력한 정수는 홀수(odd)입니다.");
		//}
		// 위의 두 if문은 상호간 독립적입니다.
		
		// 아래는 위 두개의 if를 하나로 합쳐서 둘 중 하나는 선택되어 실행시킴
		if( b==0 ) {
			System.out.println("입력한 정수는 짝수(even)입니다.");
		} else {
			System.out.println("입력한 정수는 홀수(odd)입니다.");
		}
		
		int kor=70, eng=98, mat=95;
		double avg = (kor+eng+mat)/3.0;
		// 평균이 80이사이라면 합격이라고 출력
		System.out.println("단일 if문 실행:");
		if( avg >= 80.0) { 
			System.out.println("평균 80이상 합격");
		}
		// 평균 80이상이면 합격, 아니면 불합격 출력
		System.out.println("단일 if~else문 실행:");
		if( avg >= 80.0) {
			System.out.println("평균 80이상 합격");
		} else {
			System.out.println("평균 80미만 불합격");
		}
		
	
		// 평균 60 이상이거나 영어점수가 80 이상이라면 합격, 아니면 불합
		if (avg>=60 || eng>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 평균 60이상이면서 모든 과목 40이상 합격
		if ( (avg>=60) && (kor>=40) && (eng>=40) && (mat>=40) ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 평균 60이상이거나 모든 과목 50이상 합격
		if ( (avg>=60) || (kor>=50) && (eng>=50) && (mat >=50) ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
