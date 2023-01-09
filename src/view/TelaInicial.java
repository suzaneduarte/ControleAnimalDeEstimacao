package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaInicial implements ActionListener {
	private static JFrame janelainicial = new JFrame("Controle de Animais de Estimação"); //cria o contêiner janelainicial
	private static JLabel titulo = new JLabel("Olá! Faça seu login."); //rótulo só com texto
	private static JLabel email = new JLabel("Seu e-mail"); //rótulo só com texto
	private static JLabel senha = new JLabel("Sua senha"); //rótulo só com texto
	private static JButton entrar = new JButton("Entrar");
	
	public TelaInicial() {

		jtf = newJTextField(10);  //cria campo de texto com largura de 10 colunas 
		jtf.setActionCommand("myTF"); //define os comandos de ação de campo do texto

		//como o layout do contêiner é nulo:
		janelainicial.setLayout(null);
		titulo.setBounds(120, 10, 150, 30);
		//DUVIDA: janelainicial.setLayout(new FlowLayout()); //especifica FlowLayout como gerenciador de layout

		//define design:
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		email.setBounds(140, 100, 100, 30);
		senha.setBounds(140, 150, 100, 30);
		entrar.setBounds(140, 50, 100, 30);
		
		
		janelainicial.setSize(400, 250); //define as dimensões em pixel da janela inicial
		janelainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra app

		//adiciona ouvintes de ação: 
		jtf.addActionListener(this);
		entrar.addActionListener(this);

		//cria rótulos: 
		jlabContents = new JLabel("");

		//adiciona os componentes ao painel de conteúdo da janela inicial
		janelainicial.add(titulo); 
		janelainicial.add(email);
		janelainicial.add(senha);
		janelainicial.add(entrar);	
		
		//exibe a janela
		janelainicial.setVisible(true);
	}
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {

		if(ae.getActionCommand().equals("Entrar")) //se o botão entrar for pressionado 
		{
			String orgStr = entrar.getText();
			String resString = "";

			for(int i = orgStr.lengt()-1; i>= 0; i--) //armazena string invertida
				resString += orgStr.charAt(i);

			entrar.setText(resString);
		}else
		{
			jlabContents.setText("Você pressionou Entrar. É:" + email.getText());
		}
		
	}

	//cria o quadro na thread de despacho de evento
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new TelaInicial();
			}
		});
	}
}