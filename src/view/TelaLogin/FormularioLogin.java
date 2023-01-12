package view.TelaLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;

public class FormularioLogin implements ActionListener {
	JFrame janela;
	
	private int bordaX = 24;
	private int bordaY = 24;

	public FormularioLogin(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public void construir() {
		construirCaixaDeTexto(janela);
		construirCaixaDeTextoDeSenha(janela);
	}
	
	private void construirCaixaDeTexto(JFrame janela) {
		JLabel email = new JLabel("Seu e-mail:"); //rótulo só com texto
		email.setBounds(bordaX, bordaY + 100, 160, 30);
		email.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField caixaDeTexto = new JTextField(20); //cria campo de texto com largura de 10 colunas 
		caixaDeTexto.setActionCommand("myTF"); //define os comandos de ação de campo do texto
		caixaDeTexto.setBounds(bordaX + 130, bordaY + 105, 180, 20);
		caixaDeTexto.addActionListener(this);
		
		janela.add(caixaDeTexto);
		janela.add(email);
	}
	
	private void construirCaixaDeTextoDeSenha(JFrame janela) {
		JLabel senha = new JLabel("Sua senha:"); //rótulo só com texto
		senha.setBounds(bordaX, bordaY + 144, 160, 20);
		senha.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField caixaDeTextoSenha = new JPasswordField(30);
		caixaDeTextoSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
		caixaDeTextoSenha.setBounds(bordaX + 130, bordaY + 144, 180, 20);
		
		janela.add(caixaDeTextoSenha);
		janela.add(senha);
	}
}