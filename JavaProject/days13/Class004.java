package days13;
class Dog{
	String name;
	int age;
	String phone;
	// 멤버 메소드의 생성 주된 목적: 멤버 변수에 값을 대입, 연산, 출력하기 위해서
	// 목적대로 한다면 d1.name = "댕댕이"; 연산 가능하여 메소드가 필요 없을 수도 있음
	// private이 붙어있다면 d1.name = "댕댕이"; 불가능하여 public 형태 멤버 메소드 생성하여 사용
	
	// 이클립스에서 자동으로 생성되는 메소드(getter/setter)를 자주 사용함
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
public class Class004 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("댕댕이");
		d1.setAge(6);
		d1.setPhone("010-5555-6666");
		
		System.out.println("이름: " + d1.getName() + " 나이: " + d1.getAge() + " 전화번호: " + d1.getPhone());
	}

}
