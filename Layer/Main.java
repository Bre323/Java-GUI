package Layer;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {

		// JLayeredPane � um container que d� uma terceira dimens�o para posicionamento (semelhante ao z-index)
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 100, 100);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 100, 100);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 100, 100);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 300, 300);
		layeredPane.add(label1);
		layeredPane.add(label2);
		layeredPane.add(label3);
		
		JFrame frame = new JFrame("Layers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 350);
		frame.setLayout(null);
		frame.add(layeredPane);
		frame.setVisible(true);

	}

}
