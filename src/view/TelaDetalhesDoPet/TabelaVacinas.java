package view.TelaDetalhesDoPet;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleDetalhesDoPet;
import enumerate.Especie;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Raca;
import modelo.Vacina;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina;

/**
 *  Classe TelaCadastro chama os demais elementos
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class TabelaVacinas implements ActionListener {

	private int bordaX = 24;
	private int bordaY = 24;
	
	private AnimalDeEstimacao animal;
	private ControleDetalhesDoPet controle;
	private JFrame janela;
	private JComboBox caixaSelecionarVacina;
	private JTable tabela;
	private JScrollPane barraRolagem;
	private JButton botaoEditar;
	private JButton botaoDeletar;
	
	public TabelaVacinas(AnimalDeEstimacao animal, ControleDetalhesDoPet controle, JFrame janela) {
		this.animal = animal;
		this.controle = controle;
		this.janela = janela;
	}
	
	/**
	 * Constroi os elementos da tabela 
	 */
	public void construir() {
		construirTabela();
		construirSelecaoDeVacinas();
		construirBotoes();
	}
	
	/**
	 * tabela
	 */
	
	private void construirTabela() {
		List<Object[]> vacinasFormatadas = new ArrayList<Object[]>();
		
		for(Vacina vacina : animal.getVacinas()) {
			Object[] formatada = {vacina.getNomeDaVacina(), vacina.getData(), vacina.getLaboratorio(), vacina.getLote(), vacina.getPeriodo() + " " + vacina.getIntervalo()};
			vacinasFormatadas.add(formatada);
		}

		String [] colunas = {"Nome", "Data", "Laboratorio", "Lote", "Frequencia" };
		
		tabela = new JTable(vacinasFormatadas.toArray(new Object[0][0]), colunas);
		tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	            botaoEditar.setEnabled(true);
	            botaoDeletar.setEnabled(true);
	        }
	    });
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(bordaX, bordaY + 280, 460, 100);
		
		janela.add(barraRolagem);
	}
	
	/**
	 * botoes
	 */
	
	private void construirBotoes() {
		botaoEditar = new JButton("Editar Vacina");
		botaoDeletar = new JButton("Deletar");
		JButton botaoVoltar = new JButton("Voltar");
		
		botaoEditar.setBounds(bordaX, bordaY + 400, 160, 20);
		botaoEditar.setActionCommand("editar");
		botaoEditar.addActionListener(this);
		botaoEditar.setEnabled(false);
		
		botaoDeletar.setBounds(bordaX + 300, bordaY + 400, 160, 20);
		botaoDeletar.setActionCommand("deletar");
		botaoDeletar.addActionListener(this);
		botaoDeletar.setEnabled(false);
		
		botaoVoltar.setBounds(bordaX + 150, bordaY + 460, 160, 20);
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		
		janela.add(botaoEditar);
		janela.add(botaoDeletar);
		janela.add(botaoVoltar);
	}
	
	/**
	 * vacinas
	 */
	
	private void construirSelecaoDeVacinas () {
		JLabel titulo = new JLabel("Vacinas: ");
		titulo.setBounds(bordaX, bordaY + 234, 120, 20);
		titulo.setFont(new Font("Arial", Font.BOLD, 14));
		
		String[] vacinasStrings = controle.BuscarVacinas();

		caixaSelecionarVacina = new JComboBox<String>(vacinasStrings);
		caixaSelecionarVacina.setBounds(bordaX + 150, bordaY + 234, 260, 20);
		
		JButton adicionarVacina = new JButton("+");
		adicionarVacina.setBounds(438, bordaY + 226, 45, 40);
		adicionarVacina.addActionListener(new AbstractAction("Cadastrar nova vacina") {
	        public void actionPerformed(ActionEvent ae) {
	            controle.adicionarVacina(caixaSelecionarVacina.getSelectedIndex());
	            janela.remove(barraRolagem);
	            construirTabela();
	        }
	    });
		
		janela.add(caixaSelecionarVacina);
		janela.add(titulo);
		janela.add(adicionarVacina);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if ("editar" == ae.getActionCommand()) {
			controle.editarVacina(tabela.getSelectedRow());
		} else if("deletar" == ae.getActionCommand()) {
			controle.removeVacina(tabela.getSelectedRow());
			janela.remove(barraRolagem);
			construirTabela();
		} else if("voltar" == ae.getActionCommand()) {
			controle.voltar();
		}
	}
}
