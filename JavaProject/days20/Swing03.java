package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener {
	//1. ActionListener를 implements 함
	//2. 적용할 컨트롤에 addActionListner 메소드로 감시설정함
	//3. 해당 컨트롤에 이벤트가 발생하면 호출된 ActionPerformed메소드를 오버라이딩함
	JLabel result;
	
	ButtonEvent() {
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		result = new JLabel(""); //버튼 클릭에 의해서 실행 결과가 담길 라벨
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		//이벤트를 설정하고 감시할 리스너를 적용하고자한느 컨트롤에 붙여둠
		//해당 컨트롤에 클릭등의 이벤트가 발생하면 자동으로 actionPerformed메소드가 호출됨
		male.addActionListener(this);
		female.addActionListener(this);
		
		setTitle("버튼 이벤트 테스트"); //윈도우 좌측 상단에 표시된 타이틀 내용 설정
		setSize(300, 200); // 윈도우 크기 설정 : 단위(픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);  //화면에 윈도우를 출현시키는 메소드
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//클릭된 컨트롤의 표시된 값이 문자변수 s에 저장
		String s = e.getActionCommand(); 
		result.setText(s);
	}
}
public class Swing03 {

	public static void main(String[] args) {
		new ButtonEvent();
	}
}