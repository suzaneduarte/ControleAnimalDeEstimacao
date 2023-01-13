package view.TelaCadastroAnimal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import view.TelaCadastroAnimal.TelaCadAnimal;

	public class TelaCadAnimal implements ActionListener {
		private static JFrame telacadastroanimal = new JFrame("Cadastrar Animal de Estimação"); 
		
		public TelaCadAnimal() {

			telacadastroanimal.setLayout(null);

			telacadastroanimal.setSize(448, 500); 
			telacadastroanimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			
			construirImagemDeFundo();
			
			QuadroAnimal quadrocadastro = new QuadroAnimal(telacadastroanimal);
			quadrocadastro.construir();
			
			telacadastroanimal.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent ae) {

		}
		
		private void construirImagemDeFundo() {
			try {
				BufferedImage image = ImageIO.read(getClass().getResource("/imagens/primeiratela.jpg"));
				ImageIcon icon = new ImageIcon(image);
				
				JLabel contentPane = new JLabel();
				contentPane.setIcon( icon );
				telacadastroanimal.setContentPane( contentPane );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//cria o quadro na thread de despacho de evento
		
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new TelaCadAnimal();
				}
			});
		}
	}