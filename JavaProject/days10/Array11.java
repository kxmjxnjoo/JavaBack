package days10;

public class Array11 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[3][2];
		
		int[] a1 = {1,2,3,4,5};
		for(int k : a1) {
			System.out.printf(k + " ");
		}
		// for 문과 배열의 이름을 이용한 배열의 접근
		// 위와 같이 for명령 안에 배열의 요소 중 하나를 저장할 수 있는 변수를 선언하고
		// 클론(:)과 함께 1차원 배열의 이름을 쓰면 배열의 요소하나를 변수에 넣고
		// 반복실행 1회가 배열의 요소 갯수만큼 실행됨
		
		System.out.println();
		int[][] b = {{1,2},{3,4},{5,6}};
		// int[][] b = new int[3][2]; -> 값이 모두 0으로 초기화

		// 위 두개의 배열 선언은 각 구성요소 값들은 다르지만 행열의 갯수는 같음
		// 2차원 배열의 구조 
		// b[0] : {1,2}		b[1] : {3,4}		b[2] : {5,6}
		// b[0][0]:1 	b[0][1]:2
		// b[1][0]:3 	b[1][1]:4
		// b[2][0]:5 	b[2][1]:6
		for(int k : b[1]) {
			System.out.printf(k + " ");
		}
		// 2차원 배열의 요소 접근 - 2개의 인덱스 사용
		// 변수명[행의인덱스 - 0부터 시작][열의 인덱스 - 0부터 시작] = 값;
		// arr 2차원 배열의 3번째 행의 두번째 요소에 10을 입력
		arr[2][1] = 10;
		System.out.println(arr[2][1]);
		
		// 2차원 배열의 배열을 생성하면서 초기화하는 방법
		// 초기화 값을 설정하는 방법
		// { {1번쨰 행의 초기화 값}, {2번쨰 행의 초기화 값}...}
		// 2행 3열의 2차원 배열을 생성하면서
		// 1번쨰 행의 요소 값을 1,2,3으로 2번째 행의 요소 값을 4,5,6으로 지정
		int[][] arr3 = new int[][] {{1,2,3,},{4,5,6}};
		// 2행 3열 2차원 배열
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		int[][] arr4 = {{1,2},{4,5},{7,8}}; //3행 2열 2차원 배열
		System.out.println(arr4[0][1]);
		System.out.println(arr4[1][1]);
		
		// 2차원 배열 생성 후 2중 반복 실행문에 의한 값 저장과 출력
		int[][] a = new int[4][6];
		
		int k = 1;
		for(int i=0; i<a.length; i++ ) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = k++;
			}
		}
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=5; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
		
		int[] a2 = {1,2,3,4,5}; // 이 다 섯개의 변수를 저장할 변수선언, :
		for(int k3 : a2) {
			System.out.printf(k3 + " ");
		}
		// a = { {1,2,3,4,5}. {16,7,8,9,10}. {11,12,13,14,15} ...
		// a[0]: {1,2,3,4,5}. a[1]: {16,7,8,9,10}
		// 위와 같이 해도 되지만 아래가 조금 더 간단함, 그러나 이해하기 어려우면 위의 방법 써도 일단은 괜찮음
		System.out.println(); 
		for(int[] k1 : a ) { 
			// a배열의 주소가 저장될 배열변수(k1)선언하여 : 앞에 오게하고 a가 순차적으로 k1으로 감
			for(int k2 : k1) { 
			// ex) k1(a의 배열 저장됨): {1,2,3,4,5} k1: {16,7,8,9,10} 을 저장할 k2를 선언하여 저장함
				System.out.printf("k:%d\t ", k2);
			}
			System.out.println();
		}
	}
}
