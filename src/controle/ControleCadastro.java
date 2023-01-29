package controle;

import java.util.*;

import javax.swing.JFrame;

import enumerate.Sexo;
import modelo.*;
import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleCadastro faz o controle do Cadastro dos Usuários
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleCadastro {
	
	private JFrame janela;
	private Dados dados;
	
	public ControleCadastro (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	/**
	 * Verifica se a senha e a confirmação da senha são iguais
	 * Cria um novo usuário com as informações do formulário
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	public void Cadastrar(
			String email,
			String cpf,
			String telefone,
			String nome,
			String nascimento,
			Sexo sexo,
			String senha,
			String confirmacaoSenha
		) {
		if(senha.compareTo(confirmacaoSenha) == 0) {
			Usuario usario = new Usuario(email, cpf, telefone, nome, nascimento, sexo, senha);
			dados.setUsuarioConectado(usario);
			
			new MeusPets();
			janela.dispose();
		} else {
			
		}
	}
	
}
