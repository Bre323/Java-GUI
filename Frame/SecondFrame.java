package Frame;

import java.awt.Color;
import javax.swing.JFrame;

public class SecondFrame extends JFrame {
	
	SecondFrame() {
		this.setSize(400,400);  
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		this.setResizable(false);  
		this.getContentPane().setBackground(new Color(128, 33, 99));
	}
}
