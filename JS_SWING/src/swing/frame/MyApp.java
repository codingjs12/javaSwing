package swing.frame;

import javax.swing.JFrame;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("나의 프레임");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
//		frame.setLocation(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
