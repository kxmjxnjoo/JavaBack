package days12;
// 멤버메소드의 주된목적 멤버변수의 값을 저장, 대입, 세팅하거나 얻어오거나가 큼
// 때문에 멤버메소드(저장하고 얻어오는 메소드)를 별도의 사유가 없어도 
//멤버변수에 따라필요한 만큼 만들고 시작하는 경우가 많음
// 메소드의 이름은 setter와 getter라는 이름을 사용하는 두개의 메소드임
class GetSetTest {
	private int intVar;
	private double doubleVar;
	private String stringVar;
	
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
// 멤버 변수가 하나 만들어지면 그 변수에 전달값을 저장할 수 있는 메소드와 값을 얻어낼 수 있는 메소드 생성
// 멤버 변수의 값을 저장하는 메소드 이름 : setIntVar
//public void setIntVar(int n) {
//	intVar = n;
// 	}
//public int getIntVar() {
//	return intVar;
//	}
//public void setdoubleVar(double d) {
//	doubleVar = d;
// 	}
//public double getDouvleVar() {
//	return doubleVar;
//	}
//public void setStringVar(String s) {
//	stringVar = s;
// 	}
//public String getStringVar() {
//	return stringVar;
//	}
}
public class Class07 {
	
	public static void main(String[] args) {
		GetSetTest gs = new GetSetTest();
		gs.setIntVar(123);
		System.out.println("멤버변수 intVar : " + gs.getIntVar());
	}

}
