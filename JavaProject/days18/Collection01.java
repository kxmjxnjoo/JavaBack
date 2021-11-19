package days18;

import java.util.ArrayList;
import java.util.Vector;

public class Collection01 {

	public static void main(String[] args) {
		// 동적 배열의 객체 생성 초기값으로 크기를 지정할 수 있지만 통상 크기 지정 없이 사용
		Vector v = new Vector();
		ArrayList a = new ArrayList();
		
		// 데이터 입력 add 메소드를 사용하여 데이터 입력
		v.add(10);
		v.add(20);
		v.add(30);
		// 데이터의 저장은 add로 저장하는 데이터의 레퍼런스 값을 저장
		a.add(10);
		a.add(20);
		a.add(30);
		
		// Vector, ArrayList 클래스의 size 메소드 : 현재 저장되어 있는 데이터의 개수를 반환
		for(int i=0; i<v.size(); i++) {
			System.out.printf("v[%d] = %d\t\t", i, v.get(i));
		}
		
		System.out.println();
		for(int i=0; i<a.size(); i++) {
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		}
		a.set(2, 100); // 인덱스 매개변수를 추가하여 데이터 삽입 가능
		// set은 기존값을 지우고 대입
		System.out.println();
		for(int i=0; i<a.size(); i++) {
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		}
		a.add(2, 300); // add는 기존값을 뒤로 밀고 중간에 삽입 -> 원래 2번 인덱스의 값이 3번으로 감
		System.out.println();
		for(int i=0; i<a.size(); i++) {
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		}
	}
}
