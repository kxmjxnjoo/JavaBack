package days22;

import java.io.IOException;

public class IO03 {

	public static void main(String[] args) throws IOException {
		
		byte[] firstNumber = new byte[10];
		byte[] secondNumber = new byte[10];
		//자료형이 byte라는 건, 배열 한 칸에 -128~127까지를 저장한다는 뜻
		//입력받은 하나의 숫자가 제한되는 것이 아니라 입력받은 아라비아 기호의
		//아스키 코드값이 제한된다는 것
		
		System.out.print("첫번째 정수 : ");
		int size_1 = System.in.read(firstNumber);
		System.out.print("두번째 정수 : ");
		int size_2 = System.in.read(secondNumber);
//		//입력한 글자들 외에 데이터의 끝을 표시하는 글자와 입력한 엔터까지 저장되어서
//		//배열에 저장된 데이터 갯수 +2개의 size가 출력됨
//		System.out.println(size_1);
//		for(int i=0; i<firstNumber.length; i++) 
//			System.out.printf("%c", (char)firstNumber[i]);
//		System.out.println();
//		System.out.println(size_2);
//		for(int i=0; i<secondNumber.length; i++) 
//			System.out.printf("%c", (char)secondNumber[i]);
		
		// 165입력했을 경우 
		//firstNumber[0] = '1'
		//firstNumber[1] = '6'
		//firstNumber[2] = '5'
		//('5'-'0')*1 + ('6'-'0')*10 + ('1'-'0')*100
		
		int i, m, n1=0, n2=0; //i 배열의 인덱스 m: 각자리에 곱셉이될 10의 자승
		for(i= size_1 -3, m=1; i>=0; i--, m*=10) {
			n1 += (firstNumber[i] - '0') *m;
			System.out.printf("firstNumber[%d]-%d \t", i, firstNumber[i]-'0');
			System.out.printf(" %d x %d => %d \t", 
						firstNumber[i]-'0', m,	(firstNumber[i]-'0')*m);
			System.out.println(n1);
		}
		//i는 1의 자리숫자가 있는 첨자부터 0번째(가장 큰자리수 숫자가 있는곳) 까지 반복
		//1234입력 시 size가 6이고 i변수는 size-3번째(6-3부터) 0까지 반복함
		//그 처음이 '4'해당하는 배열 인덱스 3의 자리글자임
		//그렇게 지목된 일의 자리의 글잡주터 '0'글자를 뺄셈해서 아스키 코드값의 차로 4
		//해당 숫자를 얻고 각 반복마다 10이 계속 곱해지는(1,10,100,1000...)
		//m값을 곱해서 각 자리수를 만들어 그것을 n1변수에 누적함
		System.out.println();
		for(i=size_2-3, m=1; i>=0; i--, m=m*10) {
			n2 += (secondNumber[i] - '0') *m;
			System.out.printf("secondNumber[%d]-%d \t", i, secondNumber[i]-'0');
			System.out.printf(" %d x %d => %d \t", 
						firstNumber[i]-'0', m,	(secondNumber[i]-'0')*m);
			System.out.println(n2);
		}
	}
}