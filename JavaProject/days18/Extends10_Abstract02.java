package days18;

abstract class AbstractAnimal {
	public abstract void sound();
}
class DogA extends AbstractAnimal{
	public void sound() {
		System.out.println("멍~멍~");
	}
}
class CatA extends AbstractAnimal{
	@Override // 어노테이션(라벨,펫말)
	public void sound() {
		System.out.println("냥~냥~");
	}
}

public class Extends10_Abstract02 {
	public static void main(String[] args) {
		//AbstractAnimal a = new AbstractAnimal(); 에러	
		
		// 추상메소드를 오버라이딩한 자식클래스는 일반 클래스로 사용될 수 있음
		// 추상클래스로 추상클래스만의 객체를 만들 수는 없지만
		// AbstractAnimal a = new AbstractAnima(); X
		// 추상클래스(부모)의 레퍼런스 변수로 자식클래스의 인스턴스 주소는 저장가능
		// 추상클래스는 내부에 완전치 못한 추상메소드가 있으므로 객체생성은 안되지만 
		// AbstractAnimal b = new Dog(); O
		// AbstractAnimal c = new Cat();  O
		// 자식들의 인스턴스를 저장할 레퍼런스 변수로는 사용이 가능(다형성의 구현)
		AbstractAnimal dog = new DogA();
		AbstractAnimal cat = new CatA();
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("고양이 소리");
		cat.sound();		
	}
}