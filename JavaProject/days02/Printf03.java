package days02;

public class  Printf03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * System.out.printf("\t\t###성적표###\n");
		 * System.out.printf("------------------------------------\n");
		 * System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		 * System.out.printf("%3d\t %d\t %d\t%d\t%d\t%3.1f\t ",1, 89, 87, 56, 254,
		 * 81.5); System.out.printf("\n %d\t %d\t %d\t%d\t%d\t%3.1f\t ",2, 87, 89, 54,
		 * 234, 83.5); System.out.printf("\n %d\t %d\t %d\t%d\t%d\t%3.1f\t ",3, 56, 58,
		 * 58, 244, 85.7);
		 */
		
		
		System.out.printf("%3s\t%10s\t%3s\t%3s\t%3s\t%3s\t%5s\n",
				"번호", "이름", "국어", "영어", "수학", "총점", "평균" );
		System.out.printf("----------------------------------------------------\n");
		
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 
				1, "홍길동", 98, 87, 56,(98+87+56), (98+87+56)/3.0 );
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 
				2, "홍길서", 78, 68, 98,(78+68+98), (78+68+98)/3.0 );
		System.out.printf("%3d\t%10s\t%3d\t%3d\t%3d\t%3d\t%5.1f\n", 
				3, "홍길남", 100, 100, 100, (100+100+100), (100+100+100)/3.0 );
		System.out.printf("----------------------------------------------------\n");
	}
}