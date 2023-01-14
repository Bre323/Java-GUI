package ColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	
	Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a Color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Random Text");
		label.setFont(new Font("Comic Sans", Font.BOLD, 20));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Choose color", Color.black);
			
			label.setForeground(color);
		}
	}
	
}
