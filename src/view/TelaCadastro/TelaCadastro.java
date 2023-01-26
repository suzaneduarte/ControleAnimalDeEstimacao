package view.TelaCadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import controle.ControleLogin;
import view.TelaLogin.PrimeiraTela;
import controle.ControleCadastro;
import modelo.Dados;
	
	public class TelaCadastro implements ActionListener {
		private static JFrame telacadastro = new JFrame("Controle de Animais de Estimação"); //cria o contêiner telacadastro
		private ControleCadastro controle = new ControleCadastro(telacadastro);
		private Dados dados;
		
		public TelaCadastro() {
			this.dados = new Dados();
			Inicializar();
		}
		
		public TelaCadastro(Dados dados) {
			this.dados = dados;
			Inicializar();
		}
		
		private void Inicializar() {
			telacadastro.setLayout(null);

			telacadastro.setSize(448, 500); //define as dimensões em pixel da janela inicial
			telacadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra app
			
			construirImagemDeFundo();
			
			QuadroCadastro quadrocadastro = new QuadroCadastro(telacadastro, controle);
			quadrocadastro.construir();
			

//			//exibe a janela
			telacadastro.setVisible(true);
		}
		
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {

		}
		
		private void construirImagemDeFundo() {
			try {
				BufferedImage image = ImageIO.read(getClass().getResource("/imagens/primeiratela.jpg"));
				ImageIcon icon = new ImageIcon(image);
				
				JLabel contentPane = new JLabel();
				contentPane.setIcon( icon );
				telacadastro.setContentPane( contentPane );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//cria o quadro na thread de despacho de evento
		
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new TelaCadastro();
				}
			});
		}
	}