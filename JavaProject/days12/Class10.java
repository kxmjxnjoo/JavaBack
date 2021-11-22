package days12;
class Cclass {
	private int age;
	// 생성자는 메소드이므로 매개변수를 사용할 수 있음
	// 1. 생성자의 매개변수를 활용하는 경우 각각의 객체마다 서로 다른 값을 가질 수 있음
	Cclass(int a) {
		age = a;
	}
	// 5. 생성자 메소드 오버로딩을 통해 없어진 디폴트 생성자 문제를 해결할 수 있음
	Cclass() {
		age = 40; 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
}
public class Class10 {

	public static void main(String[] args) {
	// 2. 생성자에 전달인수를 만들고 다른 값을 전달하여 객체마다 멤버변수의 초기값을 달리하여 시작가능	
		Cclass c1 = new Cclass(20);
		Cclass c2 = new Cclass(30);
		// 3. 클래스에 매개변수 갖든 안갖든 생성자가 꺼내지고 정의되면 디폴트 생성자는 정의된 생성자로 대체되고 없어짐
		// 4. 해당 클래스의 경우 디폴트 생성자가 없어졌으므로 (5) 생성자 오버로딩을 만들지 않으면 에러로 뜸
		Cclass c3 = new Cclass(); 
		// 6. 디폴트 생성자가 생겼으므로 정상 실행됨
	}

}
