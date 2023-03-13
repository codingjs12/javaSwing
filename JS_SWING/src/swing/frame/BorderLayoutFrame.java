package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame {

	public BorderLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
//		frame.setLocation(500, 300);
		setLocationRelativeTo(null);

		// 레이아웃 설정
		setLayout(new BorderLayout());

		// 컴포넌트 추가
		JButton button1 = new JButton("1");
		add(button1, BorderLayout.NORTH);

		JButton button2 = new JButton("2");
		add(button2, BorderLayout.WEST);

		JButton button3 = new JButton("3");
		add(button3, BorderLayout.EAST);

		JButton button4 = new JButton("4");
		add(button4, BorderLayout.SOUTH);

		JButton button5 = new JButton("5");
		add(button5, BorderLayout.CENTER);

		JButton button6 = new JButton("6");
		add(button6, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutFrame("Borderlayout 연습");
		
	}
}
