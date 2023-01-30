package view.TelaPrincipal;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleMeusPets;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/**
 *  Essa é a classe que cria a tabela na qual os animais de estimação de determinado usuário irá aparecer. 
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class Tabela implements ListSelectionListener, DocumentListener {
	private JFrame janela;
	private ControleMeusPets controle;

	/**
	 * Cria o campo de pesquisa para busca do animal de estimação. 
	 */		
	
	JTextField pesquisa = new JTextField();
	
    private JList b,b1,b2;
    private JLabel l1;
    
    JList<String> listaPets = new JList<String>();
    JLabel rotulo = new JLabel("Pesquisar na lista:");
	
	public Tabela(JFrame janela, ControleMeusPets controle) {
		this.janela = janela;
		this.controle = controle;
	  }
	
	public void Construir() {
		ConstruirCampoDePesquisa();
		ConstruirTabela();
	}
	
	/**
	 * Adiciona a caixa de texto usada para pesquisar os valores na lista
	 */		
	
	public void ConstruirCampoDePesquisa() {
		rotulo.setBounds(10, 8, 150, 20);
	    pesquisa.setBounds(10, 27, 150, 20);
	    pesquisa.getDocument().addDocumentListener(this);

	    janela.add(pesquisa);
	}
	
	public void ConstruirTabela() {		
		listaPets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPets.setVisibleRowCount(2); //linhas visiveis

		listaPets.addListSelectionListener(this);
		listaPets.setOpaque(false);
		listaPets.setBackground(new Color(0, 0, 0, 0));
		listaPets.setListData(controle.GerarListaDePets(""));
		
		listaPets.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent evt) {
		        controle.detalhesDoPet(listaPets.getSelectedIndex());
		    }
		});

		/**
		 * Cria a funcionalidade de rolar os dados na tabela. E também adiciona a lista à janela
		 */		

	    JScrollPane scroll = new JScrollPane(listaPets);
	    scroll.setBounds(10, 49, 250, 440);

	    scroll.setVisible(true);
		
		janela.add(scroll);
		janela.add(rotulo);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(src == this.listaPets) {
			
		}
		
	}

	/**
	 * Esses métodos tem relação com os caracteres que são colocados no campo de busca "Pesquisar na lista:"
	 * O método insertUptade relaciona-se quando o usuário digita alguma letra no campo. 
	 * O método removeUpdate relaciona-se quando o usuário apaga alguma letra no campo. 
	 */	
	
	@Override
	public void insertUpdate(DocumentEvent e){
		String entrada = pesquisa.getText();
		listaPets.setListData(controle.GerarListaDePets(entrada));
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		String entrada = pesquisa.getText();
		listaPets.setListData(controle.GerarListaDePets(entrada));
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
	
	}
	
	
	
	
}
