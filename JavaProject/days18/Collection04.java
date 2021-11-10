package days18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
			List list = new LinkedList(lotto);
			Collections.sort(list);
			System.out.println(list);
	}
}