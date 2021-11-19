package days15;

class Car {
	int 엔진;
	int 배기량;
	int 도어개수;
}
class k7 extends Car { //자식클래스 선언
	public void printInfor() { //자식 클래스에서는 상속받은 멤버를 사용할 수 있음
		System.out.printf("엔진 %d\n", this.엔진);
		System.out.printf("배기량: %d\n", this.배기량);
		System.out.printf("도어개수: %d\n", this.도어개수);
	}
}
public class Extends02 {

	public static void main(String[] args) {
		k7 k = new k7();
		k.엔진 = 6;		k.배기량 = 3000;		k.도어개수 = 5;
		k.printInfor();
	}

}
