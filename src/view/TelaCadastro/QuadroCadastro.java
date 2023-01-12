package view.TelaCadastro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import view.PrimeiraTela.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class QuadroCadastro implements ActionListener {
	private JFrame janela;
	private int bordaX = 24;
	private int bordaY = 24;
	
	public QuadroCadastro(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		// criar voltar, não esquecer de usar o .setActionCommand nos botões
		if ("voltar" == ae.getActionCommand()) {
	        
	    } else if("cadastrar" == ae.getActionCommand()) {
	        new PrimeiraTela();
	        janela.dispose();
	    }
	}
	
	public void construir() {
//		construirFundo(janela);
		construirTitulo(janela);
		construirFormulario(janela);
		construirBotoes(janela);
	}
	
	private void construirTitulo(JFrame janela) {
		JLabel titulo = new JLabel("Cadastro");
		
		titulo.setBounds(bordaX + 50, bordaY, 400, 90); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.black);
		
		janela.add(titulo);
	}
	
	private void construirFormulario(JFrame janela) {
		FormularioCadastro formularioCadastro = new FormularioCadastro(janela);
		formularioCadastro.construir();
	}
	
	private void construirBotoes(JFrame janela) {
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoCadastrar.setBounds(bordaX + 140, bordaY + 378, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoCadastrar);
		
	}
}
