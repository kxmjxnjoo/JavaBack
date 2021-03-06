package days10;

public class Array14 {

	public static void main(String[] args) {
		// 1차원 배열의 복사
		int[] a = {1,2,3,4,5};
		int[] b;
		
		b = a;  // 참조변수의 주소 복사
		for(int k: a) 
			System.out.printf("%d ", k);
		System.out.println();
		for(int k: b)
			System.out.printf("%d ", k);
		System.out.println();
		
		a[2] = 100;
		
		for(int k : a) 
			System.out.printf("%d ", k);
		System.out.println();
		for(int k: b)
			System.out.printf("%d ", k);
		System.out.println();
		// 레퍼런스 변수간의 값의 복사로는 배열의 복사까지 이루어지지 않음
		// 위의 동작 b=a; 는 a가 갖고 있는 참조값(주소)를 b변수에 복사한 것 이므로
		// 배열공간은 하나, 그 배열 주소를 저장한 변수는 두개로 설정한 것 과 같음
		// 따라서 a[2]값 변경은 b[2]값 변경과 같다
		
		// 1. 배열복사의 방법#1 : 새로운 공간을 new로 만들고 각 요소를 일일이 복사
		b = new int[5];
		for(int i=0; i<a.length; i++) b[i] = a[i];
		a[4] = 300;
		for(int k: a)
			System.out.printf("%d ", k);
		System.out.println();
		for(int k: b)
			System.out.printf("%d ", k);
		System.out.println();
		
		// 2. 배열복사의 방법#2 : clone 메소드를 사용한 배열 복사 배열명.clone()
		// 해당 배열변수가 참조하고 있는 장소의 배열을 새로운 공간에 복제
		// c는 a 배열이 복제된 배열을 참조하는 변수
		int[] c = a.clone(); // 힙 영역에 배열의 복사본을 새로 만들고 그 주소를 전달
		a[1] = 200;
		for(int k: a)
			System.out.printf("%d ", k);

		for(int k: c)
			System.out.printf("%d ", k);
		System.out.println();
		
		// 2차원 배열의 복사
		// 2차원 배열(다차원배열)은 clone 메소드의 결과로 실제 일차원 배열 관리하는 참조변수들의 배열만 복사
		int[][] d = {{1,2,3},{4,5,6}};
		int[][] e = d.clone();
		d[1][0] = 500;
		for( int i=0; i<e.length; i++) {
			for( int j=0; j<e[i].length; j++) {
				System.out.printf("%d ", e[i][j]);
				System.out.println();
			}
		}
		// 2차원 배열은 새로 공간 생성 후 각각의 값을 다시 복사해야 완벽한 복사가 실행됨
		int[][] f = new int[d.length][d[0].length]; // 각 배열의 길이를 모른다? .length 사용
		for( int i=0; i<d.length; i++) {
			for( int j=0; j<d[i].length; j++) {
				f[i][j] = d[i][j];
			}
		}
		d[0][2]=1000;
		for( int i=0; i<f.length; i++) {
			for( int j=0; j<f[i].length; j++) {
				System.out.printf("%d ", f[i][j]);
			}
			System.out.println();
		}
		
	}
}
