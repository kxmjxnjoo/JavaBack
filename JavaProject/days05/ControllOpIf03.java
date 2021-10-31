package days05;

import java.util.Scanner;

public class ControllOpIf03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
	int a = sc.nextInt();
		
	
		/* if( a>0 ) {
			System.out.println("입력한 정수는 양수입니다");
		}else {
			if( a<0 ) {
				System.out.println("입력한 정수는 음수입니다");
			}else {
				System.out.println("입력한 정수는 0입니다");	
			}
		*/
		if( a>0 ) {
			System.out.println("입력한 정수는 양수입니다");
		}else if( a<0 ) {
				System.out.println("입력한 정수는 음수입니다");
			}else {
				System.out.println("입력한 정수는 0입니다");	
			}
		// 위에서 ()안의 연산식으로 계산한 결과가 true일 경우 {}안의 명령이 실행됨
				
		// 중괄호 안의 명령이 한개라면 중괄호는 역시 생략가능
			if( a>0 ) System.out.println("입력한 정수는 양수입니다");
			else if( a<0 )	System.out.println("입력한 정수는 음수입니다");
			else System.out.println("입력한 정수는 0입니다");	
			
		
		
		int kor=70, eng=98, mat= 95;
		double avg = (kor+eng+mat)/3.0;
		
		// 평균 점수 80이상 합격, 70이상 79이하 대기순번, 나머지 불합격
		if(avg>=80) {
			System.out.println("합격");
		}else if ( (avg>=70) && (avg<=79) ) { 
//avg 79.5가 나올 경우 -> 불합격 나옴 잘 생각해서 a<80으로 작성했어야함
			System.out.println("대기순번");
		}else
			System.out.println("불합격");  // 내가 입력한 것 
		
		
		if(avg>=80) System.out.println("합격");
		else if ( (avg>=70) && (avg<80) ) System.out.println("대기순번"); //
		else	System.out.println("불합격"); // 강사님 입력
	 
	}
}