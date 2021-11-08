package days16;

public class ArrayMethodTest {

	public static void main(String[] args) {
		int[][] a = new int[9][5];
		// 그림과 같이 배열을 구성하고 값을 대입
		input(a); 
		// 그림과 같이 출력
		prn(a);
	}
	public static void input(int[][] a) {
//		int count = 1;
//		
//		for(int i=1; i<=a.length; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.printf("%d ", count++);	
//			}
//			System.out.println();
//		} 내가 작성 -> 1 부터 46까지.. 중간에 열에 +2 된 상태로 출력됐음
		for(int i=0; i<=4; i++) 
			a[i] = new int[i+1];
		for(int i=5; i<=8; i++) 
			a[i] = new int[9-i];
		int k =1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = k++;
			}
		}
	}
	public static void prn(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
		System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}