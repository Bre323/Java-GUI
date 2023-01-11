package Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
	
	public static void main(String[] args) {
		
		//Layout Manager define como é o layout dos componentes dentro do container
		
		//Border Layout: Gerencia os componentes em 5 regiões(NORTH, SOUTH, EAST, WEST e CENTER)
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(5, 5));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.black);
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		
		/*  -------------------  JPanel Panel5  -----------------------  */
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.red);
		panel7.setBackground(Color.blue);
		panel8.setBackground(Color.green);
		panel9.setBackground(Color.yellow);
		panel10.setBackground(Color.black);
		
		
		panel5.setLayout(new BorderLayout(5, 5));
		
		
		panel6.setPreferredSize(new Dimension(25, 25));
		panel7.setPreferredSize(new Dimension(25, 25));
		panel8.setPreferredSize(new Dimension(25, 25));
		panel9.setPreferredSize(new Dimension(25, 25));
		panel10.setPreferredSize(new Dimension(25, 25));
		
		
		panel5.add(panel6, BorderLayout.SOUTH);
		panel5.add(panel7, BorderLayout.WEST);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.NORTH);
		panel5.add(panel10, BorderLayout.CENTER);
		
		/*  -----------------------------------------------------------  */
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.EAST);
		frame.add(panel3, BorderLayout.WEST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
	}

}
