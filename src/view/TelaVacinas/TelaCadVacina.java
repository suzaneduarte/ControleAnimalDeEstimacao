package view.TelaVacinas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import controle.*;
import modelo.Dados;
import view.TelaCadastroAnimal.QuadroAnimal;
import view.TelaVacinas.TelaCadVacina;


public class TelaCadVacina implements ActionListener {
	private static JFrame telacadastrovacina = new JFrame("Cadastre uma vacina!"); 
	private Dados dados;
	private ControleVacinas controle = new ControleVacinas(telacadastrovacina, dados);
		
	public TelaCadVacina(Dados dados) { //caso venha de outra tela (com parâmetro)
		this.dados = dados;
		Inicializar();
	}
	
	public TelaCadVacina() {
		this.dados = new Dados();
		Inicializar();
	}
	
	private void Inicializar() {
		telacadastrovacina.setLayout(null);

		telacadastrovacina.setSize(448, 500); 
		telacadastrovacina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		construirImagemDeFundo();

		QuadroVacina quadrocadastro = new QuadroVacina(telacadastrovacina, controle);
		quadrocadastro.construir();
		
		telacadastrovacina.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {

	}
	
	private void construirImagemDeFundo() {
		try {
			BufferedImage image = ImageIO.read(getClass().getResource("/imagens/primeiratela.jpg"));
			ImageIcon icon = new ImageIcon(image);
			
			JLabel contentPane = new JLabel();
			contentPane.setIcon( icon );
			telacadastrovacina.setContentPane( contentPane );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//cria o quadro na thread de despacho de evento
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new TelaCadVacina();
			}
		});
	}
}