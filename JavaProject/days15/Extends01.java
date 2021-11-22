package days15;
//	코드의 중복이 발생하고 있는 클래스들
//class PersonA{
//	String name;			int age;
//}
//class PersonB{
//	String name;			int age;
//	String empbum;
//}

// 중복되는 멤버들이나 코드를 구성요소로 한 부모클래스 생성
class Person{
	String name;			int age;
}
// 부모를 상속한(상속을 구현한) 자식 클래스를 생성
class PersonA extends Person{
	String hakbun;
}
class PersonB extends Person{
String empbum;	
}
public class Extends01 {

	public static void main(String[] args) {
		PersonA a = new PersonA();
		PersonB b = new PersonB();
		a.name = "홍길동";
		b.age = 26;
		System.out.println(a.name);
		System.out.println(b.age);
	}
}
