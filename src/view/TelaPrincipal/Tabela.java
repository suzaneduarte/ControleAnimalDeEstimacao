package view.TelaPrincipal;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleMeusPets;

import java.awt.Font;

import javax.swing.*;

public class Tabela implements ListSelectionListener {
	private JFrame janela;
	private ControleMeusPets controle;
	
    private JList b,b1,b2;
    private JLabel l1;
    
    JList<String> listaPets = new JList<String>();
    JLabel rotulo = new JLabel("Pesquisar na lista:");
	
	public Tabela(JFrame janela, ControleMeusPets controle) {
		this.janela = janela;
		this.controle = controle;
		
	    // Adiciona a caixa de texto usada para pesquisar os valores na lista
	    final JTextField pesquisa = new JTextField();    
	    janela.add(pesquisa);
	    janela.add(rotulo);
	    pesquisa.setBounds(10, 27, 150, 20);
//	    pesquisa.getDocument().addDocumentListener(
//	    		new DocumentListener(){
//	    			public void insertUpdate(DocumentEvent e){
//	    				pesquisarLista(MeusPets); 
//	    			}
//	    		);
	 
	    // Adiciona a lista à janela
	    JScrollPane scroll = new JScrollPane(listaPets);
	    janela.add(scroll);
	    scroll.setBounds(10, 49, 150, 150);  

	    scroll.setSize(350, 250);
	    scroll.setVisible(true);
	  }
	
	public void Construir() {
		//create a panel
		rotulo.setBounds(280, 290, 105, 55);
		listaPets.setBounds(280, 310, 105, 55);
		listaPets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPets.setVisibleRowCount(2); //linhas visiveis
		
		listaPets.setListData(controle.GerarListaDePets());
		listaPets.addListSelectionListener(this);
		listaPets.setOpaque(false);
		
		janela.add(listaPets);
		janela.add(rotulo);
	}
	
	

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(src == this.listaPets) {
			
		}
		
	}
	
	
	
	
}
