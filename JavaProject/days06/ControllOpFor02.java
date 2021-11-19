package days06;

public class ControllOpFor02 {

	public static void main(String[] args) {
		// 1부터 100사이의 정수 출력
		int i;
		System.out.println("정수출력-------------------------------");
		for(i=1; i<=100; i++) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n반복 실행 후 i변수 값: %d\n", i);
		
		System.out.println("\n 1부터 100사이의 짝수 출력 #1------------------");
		for(i=1; i<=100; i++) {
			if(i%2==0) System.out.printf("%d ", i);
		}
		System.out.printf("\n 반복 실행 후 i변수 값: %d", i);
		System.out.println("\n 1부터 100사이의 짝수 출력 #2------------------");
		for(i=2; i<=100; i+=2 ) {
		System.out.printf("%d ", i); //2씩 출렸됐기 때문에 #1과 같이 100이나 마지막이 102가 됨
		}
		System.out.printf("\n 반복 실행 후 i변수 값: %d", i);
		
		System.out.println("\n 1부터 100사이의 홀수 출력 ##1------------------");
		for(i=1; i<=100; i++) {
			if(i%2==1)
			System.out.printf("%d ", i);
		}
		System.out.println("\n 1부터 100사이의 홀수 출력 ##2------------------");
		for(i=1; i<=100; i+=2) {
			System.out.printf("%d ", i);
		}

	}

}
