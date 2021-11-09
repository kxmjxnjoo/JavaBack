package days17;

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
		
	}
}