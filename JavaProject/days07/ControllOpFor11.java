package days07;

public class ControllOpFor11 {

	public static void main(String[] args) {
		// 1부터 20사이 :ㅇㅣ전 숫자와 다음숫자가 세트를 이루는 수열 출력
		// (0,1,2) (1,2,3) (2,3,4).... (19,20,21)
		int i;
		for(i=1; i<=20; i++) {
				System.out.printf("(%d, %d, %d)\n", i-1, i, i+1);
			
			}		
	}
}
