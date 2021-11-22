package days16;
// ### Object 클래스
// 사용자 정의 클래스를 생성하며 상속을 구현하지 않으면 자동으로 java.lang.Object클래스를 상속
// Object 클래스는 java에서 사용되는 모든 클래스들의 최상위 부모클래스
// Subclass extends Super 라는건 Subclass는 Object 클래스를 상속하지 않지만
// Super클래스가 Object클래스를 상속하므로 Subclass는 Object클래스를 상위의 상위로 상속한 것과 같은 의미
class UserClass /* extends Object */ {
	
}
public class Extends09_Object01 {

	public static void main(String[] args) {
		UserClass obj = new UserClass();
		// getClass 메소드는 해당 객체의 클래스 이름을 리턴해주는 메소드이며
		// Object 클래스에서 상속받은 메소드
		System.out.println(obj.getClass());
		// hashCode 메소드는 해당 객체의 해시코드값(다른 객체와 구분하기 위한 고유값)
		// 을 리턴해주는 메소드(JVM에 의해 관리되고 있는 번호)
		System.out.println(obj.hashCode());
		
		// toString 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메소드
		System.out.println(obj.toString());
		// 객체의 클래스명 + '@' + 해시코드값(16진수)
	
		System.out.println(obj);
		// System.out.println(obj.toString()); 와 같음
	}
}
