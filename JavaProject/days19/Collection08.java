package days19;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
// s1.equals(s2)		this <- s1		obj <-s2
	public boolean equals(Object obj) { // Object는 어떤것이 오든 받을 수 있음
		// this.name와 obj.name의 비교(this.age / this.age)
		// obj는 부모클래스의 참조변수이므로 자식클래스(Human)의 멤버변수임 name,age
		// 에는 access 할 수가 없기 때문에 아래와 같이 형변환이 필요 
		
		// 전달된 obj가 현재로 어떤 인스턴스를 갖고 있는지 모르기 때문에
		// instanceof 이용하여 형변환이 가능한지 먼저 확인하고 변환
		// 이상한 클래스가 왔으면 그냥 바로 return false로 메소드 종료
		if( !(obj instanceof Point) )
			return false;
		Point target = (Point)obj;
		boolean result = this.x==target.x && this.y==target.y;
		return result;
	}
}
public class Collection08 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		Point p1 = new Point(10,10);
		list.add(p1);
		list.add(new Point(20,20));
		list.add(new Point(30,30));
		for( Point p : list ) System.out.println(p.toString());
		
		int index = list.indexOf( new Point(30,30) );
		System.out.printf("(30,30)의 위치: %d\n", index);
		boolean con = list.contains(new Point(30,30));
		System.out.printf("(30,30)의 저장 유무: %b\n", con);
		// 사용자 정의 클래스에 equls 메소드가 오버라이딩 되지 않은 경우
		// 컬렉션 내부에서 동일한 형태의 객체를 검색 비교할 수 없음
	}
}
