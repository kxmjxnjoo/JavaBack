package days03;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int num, kor, eng, mat, total;
	double avg;
	//String 형을 가장 먼저 입력해야함!!!!! ★
	System.out.print("이름을 입력하세요: ");
	name = sc.nextLine();
	
	System.out.print("번호를 입력하세요: ");
	num = sc.nextInt();
	
	System.out.print("국어 점수를 입력하세요: ");
	kor = sc.nextInt();
	
	System.out.print("영어 점수를 입력하세요: ");
	eng = sc.nextInt();
	
	System.out.print("수학 점수를 입력하세요: ");
	mat = sc.nextInt();
	
	total = kor + eng + mat;
	avg = total / 3.0;
	System.out.println("\t\t###성적표###");
	System.out.println("--------------------------------------------------");
	System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "번호", "국어", "영어", "수학", "총점", "평균");
	System.out.println("--------------------------------------------------");
	System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", name, num, kor, eng, mat, total, avg);
	
	System.out.println();
	System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
	System.out.println("--------------------------------------------------");
	System.out.println(name + "\t" + num + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + (int)(avg*100)/100.0);
	}
}