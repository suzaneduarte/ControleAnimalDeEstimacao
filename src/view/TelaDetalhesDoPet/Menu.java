package view.TelaDetalhesDoPet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.ControleDetalhesDoPet;
import modelo.AnimalDeEstimacao;

public class Menu implements ActionListener {	
	private JFrame janela;
	private ControleDetalhesDoPet controle;
	private JButton meuspets, vacinas, minhaconta;
	private AnimalDeEstimacao animal;
	
	public Menu(JFrame janela, ControleDetalhesDoPet controle, AnimalDeEstimacao animal) {
		this.janela = janela;
		this.controle = controle;
		this.animal = animal;
	}

	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}

	
	public void construir() {
		JMenuBar barraMenu = new JMenuBar(); 
		
	    // Define e adiciona três menus drop down na barra de menus:
		JMenu acoesMenu = new JMenu("Ações com esse Pet");
		

	    JMenuItem editar = new JMenuItem(new AbstractAction("Editar esse Pet") {
	        public void actionPerformed(ActionEvent ae) {
	            controle.editarAnimal();
	        }
	    });
	    
	    JMenuItem deletar = new JMenuItem(new AbstractAction("Deletar esse Pet") {
	        public void actionPerformed(ActionEvent ae) {
	        	controle.deletarAnimal();
	        }
	    });
		
		barraMenu.add(acoesMenu);
		acoesMenu.add(editar);
		acoesMenu.add(deletar);
		
		janela.setJMenuBar(barraMenu);
	}
}