package view.TelaPrincipal;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import view.TelaCadastroAnimal.TelaCadAnimal;
import controle.ControleLogin;
import controle.ControleMeusPets;
import modelo.Dados;
import view.TelaPrincipal.Tabela;

/**
 *  Essa é a Tela Principal do aplicativo, a qual demonstra os pets vinculados ao usuário. 
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class MeusPets implements ActionListener {
	private static JFrame janela = new JFrame("Tela Principal - Meus Pets");
	private Dados dados;
	private ControleMeusPets controle;

	private int bordaX = 24;
	private int bordaY = 24;

	/**
	 * Utiliza os dados como parâmetro, uma vez que segue o caminho usual. 
	 * Além disso, chama o método Inicializar. 
	 */
	
	public MeusPets(Dados dados) {
		this.dados = dados;
		Inicializar();
	}

	/**
	 * Caso não venha da navegação usual/correta.
	 * Esse método é utilizado conforme é visualizado na main.
	 */
	
	public MeusPets() {
		this.dados = new Dados();
		Inicializar();
	}

	private void Inicializar() {
		controle = new ControleMeusPets(janela, dados);
		janela.setLayout(null);

		janela.setSize(272, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);

		/**
		 * Chama o construir da classe Menu
		 */
		
		Menu menu = new Menu(janela, controle);
		menu.construir();

		/**
		 * Chama o construir da classe Meus Pets
		 */		
		
		this.construir();
		
		/**
		 * Cria a tabela na janela, que conterá todos os animais de estimação do usuário. 
		 */		
		
		Tabela tabela = new Tabela(janela, controle);
		tabela.Construir();

		janela.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
			controle.CadastrarPet();

		} else if ("Vacinas" == ae.getActionCommand()) {
			controle.Vacinas();
		}

	}

	public void construir() {
		construirImagemDeFundo();
		construirBotoes(janela);
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

	/**
	 * Cria o botão de Cadastrar Pet 
	 */		
	
	private void construirBotoes(JFrame janela) {
		JButton botaoAdicionarPet = new JButton("Cadastrar Pet");

		botaoAdicionarPet.setBounds(56, 500, 160, 30);
		botaoAdicionarPet.setActionCommand("Cadastrar Pet");
		botaoAdicionarPet.addActionListener(this);

		janela.add(botaoAdicionarPet);

	}

	// cria o quadro na thread de despacho de evento

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MeusPets();
			}
		});
	}
}