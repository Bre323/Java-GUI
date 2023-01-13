package Slider;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo() {
		frame = new JFrame("Slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);
		slider.addChangeListener(this);
		
		slider.setPreferredSize(new Dimension(350, 100));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setPaintLabels(true);
		slider.setFont(new Font("Arial", Font.PLAIN, 10));
		
		label.setText("Temperature: " + slider.getValue() + "°C");
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setResizable(false);
		frame.setSize(400, 250);
		frame.setVisible(true);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == slider) {
			label.setText("Temperature: " + slider.getValue() + "°C");
		}
	}
	
}
