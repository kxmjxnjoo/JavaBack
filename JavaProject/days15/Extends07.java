package days15;
//### 상속문법
//- 각 클래스에서 발견되는 공통 변수, 메소드등을 하나의 클래스로 선언하여 물려받는 문법
//    - 상속은 모든 클래스의 공통되는 속성, 기능을 정의된 부모클래스를 자식클래스에게 물려주는 방식입니다.
//    - 부모클래스에 정의되는 속성, 또는 기능들은 모든 자식클래스에서 동작해야 하므로 일반적인 정의만 사용할 수 있음
//    - 상속받은 메소드들은 자식클래스의 생성 목적이나 용도에 따라 사용이 어울리지 않은 메소드일 가능성이 있음
class Animal {
	public void crying() {
		System.out.println("소리를 냅니다");
	}
}
class Dog extends Animal {
	public void sound() {
		crying(); // 자식의 오버라이딩된 crying() 호출
		System.out.println("멍멍~!");
	}
	public void crying() {
		super.crying(); // 부모의 crying() 호출
		System.out.println("멍멍~!");
	}
	
}
class Cat extends Animal {
	public void sound() {
		System.out.println("냥냥~!");
	}
	public void crying() {
		System.out.println("냥냥~!");
	}
}

// ### 재정의 (Overriding)
//    - 자식 클래스는 부모 클래스에서 물려받은 메소드를 자신의 용도에 맞게 재정의 할 수 있음
//    - 메소드 오버라이딩은 자식클래스에서 부모클래스의 메소드 원형을 다시 정의하는 문법으로
//    - 메소드 오버라이딩을 구현하면 부모클래스에서 물려받은 메소드는 무시되고 새롭게 정의한 메소드가 사용됨

// ### 메소드 오버라이딩
// 1. 메소드의 이름이 동일해야 함
// 2. 메소드의 매개변수 타입, 개수 순서가 다를 경우 같은 이름의 메소드라도 다른 메소드로 인식함
// 3. 상속관계에서만 사용할 수 있음
// 4. 부모클래스의 메소드의 원형과 반드시 일치해야함(리턴값의 타입, 메소드이름, 매개변수)
// 5. 쩝근 지정자는 축소될 수 없음(다형성의 구현 때문)
// 6. 부모클래스의 final로 정의된 메소드는 오버라이딩 할 수 없음
// 7. 오버라이딩 된 자식 클래스의 메소드에서 super.crying()이란 명령으로 부모클래스의 메소드를 호출할 수 있음
// 8. 클래스의 외부에서는 super라는 말을 쓸 수 없으므로 생성된 객체를 통한 super 사용은 허용하지 않음 c.super.crying(); ← 에러
    
public class Extends07 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.crying();
		c.crying();
		
		d.sound();
		c.sound();
	}

}
