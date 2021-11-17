package days22;

import java.io.IOException;

//- 입출력
//- 자바에서 입출력은 스트림의 개념을 사용함
//스트림 → 단반향 통신
//- 입력과 출력에 관한 스트림이 각각 클래스로 제공됨
//- 모든 입출력 클래스는 java.io패키지에 정의되어 있음
//- 입출력 클래스
//1. 바이트 타입
//- 이진데이터(눈으로 읽을 수 있는 데이터) : 이미지, 실행파일, 엑셀파일 등
//- InputStream(입력의 최상위 부모클래스)
//OutputStream(출력의 최상위 부모클래스)
//1. 문자 타입
//- 텍스트 데이터 : txt파일과 같은 내용을 처리할 수 있는 클래스
//- Reader(입력의 최상위 부모클래스)
//Writer(출력의 최상위 부모클래스)
public class IO01 {

	public static void main(String[] args) throws IOException {
//		System.out.print("글자나 숫자 하나를 입력하세요 : ");
//		int num = System.in.read();
//		System.out.printf("입력된 정수 : %d\n", num);
//		System.out.printf("입력된 문자 : %c\n",(char) num);
		//위와 같은 바이트 입출력 클래스는 스트림으로 부터 1바이트씩 읽거나 쓸 수 있음
		//기본입력을 제공하는 System.in 객체는 키보드와 연결된 기본입력 스트림으로부터
		//1바이트씩 읽어 올 수 있으며, 읽어 들이는 값은 문자의 코드(아스키코드) 값임
		//num변수에는 입력한 글자의 아스키코드값이 저장됨
		// A-65		0-48		a-97
		
		//new Scanner(System.in) 그동안 사용해오던 Scanner도 위의 System.in의
		//객체를 모체로 하고있음
		int input;
		System.in.read();
		System.in.read();
		System.out.print("키보드 입력을 실행하세요 : ");
		input = System.in.read();
		System.out.printf("\n입력된 값 : %d\n", input);
		System.out.printf("입력된 문자 : %c\n",(char)input);
		
	}
}