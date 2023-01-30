package view.TelaCadastroAnimal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import view.TelaCadastro.*;
import view.TelaPrincipal.MeusPets;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;

import controle.ControleCadastroPet;

/**
 *  Classe QuadroAnimal posiciona os elementos na tela
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */
public class QuadroAnimal implements ActionListener {
	private JFrame janela;
	private ControleCadastroPet controle;
	private int bordaX = 24;
	private int bordaY = 24;
	FormularioCadAnimal formularioAnimal;
	
	public QuadroAnimal(JFrame janela, ControleCadastroPet controle) {
		this.janela = janela;
		this.controle = controle;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		if ("voltar" == ae.getActionCommand()) {
	        controle.Voltar();
	    } else if("cadastrar" == ae.getActionCommand()) {
	    	controle.Cadastrar(formularioAnimal.getEspecie(), formularioAnimal.getRaca(), formularioAnimal.getNome(), formularioAnimal.getDataNasc(), formularioAnimal.getSexo() );
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
		JLabel titulo = new JLabel("Cadastre seu Pet!");
		
		titulo.setBounds(bordaX, bordaY, 500, 160); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.DARK_GRAY);
		
		janela.add(titulo);
	}
	/**
	 * formulario
	 * @param janela
	 */
	private void construirFormulario(JFrame janela) {
		formularioAnimal = new FormularioCadAnimal(janela, controle);
		formularioAnimal.construir();
	}
	
	/**
	 * botoes
	 * @param janela
	 */
	private void construirBotoes(JFrame janela) {
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoVoltar.setBounds(bordaX + 80, bordaY + 490, 120, 20);
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		
		botaoCadastrar.setBounds(bordaX + 224, bordaY + 490, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoVoltar);
		janela.add(botaoCadastrar);
	}
}