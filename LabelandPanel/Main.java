package LabelandPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		//JLabel = R�tulos que podem ser exibidos nos frames
		
		JLabel label = new JLabel();  //Cria��o de um JLabel
		label.setText("Apenas um texto aleat�rio!");  //Insere texto no label criado. Tamb�m pode ser colocado logo na declara��o
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);

	}

}
