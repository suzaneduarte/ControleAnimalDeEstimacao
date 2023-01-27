package view.TelaPrincipal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import view.TelaCadastro.*;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;

public class Menu implements ActionListener {	
	private JFrame janela;
	private JButton meuspets, vacinas, minhaconta;
	
	private int bordaX = 24;
	private int bordaY = 24;
	
	public Menu(JFrame janela) {
		this.janela = janela;
	}

	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
			}

	
	public void construir() {
		JMenuBar barraMenu = new JMenuBar(); 
		
	    // Define e adiciona três menus drop down na barra de menus:
		JMenu meuspetsMenu = new JMenu("Meus Pets");
		JMenu vacinasMenu = new JMenu("Vacinas");
		JMenu minhacontaMenu = new JMenu("Minha Conta");

		//  Cria e adiciona um item simples para o menu:
	    JMenuItem sair = new JMenuItem("Sair");
		
		barraMenu.add(meuspetsMenu);
		barraMenu.add(vacinasMenu);
		barraMenu.add(minhacontaMenu);
		minhacontaMenu.add(sair);
		
		janela.setJMenuBar(barraMenu);
	}
}