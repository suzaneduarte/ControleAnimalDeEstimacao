package view.TelaLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import view.TelaCadastro.*;
import view.TelaPrincipal.MeusPets;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;

public class QuadroLogin implements ActionListener {
	private JFrame janela;
	
	private int bordaX = 24;
	private int bordaY = 24;
	
	public QuadroLogin(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		if ("entrar" == ae.getActionCommand()) {
	        new MeusPets();
	        janela.dispose();
	    } else if("cadastrar" == ae.getActionCommand()) {
	        new TelaCadastro();
	        janela.dispose();
	    }
	}
	
	public void construir() {
		construirTitulo(janela);
		construirFormulario(janela);
		construirBotoes(janela);
	}
	
	private void construirTitulo(JFrame janela) {
		JLabel titulo = new JLabel("Olá! Faça seu Login");
		
		titulo.setBounds(bordaX, bordaY, 400, 90); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.DARK_GRAY);
		
		janela.add(titulo);
	}
	
	private void construirFormulario(JFrame janela) {
		FormularioLogin formularioLogin = new FormularioLogin(janela);
		formularioLogin.construir();
	}
	
	private void construirBotoes(JFrame janela) {
		JButton botaoEntrar = new JButton("Entrar");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoEntrar.setBounds(bordaX + 80, bordaY + 200, 120, 20);
		botaoEntrar.setActionCommand("entrar");
		botaoEntrar.addActionListener(this);
		
		botaoCadastrar.setBounds(bordaX + 224, bordaY + 200, 120, 20);
		botaoCadastrar.setActionCommand("cadastrar");
		botaoCadastrar.addActionListener(this);
		
		janela.add(botaoEntrar);
		janela.add(botaoCadastrar);
	}
}