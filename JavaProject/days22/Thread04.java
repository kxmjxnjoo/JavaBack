package days22;
//### Runnable 인터페이스 구현 방법
//1. Runnable 인터페이스를 구현하는 클래스 작성
//2. public void run() 오버라이딩 구현
//3. 해당 클래스의 A 객체 생성
//4. A객체를 Thread 클래스의 생성자로 전달하여 Thread객체 생성
//5. 생성시킨 스레드의 start메소드 호출
class ThreadD1 implements Runnable {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.printf("ThreadD1 : i -> %d\n", i);
			try { Thread.sleep(1000);
			} catch (Exception e) { }
 		}
	}
}
class ThreadD2 implements Runnable {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.printf("ThreadD2 : i -> %d\n", i);
			try { Thread.sleep(1000);
			} catch (Exception e) { }
 		}
	}
}
public class Thread04 {
	public static void main(String[] args) {
		//Runnable 인터페이스를 구현한 스레드 생성
		//1.Runnable 인터페이스를 구현한 클래스의 객체 생성
		ThreadD1 t1 = new ThreadD1();
		//2. 1에서 생성된 객체를 Thread생성자에 전달인수로 전달하여 Thread객체 생성
		Thread t = new Thread(t1);
		//3. 2에서 생성된 Thread객체를 사용하여 start메소드 호출
		t.start();
		//위의 과정을 한 라인으로 작성한 코드
		new Thread(new ThreadD2()).start();
		for(int i=10; i>0; i--) {
			System.out.printf("main : i -> %d\n", i);
			try { Thread.sleep(1000);
			} catch (Exception e) { }
 		}
	}
}