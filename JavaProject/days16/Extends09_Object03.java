package days16;
// ### Object 클래스의 equals메소드
// - 객체간의 비교를 위해 사용되는 메소드
// - Object가 상속한 메소드들 중 toString과 함께 가장 많이 오버라이딩 되는 메소드
public class Extends09_Object03 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		if(n1==n2) {
			System.out.println("n1 변수와 n2 변수는 같습니다.");
		} else
			System.out.println("n1 변수와 n2 변수는 다릅니다.");
		
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1==s2) {
			System.out.println("s1 변수와 s2 변수는 같습니다.");
		} else
			System.out.println("s1 변수와 s2 변수는 다릅니다.");
		// System.out.println(s1);  "Hello" 출력
		// 이미 String클래스에는 저장된 문자가 리턴되는  toString 메소드가 오버라이딩 되어있는 것
		// ==비교연산은 변수가 직접 저장한 값으로 비교해주는 연산자라는 걸 감안하면
		// s1==s2 는 두 개의 참조변수값(주소값)이 비교되었다, 같은 주소를 가지고 있다는 것
		
		// String s1 = "Hello"; 실행시에 Heap영역에 "Hello" 가 저장되고 그 주소가 s1변수에 저장됨
		// String s2 = "Hello"; 실행시 새로운 영역에 저장X 이미 존재하는 값의 주소를 s2에 또 저장하는 것
		
		// new키워드를 사용하지 않았기 때문에(새로운 공간을 생성하지 않아) 일어나는 현상임
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if(s3==s4) {
			System.out.println("s3 변수와 s4 변수는 같습니다.");
		} else
			System.out.println("s3 변수와 s4 변수는 다릅니다.");
		// 앞선 명령과 달리 new키워드를 사용하여 서로 다른 공간에 저장하고 각각의 주소를 
		// s3와 s4에 저장하니 앞서 코드와 다른 결과가 나왔음
		// 비교연산자는 글자들의 비교가 아니라 레퍼런스 주소들의 비교라는 의미
		
		// 실제 객체의 값을 비교하기 위해 equals 메소드를 사용하면 참조값이 서로 다른
		// 객체의 실제 데이터를 비교하여 동일한 데이터를 가지고 있는지 확인할 수 있음
		 if(s3.equals(s4)) {
			 System.out.println("s3 변수와 s4 변수는 같습니다.(eqauls)");
		 } else 
			 System.out.println("s3 변수와 s4 변수는 다릅니다.(eqauls)");
		 
		 Point p1 = new Point(10,20);
		 Point p2 = new Point(10,20);
		 if(p1.equals(p2)) {
			 System.out.println("p1 변수와 p2 변수는 같습니다.(eqauls)");
		 } else                  
			 System.out.println("p1 변수와 p2 변수는 다릅니다.(eqauls)");
		 // equals 메소드는 Object 클래스의 메소드로서 최초는 레퍼런스값(주소)들의 비교 정의하고있음
		 // String 클래스는 이미 equals 메소드를 실제값의 비교로 오버라이딩 되어 있으며
		 // 기타 다른 사용자 정의 클래스에는 별도로 equals를 실제값으로 비교하도록 오버라이딩 해줘야함
	}
}