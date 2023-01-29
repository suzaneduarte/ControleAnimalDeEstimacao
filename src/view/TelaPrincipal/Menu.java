package view.TelaPrincipal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.ControleMeusPets;
import view.TelaCadastro.*;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;

public class Menu implements ActionListener {	
	private JFrame janela;
	private ControleMeusPets controle;
	private JButton meuspets, vacinas, minhaconta;
	
	private int bordaX = 24;
	private int bordaY = 24;
	
	public Menu(JFrame janela, ControleMeusPets controle) {
		this.janela = janela;
		this.controle = controle;
	}

	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}

	
	public void construir() {
		JMenuBar barraMenu = new JMenuBar(); 
		
	    // Define e adiciona três menus drop down na barra de menus:
		JMenu meuspetsMenu = new JMenu("Meus Pets");
		JMenu minhacontaMenu = new JMenu("Minha Conta");
		JMenu vacinasMenu = new JMenu("Vacinas");
		
	    JMenuItem cadastrarVacina = new JMenuItem(new AbstractAction("Cadastrar nova vacina") {
	        public void actionPerformed(ActionEvent ae) {
	            controle.telaDeVacinas();
	        }
	    });

		//  Cria e adiciona um item simples para o menu:
	    JMenuItem sair = new JMenuItem(new AbstractAction("Sair") {
	        public void actionPerformed(ActionEvent ae) {
	            controle.deslogar();
	        }
	    });
		
		barraMenu.add(meuspetsMenu);
		barraMenu.add(vacinasMenu);
		barraMenu.add(minhacontaMenu);
		minhacontaMenu.add(sair);
		vacinasMenu.add(cadastrarVacina);
		
		janela.setJMenuBar(barraMenu);
	}
}