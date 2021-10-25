package days05;

import java.util.Scanner;

public class ControllOpIf01 {

	public static void main(String[] args) {
		// 사용자로부터 정수 하나를 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		int b = a % 2;
		//boolean result a%2 == 0;
		//System.out.println("입력한 정수는 짝수입니까: " + result);

		//관계(비교) 연산의 결과로 해당 명령 실행여부를 결정하는 명령 -> if
		
		if(a%2==0) {
			System.out.println("입력한 정수는 짝수 입니다.");
		} //()안의 값이 true이면 {}안의 명령을 실행 false이면 실행하지 않음
		if(a%2!=0) {
			System.out.println("입력한 정수는 홀수 입니다.");
			
	//----------------------------------------------------------------------
			
		boolean result = a%2==0;
		if(result) System.out.println("입력한 정수는 짝수입니다."); 
		if(a%2==0) System.out.println("입력한 정수는 짝수입니다.");
		if(result==true) System.out.println("입력한 정수는 짝수입니다.");
		if(b ==0) System.out.println("입력한 정수는 짝수입니다.");
		// 짝수인 경우 위 네가지 표현으로 출력가능
		if(!result ) System.out.println("입력한 정수는 홀수 입니다.");
		//result에 false가 저장되어 있어야 !에 의해 true로 변환되어 if문이 true를 인식해서 해당 명령 실행됨
		if(a%2!=0) System.out.println("입력한 정수는 홀수 입니다.");
		if(result==false) System.out.println("입력한 정수는 홀수 입니다.");
		if(b!=0) System.out.println("입력한 정수는 홀수 입니다.");
		// 홀수의 경우 위 네가지 표현으로 출력가능
			
			
		}
	}
}
