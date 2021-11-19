package days11;

public class Method14 {

	public static void main(String[] args) {
		int c;
		c = max(50,60,80,60,54,60);
		System.out.println("입력값 중 큰 값은 " + c + "입니다");
		c = max(50,60,80,60,54,60,56,87,69);
		System.out.println("입력값 중 큰 값은 " + c + "입니다");
	}
	// 참조변수 a를 이름으로 한 배열이 생성됨
	public static int max (int... a) {
		// 배열의 크기는 전달되는 전달인수의 개수로.. 
		// 전달되는 전달 인수들은 배열의 구성요소로 전달됨
		int max=a[0];
		for(int i=1; i<a.length; i++) 
			if(max < a[i]) max = a[i];
		return max;
		
	}
}
