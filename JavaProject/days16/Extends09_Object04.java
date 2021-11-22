package days16;
class Human{
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		String info = "name: " + this.name + ", age: " + this.age;
		return info; // "name: 홍길동, age: 26"
	}
	// s1.equals(s2)		this <- s1		obj <-s2
	public boolean equals(Object obj) { // Object는 어떤것이 오든 받을 수 있음
		// this.name와 obj.name의 비교(this.age / this.age)
		// obj는 부모클래스의 참조변수이므로 자식클래스(Human)의 멤버변수임 name,age
		// 에는 access 할 수가 없기 때문에 아래와 같이 형변환이 필요 
		
		// 전달된 obj가 현재로 어떤 인스턴스를 갖고 있는지 모르기 때문에
		// instanceof 이용하여 형변환이 가능한지 먼저 확인하고 변환
		// 이상한 클래스가 왔으면 그냥 바로 return false로 메소드 종료
		if( !(obj instanceof Human) )
			return false;
		Human target = (Human)obj;
		
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age==target.age;
		boolean result = flag_name && flag_age;
		return result;
	}
}
public class Extends09_Object04 {
	public static void main(String[] args) {
		Human s1 = new Human("홍길동", 21);
		Human s2 = new Human("홍길동", 21);
		Human s3 = new Human("홍길서", 22);
		System.out.println("Human 1의 정보- " + s1);
		System.out.println("Human 2의 정보- " + s2);
		System.out.println("Human 3의 정보- " + s3);
		
		// 레퍼런스 변수들간의 비교
		if(s1==s2) {
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1==s2)");
		} else
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1==s2)");
		// 결과 : s1 변수와 s2 변수는 다릅니다.(s1==s2)
		
		// .equals 메소드를 사용하여 비교(equals 메소드 오버라이드 이후)
		if(s1.equals(s2)) {
			System.out.println("s1 변수와 s2 변수는 같습니다.(s1.equals(s2))");
		} else
			System.out.println("s1 변수와 s2 변수는 다릅니다.(s1.equals(s2))");
		// 결과 :  s1 변수와 s2 변수는 다릅니다.f(s1.equals(s2))
		// Object클래스 equals메소드는 기본적으로 두 객체의 레퍼런스 값을 비교하는 연산만을 수행
		if(s1.equals(s3)) {
			System.out.println("s1 변수와 s3 변수는 같습니다.(s1.equals(s3))");
		} else
			System.out.println("s1 변수와 s3 변수는 다릅니다.(s1.equals(s3))");
	}
}