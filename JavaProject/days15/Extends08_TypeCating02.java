package days15;
class SuperF {
	int superNum;
	void abc() {
		System.out.println("sub method");
	}
}
class SubF extends SuperF {
	int subNum;
	void abc() {
		System.out.println("sub method");
	}
}
public class Extends08_TypeCating02 {

	public static void main(String[] args) {
		SuperF super1 = new SuperF(); // 부모클래스의 객체 생성
		SubF sub1 = new SubF(); // 자식클래스의 객체 생성
		
		// 1. 자식 클래스의 인스턴스 주소값을 부모클래스의 레퍼런스 변수에 저장이 가능함
		//   부모참조변수 <- 자식 인스턴스의 주소 O
		super1 = sub1;
		super1 = new SubF();
		
		// 2. 부모 클래스의 인스턴스 주소값을 자식클래스의 레퍼런스 변수에 저장하는 건 불가능
		//	  자식참조변수 <- 부모 인스턴스의 주소 X
		//sub1 = super1; 
		//sub1 = new SuperF();     두 코드다 에러, 불가능
		
		// 3. 부모클래스의 인스턴스 주소값을 자식클래스의 레퍼런스 변수에 그래도 
		//		저장하고 싶다면.. 강제캐스팅 이용하여 저장은 가능함
		SuperF super3 = new SuperF();
		// SubF sub3 = (SubF)super3; -> 런타임 에러
		// 작성 상으로 문제는 없으나 실행을 하게 되면 런타임 에러가 발생함
		// 실제 Heap 저장된 인스턴스의 타입이 자식 클래스가 아니면 프로그램 실행 중
		// 런타임 에러가 발생되어 프로그래밍 종료됨
		
		// 따라서 부모레퍼런스값을 자식 레퍼런스에 넣을 수 있는 경우를 선별해야 하는데
		// 현재의 부모 레퍼런스 변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한함
		SuperF super4 = new SubF();
		SubF sub4 = (SubF)super4;
		// 자식 레퍼런스 <- (타입캐스팅)부모레퍼런스 <- 자식 인스턴스의 주소
		
		// 강제 캐스팅을 사용한 형변환 시 에러를 방지하는 방법
		// instanceof 연산자 
		// SuperF super5 = new SuperF(); // 실행결과:형변환 실패
		SuperF super5 = new SubF();
		// SubF클래스로의 형변환 가능성을 true, false로 판단
		if( super5 instanceof SubF) { 
			SubF sub5 = (SubF)super5;
			System.out.println("형 변환 성공~!");
		} else {
			System.out.println("형 변환 실패~!");
			
		// 5. 1번에서 자식 인스턴스를 저장하고 있는 부모 레퍼런스는 부모가 상속해준 멤버변수에만 접근이 가능합니다
			SuperF super2 = new SubF();
			super2.superNum = 100;  //O 
			// super2.subNum = 100; //X
			
			SubF sub2 = new SubF();
			super2 = sub2;
			super2.superNum = 200; //O
			// super2.subNum = 300; //X
			super2.abc();
			// 다만 메소드가 오버라이딩 되었다면 부모클래스의 레퍼런스로 실행한 메소드는
			// 자식 클래스에서 오버라이딩 된 메소드가 우선 실행됨
		}
	}
}
