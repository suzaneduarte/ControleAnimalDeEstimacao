package view.TelaVacinas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleCadastroPet;
import controle.ControleVacinas;
//import view.TelaVacina.*;
//import view.TelaCadVacina

/**
 *  Classe QuadroVacina posiciona os elementos na tela
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class QuadroVacina implements ActionListener {
	private JFrame janela;
	private ControleVacinas controle;
	private int bordaX = 24;
	private int bordaY = 24;
	private FormularioCadVacina formulario;
	
	public QuadroVacina(JFrame janela, ControleVacinas controle) {
		this.janela = janela;
		this.controle = controle;
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("voltar" == ae.getActionCommand()) {
	        controle.Voltar();
	    } else if("cadastrar" == ae.getActionCommand()) {
	    	controle.Cadastrar(formulario.getNome(), formulario.getData(), formulario.getLote(), formulario.getLaboratorio(), formulario.getRevacina(), formulario.getPeriodo(), formulario.getIntervalo());
	    }
	}
	
	/**
	 * chama os elementos na tela
	 */
	public void construir() {
		construirTitulo(janela);
		construirFormulario(janela);
		construirBotoes(janela);
	}
	
	/**
	 * titulo
	 * @param janela
	 */
	
	private void construirTitulo(JFrame janela) {
		JLabel titulo = new JLabel("Cadastre uma vacina!");
		
		titulo.setBounds(bordaX, bordaY + 25, 550, 100); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.DARK_GRAY);
		
		janela.add(titulo);
	}
	/**
	 * formulario
	 * @param janela
	 */
	private void construirFormulario(JFrame janela) {
		formulario = new FormularioCadVacina(janela, controle);
		formulario.construir();
	}
	/**
	 * botoes
	 * @param janela
	 */
	private void construirBotoes(JFrame janela) {
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoVoltar.setBounds(bordaX + 80, bordaY + 520, 120, 20);
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		
		botaoCadastrar.setBounds(bordaX + 224, bordaY + 520, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoVoltar);
		janela.add(botaoCadastrar);
	}
}
