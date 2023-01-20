package MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame implements MouseListener {

	JLabel label;
	
	
	Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(25, 25, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.pink);
	}

}
