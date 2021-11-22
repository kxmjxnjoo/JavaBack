package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonTest2 extends JFrame{
	ButtonTest2() { 	//윈도우 최초화면의 구성은 대부분 생성자 메소드에서 구성함
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton plus = new JButton("+");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton minus = new JButton("-");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton mult = new JButton("x");
		JButton result = new JButton("=");
		JButton zero = new JButton("0");
		JButton clear = new JButton("C");
		JButton divide = new JButton("÷");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(seven);
		con.add(eight);
		con.add(nine);
		con.add(plus);
		con.add(four);
		con.add(five);
		con.add(six);
		con.add(minus);
		con.add(one);
		con.add(two);
		con.add(three);
		con.add(mult);
		con.add(result);
		con.add(zero);
		con.add(clear);
		con.add(divide);
		
		setTitle("버튼 컴퍼넌트 테스트"); //윈도우 좌측 상단에 표시된 타이틀 내용 설정
		setSize(220, 200); // 윈도우 크기 설정 : 단위(픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//현재 윈도우 종료시 프로그램까지 종료 설정
		setVisible(true);  //화면에 윈도우를 출현시키는 메소드
	}
}
public class Swing02 {

	public static void main(String[] args) {
		new ButtonTest2();
	}
}
