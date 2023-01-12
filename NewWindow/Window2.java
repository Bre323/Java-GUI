package NewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window2 {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Second Window");
	
	Window2() {
		label.setBounds(85, 75, 100, 50);
		label.setFont(new Font("Arial", Font.PLAIN ,12));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(275, 275);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
