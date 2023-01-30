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
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Vacina;
import view.TelaCadastroAnimal.QuadroAnimal;
import view.TelaVacinas.TelaCadVacina;

/**
 *  Classe TelaCadVacina chama os demais elementos
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class TelaCadVacina implements ActionListener {
	private static JFrame telacadastrovacina = new JFrame("Cadastre uma vacina!"); 
	private Dados dados;
	private ControleVacinas controle;
	private AnimalDeEstimacao animal = null;
	private Vacina vacina = null;
		
	public TelaCadVacina(Dados dados) { //caso venha de outra tela (com parâmetro)
		this.dados = dados;
		Inicializar();
	}
	
	public TelaCadVacina(Dados dados, AnimalDeEstimacao animal) { //caso venha de outra tela (com parâmetro)
		this.dados = dados;
		this.animal = animal;
		Inicializar();
	}
	
	public TelaCadVacina(Dados dados, AnimalDeEstimacao animal, Vacina vacina) { //caso venha de outra tela (com parâmetro)
		this.dados = dados;
		this.animal = animal;
		this.vacina = vacina;
		Inicializar();
	}
	
	public TelaCadVacina() {
		this.dados = new Dados();
		Inicializar();
	}
	
	/**
	 * inicializa
	 */
	
	private void Inicializar() {
		controle = new ControleVacinas(telacadastrovacina, dados, animal, vacina);
		telacadastrovacina.setLayout(null);

		telacadastrovacina.setSize(520, 650); 
		telacadastrovacina.setLocationRelativeTo(null);
		telacadastrovacina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		construirImagemDeFundo();

		QuadroVacina quadrocadastro = new QuadroVacina(telacadastrovacina, controle);
		quadrocadastro.construir();
		
		telacadastrovacina.setVisible(true);
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