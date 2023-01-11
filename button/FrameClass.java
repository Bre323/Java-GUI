package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameClass extends JFrame {
	
	JButton button;
	
	FrameClass() {
		
		button = new JButton();
		button.setBounds(200, 200, 100, 50);
		button.addActionListener(e -> System.out.println("Botão Acionado!"));
		button.setText("Action");
		button.setFocusable(false);
		button.setFont(new Font("Arial", Font.BOLD, 16));
		button.setForeground(Color.ORANGE);
		button.setBackground(Color.DARK_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
	}
}
