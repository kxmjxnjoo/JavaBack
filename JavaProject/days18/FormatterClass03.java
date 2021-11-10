package days18;

import java.text.DecimalFormat;

public class FormatterClass03 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0000");
		double number = 123.123456;
		System.out.printf("%19s : %f --> %s\n", 
				"0000", number, df.format(number));
		
		number = 123456.71289;
		df = new DecimalFormat("0.000");
		System.out.printf("%19s : %f -> %s\n", 
				"0.000", number, df.format(number));
		
		number = 123456789.0;
		// 천단위 구분기호 표시 패턴 0,000,000
		df = new DecimalFormat("0,000");
		System.out.printf("%19s : %f ->  %s\n", "0,000", number, df.format(number));
	
		number = 89;
		df = new DecimalFormat("0,000");
		System.out.printf("%19s : %f ->  %s\n", "0,000", number, df.format(number));
		
		number = 89.0;
		// 무효의 0을 표시하지 않는 #을 0대신 사용
		df = new DecimalFormat("#,###");
		System.out.printf("%19s : %f ->  %s\n", "#,###", number, df.format(number));
		// 십의 자리든 백의 자리든 표시할 숫자가 있을 때만 표시 - 강제 0표시 안함
		// 표시할 숫자가 1000을 넘어갈때만 , 표시
		number = 123456.0;
		df = new DecimalFormat("0,000");
		System.out.printf("%19s : %f ->  %s\n", "#,###", number, df.format(number));
		
		// #을 이용한 소수점 표시 : #의 개수보다 표시할 숫자가 많으면 #개수만큼 표시
		// #개수보다 표시할 숫자가 적으면 숫자있는 만큼만 표시
		number = 123456.7128;
		df = new DecimalFormat("#,###.###");
		System.out.printf("%19s : %f ->  %s\n", "#,###.###", number, df.format(number));
		number = 123456.7;
		System.out.printf("%19s : %f ->  %s\n", "#,###.###", number, df.format(number));
		
		number = 1234;
		df = new DecimalFormat("#,###.원"); // 단위 또는 기호 첨가
		System.out.printf("%19s : %f ->  %s\n", "#,### 원", number, df.format(number));
		
		number = -1234.2;
		df = new DecimalFormat("#,###.##+;#,###.##-"); // 음수와 양수 표시
		System.out.printf("%19s : %f ->  %s\n", "#,###.##+;#,###.##-", number, df.format(number));
		
		number = 0.8539;
		df = new DecimalFormat("#.#%"); // 100을 곱해서 %로 표시
		System.out.printf("%19s : %f ->  %s\n", "#.#%", number, df.format(number));
		
		number = 123.172839;
		System.out.println("123.172839 -> " + (int)(number*10)/10.0);
		df = new DecimalFormat("0.0");
		System.out.println("123.172839 -> " + df.format(number));
	}
}