package Flow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		
		// O flow Layout organiza os componentes em uma linha, com o tamanho ocupado de acordo com o tamanho dos componentes
		// Se o espaço horizontal do container for muito pequeno, os componentes são passados para a próxima fila disponível

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 200));
		panel.setBackground(Color.BLACK);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		
		panel.add(new JButton("A"));
		panel.add(new JButton("B"));
		panel.add(new JButton("C"));
		panel.add(new JButton("D"));
		panel.add(new JButton("E"));
		panel.add(new JButton("F"));
		panel.add(new JButton("G"));
		panel.add(new JButton("H"));
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
