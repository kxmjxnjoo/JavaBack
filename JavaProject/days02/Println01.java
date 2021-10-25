package days02;

public class Println01 {

	public static void main(String[] args) {
		// println()은 printf("\n") 와 같은 동작을 함
		// println은 \n 없이도 출력 후 개행
		// System.out.println("\n") <- 두 줄 개행
		
		// printf와 같이 format 양식 글자 (%d %f등..)를 사용하지 않고 출력이 간단함
		
		System.out.println(10); //10출력
		System.out.println(12.123); //12.123출력
		System.out.println("Java Programming"); //문자 출력
		
		System.out.println( 10 + ", " + 12.123 + ", " + "Java Programming" ); 
		// + 연산자는 문자와 다른 형식의 데이터가 연산되면 이어붙이게됨(숫자끼리는 산술연산됨)
		
		// 문자와 숫자가 다른 점
		// 1. 따옴표안에 있느냐에 따라 구분 
		// ex1) 123은 백이십삼이라고 읽지만 "123"은 일이삼
		// ex2) 987은 1234보다 작지만 "987"은 "1234" 보다 크다고 표현함
		// - 문자들간의 비교는 첫 글자부터 하나씩 같은 위치의 글자와 비교함
		// - 첫 글자에서 크기가 결정되면 다음은 비교하지 않음
		// - 두번째 글자를 비교하는 경우는 첫번째 글자가 동일할 경우에 한함
		// - 두번쨰 글자도 동일하다면 세번째 글자 비교
		// - 사전에서 먼저 나오는 글자를 작고 뒤에 나오는 글자를 크다라고 함
	}
}