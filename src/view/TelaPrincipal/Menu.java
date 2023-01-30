package view.TelaPrincipal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.ControleMeusPets;
import view.TelaCadastro.*;

/**
 *  Classe Menu da as opcoes de menu para o usuario
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */
public class Menu implements ActionListener {	
	private JFrame janela;
	private ControleMeusPets controle;
	private JButton meuspets, vacinas, minhaconta;
	
	public Menu(JFrame janela, ControleMeusPets controle) {
		this.janela = janela;
		this.controle = controle;
	}

	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}

	/**
	 * constroi os elementos do menu na tela
	 */
	
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