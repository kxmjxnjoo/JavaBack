package days22;
//### Thread
//- 프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을 때 원래 갖고 있는 
//   메인 Thread 외에 Thread 클래스를 추가사용하여 실행시킬 수 있음
//- Thread Class
// - 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스
//- 구현 방법
//  1. Thread클래스를 상속받는 방법
//     1-1 Thread클래스를 상속받아 public void run() 메소드를 오버라이딩함. 
//        - public void run() : 스레드가 생성되어 수행할 작업을 정의하는 메소드
//        
//     1-2 해당 클래스의 객체를 생성하고 start메소드를 호출(실행)함 
//         만약 오버라이딩된 run 메소드를 호출하면, 스레드 생성실행이 아니라, 
//          일반 메소드 호출이 되므로 반드시 start메소드를 통해 run으로 이어지게 호출해야함
//        - start메소드 : Thread(부모 클래스)에 있는 메소드로, 자체적으로 스레드 추가 생성후 run메소드를 재호출하는 역활을 함(상속된 메소드로 메소드가 표면에 보여지지 않은 채 사용됨
//   2. Runnable 인터페이스를 implements(구현)하는 방법
//      2-1 Thread클래스를 상속하는 방법과 같고 효과도 거의 같음
class ThreadB1 extends Thread{
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.printf("ThreadB1 : i -> %d\n", i);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadB2 extends Thread{
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.printf("ThreadB2 : i -> %d\n", i);
			try {
				sleep(300);
//### sleep 메소드
//- Thread 클래스에 있는 static 메소드
//    - 사용할 때 Thread.sleep()으로 사용해야 하지만 현재 위치는 
//		 자기 자신의 클래스 내부이므로 sleep() 으로만 사용 가능
//    - 프로세서 실행에 관여하는 명령이라 예외처리가 따라다님
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Thread02 {

	public static void main(String[] args) {
		ThreadB1 b1 = new ThreadB1();
		ThreadB2 b2 = new ThreadB2();
		//b1.run();
		b1.start();
		b2.start();
		for(int i=1; i<=10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}