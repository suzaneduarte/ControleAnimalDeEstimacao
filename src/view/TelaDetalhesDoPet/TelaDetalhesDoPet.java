package view.TelaDetalhesDoPet;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import controle.ControleDetalhesDoPet;
import controle.ControleMeusPets;
import modelo.AnimalDeEstimacao;
import modelo.Dados;

/**
 *  Classe TelaDetalhesDoPet exibe os detalhes dos pets e suas vacinas cadastradas
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class TelaDetalhesDoPet {
	private static JFrame janela;
	private Dados dados;
	private ControleDetalhesDoPet controle;
	private AnimalDeEstimacao animal;

	private int bordaX = 24;
	private int bordaY = 24;

	public TelaDetalhesDoPet(AnimalDeEstimacao animal, Dados dados) {
		this.animal = animal;
		this.dados = dados;
		Inicializar();
	}

	public TelaDetalhesDoPet() {
		this.dados = new Dados();
		this.animal = dados.getAnimaisDeUsuario().get(0);
		Inicializar();
	}

	private void Inicializar() {
		janela = new JFrame("Detalhes do " + animal.getNome());
		controle = new ControleDetalhesDoPet(janela, dados, animal);
		janela.setLayout(null);

		janela.setSize(500, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		this.construir();
		
		DetalhesDoPet detalhesDoPet = new DetalhesDoPet(animal, controle, janela);
		detalhesDoPet.construir();
		
		TabelaVacinas tabelaVacina = new TabelaVacinas(animal, controle, janela);
		tabelaVacina.construir();
		
		Menu menu = new Menu(janela, controle, animal);
		menu.construir();

		janela.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
//			controle.CadastrarPet();

		} else if ("Vacinas" == ae.getActionCommand()) {
//			controle.Vacinas();
		}

	}

	public void construir() {
		construirImagemDeFundo();
	}

	private void construirImagemDeFundo() {
		try {
			BufferedImage image = ImageIO.read(getClass().getResource("/imagens/primeiratela.jpg"));
			ImageIcon icon = new ImageIcon(image);

			JLabel contentPane = new JLabel();
			contentPane.setIcon(icon);
			janela.setContentPane(contentPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// cria o quadro na thread de despacho de evento
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TelaDetalhesDoPet();
			}
		});
	}
}
