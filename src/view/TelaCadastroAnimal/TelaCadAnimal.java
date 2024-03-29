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
import controle.ControleCadastroPet;
import modelo.AnimalDeEstimacao;
import modelo.Dados;

/**
 *  Classe TelaCadAnimal chama os demais elementos
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class TelaCadAnimal implements ActionListener {
	private static JFrame telacadastroanimal = new JFrame("Cadastrar Animal de Estimação"); 
	private ControleCadastroPet controle;
	private Dados dados;
	private AnimalDeEstimacao animal = null;
	
	public TelaCadAnimal(Dados dados) {
		this.dados = dados;
		Inicializar();
	}
	
	public TelaCadAnimal() {
		this.dados = new Dados();
		Inicializar();
	}
	
	public TelaCadAnimal(Dados dados, AnimalDeEstimacao animal) {
		this.dados = dados;
		this.animal = animal;
		Inicializar();
	}

	/**
	 * inicializa
	 */
	private void Inicializar() {
		controle = new ControleCadastroPet(telacadastroanimal, dados, animal);
		telacadastroanimal.setLayout(null);

		telacadastroanimal.setSize(475, 600); 
		telacadastroanimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		telacadastroanimal.setLocationRelativeTo(null);
		
		construirImagemDeFundo();
		
		QuadroAnimal quadrocadastro = new QuadroAnimal(telacadastroanimal, controle);
		quadrocadastro.construir();
		
		telacadastroanimal.setVisible(true);
	}
	
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