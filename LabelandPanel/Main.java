package LabelandPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		//JLabel = Rótulos que podem ser exibidos nos frames
		//JPanel = Componente que funciona como um container que contém outros componentes
		
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
		label.setBounds(150, 150, 300, 300);  //Define a posição e o dimensionamento do label dentro do frame
		
		JPanel redPanelTop = new JPanel();
		redPanelTop.setBackground(Color.red);
		redPanelTop.setBounds(0, 0, 200, 200);
		
		JPanel greenPanelTop = new JPanel();
		greenPanelTop.setBackground(Color.green);
		greenPanelTop.setBounds(200, 0, 200, 200);
		
		JPanel bluePanelTop = new JPanel();
		bluePanelTop.setBackground(Color.blue);
		bluePanelTop.setBounds(400, 0, 200, 200);
		
		JPanel redPanelBottom = new JPanel();
		redPanelBottom.setBackground(Color.red);
		redPanelBottom.setBounds(0, 362, 200, 200);
		
		JPanel greenPanelBottom = new JPanel();
		greenPanelBottom.setBackground(Color.green);
		greenPanelBottom.setBounds(200, 362, 200, 200);
		
		JPanel bluePanelBottom = new JPanel();
		bluePanelBottom.setBackground(Color.blue);
		bluePanelBottom.setBounds(400, 362, 200, 200);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.add(label);
		frame.add(redPanelTop);
		frame.add(greenPanelTop);
		frame.add(bluePanelTop);
		frame.add(redPanelBottom);
		frame.add(greenPanelBottom);
		frame.add(bluePanelBottom);

	}

}
