package days14;
class StaticB{
	int bunho;
	static int count = 0;
	StaticB() {
		count++;
		bunho = count;
		// 생성자 메소드에서 count값을 1씩 증가시켜 그 값을 num에 저장
	}
}
public class Class19 {

	public static void main(String[] args) {
		System.out.printf("count = %d\n", StaticB.count);
		StaticB b1 = new StaticB();
		System.out.printf("b1.num = %d, count = %d\n", b1.bunho, StaticB.count);
		StaticB b2 = new StaticB();
		System.out.printf("b2.num = %d, count = %d\n", b2.bunho, StaticB.count);
		StaticB b3 = new StaticB();
		System.out.printf("b3.num = %d, count = %d\n", b3.bunho, StaticB.count);
		StaticB b4 = new StaticB();
		System.out.printf("b4.num = %d, count = %d\n", b4.bunho, StaticB.count);
	}

}
