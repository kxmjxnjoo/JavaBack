package days12;

class Animal {
	String name;
	int age;
	public void output() {
		System.out.printf("나의 이름은 %s, 나의 나이는 %d 입니다\n", name,age);
	}
	void input(String n, int a) {
		name = n;
		age = a;
	}
	String getName() {
		String name = "";
		return name;
	}
	int getAge() {
		return age;
	}
}

public class Class03 {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal(); // 객체의 생성
		// 멤버변수가 어떤 객체의 변수인지 구분하기 위해 변수이름 앞에 (객체이름.)을 붙여 사용하듯
		// 멤버 메소드도 호출의 주체가 되는 객체이름을 반드시 써야함 
		a1.name = "댕댕이";
		a1.age = 20;
		a1.output();
		System.out.println("이름: " + a1.name + " 나이: " + a1.age);
		
		a2.input("바둑이", 25);
		a2.output();
		System.out.println("이름: " + a2.name + " 나이: " + a2.age);
	
		String n = a1.getName();
		int a = a1.getAge();
		System.out.println("이름: " + n + "나이: " + a);
		
		System.out.println("이름: " + a2.getName() + "나이: " + a2.getAge());
		
		// 어떤 멤버 메소드를 만들고 사용해야 하는가에 정답은 없음
		// 개발자 판단 및 프로그램의 필요성에 의해 설계하고 제작되는 메소드를
		// 잘 만들고 잘 사용하면 됨
		
	}
}
