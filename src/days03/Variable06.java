package days03;

public class Variable06 {
	// 정수형 : bye(1), short(2), int(4 - 기본형) -21억~21억, long(8)\
	// 실수형 : float(4), double(8 - 기본형)
	// 문자형 : char(2 - 유니코드 지원)
	// 진위형 : boolean( 1- true/false의 값만 저장가능)
	// 문자열 : String(클래스, 정해진 크기가 없음)
	
	public static void main(String[] args) {

		System.out.println(100); //100은 정수형의 기본형인 int
		System.out.println(12.345); //12.345는 실수의 기본형인 double

		// 변수의 다양한 선언(생성) 방법
		// 1. 변수 선언 후 값을 할당(대입)
		int n1;
		n1 =10;
		// 2. 변수의 선언과 값의 대입을 동시에 처리
		int n2 =20;
		// 3. 다수개의 변수를 한 번에 선언하는 방법 (동일한 타입만 가능)
		int n3, n4, n5;
		// 4. 다수 개의 변수를 값을 대입하면서 생성하는 방법
		int n6 = 60, n7=70;
		
		// 변수의 선언위치
		// 변수의 사용 전이라면 위치에 관계 없이 변수 선언 가능
		// 변수는 반ㄷ싀 선언(생성) 후에 사용가능
		// 선언전에 사용하는 변수는 오류
		
		int v1 =10;
		System.out.println("프로그램 시작 v1변수의 값: " + v1);
		//System.out.printf("v3 변수의 값 %d\n", v3); //에러
		// v3 변수 생성 명령이 앞 단에 없으므로 위 명령은 오류
		int v3 = 30;
		System.out.printf("v3 변수의 값 %d\n", v3); //v3변수 선언되었으므로 정상실행
		
		// 변수는 선언 이후라도 값이 대입되지 않으면 사용이 불가
		int v4;
		// 아래 코드는 변수값이 저장되지 않았기 때문에 오류 발생
		//System.out.printf("v4 변수의 값 %d\n", v4); //오류
		v4 = 40;
		System.out.printf("v4 변수의 값 %d\n", v4);
		
		// 변수의 값은 여러번 대입할 수 있으며 저장되는 값은 가장 최근 마지막 값이 사용됨
		// 이전에 저장된 값은 소멸, 한 번에 하나씩만 저장할 수 있는 단점
		n1 = 60;
		System.out.println("프로그램 실행 중 변경된 n1변수의 값: "+ n1);
	}
}
