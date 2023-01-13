package Check;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JCheckBox checkBox;
	
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		checkBox = new JCheckBox("Check!");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Serif", Font.BOLD, 16));
		
		this.add(checkBox);
		this.add(button);
		this.setSize(250, 80);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}
}
