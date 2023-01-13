package ProgressandMenubar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	
	MenuDemo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F
		editMenu.setMnemonic(KeyEvent.VK_D); //Alt + D
		helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			System.out.println("File Loaded!");
		}
		else if(e.getSource() == saveItem) {
			System.out.println("File Saved Successfully!");
		}
		else if(e.getSource() == exitItem) {
			System.exit(0);
		}
	}
	
}
