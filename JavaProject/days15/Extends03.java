package days15;
// 접근 지정자와 상속
// 부모클래스의 private 멤버는 아무리 자식 클래스여도 접근할 수 없는 멤버
class SuperA{
	SuperA() {
		
	}
	// private : 현재 클래스 내에 있는 멤버 메소드를 통해서만 접근 가능한 완전 은닉 멤버변수
	private int n1;
	public int n2;
	// 디폴트 접근 지정자 : 동일한 패키지 내부에서는 public으로 동작,
	// 다른 패키지에서는 private로 동작
	int n3;
	// 자신의 클래스에 있는 private 멤버에 access 하는 멤버 메소드 
	public int getN1() {
		return n1;
	}
	 protected int n4; // 자식 클래스-> public, 외부 -> private로 작동
}
class SubA extends SuperA {
	SubA() {
		super();
	}
	public void printInfor() {
			//System.out.println(this.n1);
			// 부모 클래스의 private 멤버는 access 할 수 없음
		System.out.println(this.n2);
		// 부모 클래스의 public 멤버는 가능
		// 부모 클래스의 디폴트 접근 지정자는 동일한 패키지에서 public과 같으므로 가능
		System.out.println(this.n3);
		// public으로 선언된 멤버메소드를 이용하면 부모 클래스의 private 멤버에도 access가능
		System.out.println(this.getN1());
		// 부모클래스의 protected는 자식클래스에게 public과 같음
		System.out.println(this.n4);
		}
	}
public class Extends03 {

	public static void main(String[] args) {
		SubA a = new SubA();
		
	}
}
