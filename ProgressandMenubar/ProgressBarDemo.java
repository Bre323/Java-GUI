package ProgressandMenubar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar progressBar = new JProgressBar();
	
	
	ProgressBarDemo() {
		progressBar.setValue(0);
		progressBar.setBounds(0, 0, 385, 50);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.BLACK);
		
		frame.add(progressBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	
	public void fill() {
		int counter = 0;
		
		while(counter <= 100) {
			progressBar.setValue(counter);
			
			try {
				Thread.sleep(50);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter++;
		}
		
		progressBar.setString("Loading Complete");
		frame.dispose();
		MenuDemo menu = new MenuDemo();
	}
	
}
