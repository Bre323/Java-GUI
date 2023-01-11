package Grid;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		// Grid Layout: Os componentes são organizados em uma grade com linhas e colunas
		// O componente ocupa todo o espaço da célula
		// Todas as células da grade possuem o mesmo tamanho

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 350);
		frame.setLayout(new GridLayout(3, 3, 10, 10));
		frame.setResizable(false);
		
		frame.add(new JButton("A"));
		frame.add(new JButton("B"));
		frame.add(new JButton("C"));
		frame.add(new JButton("D"));
		frame.add(new JButton("E"));
		frame.add(new JButton("F"));
		frame.add(new JButton("G"));
		frame.add(new JButton("H"));
		frame.add(new JButton("I"));
		
		frame.setVisible(true);
	}

}
