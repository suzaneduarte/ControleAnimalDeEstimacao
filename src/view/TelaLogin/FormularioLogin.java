package view.TelaLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;
//import java.io.IOException;


/**
 *  Classe FormularioLogin cria o formulario do login
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class FormularioLogin implements ActionListener {
	JFrame janela;
	
	private int bordaX = 24;
	private int bordaY = 24;
	private JTextField caixaDeTextoEmail;
	private JTextField caixaDeTextoSenha;

	public FormularioLogin(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public String getEmail() {
		return caixaDeTextoEmail.getText();
	}
	
	public String getSenha() {
		return caixaDeTextoSenha.getText();
	}
	
	/**
	 * constroi os elementos 
	 */
	public void construir() {
		construirCaixaDeTexto(janela);
		construirCaixaDeTextoDeSenha(janela);
	}
	
	/**
	 * cx de txt email
	 * @param janela
	 */
	
	private void construirCaixaDeTexto(JFrame janela) {
		JLabel email = new JLabel("Seu e-mail:"); //rótulo só com texto
		email.setBounds(bordaX, bordaY + 100, 160, 30);
		email.setFont(new Font("Arial", Font.BOLD, 14));
		caixaDeTextoEmail = new JTextField(20); //cria campo de texto com largura de 10 colunas 
		caixaDeTextoEmail.setActionCommand("myTF"); //define os comandos de ação de campo do texto
		caixaDeTextoEmail.setBounds(bordaX + 130, bordaY + 105, 180, 20);
		caixaDeTextoEmail.addActionListener(this);
		
		janela.add(caixaDeTextoEmail);
		janela.add(email);
	}
	
	/**
	 * cx de txt senha
	 * @param janela
	 */
	private void construirCaixaDeTextoDeSenha(JFrame janela) {
		JLabel senha = new JLabel("Sua senha:"); //rótulo só com texto
		senha.setBounds(bordaX, bordaY + 144, 160, 20);
		senha.setFont(new Font("Arial", Font.BOLD, 14));
		caixaDeTextoSenha = new JPasswordField(30);
		caixaDeTextoSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
		caixaDeTextoSenha.setBounds(bordaX + 130, bordaY + 144, 180, 20);
		
		janela.add(caixaDeTextoSenha);
		janela.add(senha);
	}
}