package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutFrame extends JFrame {

	public GridLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
//		frame.setLocation(500, 300);
		setLocationRelativeTo(null);

		// 레이아웃 설정
		setLayout(new GridLayout(4,2));

		// 컴포넌트 추가
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("학번");
		JLabel label3 = new JLabel("학과");
		JLabel label4 = new JLabel("과목");
		
		JTextField textfield1 = new JTextField();
		JTextField textfield2 = new JTextField();
		JTextField textfield3 = new JTextField();
		JTextField textfield4 = new JTextField();
		
		add(label1);
		add(textfield1);
		
		add(label2);
		add(textfield2);
		
		add(label3);
		add(textfield3);
		
		add(label4);
		add(textfield4);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutFrame("Gridlayout 연습");
		
	}
}
