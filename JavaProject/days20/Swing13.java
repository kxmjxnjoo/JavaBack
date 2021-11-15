package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// 컨테이너의 레이아웃 5행 1열의 GridLayout
//1행 : JPane p1 배치 -> p1에는 FlowLayout으로 TextField 한개 배치(가로크기 적당히)
//1행 : JPane p2 배치 -> p2에는 GridLayout으로 버튼 네개(7 8 9 +)
//1행 : JPane p3 배치 -> p3에는 GridLayout으로 버튼 네개(4 5 6 -)
//1행 : JPane p4 배치 -> p4에는 GridLayout으로 버튼 네개(1 2 3 *)
//1행 : JPane p5 배치 -> p5에는 GridLayout으로 버튼 네개(C 0 = ÷)
class Calculator extends JFrame implements ActionListener {
	JTextField jt;
	
	Calculator() {
		jt = new JTextField(15);
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성
		jt.setFont(f);
		// JButton b = new JButton("폰트");
		// b.setFont(f); // 버튼에 폰트 적용
		Container con = getContentPane();
		con.setLayout(new GridLayout(5,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setLayout( new FlowLayout(FlowLayout.CENTER));
		jt.setText("0");
		jt.setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false); // 마우스 키보드로 편집할 수 없게
		p1.add(jt);
		con.add(p1);

		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bp = new JButton("+");
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		bp.setFont(f);
		p2.setLayout(new GridLayout(1,4));
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bp);
		con.add(p2);
		
		JButton b6 = new JButton("6");
		JButton b5 = new JButton("5");
		JButton b4 = new JButton("4");
		JButton bm = new JButton("-");
		b6.setFont(f);
		b5.setFont(f);
		b4.setFont(f);
		bm.setFont(f);
		p3.setLayout(new GridLayout(1,4));
		p3.add(b6);
		p3.add(b5);
		p3.add(b4);
		p3.add(bm);
		con.add(p3);
		
		JButton b3 = new JButton("3");
		JButton b2 = new JButton("2");
		JButton b1 = new JButton("1");
		JButton bmt = new JButton("x");
		b3.setFont(f);
		b2.setFont(f);
		b1.setFont(f);
		bmt.setFont(f);
		p4.setLayout(new GridLayout(1,4));
		p4.add(b3);
		p4.add(b2);
		p4.add(b1);
		p4.add(bmt);
		con.add(p4);
		
		JButton bc = new JButton("C");
		JButton b0 = new JButton("0");
		JButton be = new JButton("=");
		JButton bd = new JButton("÷");
		bc.setFont(f);
		b0.setFont(f);
		be.setFont(f);
		bd.setFont(f);
		p5.setLayout(new GridLayout(1,4));
		p5.add(bc);
		p5.add(b0);
		p5.add(be);
		p5.add(bd);
		con.add(p5);
		
		b0.addActionListener(this);		b1.addActionListener(this);
		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);
		b6.addActionListener(this);		b7.addActionListener(this);
		b8.addActionListener(this);		b9.addActionListener(this);
		
		setTitle("Calculator Example");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jt.getText();
		String s = e.getActionCommand();
			jt.setText(s1 + s); // 기존 글자에 계속 누적됨
	}
}
public class Swing13 {
	public static void main(String[] args) {
		new Calculator();
	}
}