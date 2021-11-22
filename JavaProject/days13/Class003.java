package days13;
class Animal{
	String name;
	int age;
	String phone;

	// a1.output(); 객체에 의해 메소드가 호출되면 메소드를 호출한 객체(호출객체)의 참조값(주소)이
	// 메소드에 숨어있는 this참조변수에 전달, 누가 호출했는지 구분하여 사용하게 도와줌
	// this <-a1;
	// this : 메소드의 호출 객체의 참조값이 저장되는 참조변수
	Animal copy1() {
		Animal temp = new Animal();
		temp.name = this.name;
		temp.age = this.age;
		temp.phone = this.phone;
		return temp;
	}
	// temp <- a2		this <-a4
	void copy2(Animal temp) {
		this.name = temp.name;
		this.age = temp.age;
		this.phone = temp.phone;
	}
	
	public void output(/*Animal this*/) {
		// 매개변수가 멤버 변수와 이름이 중복되어 구분되지 않은 상황이 아니더라도 사용되고 있으며 생략 명시 모두 가능
		System.out.println("이름: " + name + " 나이: " + age + " 전화번호: " + phone);
	}
	// 매개변수와 멤버변수 이름이 중복된다면 this는 반드시 명시하여 사용 ex) this.name = name;
	void input(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
}

public class Class003 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.name = "";
		a2.name = "";
		// new에 의해 다른 공간에 만들어진 a1, a2는 멤버변수도 제각각 공간을 차지하고 있음
		// 위처럼 변수의 값을 다른 값으로 따로 대입하는 동작에 전혀 문제가 없음
		
		// 하지만 멤버 메소드는 정의된 메소드가 하나 존재하고 각 객체들이 공유하기 때문에
		// 어떤 객체가 해당 멤버 메소드를 호출했는지 메소드내에서 구분될 필요가 있음
		// 그걸 구분해주는 변수가 this임
		
		a1.input("홍길동", 30, "010-9999-8888");
		a2.input("홍길서", 20, "010-7777-8888");
		
		a1.output();
		a2.output();
		
		// Animal a3 = a1; 참조값의 복사이므로 완벽한 객체 생성과 복사가 이루어지지 않음
		// 새로운 객체 생성(저장공간 생성포함)과 복사가 이루어 지려면 어디선가 new 연산자 사용필수
		// 복사보단 멤버변수간 값의 복사가 이루어져야함 그 동작들을 메소드로 정의하고 실행하게 함
		Animal a3 = a1.copy1();
		a3.output();
		
		Animal a4 = new Animal();
		// a4 = a2; 참조 값의 복사
		a4.copy2(a2);
		a4.output();
	}

}
