package view.TelaCadastro;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import view.TelaLogin.*;
import view.TelaPrincipal.MeusPets;
import controle.ControleCadastro;
import controle.ControleLogin;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 *  Classe QuadroCadastro posiciona os elementos na tela
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class QuadroCadastro implements ActionListener {
	private JFrame janela;
	private int bordaX = 24;
	private int bordaY = 24;
	private ControleCadastro controle;
	private FormularioCadastro formularioCadastro;

	public QuadroCadastro(JFrame janela, ControleCadastro controle) {
		this.janela = janela;
		this.controle = controle;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		// criar botão voltar, não esquecer de usar o .setActionCommand nos botões
		if ("voltar" == ae.getActionCommand()) {
	        
	    } else if("cadastrar" == ae.getActionCommand()) {
	    	boolean ok = controle.Cadastrar(
	    			formularioCadastro.getEmail(),
	    			formularioCadastro.getCpf(),
	    			formularioCadastro.getTelefone(),
	    			"",
	    			formularioCadastro.getDatanasc(),
	    			formularioCadastro.getSexo(),
	    			formularioCadastro.getSenha(),
	    			formularioCadastro.getConfirmarSenha()
	    		);
	    	
	    	if(!ok) {
	    		formularioCadastro.mostrarErro();
	    	}
	    }
	}
	
	/**
	 * chama os elementos
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
		JLabel titulo = new JLabel("Cadastre-se!");
		
		titulo.setBounds(bordaX + 50, 0, 400, 90); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.DARK_GRAY);
		
		janela.add(titulo);
	}
	/**
	 * formulasrio
	 * @param janela
	 */
	private void construirFormulario(JFrame janela) {
		formularioCadastro = new FormularioCadastro(janela);
		formularioCadastro.construir();
	}
	/**
	 * botoes
	 * @param janela
	 */
	private void construirBotoes(JFrame janela) {
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoCadastrar.setBounds(bordaX + 140, bordaY + 400, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoCadastrar);
		
	}
}
