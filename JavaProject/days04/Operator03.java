package days04;

import java.awt.datatransfer.SystemFlavorMap;

public class Operator03 {

	public static void main(String[] args) {
		// 관계연산자(비교연산자)
		// 좌항기준 >(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지않다)
		// 좌, 우항의 크기를 비교하여 관계식이 옳을 경우 true 틀린 경우 false 가 연산의 결과가 됨

		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		result = n1 > n2;
		System.out.printf("%d > %d : %b\n", n1, n2, result);
		result = n1 < n2;
		System.out.printf("%d < %d c %b\n", n1, n2, result);
		result = n1 >= n2;
		System.out.printf("%d >= %d -> %b\n", n1, n2, result);
		result = n1 <= n2;
		System.out.printf("%d <= %d -> %b\n", n1, n2, result);
		result = n1 == n2;
		System.out.printf("%d == %d -> %b\n", n1, n2, result);
		result = n1 != n2;
		System.out.printf("%d != %d -> %b\n", n1, n2, result);
		
		// 문자(char) 데이터 비교 : 각 데이터가 갖는 아스키 코드 값으로 비교
		char c1 = 'A', c2 = 'B';
		result = c1>c2;
		System.out.printf("%c > %c -> %b\n", c1, c2, result);
		result = c1<c2;
		System.out.printf("%c < %c -> %b\n", c1, c2, result);
		
		// String 데이터 비교
		String s1 = "1234", s2 = "987";
		//System.out.println(s1 + ">" + s2 + ": " + (s1>s2));
	
		// s1과 s2는 String 자료형으로 두 변수가 직접 문자들을 저장하고 있지 않음
		// 참조변수로 문자들은 별도의 장소에 저장되고 변수는 저장위치값만 저장
		// 변수들간의 비교(s1>s2)는 저장위치정보의 비교이므로 연산에 의미없고 불가능
		
		// String의 크다 작다를 판단해주는 compareTo()
		// String의 같다 다르다를 판단해주는 equals()
		// String 자료 간의 비교는 대부분 위의 두 도구를 이용
		
		int r = s1.compareTo(s2);
		// s1이 크면 양수를 s2가 크면 음수를 발생 & 변수 r에 저장. 같으면 0 출력
		// 앞글자(s1)에서 뒷글자(s2)의 아스키 코드값을 뺀 값(정수)을 결과로 얻음
		System.out.printf("%s > %s: %d\n", s1, s2, r);
		r = s2.compareTo(s1);
		System.out.printf("%s > %s: %d\n", s2, s1, r);
		
		// s1.compareTo(s2) : s1 - s2가 주소끼리 연산되므로 주소를 찾아 직접 글자를 가져와서
		// 뺼셈연산을 대신해주는 도구이기 때문에 정수로 결과를 얻어 int가 됨
		
		boolean b = s1.equals(s2);
		System.out.printf("%s == %s: %b\n", s1, s2, b);
		
	}

}