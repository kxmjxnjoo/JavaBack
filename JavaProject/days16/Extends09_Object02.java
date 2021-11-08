package days16;
// ### toString 메소드의 사용
// 클래스의 객체 정보를 문자열로 반환
// 객체의 클래스명 + '@' + 해시코드값(16진수)
// 사용자 정의 클래스(직접 개발한 클래스)에 toSTring 메소드를
// 오버라이딩하여 클래스의 정보를 문자열로 제공하도록 변형(재정의)할 수 있음

class UserClassB { // toString 메소드를 오버라이딩 하지 않은 클래스
}
class Point { // toString 메소드를 오버라이딩한 클래스
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(x= " + this.x + ", y= " + this.y + ")"; 
		// "x=값, y=값"
	}
}
public class Extends09_Object02 {

	public static void main(String[] args) {
		UserClassB obj = new UserClassB();
		System.out.println("오버라이딩 되지 않은 toString()=>" + obj.toString());
		Point p = new Point(30,20);
		System.out.println("오버라이딩 된 toString()=> " + p.toString());
		// .toString()은 print에서 사용되거나 다른 문자열과 + 연산될 때 생략이 가능
		// System.out.println("오버라이딩 된 toString()=> + p);
		String msg = "Point => " + p;
		System.out.println(msg);
	}
}