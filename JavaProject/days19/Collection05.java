package days19;

import java.util.ArrayList;
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
		
	}
}