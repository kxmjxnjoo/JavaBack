package days09;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생은 몇 명입니까?: ");
//		String tmp = sc.nextLine();
//		int std = Integer.parseInt(tmp);
		int std = Integer.parseInt(sc.nextLine());
		
		
//		int kor1, kor2, kor3 ... X 
		
		int[] kor = new int[std]; // 국어 점수들 저장용 배열
		int[] eng = new int[std]; // 영어점수용
		int[] mat = new int[std]; // 수학점수용
		int[] tot = new int[std]; // 총점용
		double[] avg = new double[std]; // 평균용 
		String[] name = new String[std]; //이름용
//		System.out.printf("1번 학생의 국어 점수: ");
//		kor[0] = sc.nextInt();
//		System.out.printf("1번 학생의 영어 점수: ");
//		eng[0] = sc.nextInt();
//		System.out.printf("1번 학생의 수학 점수: ");
//		mat[0] = sc.nextInt(); // 너무 번거롭고 많음
		
		for(int i=0; i<std; i++) {
			System.out.printf("%d 번 학생의 이름: ", i+1);
			name[i] = sc.nextLine(); //
			System.out.printf("%d 번 학생의 국어점수: ", i+1);
			kor[i] = Integer.parseInt( sc.nextLine() );
			System.out.printf("%d 번 학생의 영어점수: ", i+1);
			eng[i] = Integer.parseInt( sc.nextLine() );
			System.out.printf("%d 번 학생의 수학점수: ", i+1);
			mat[i] = Integer.parseInt( sc.nextLine() );
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;   // 아래 주석처리된 for(){} 문에 있는 걸 복사해옴 따로 하지 않고 바로바로 계산도 가능
			
		// nextLine과 nextInt 섞어 사용할 때 생기는 문제(과거 성적표 입력 때 내가 했던 질문) 
		// Line이 엔터도 인식하기 때문에 실행할 것이 끝났다고 여기고 다음으로 넘어가는 것
		// 1. 가장 쉬운 방법은 Line을 그렇게 일어날 것 같은 부분에 추가 입력해줌
		// 2. 문자를 입력받아 숫자로 변환하여 하는 것. 현재 sc.nextInt() 부분을 sc.nextLine()으로 받고
		//     문자열을 숫자로 변환해주는 문법 쓰기 ex) -> Integer.parstInt(sc.nextLine());   
		}
//		for(int i=0; i<std; i++) {
//			tot[i] = kor[i] + eng[i] + mat[i];
//			avg[i] = tot[i] / 3.0;
//		}
		System.out.println("\t\t###성적표###");
		System.out.println("-------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for(int i=0; i<std; i++) 
			System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n",
					i+1, name[i], kor[i], eng[i], mat[i], tot[i], avg[i]);
		System.out.println("-------------------------------------------------------");
	}
}