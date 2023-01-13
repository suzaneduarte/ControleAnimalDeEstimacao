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

public class QuadroAnimal implements ActionListener {
	private JFrame janela;
	
	private int bordaX = 24;
	private int bordaY = 24;
	
	public QuadroAnimal(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		if ("voltar" == ae.getActionCommand()) {
	        new MeusPets();
	        janela.dispose();
	    } else if("cadastrar" == ae.getActionCommand()) {
	       //adicionar na lista de pets 
	        new MeusPets();
	        janela.dispose();
	    }
	}
	
	public void construir() {
		construirTitulo(janela);
		construirFormulario(janela);
		construirBotoes(janela);
	}
	
	private void construirTitulo(JFrame janela) {
		JLabel titulo = new JLabel("Cadastre seu Pet!");
		
		titulo.setBounds(bordaX, bordaY, 500, 100); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.DARK_GRAY);
		
		janela.add(titulo);
	}
	
	private void construirFormulario(JFrame janela) {
		FormularioCadAnimal formularioLogin = new FormularioCadAnimal(janela);
		formularioLogin.construir();
	}
	
	private void construirBotoes(JFrame janela) {
		JButton botaoVoltar = new JButton("Voltar");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoVoltar.setBounds(bordaX + 80, bordaY + 380, 120, 20);
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		
		botaoCadastrar.setBounds(bordaX + 224, bordaY + 380, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoVoltar);
		janela.add(botaoCadastrar);
	}
}