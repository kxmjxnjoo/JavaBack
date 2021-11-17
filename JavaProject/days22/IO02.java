package days22;

import java.io.IOException;

public class IO02 {
//### InputStream 클래스의 read 메소드
//- read() : 입력 스트림으로부터 가장 앞에 위치한 1바이트를 읽어옴
//- read(byte[]) : 입력 스트림의 가장 앞부터 매개변수로 전달된 배열의 크기까지 바이트를 읽어옴
//- read(byte[], int startIndex, int size) 입력 스트림의 가장 앞부텉 size 크기만큼 데이터를 읽어옴
//- 저장은 매개변수로 전달된 배열의 startIndex위치부터 저장

	public static void main(String[] args) throws IOException {
		byte[] input = new byte[20];
		System.out.print("\n키보드 입력을 실행하세요 : ");
		int size = System.in.read(input);
		System.out.printf("읽어온 바이트의 크기는 %d 입니다.\n", size);
		for(int i=0; i<input.length; i++)
			System.out.printf("%c ", (char)input[i]);
	}
}