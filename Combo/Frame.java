package Combo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {
	
	JComboBox comboBox;
	
	
	Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] cars = {"Lamborghini", "Porsche", "Ferrari"};
		comboBox = new JComboBox(cars);
		comboBox.addActionListener(this);
		comboBox.addItem("Mustang");
		comboBox.insertItemAt("Bugatti", 2);
		
		this.add(comboBox);
		this.setSize(250, 80);
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}

}
