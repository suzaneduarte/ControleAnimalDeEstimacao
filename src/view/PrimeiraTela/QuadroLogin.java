package view.PrimeiraTela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class QuadroLogin implements ActionListener {
	private JFrame janela;
	private JPanel fundo;
	
	private int bordaX = 24;
	private int bordaY = 24;
	
	public QuadroLogin(JFrame janela) {
		this.janela = janela;
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {

	}
	
	public void construir() {
//		construirFundo(janela);
		construirTitulo(janela);
		construirFormulario(janela);
		construirBotao(janela);
	}
	
	private void construirTitulo(JFrame janela) {
		JLabel titulo = new JLabel("Olá! Faça seu Login");
		
		titulo.setBounds(bordaX, bordaY, 400, 90); 
		titulo.setFont(new Font("Arial", Font.BOLD, 35));
		titulo.setForeground(Color.black);
		
		janela.add(titulo);
	}
	
	private void construirFormulario(JFrame janela) {
		FormularioLogin formularioLogin = new FormularioLogin(janela);
		formularioLogin.construir();
	}
	
	private void construirBotao(JFrame janela) {
		JButton botaoEntrar = new JButton("Entrar");
		
		botaoEntrar.setBounds(bordaX + 140, bordaY + 200, 120, 20);
		botaoEntrar.addActionListener(this);
		
		janela.add(botaoEntrar);
	}
//	
//	private void construirFundo(JFrame janela) {
//		fundo = new JPanel();
//		fundo.setLayout(new BoxLayout(fundo, BoxLayout.Y_AXIS));
//		fundo.setBackground(Color.orange);
//		
//		fundo.setBounds(650,380,400,400); 
//		
//		janela.add(fundo);
//	}
}
