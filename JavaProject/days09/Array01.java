package days09;

public class Array01 {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		
		// 배열의 각 공간에 값을 대입하는 방법
		// 인덱스(첨자) 연산을 사용
		// 배열의 인덱스(첨자) : 시작은0 종료는 배열의 크기 -1
		// 배열변수명[인덱스(첨자)] = 값;
		a[0] = 10; // 배열의 1번째 요소에 값 대임 
		a[1] = 20; // 배열의 2번째 요소에 값 대입
		a[2] = 30; // 배열의 3번째 요소에 값 대입
		
		int a1, a2, a3;
	//	ai = 30; 에러
		
		int i = 0;
		b[i] = 30;
		i = 1;
		b[i] = 40;
		b[i+1] = 50;
		
		System.out.printf("a[0] = %d\n", a[0]);
		System.out.printf("a[1] = %d\n", a[1]);
		System.out.printf("a[2] = %d\n", a[2]);
		System.out.printf("b[0] = %d\n",	 b[0]);
		System.out.printf("b[1] = %d\n", b[1]);
		System.out.printf("b[2] = %d\n", b[2]);
	}
}
