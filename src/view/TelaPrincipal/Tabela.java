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
	//lists
    private JList b,b1,b2;
    private JLabel l1;
    
    JList<String> listaPets = new JList<String>();
	
	public Tabela(JFrame janela, ControleMeusPets controle) {
		this.janela = janela;
		this.controle = controle;
	}
	
	public void Construir() {
		//create a panel
		
		
		listaPets.setBounds(280, 310, 105, 55);
		listaPets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPets.setVisibleRowCount(2); //linhas visiveis
//		listaPets.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		
		listaPets.setListData(controle.GerarListaDePets());
		listaPets.addListSelectionListener(this);
		
		janela.add(listaPets);
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(src == this.listaPets) {
			
		}
		
	}
	
	
	
	
}
