package days23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IO09 {
	
	public static void main(String[] args) throws IOException {
		//경로 확인 및 생성의 이유로 File 객체는 아래와 같이 두번 생성하여 완성
		File dir = new File("D:\\JAVA01\\java_se\\temp");
		if(!dir.exists()) dir.mkdirs();
		File file_binary = new File(dir,"binary_data.dat");
		File file_text = new File(dir,"text_data.txt");
		//File file_text = new File("D:\\JAVA01\\java_se\\temp\\text_data.txt"); 도 가능
		// dir라고 간편하게 작성한 것
		
		//파일로부터 이전 데이터를 읽어올 수 있는 스트림 객체 생성
		FileInputStream fis_binary = new FileInputStream(file_binary);
		//파일로부터 텍스트 데이터를 읽어올 수 있는 스트림 객체 생성
		FileReader fr_text = new FileReader(file_text);
		// 파일의 존재와 오픈의 오류는 디스크 상의 문제이므로 명령으로 해결할 수 없음
		// 따라서 파일 입출력(또는 화면입출력)은 항상 예외처리가 따라다님
		
		//이진데이터 읽어와서 출력
		int data_binary;
		data_binary = fis_binary.read();
		System.out.println(data_binary);
		data_binary = fis_binary.read();
		System.out.println(data_binary);
		fis_binary.close();
		
		//text데이터는 한글자씩 읽어옴. 그래서 반복실행문을 이용함
		//텍스트파일의 내용을 한글자씩 읽어들이는 경우 입력 데이터의
		//저장형식은 반드시 int타입으로 문자값을 전달받아야함
		//파일끝에 도달하면 -1이 읽혀져 오는데 char는 부호가 없는 자료형이므로
		//-값을 처리할 수 없고, 파일의 끝으로 인식되지 않기 때문
		//char형으로 읽어낸다면, 무조건 양수로만 취급하여 반복을 빠져나올 수 없음
		
		int data_text;
		data_text = fr_text.read();
		while(data_text != -1) {
			System.out.print((char)data_text);
			data_text = fr_text.read();
		}
//		while( (data_text = fr_text.read()) != -1)
//			System.out.print((char)data_text);    간단하게 할 수 있는 코드
		fr_text.close();
	}
}