package NewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton("Window");
	JButton button2 = new JButton("Second Window");
	
	
	LaunchPage() {
		button.setBounds(200, 150, 100, 50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		button2.setBounds(175, 225, 150, 50);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		frame.add(button);
		frame.add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			frame.dispose();
			Window window = new Window();
		}
		else if(e.getSource() == button2) {
			frame.dispose();
			Window2 window2 = new Window2();
		}
	}

}
