package days19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(1);	v.add(2);	v.add(2);
		System.out.println(v.size()); // 중복을 허용하기 때문에 3이 반환
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);	a.add(2);	a.add(2);
		System.out.println(a.size()); // 중복을 허용하기 때문에 3이 반환
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);	l.add(2);	l.add(2);
		System.out.println(l.size()); // 중복을 허용하기 때문에 3이 반환
		
		HashSet<Integer> h = new HashSet<>();
		h.add(1);	h.add(2);	h.add(2);
		System.out.println(h.size()); // 중복을 허용하지 않기 때문에 2이 반환
		
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size()<6) {
			lotto.add ( (int)(Math.random()*45)+1);
		}
		for(Integer i : lotto) System.out.printf("%d ", i);
		System.out.println();
		
		// 해쉬세트 콜렉션에는 sort메소드가 없음 따라서 링크드 리스트 
		// 부모클래스인 List 클래스에 전해줘서 리스트 변환과정을 거치고
		// Collections.sort로 정렬을 수행하여야함
			List<Integer> list = new LinkedList(lotto);
			Collections.sort(list);
			System.out.println(list);
			
		// HashSet 타입의 객체 내부를 순회하는 방법
		// 1. Iterator 객체를 사용하는 방법
		// - Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		Iterator<Integer> iter = lotto.iterator();
		Iterator<Integer> iter2 = list.iterator();
		while(iter.hasNext()) 
			System.out.printf("%d ", iter.next() );
		while(iter.hasNext()) 
			System.out.printf("%d ", iter2.next() );
		// 제어권을 넘겨받아서 위와 같이 한번 리스트를 모두 순회하면
		// iter = lotto.iterator(); -> 다시 방문 필요할 때 제어권을 다시 얻어내야함
		System.out.println();
		
		//- for(자료형 변수명 : 순회할 수 있는 타입(배열, 컬렉션) ) 
		//	배열, 컬렉션으로부터 추출한 변수를 사용하는 코드
		for(Integer i : lotto)
			System.out.printf("% d", i);
		System.out.println();
		for(Integer i : list) // 이와 같이 사용하려면 List 선언시 제네릭 사용해야함
			System.out.printf("% d", i);
		// Integer i 부분: 오른쪾의 배열이나 리스트의 아이템 하나를 저장할 변수선언
		// lotto 부분 : 왼쪽변수에 차례로 하나씩 전달해 줄 수 있는 아이템을 보유한 컬렉션 또는 배열
		// 오른쪽 리스트 또는 배열의 값을 차례로 하나씩 외쪽 변수에 값을 전달하면서 1회의 반복실행 진행
		System.out.println();
	}
}