package days02;

public class Println02 {

	public static void main(String[] args) {
		System.out.println("\t\t ###성적표###");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총합\t평균");
		System.out.println("----------------------------------------------------");
		System.out.println("1\t홍길동\t\t98\t87\t56\t" + (98+87+56)+ "\t" + (98+87+56)/3.0);
		System.out.println("2\t홍길서\t\t78\t68\t98\t" + (78+68+98) + "\t" + (78+68+98)/3.0);
		System.out.println("3\t홍길남\t\t100\t100\t100\t" + (100+100+100) + "\t" + (100+100+100)/3.0);
	
	}
}