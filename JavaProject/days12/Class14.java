package days12;
class ThisA{
	private int num;
	public void init(int num) {
		this.num = num;
	}
	
	public void prn() {
		System.out.println("멤버변수 num의 값: " + this.num);
	}
}
public class Class14 {
	public static void main(String[] args) {
		ThisA t1 = new ThisA();
		t1.init(100);
		t1.prn();
	}

}
