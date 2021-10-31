package days08;

public class ControllOpWhile02 {

	public static void main(String[] args) {
		// 1부터 100 사이의 짝수 출력
		int i=2;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
				i+=2;
			}
		}
	}
}
