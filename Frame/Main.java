package Frame;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		// JFrame: Cria uma tela onde os componentes ser�o adicionados.
		
		/*
		JFrame frame = new JFrame();  //Cria��o de um JFrame
		frame.setSize(500,500);  //Defini��o do tamanho padr�o da janela
		frame.setVisible(true);  //Janela est� vis�vel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Encerra aplica��o ao fechar a janela
		frame.setResizable(false);  //N�o � poss�vel redimensionar a janela
		frame.getContentPane().setBackground(new Color(0x3f3367)); //Define a cor de fundo da janela
		*/
		
		new SecondFrame(); //Segunda janela, de outra classe chamada SecondFrame
	}

}
