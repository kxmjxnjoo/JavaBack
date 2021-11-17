package days22;

import java.io.File;
import java.io.IOException;

public class IO07 {

	public static void main(String[] args) throws IOException {
		// D:\JAVA01\Java_se\temp 폴더를 참조하는 File객체 생성
		File d = new File("D:\\JAVA01\\Java_se\\temp");
		System.out.println("D:\\JAVA01\\Java_se\\temp");
		
		//exists() : 생성자에 입력한 
		if(d.exists()) {
			System.out.println("temp 디렉토리 발견~!");
		}else {
			System.out.println("temp 디렉토리가 없어서 새로 생성합니다");
			d.mkdirs(); // 디렉토리를 생성하는 메소드
		}
		File f = new File(d, "msg.txt");
		//Flie f = new File("D:\\JAVA01\\Java_se\\temp\\msg.txt");
		//이와 같이 한번에 폴더와 파일명을 설정할 수 있으나 폴더가 없을 수 있기 때문에
		// 폴더 확인 절차를 거치고 파일을 설정함
		
		if( !f.exists())
			f.createNewFile(); //파일 생성 메소드 - 예외처리 add throw dec...
		
		System.out.printf("파일명 : %s\n", f.getName());
		System.out.printf("파일의 전체경로 : %s\n", f.getAbsoluteFile());
		System.out.printf("파일의 크기 : %d\n",f.length());
	}
}