package days13;
class Person{
	String name;
	int age;
	String phone;
	public void input(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
	// 멤버 메소드
	public void output() {
		System.out.println("이름: " + name + " 나이: " + age + " 전화번호: " + phone);
	}
	void output2() {
		
	}
	
}

public class Class002 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
//		p1.name = "홍길동";
//		p1.age = 30;
//		p1.phone = "010-9999-8888";
//		p2.name = "홍길서";
//		p2.age = 40;
//		p2.phone = "010-7777-8888";
//		System.out.println("이름: " + p1.name + " 나이: " + p1.age + " 전화번호: " + p1.phone);
//		System.out.println("이름: " + p2.name + " 나이: " + p2.age + " 전화번호: " + p2.phone);
		// 위의 코드를 멤버메소드를 이용하여 아래와 같이 만들 수 있음
		p1.input("홍길동", 30, "010-9999-8888");
		p2.input("홍길서", 20, "010-7777-8888");
		p1.output();
		p2.output();

	}

}
