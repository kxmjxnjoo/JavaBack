package days23;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import days23.CalculatorResult;

public class IO21 {

	public static void main(String[] args) throws IOException, ClassNotFoundException  { 
		//특정 날짜를 입력 받아서 그 날짜 파일만 출력하세요
		//날짜 입력 양식을 정해서 잘못된 입력은 다시 입력 받게 설정해주세요
		System.out.print("출력할 날짜를 입력하세요(2020-01-01): ");
		String inputDate;
		Date iDate;
		BufferedReader in
		= new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		while(true) {
			try {
				inputDate = in.readLine();
				//if(inputDate.length()!=10) throw new Exception(); 
				//추가로 더 정확한 입력을 받기위해서 추가 가능함(catch()추가 작성 필요)
				iDate = sdf.parse(inputDate);
				break;
			} catch (ParseException e) {
				System.out.print("양식에 맞게 다시 입력해주세요(2020-11-19): ");
			} // try-catch를 사용했으면 IOException 여기서 설정해도 가능
		}
		System.out.println("입력한 날짜: " + sdf.format(iDate));
		
		//읽어올 파일 경로 설정
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		//폴더에서 모든 파일 목록 불러옴
		String[] f = dir.list();
		//for(String fn : f) System.out.println(fn);
		//파일명들을 이용한 반복실행문을 실행하여 입력한 파일만 대상으로 내용을 읽은 후 화면 출력
		for(int i=0; i<f.length; i++) {
			if(f[i].length()>10) { //앞으로 사용할 메소드가 f[i].substring(0,10);인데 
			//f[i]의 String 글자 갯수가 10(입력한 날짜의 글자수)가 안되멘 에러나기 때문에 애초에 제외하고 시작
				String s1 = f[i].substring(0,10);
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy_MM_dd");
				String s2 = sdf1.format(iDate) + ""; //의미 없는 글자를 붙이면 String이됨
			
				if(s1.equals(s2)) {
					File file = new File(dir, f[i]);
					ObjectInputStream ois = new ObjectInputStream(
							new BufferedInputStream(new FileInputStream(file)));
					ArrayList<CalculatorResult> list
						= (ArrayList<CalculatorResult>) ois.readObject();
					
					for(int j =0; j<list.size(); j++) 
						System.out.printf("%d. %s\n", j+1, list.get(j));
					ois.close();
				}
			}
		}
			//파일 이름과 입력한 날짜와 비교해서 같은 것만 출력해주세요
			//f[i]의 inputDate 와 비교
	}
}