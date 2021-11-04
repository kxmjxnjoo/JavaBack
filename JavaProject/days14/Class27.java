package days14;
// 객체 배열
class Student2{
	int bun;
	String name;
	int[] score;
	static int count = 0;
	Student2() {
		score = new int[3];
		bun = ++ count;
		name = "std-" + bun;
	}
	Student2(int a, int b, int c) {
		this();
		score[0] = a; score[1] = b; score[2] = c;
	}
}

public class Class27 {

	public static void main(String[] args) {
		// int[] a = new int[5];
		// String[] s = new String[5]; 객체 배열을 하는 방식과 비슷함
		Student2[] std = new Student2[5];
		// 클래스이름[] 변수이름 = new 클래스이름[배열숫자];
		// std[0].bun = 1; 값이 null이기 때문에 에러, 윗줄은 객체를 만든 것이 아니라
		// 다섯개의 참조값(주소)을 저장할 수 있는 참조변수들의 배열을 생성한 것이기 때문
		
		// 방법#1 객체를 만들 듯, 배열의 한개 요소에 new Student2()를 실행
		Student2 std0 = new Student2();   	
		std[0] = new Student2(98, 78, 98);  
		std[1] = new Student2(78, 78, 56);  
		std[2] = new Student2(65, 98, 34);  
		std[3] = new Student2(89, 65, 54);  
		std[4] = new Student2(76, 45, 56);  
		// 결론 : 배열만 만들고 끝X 배열의 한칸 한칸에 뉴인스턴스의 주소를 할당해줘야 
		//		   배열의 갯수만큼 객체 사용이 가능해짐
		for(int i=0; i<std.length; i++) 
			std[i] = new Student2(100,100,100);
	}
}
