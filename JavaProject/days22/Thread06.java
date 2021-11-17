package days22;

import javax.swing.JOptionPane;

class ThreadE extends Thread{
	private boolean state = true;	//스레드 실행여부를 판단할 변수 생성
	//state변수값을 변경할 수 있는 멤버 메소드 생성
	public void setState(boolean s) {
		this.state = s;
	}
	public void run() {
		//수시로 state 변수를 확인하며 스레드 실행을 계속할지 검사함
		for(int i=10; i>0&&this.state == true; i--) {
			System.out.println(i);
			try { sleep(1000);
			} catch(Exception e) { }
		}
	}
}
//스레드를 계속할지 아니면 멈출지를 결정할 boolean변수가 멤버변수로 추가됨
//스레드를 계속하려면 true, 멈추려면 false로 값을 대입하녀 setState 메소드도 추가됨
//run메소드는 실행 중간중간 또는 반복실행의 조건에서 state변수가 true인지 검사함
//false면 멈춤 true면 계속 진행
public class Thread06 {

	public static void main(String[] args) {
		ThreadE t2 = new ThreadE();
		t2.start();
		String input = JOptionPane.showInputDialog("정답을 입력하세요.");
		//필요한 입력이 완료되면 스레드 실행중이더라도 state값을 false로 바꿔서 멈추게함
		t2.setState(false);
		//t2.stop()은 사용하지 않음
		System.out.println("입력하신 값은 " + input + "입니다");
	}
}