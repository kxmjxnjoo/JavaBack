package days23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO10 {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\JAVA01\\java_se\\temp");
		File file_abc = new File(dir, "abc.txt");
		
		if( !file_abc.exists() ) file_abc.createNewFile();
		
		FileInputStream fis_abc = new FileInputStream(file_abc);
		FileWriter fos_abc = new FileWriter(file_abc);
		
		//File dir = new File("D:\\JAVA01\\java_se\\temp");
		//if(!dir.exists()) dir.mkdirs(); 	-> 폴더 만들어져 있어서 이번에 생략했음 그러나 평소엔 확인할 것
	
		//File file_text = new File(dir. "abc.txt"); 	-> 변수선언 다르나 동일
		//FileWriter fos_text = new FileWriter(file_text); 
		// 강사님 작성코드
		
		fos_abc.write("선거에 있어서 \"최고득표자\"가 2인 이상인 때에는 국회의 재적의원과 반수가 출석한 공개회의에서 다수표를 얻은 자를"
				+ "\"당선자\"로 한다. 이 헌법시행 당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속한다. \n\n\n"
				+ "국회의 회의는 공개한다. 다만, 출석의원 50%이상의 찬성이 있거나 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지"
				+ "아니할 수 있다.");
		fos_abc.close();
	}
}