package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

import modelo.Dados;
import modelo.Usuario;

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
	 * Procura um usuário com o email e senha digitados
	 * Se o usuário for encontrado, coloca ele como usuário conectado no banco de dados
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	public void Entrar(String email, String senha) {
		Usuario usuario = dados.procuraUsuario(email, senha);
		if (usuario == null) {
			
		} else {
			dados.setUsuarioConectado(usuario);
			new MeusPets(this.dados);
			janela.dispose(); //destruindo a tela atual 			
		}
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
