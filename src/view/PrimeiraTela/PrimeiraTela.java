package view.PrimeiraTela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class PrimeiraTela implements ActionListener {
	private static JFrame janelainicial = new JFrame("Controle de Animais de Estimação"); //cria o contêiner janelainicial
	
	public PrimeiraTela() {
//		//como o layout do contêiner é nulo:
		janelainicial.setLayout(null);

		janelainicial.setSize(448, 320); //define as dimensões em pixel da janela inicial
		janelainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra app
		
		construirImagemDeFundo();
		
		QuadroLogin quadroLogin = new QuadroLogin(janelainicial);
		quadroLogin.construir();
		

//		//exibe a janela
		janelainicial.setVisible(true);
	}
	
	
	//trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {

//		if(ae.getActionCommand().equals("Entrar")) //se o botão entrar for pressionado 
//		{
//			String orgStr = entrar.getText();
//			String resString = "";
//
//			for(int i = orgStr.lengt()-1; i>= 0; i--) //armazena string invertida
//				resString += orgStr.charAt(i);
//
//			entrar.setText(resString);
//		}else
//		{
//			jlabContents.setText("Você pressionou Entrar. É:" + email.getText());
//		}
		
	}
	
	private void construirImagemDeFundo() {
		try {
			BufferedImage image = ImageIO.read(getClass().getResource("/imagens/primeiratela.jpg"));
			ImageIcon icon = new ImageIcon(image);
			
			JLabel contentPane = new JLabel();
			contentPane.setIcon( icon );
			janelainicial.setContentPane( contentPane );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//cria o quadro na thread de despacho de evento
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new PrimeiraTela();
			}
		});
	}
}