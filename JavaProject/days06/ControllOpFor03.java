package days06;

public class ControllOpFor03 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		int i;
		int sum=0;
		for(i=1; i<=10000; i++) {
			sum = sum + i;
		} //처음에 sum변수 값 선언 안 하고, 출력 문법 for{ }문 안에 넣어서 원하는대로 실행안됨
			System.out.println("덧셈 결과: " + sum); 
			//과정이 전부 출력되길 원하면 for{}문 안에 넣기
			// int 의 표현 범위 = -21억 ~ 21억임 만약 수가 넘을 시 에러는 나지 않지만 이상한 출력문 나옴

	}
}
