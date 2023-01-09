package Frame;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		// JFrame: Cria uma tela onde os componentes serão adicionados.
		
		/*
		JFrame frame = new JFrame();  //Criação de um JFrame
		frame.setSize(500,500);  //Definição do tamanho padrão da janela
		frame.setVisible(true);  //Janela está visível
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Encerra aplicação ao fechar a janela
		frame.setResizable(false);  //Não é possível redimensionar a janela
		frame.getContentPane().setBackground(new Color(0x3f3367)); //Define a cor de fundo da janela
		*/
		
		new SecondFrame(); //Segunda janela, de outra classe chamada SecondFrame
	}

}
