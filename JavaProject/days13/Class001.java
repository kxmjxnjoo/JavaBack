package days13;

class Human{
	String name;
	int age;
	String phone;
}

public class Class001 {

	public static void main(String[] args) {
		int a; // 스택에 생성되는 기본자료형 변수
		String s; // 힙에 실제 데이터가 저장되는 참조변수
		Human h1 = new Human();
		Human h2 = new Human();
		// class 생성이 끝나면 생성된 객체의 변수를 만들어 사용할 수 있음
		// new에 의해 name과 age가 저장될 Human 데이터형의 공간이 
		// Heap영역에 생성되고 그 공간의 주소가 참조변수(h1, h2) 에 저장됨
		
		String[] name = new String[10];
		int[] age = new int[10];
		// name[0] age[0]이 1번 사람의 자료.. name[1] age[1]이 2번 사람의 자료...
		String[] phone = new String[10];
		
		h1.name = "홍길동";
		h1.age  = 30;   
		
		h2.name = "홍길서";
		h2.age = 40; 
		
		Human[] h = new Human[10]; // 객체 배열
		// h[0]에 name, age, phone이 모두 포함되어있음
		
		Human h3; // 참조 변수 선언
		h3 = new Human(); // 힙에 새로운 인스턴스 생성 후 주소(참조 값) 저장
		Human h4 = new Human();
		h3.name = "홍길남";
		h4.name = "홍길서";
		h1.phone = "010-5555-6666";
		h3.age = 30;
		h4.age = 50;
		h3.phone = "010-1111-2222";
		h4.phone = "010-2222-3333";
		
		System.out.println("이름: " + h1.name + " 나이: " + h1.age + " 전화번호: "
		 + h1.phone);
		
		Human h5 = new Human();
		
		System.out.println("이름: " + h5.name + " 나이: " + h5.age + " 전화번호: "
				 + h5.phone);
		// new로 만든 공간은 정수 0 실수 0.0 문자 null 값이 자동으로 초기화 됨
	}

}
