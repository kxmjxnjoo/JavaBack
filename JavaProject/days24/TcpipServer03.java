package days24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	Socket socket; //2. run()메소드에도 사용해야 하기 때문에 멤버변수로 선언
	DataOutputStream out;
	String name;
	Sender(Socket s) {
		this.socket=s;
		try {
			out = new DataOutputStream( socket.getOutputStream() );
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out!=null) {
			try {
				out.writeUTF(name + sc.nextLine());
				//화면에 입력한 내용을 만들어둔 말머리와 함께 전송
			} catch(IOException e) { e.printStackTrace();}
		}
	}
}
class Receiver extends Thread{
	Socket socket;
	DataInputStream in;
	Receiver(Socket s) {
		this.socket=s;
		try {
			in = new DataInputStream( socket.getInputStream() );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while(in!=null) {
			try {
				System.out.println(in.readUTF());
			} catch(IOException e) { e.printStackTrace(); }
		}
	}
}
public class TcpipServer03 {

	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(5555);
			System.out.println("서버가 준비되었습니다. 연결을 기다립니다.");
			s = sS.accept(); //s에 연결 및 상대클라이언트 정보 저장
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s); 
			//1. 주소를 전달하고 각 스레드에 전달인수가 있는 생성자 생성
			sender.start();
			receiver.start();
		} catch (IOException e) { e.printStackTrace();	}
	}
}