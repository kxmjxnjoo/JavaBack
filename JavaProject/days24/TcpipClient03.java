package days24;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class TcpipClient03 {

	public static void main(String[] args) {
		String serverIP = "192.168.35.27";
		try {
			Socket s = new Socket(serverIP,5555);
			System.out.println("서버에 연결");
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s); 
			sender.start();
			receiver.start();
		} catch ( UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		} catch (Exception e) {e.printStackTrace();	
		}
	}
}