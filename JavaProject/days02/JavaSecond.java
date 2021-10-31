package days02;
// 클래스 이름은 영문과 숫자가 조합될 수 있다
// 첫 글자는 항상 영문이어야 한다
// 사용 가능한 기호가 있다면 (_) 정도만 가능하다

public class JavaSecond {

	public static void main(String[] args) {
		System.out.println("\t겁나 쉬운 자바 프로그래밍~!\n");
		System.out.println("\t겁나 쉬운 자바 프로그래밍~!\n");
		System.out.println("\t겁나 쉬운 자바 프로그래밍~!\n");
		
		System.out.printf("------------------------------------------------\n");
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("1\t89\t87\t56\t254\t81.5\n");
		System.out.printf("2\t87\t89\t54\t234\t83.5\n");
		System.out.printf("3\t56\t58\t58\t244\t85.7\n");
		System.out.printf("------------------------------------------------\n");
		
		System.out.printf("\n"); //한 줄 다음으로
		System.out.printf("겁나 쉬운 \"자바\" 프로그래밍\n");
		//큰 따옴표를 화면에 직접 출력하면 \"라고 해야 합니다
		// "만 사용한다면 시작 또는 끝나는 따옴표로 인식되어 오류를 발생시킵니다.
		System.out.printf("겁나 쉬운 \'자바\' 프로그래밍\n");
		System.out.printf("겁나 쉬운 '자바' 프로그래밍\n\n");
		
		System.out.printf("대통령은 조약을 \"체결-비준\" 하고, \n");
		System.out.printf("외교사절을 \"신입-점수\" 또는 \"파견\"하며, \n");
		System.out.printf("\'선전포고\'와 \'강화\'를 한다. \n\n");
		System.out.printf("대통령의 임기가 만료되는 때에는 \n");
		System.out.printf("임기만료 70%% 내지 40%% 전에 후임자를 선거한다\n\n");
		
	}
}
