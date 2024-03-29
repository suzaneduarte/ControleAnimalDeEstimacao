package view.TelaLogin;
	
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import controle.ControleLogin;
import modelo.Dados;

/**
 *  Classe PrimeiraTela chama os demais elementos
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */
public class PrimeiraTela implements ActionListener {
	private static JFrame janelainicial = new JFrame("Controle de Animais de Estimação"); //cria o contêiner janelainicial
	private Dados dados;
	private ControleLogin controle;
	
	public PrimeiraTela(Dados dados) { //caso venha de outra tela (com parâmetro)
		this.dados = dados;
		Inicializar();
	}
	
	public PrimeiraTela() {
		this.dados = new Dados();
		Inicializar();
	}
	/**
	 * inicializa
	 */
	private void Inicializar() {
		controle = new ControleLogin(janelainicial, dados);
		janelainicial.setLayout(null);

		janelainicial.setSize(448, 320); //define as dimensões em pixel da janela inicial
		janelainicial.setLocationRelativeTo(null);
		janelainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra app
		
		construirImagemDeFundo();
		
		QuadroLogin quadroLogin = new QuadroLogin(janelainicial, controle);
		quadroLogin.construir();
		

	//exibe a janela
		janelainicial.setVisible(true);
	}
	
	
	// Trata eventos de ação 
	public void actionPerformed(ActionEvent ae) {
		
	}
	/**
	 * chama a imagem de fundo
	 */
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