package days13;

class Cat{
	private String name;
	private int age;
	private String phone;
	
	//원래 숨어있는 메소드 이지만 필요에 따라 밖으로 꺼내서 써놓기도 함
	public Cat() {
		// 밖으로 꺼내온 생성자의 내용이 아무것도 없다면, 꺼내지 않고 숨겨진 상태로 있는 것과 다를 바 없음
		// 보통 생성자 본래의 역활에 더하여 추가적인 명령을 쓰고자 할때 이와 같이 꺼내서 기술함
		//System.out.println("Cat 클래스의 생성자 호출~!!");
		// 멤버 변수의 값을 임의의 값으로 초기화 하고자 할 때도 사용 
		name = "야옹이";
		age = 10;
		phone = "010-8888-7777";
	}
	// 생성자 안에서 반드시 멤버변수들의 값을 대입해야하는 건 아님
	// 보통 멤버변수 값 대입 동작이 비교적 많이 사용될 뿐
	// 생성자 또는 메소드 오버로딩은 필요에 따라 제작하는것을 권장, 
	// 호출되지 않을 생성자와 메소드의 오버로딩은 만들지 않는 것을 권장
	void prn() {
		System.out.println("이름: " + name + " 나이: " + age + " 전화번호: " + phone);
	}
	void init(String n, int a, String p) {
		this.name = n;
		this.age = a;
		this.phone = p;
	}
	public Cat(String n, int a, String p) {
		this.name = n;
		this.age = a;
		this.phone = p;
	}
	// 생성자가 안에서 밖으로 꺼내져 와서 매개변수가 있는 생성자로 재정의 되는 순간 
	// 매개 변수 없는 디폴트 생성자는 없어진다(매개변수 있는 생성자로 대체)
	// 매개 변수가 ㅇ벗는 디폴트 생성자도 사용하려면 오버로딩해서 사용
}

public class Class006 {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.prn();
		Cat c2 = new Cat();
		c2.init("나비", 11, "010-8888-9999");
		Cat c3 = new Cat();
		c3.init("냥이", 9, "010-7777-9999");
		c2.prn();
		c3.prn();
		
		Cat c4 = new Cat("냥냥이", 8, "010-7878-8787");
		c4.prn();
	}

}
