package days19;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Collection05 {

	public static void main(String[] args) {
		// Key 값은 문자열, Value값은 정수로 입력받는 Hashtable로 객체 설정
		Hashtable<String, Integer> ht = new Hashtable<String,Integer>();
		// Key 값은 정수, Value값은 문장렬로 받는 HashMap객체 생성
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		// 확장 사용 예
		HashMap<Integer, ArrayList<String>> kk = new HashMap<>();
		// Key: 1에 Value: {"abcd", "efg", "hij"};  
		// Key: 2에 Value: {"kkkk", "ffff", "dddd", "didj" };  
		

		HashMap<Integer, Object > pp = new HashMap<>();
		// Key: 1 Value: "abcd"
		// Key: 2 Value: 1234
		// Key: 3 Value: 23.56
		// Key: 4 Value: {"abcd", "efg", "hij"};  
		
		// Hashtable, HashMap 클래스는 put메소드를 사용하여 데이터를 추가
		ht.put("One", 1);		ht.put("Twe", 2);		ht.put("Three", 3);
		hm.put(1,"One");		hm.put(2, "Twe");		hm.put(3, "Three");
		
		// Hashtable, HashMap 클래스는 gett메소드에 키 값을 전달하여 Value를 리턴받음
		System.out.printf("\"Three\" = %d\n", ht.get("Three"));
		System.out.printf("3 = %s\n", hm.get(3));
		
		Enumeration<String> e1 = ht.keys(); // 키들의 접근 권한을 저장
		while(e1.hasMoreElements()) {
			// 키 값을 추출
			String key = e1.nextElement(); // 키값을 얻어내고
			int value = ht.get(key); // 키값으로 검색한 value값을 얻어냄
			System.out.printf("key(%s)=Value(%d)  ", key, value);
		}
		System.out.println();
		// 2. for문을 활용하여 Key값을 순회하는 방법
		for(Integer k : hm.keySet()) { //hm.keySet() 키값들만 모아서 리스트로 생성
			String v = hm.get(k);
			System.out.printf("key(%d)=Value(%s)  ", k, v);
		}
	}
}