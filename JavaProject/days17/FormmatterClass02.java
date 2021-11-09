package days17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormmatterClass02 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		String s2 = "2020/11/24";
		
		// SimpleDateFormat에는 parse메소드를 이용하여 날짜로 변환해주는 기능있음
		// 다만 변환을 위해서 설정된 서식을 반드시 지켜야하는 제약 존재

		Date d = sdf1.parse(s2);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2.format(d));
	}
}