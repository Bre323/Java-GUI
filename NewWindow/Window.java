package NewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("This is a New Window");
	
	Window() {
		label.setBounds(75, 100, 150, 50);
		label.setFont(new Font("Arial", Font.PLAIN ,12));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
