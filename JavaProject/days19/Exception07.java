package days19;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception07 {
	// 순수하게 숫자 만으로 이루어진 정수를 입력받는 while과 try-catch 를 제작하세요
    // sc.nextInt는 입력내용에 문자가 섞이면 InputMismatchException 에러가 발생함
    // 에러가 발생하면 입력 버퍼를 sc.next() 실행해서 비우고
    // 잘못입력했습니다 메세지를 출력 후 정상 입력까지 입력을 반복하는 코드를 작성
    // 문자를 입력받아 날짜로 변환하는 코드 참조
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while(true) {
			try {
				System.out.print("정수를 입력해주세요: ");
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("정수가 아닌 타입이 입력되었습니다. ");
				// 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
				sc.next(); // 입력 버퍼를 비움
			}
		}
	}
}