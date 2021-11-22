package days23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		//이진형식, text형식 모두 가능하지만 가급적 이진형식으로...
		//"D:\\JAVA01\\Java_se\\temp 폴더안의 "eclipse-inst-jre-win64.exe" 파일을
		//"D:\\JAVA01\\Java_se\\copy" 폴더로 복사
		
		//File dir = new File("D:\\JAVA01\\java_se\\temp"); //OriginalPath
		//if(!dir.exists()) dir.mkdirs();
		//File dir1 = new File("D:\\JAVA01\\Java_se\\copy");
		//if(!dir1.exists()) dir1.mkdirs();  //CopyPath
		
		//FileInputStream fis_a = new FileInputStream("eclipse-inst-jre-win64.exe");
		//FileWriter fw_e = new FileWriter("eclipse-inst-jre-win64.exe");

		//File file_ec = new File(dir1, "eclipse-inst-jre-win64.exe");
		//BufferedOutputStream bos_e 	= new BufferedOutputStream(new FileOutputStream(file_ec));
		//BufferedWriter bw_e 	= new BufferedWriter(new FileWriter(file_ec));
		//bos_e.close();
		//fw_e.close();
		//fis_a.close();
		
		// 내가 작성한 코드.. 기존 파일을 이상하게 변형시키고 복사됨
		// Buffered in,out사용했어야 하나 writer등의 사용으로 잘못된듯
		
		String CopyPath = "D:\\JAVA01\\Java_se\\copy";
		String OriginalPath = "D:\\JAVA01\\Java_se\\temp";
		String Filename = "eclipse-inst-jre-win64.exe";
		File originDir = new File(OriginalPath); //읽어올 파일 경로 설정
		File fileOriginal = new File(originDir,Filename); // 읽어올 파일 설정
		
		File copyDir = new File(CopyPath); // 경로 설정
		if(!copyDir.exists() ) copyDir.mkdirs(); //경로생성
		File copy = new File(copyDir, Filename); //파일설정
		
		BufferedInputStream bis
		= new BufferedInputStream(new FileInputStream(fileOriginal));
		BufferedOutputStream bos
		= new BufferedOutputStream(new FileOutputStream(copy));
		
		//int data;
		//while(( data = bis.read()) !=-1) bos.write(data); 로 하거나 아니면 아래와 같이 작성 가능
		
		byte[] data = new byte[1024];
		int size;
		while( (size= bis.read(data)) != -1) bos.write(data, 0, size);
		
		bis.close();
		bos.close();
	}
}