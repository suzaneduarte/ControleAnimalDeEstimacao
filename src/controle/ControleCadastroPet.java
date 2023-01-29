package controle;

import javax.swing.JFrame;

import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleCadastroPet faz o controle do Cadastro dos Pets
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleCadastroPet {
	private JFrame janela;
	
	public ControleCadastroPet (JFrame janela) {
		this.janela = janela;
	}	
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Voltar() {
		new MeusPets();
	    janela.dispose();
	}
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Cadastrar() {
		new MeusPets();
	    janela.dispose();
	}
}
