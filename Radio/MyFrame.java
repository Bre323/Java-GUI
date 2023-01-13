package Radio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton gtaBt;
	JRadioButton minecraftBt;
	JRadioButton tetrisBt;
	
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		gtaBt = new JRadioButton("GTA");
		minecraftBt = new JRadioButton("Minecraft");
		tetrisBt = new JRadioButton("Tetris");
		
		ButtonGroup gameGroup = new ButtonGroup();
		gameGroup.add(gtaBt);
		gameGroup.add(minecraftBt);
		gameGroup.add(tetrisBt);
		
		gtaBt.addActionListener(this);
		minecraftBt.addActionListener(this);
		tetrisBt.addActionListener(this);
		
		this.add(gtaBt);
		this.add(minecraftBt);
		this.add(tetrisBt);
		this.pack();
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gtaBt) {
			System.out.println("let's play GTA!");
		}
		else if(e.getSource() == minecraftBt) {
			System.out.println("let's play Minecraft!");
		}
		else if(e.getSource() == tetrisBt) {
			System.out.println("let's play Tetris!");
		}
	}
	
}
