package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener{
	JTextField jtf;
	
	JTextFieldTest(){
		jtf = new JTextField(30);
		// 30글자를 써넣을 수 있는 텍스트 상자를 생성함
		
		JButton bt1 = new JButton("반갑습니다");
		JButton bt2 = new JButton("안녕하세요");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(jtf);
		
		setTitle("텍스트 필드 테스트");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//텍스트 필드의 값을 넣는 메소드는 jtf.setText("문자들");
		//텍스트 필드에서 쓰여진 String을 가져오는 메소드 String str = jtf.getText();
		String s1 = jtf.getText();
		String s = e.getActionCommand();
		jtf.setText(s1 + s); // 기존 글자에 계속 누적됨
	}
}
public class Swing10 {

	public static void main(String[] args) {
		new JTextFieldTest();
	}
}