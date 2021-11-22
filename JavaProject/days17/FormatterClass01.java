package days17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatterClass01 {

	public static void main(String[] args) {
		// 날짜 데이터 클래스, Calendar와는 다름
		Date today = new Date(); // java.util.Date
		System.out.println(today);
		
		// 날짜 서식 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		// 날짜 데이터를 서식 데이터에 맞춰서 적용 후 출력
		System.out.println(sdf1.format(today));
		
		// 날짜 서식 레퍼런스 변수들
		SimpleDateFormat sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS ");
		sdf4 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss a");
		// 시간H -> 대문자 : 24시간 표기 소문자 : 12시간 표기 
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		// y : 년도를 표시할 자리수 문자(yyyy:2021, yy:21)
		// M: 월을 표시할 자리수 문자 (MM:01~12, M:1~12)
		//	d : 일을 표시하는 자리수 문자(dd:01~31, d:1~31)
		// H : 시에 해당하는 자리수 문자(HH: 01~23, H:1~12)
		// h : 시에 해당하는 자리수 문자(hh: 01~12 h: 1~12)
		// m : 분		s: 초		SS: 밀리초		a: 오전/오후
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날 입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날 입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주 입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주 입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 입니다.");
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS ");
		sdf4 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss a");
		System.out.println(sdf1.format(today)); // format(Date d)
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}
}