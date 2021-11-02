package days12;


// int형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 갖는 클래스 제작
// 멤버 필드로는 int dan; 하나 생성
// 멤버 메소드 : dan 값이 0이면 1~9단 모두 출력, 0 이 아니면 해당 구구단만 출력 ptint()
// 디폴트 생성자는 dan 변수를 0으로 저장, 전달 인수가 있는 생성자는 dan변수를 전달 인수값으로 저장
class Gugudan {
	int dan;
	
	Gugudan() {
		dan = 0;
	}
	Gugudan(int d) {
		dan = d;
	}
		public void print() {
			if(dan==0) {
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%dx%d=%d\n" , i, j, i*j);
				}
			    System.out.println();
				}
			}else {
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d\n",dan, j, dan*j);
			}
		}
    }
}

public class Class12 {
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		System.out.println();
		g2.print();

	}

}
