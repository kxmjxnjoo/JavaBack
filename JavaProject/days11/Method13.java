package days11;

public class Method13 {

	public static void main(String[] args) {
		
		int max_result = max(10,50,6); 
		max_result = max(56,87);
		double max_resultD = max(123.45, 456.56);
		// 정의된 메소드들의 매개변수들과 맞지 않은 호출은 에러임
		// ex) System.out.println("세 개의 정수 중 큰 값 " + max(11,33,55,44));//에러 int 4로 한 오버로딩 없음
		
	}
	public static double max(double a, double b) {
		double mv = (a>b) ? a : b; 
		return mv;
	}
	public static int max(int i, int j) {
		int mv = (i>j) ? i : j; 
		return mv;
	}
	public static int max(int i, int j, int k) {
		int mv = max(i,j);
		mv = max(mv,k);
		return mv;
	}
}
