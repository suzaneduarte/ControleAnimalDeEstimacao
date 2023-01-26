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
	
public class MeusPets implements ActionListener {
		private static JFrame janela = new JFrame("Tela Principal - Meus Pets"); 
		private Dados dados;
		private ControleMeusPets controle;
		
		private int bordaX = 24;
		private int bordaY = 24;
		
		public MeusPets(Dados dados) {
			this.dados = dados;
			Inicializar();
		}
		
		public MeusPets() {
			this.dados = new Dados();
			Inicializar();
		}
		
		private void Inicializar() {
			controle  = new ControleMeusPets(janela, dados);
			janela.setLayout(null);

			janela.setSize(500, 600); 
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//
			Menu menu = new Menu(janela);
			menu.construir(); // Chama o construir da classe Menu 
			
			this.construir(); // Chama o construir da classe Meus Pets 
			Tabela tabela = new Tabela(janela, controle);
			tabela.Construir();
			

			janela.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent ae) {
			if ("Cadastrar Pet" == ae.getActionCommand()) {
				controle.CadastrarPet();
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
				contentPane.setIcon( icon );
				janela.setContentPane( contentPane );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private void construirBotoes(JFrame janela) {
			JButton botaoAdicionarPet = new JButton("Cadastrar Pet");
			
			botaoAdicionarPet.setBounds(bordaX + 120, bordaY + 300, 160, 30);
			botaoAdicionarPet.setActionCommand("Cadastrar Pet");
			botaoAdicionarPet.addActionListener(this);
			
			janela.add(botaoAdicionarPet);
		}

		//cria o quadro na thread de despacho de evento
		
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new MeusPets();
				}
			});
		}
	}