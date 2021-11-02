package days12;

class Aclass {
	private int age;
	// 필요에 따라 숨어있는 생성자를 꺼내놓고 메모리 학보 외에 다른 일을 시킬 수 있음
	Aclass() {
		System.out.println("Aclass의 생성자 호출~!");
		age = 100;
	}
	public int getAge() { 
	return age;
	}
	public void setAge(int a) {
		age = a;
	}
}

public class Class08 {

	public static void main(String[] args) {
		Aclass a = new Aclass();
		// 객체가 만들어질 때만 호출되기 때문에 다른 메소드처럼 호출 객체와 사용되지 않음+
		// a1.Aclass(); 에러 
		System.out.println("나이: " + a.getAge());
		Aclass b = new Aclass();
		b.setAge(200);
		System.out.println("나이: " + b.getAge());
	}

}
