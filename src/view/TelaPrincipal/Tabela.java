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

import javax.swing.*;

public class Tabela implements ListSelectionListener, DocumentListener {
	private JFrame janela;
	private ControleMeusPets controle;

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
	
	public void ConstruirCampoDePesquisa() {
		rotulo.setBounds(10, 8, 150, 20);
		// Adiciona a caixa de texto usada para pesquisar os valores na lista
	    pesquisa.setBounds(10, 27, 150, 20);
	    pesquisa.getDocument().addDocumentListener(this);

	    janela.add(pesquisa);
	}
	
	public void ConstruirTabela() {		
		listaPets.setBounds(18, 57, 150, 150);
		listaPets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPets.setVisibleRowCount(2); //linhas visiveis

		listaPets.addListSelectionListener(this);
		listaPets.setOpaque(false);
		listaPets.setBackground(new Color(0, 0, 0, 0));
		listaPets.setListData(controle.GerarListaDePets(""));

		// Adiciona a lista à janela
	    JScrollPane scroll = new JScrollPane(listaPets);
	    scroll.setBounds(10, 49, 250, 350);  

	    scroll.setVisible(true);	
		
		janela.add(scroll);
		janela.add(rotulo);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(src == this.listaPets) {
			
		}
		
	}
	
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
		// Nada
	}
	
	
	
	
}
