package swing.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameBackground extends JFrame {
	
	public MyFrameBackground(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
//		frame.setLocation(500, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정
		setLayout(new FlowLayout());
		
		// 컴포넌트 추가
		JButton button1 = new JButton("OK");
		button1.setBackground(Color.BLUE);
		add(button1);
		
		JButton button2 = new JButton("Cancel");
		button2.setBackground(Color.RED);
		add(button2);
		
		JButton button3 = new JButton("Ignore");
		add(button3);
		
		Container contentPane = this.getContentPane();
		
		this.setBackground(Color.ORANGE);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrameBackground("frame 배경색 설정"); 
	}
}
