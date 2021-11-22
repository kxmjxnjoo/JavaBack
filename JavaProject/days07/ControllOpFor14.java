package days07;

public class ControllOpFor14 {

	public static void main(String[] args) {
		// 이중 반복문을 이용, 구구단 1단부터 9단까지 출력
		// 한개의 단이 출력되는 방향은 가로 세로 상관없음
		int a, b;
	for(a=2; a<=9; a++) {
		System.out.printf("=" + a + "단 구구단=\n");
		for(b=1; b<=9; b++) {
		System.out.println(a + " x " + b + " = " + a*b);
	}
	}  // 내가 한 방법
	int i, j;
	for(i=1; i<=9; i++) {
		for(j=2; j<=9; j++) {
			System.out.printf("%dx%d=%2d ", j, i, i*j);
		}
		System.out.println();
	} // 강사님 방법  원하는 출력형태에 따라 다를 듯
	
	} 
}
