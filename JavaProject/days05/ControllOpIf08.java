package days05;

import java.util.Scanner;

public class ControllOpIf08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double avg;
		System.out.print("국어점수: ");
		kor = sc.nextInt();
		System.out.print("영어점수: ");
		eng = sc.nextInt();
		System.out.print("수학점수: ");
		mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot/3.0;
		
		// 평균 60이상, 모든 과목 40미만 없으면 합격
		// 그렇지 않으면 불합격 출력하되
		// 해당되는 불합격사유( 평균 미달, 국어 과락, 영어 과락, 수학과락)를 모두 함께 출력하세요
		
		
	/*	if( ave>=60 && kor>=40 && eng>=40 && mat>=40)
			System.out.println("합격");
		else if( ave<60 && kor>=40 && eng>=40 && mat>=40 )
			System.out.println("불합격\n평균미달");
		else if( ave>=60 && kor<40 && eng>=40 && mat>=40 )
			System.out.println("불합격\n국어과락");
		else if( ave>=60 && kor>=40 && eng<40 && mat>=40 )
			System.out.println("불합격\n영어과락");
		else if( ave>=60 && kor>=40 && eng>=40 && mat<40 )
			System.out.println("불합격\n수학과락");
		else if( ave<60 && kor<40 && eng>=40 && mat>=40 )
			System.out.println("불합격\n평균미달\n국어과락");
		.... 경우의 수 약 30개
		//내가 작성한 것 경우의 수가 너무 많아서 안됨 */
			
			if( (avg>=60) && (kor>=40) && (eng>=40) && (mat>=40) ) 
				System.out.println("합격");
			else {
				System.out.println("불합격");
				if(avg<60) System.out.println("평균미달");
				if(kor<40) System.out.println("국어과락");
				if(eng<40) System.out.println("영어과락");
				if(mat<40) System.out.println("수학과락"); 
		//if와 else는 세트가 아님 if문 단독으로 실행되는 것 기억
				
		}
	}
}
