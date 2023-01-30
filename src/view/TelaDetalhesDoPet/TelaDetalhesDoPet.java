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
 *  Essa é a Tela de detalhamento de cada um dos pets da lista de animais de estimação do usuário.
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

	/**
	 * Utiliza animal e os dados como parâmetros, uma vez que segue o caminho usual. Além disso, chama o método Inicializar. 
	 */
	
	public TelaDetalhesDoPet(AnimalDeEstimacao animal, Dados dados) {
		this.animal = animal;
		this.dados = dados;
		Inicializar();
	}

	/**
	 * Caso não venha da navegação usual/correta, esse método é utilizado conforme é visualizado na main. 
	 */
	
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
		
		/**
		 * Traz todas as informações detalhadas em relação ao determinado animal de estimação detalhado
		 */
		
		DetalhesDoPet detalhesDoPet = new DetalhesDoPet(animal, controle, janela);
		detalhesDoPet.construir();
		
		/**
		 * Cria a tabela de vacinas do animal selecionado
		 */
		
		TabelaVacinas tabelaVacina = new TabelaVacinas(animal, controle, janela);
		tabelaVacina.construir();

		/**
		 * Cria o menu na parte superior da tela para que seja possível realizar as ações de editar o animal ou deletar o animal. 
		 */
		
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
