package LabelandPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		//JLabel = Rótulos que podem ser exibidos nos frames
		
		JLabel label = new JLabel();  //Criação de um JLabel
		label.setText("Apenas um texto aleatório!");  //Insere texto no label criado. Também pode ser colocado logo na declaração
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);

	}

}
