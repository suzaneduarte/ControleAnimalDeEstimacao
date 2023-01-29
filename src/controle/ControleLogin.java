package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

import modelo.Dados;

/**
 *  Classe ControleLogin faz o controle dos Logins dos Usuários
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleLogin {
	private JFrame janela;
	private Dados dados;
	public ControleLogin (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Entrar() {
		new MeusPets(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}
	
	/**
	 * Chama a tela Cadastro
     * Destrói a janela atual
	 */
	
	public void Cadastrar() {
		new TelaCadastro(this.dados);
        janela.dispose();
	}
}
