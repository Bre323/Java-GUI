package LabelandPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		//JLabel = Rótulos que podem ser exibidos nos frames
		
		Border border = BorderFactory.createLineBorder(Color.blue, 3);
		
		JLabel label = new JLabel();  //Criação de um JLabel
		label.setText("Apenas um texto aleatório!");  //Insere texto no label criado. Também pode ser colocado logo na declaração
		label.setHorizontalAlignment(JLabel.CENTER);  //Define o posicionamento do label de acordo com o eixo X
		label.setVerticalAlignment(JLabel.CENTER);    //Define o posicionamento do label de acordo com o eixo Y
		label.setForeground(Color.blue);  //Define a cor da fonte
		label.setFont(new Font("Arial", Font.BOLD, 20));  //Define outras características da fonte, como tipo e tamanho
		label.setBackground(Color.black);  //Define a cor de fundo
		label.setOpaque(true);  //Mostra a cor de fundo definida pelo setBackground
		label.setBorder(border);  //Coloca a borda no label
		label.setBounds(95, 75, 300, 300);  //Define a posição e o dimensionamento do label dentro do frame
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.add(label);

	}

}
