package days23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
		// D:\\JAVA01\\Java_se\\temp\\abc.txt 파일의 내용을 콘솔창에 출력
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if( !dir.exists() )	dir.mkdirs();
		
		File file_abc = new File(dir, "abc.txt");
		FileReader fr_text = new FileReader(file_abc);
		int data_text;
		while( (data_text = fr_text.read()) != -1 )
			System.out.print((char)data_text);
		// 스트림 종료
		fr_text.close();
	}
}