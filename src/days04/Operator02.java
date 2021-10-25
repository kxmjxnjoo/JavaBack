package days04;

public class Operator02 {

	public static void main(String[] args) {
		int n = 50;
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		n = n + 10; // n변수에 10을 누적
		// 1. 현재 n값(50)과 두번째 피연산자인 10이 CPU로 전달되어 덧셈
		// 2. 연산결과가 돌아와서 다시 n변수에 저장
		// 연산에 사용됐던 n값 50은 사라지고, 연산의 결과인 60이 n변수에 저장
		// 간략하게 다음과 같이도 사용가능 n+10;
		
		System.out.println("n = n + 10 -> n: " + n);
		n=n-10; //n-= 10;
		System.out.println("n = n - 10 -> n: " + n);
		n=n*10; // n*=10;
		System.out.println("n = n * 10 -> n: " + n);
		double d = 50.0;
		System.out.println("d의 최초값: " + d);
		d=d/10.0; //d/=10.0;
		System.out.println("n = d / 10 -> n: " + d);
		n=n%10; //n%=10;
		System.out.println("n = n % 10 -> n: " + n);

		// n = n + 1; n = -1; n+=1; n-=1;
		// 값을 1씩 증가, 감소하는 연산자 ++, --
		// 대입연산자(=)를 사용하지 않고 값을 변경
		n = 50;
		n++; //n+=1; n=n+1;
		System.out.println("n++ -> n: " + n);
		++n;
		System.out.println("++n -> n: " + n);
		// 위와 같은 단항연산 때는 앞 뒤 어느 곳에 붙여도 똑같이 연산됨
		
		// ++, -- 연산기호가 앞 뒤에 있을 떄 차이가 나는 경우는 다른 연산과 섞여있을 때
		n = 10;
		System.out.println("현재 n값: " + n);
		int k = n++; //현재 값에 속해 있는 연산 참여 후 1증가 = n의 값을 k에 저장하고 n에 1을 증가 후 값 저장 
		System.out.println("k: " + k);
		System.out.println("n: " + n);
		
		n = 10;
		k = ++n; // 1증가 후에 다른 연산에 참여 = n에 1증가 후 k에 저장
		System.out.println("k: " + k);
		System.out.println("n: " + n);
	}

}