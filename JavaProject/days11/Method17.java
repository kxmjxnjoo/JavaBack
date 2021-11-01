package days11;

import java.util.Scanner;

public class Method17 {

	public static void main(String[] args) {
		int[][] scores;
		double[] avg;
		// int s = getStudentNumber(); //학생수를 입력받아서 리턴하는 메소드
		// int k = getSubjecttNumber(); //과목수를 입력받아서 리턴하는 메소드
		// scores = new int[s][k];
		scores = new int[getStudentNumber()][getSubjectNumber()+1];
		avg = new double [scores.length]; //2차원 배열의 length를 쓰면 행의 결과가 나옴
		input(scores); // s명의 학생의 k개의 과목수 입력 // 콜 바이 레퍼런스 사용
		cals(scores, avg); // 총점 평균 계산
		output(scores, avg); // 성적표 출력
	}
	
	private static int getStudentNumber() { //()안에 내용 넣을 필요없었음
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		return sc.nextInt();
	}
	
	public static int getSubjectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수 : ");
		return sc.nextInt(); //총점이 들어갈 자리 +1로 함
	}

	public static void input(int[][] s) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length-1; j++) { //-1하는 이유는 총점 자리를 남겨두기 위해
				System.out.printf("%d번 학생 %d과목 점수: ", i+1, j+1);
				s[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void cals(int[][] s, double[] a) {
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length-1; j++) {
				s[i][s[i].length-1] += s[i][j]; // 과목수 -1 에 += [i][j] 점수들을 저장해라 
			}
			a[i] = s[i][s[i].length-1] / (double)(s[i].length-1);
		}
	}
	
	public static void output(int[][] s, double[] a) {
		int sub = s[0].length;
		int std = s.length;
		System.out.println("\t\t=====성적표======");
		System.out.println("--------------------------------------");
		System.out.printf("번호\t");
		for(int i=0; i<sub-1; i++) 
			System.out.printf("과목%d\t", i+1);
		System.out.printf("총점\t평균\n");
		System.out.println("--------------------------------------");
		for(int i=0; i<std; i++) {
			System.out.printf("%d\t", i+1); // 0부터 시작이라 +1;
			for(int j=0; j<sub; j++)  // 총점까지 나와야하기 때문에 -1 안함
				System.out.printf("%d\t", s[i][j]);
			
		System.out.printf("%.1f\n", a[i]);
		}
		System.out.println("--------------------------------------");
	}

}
