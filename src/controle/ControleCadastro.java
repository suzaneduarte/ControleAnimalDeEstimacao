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
	
	public ControleCadastro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Verifica se a senha e a confirmação da senha são iguais
	 * Cria um novo usuário com as informações do formulário
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	public boolean Cadastrar(
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
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * Teste Unitario do CPF
	 * @param valor
	 * @return
	 */
	
	public static boolean testeCpf(String valor) {
		if(valor.matches("[0-9]+")) 
			return true;
		else 
			return false;
	}
	
	/**
	 * Teste Unitario do Telefone
	 * @param valor
	 * @return
	 */
	
	public static boolean testeTelefone(String valor) {
		if(valor.matches("[0-9]+")) 
			return true;
		else 
			return false;
	}
	
	/**
	 * Teste Unitario do Nome
	 * @param nomeNomeCorreto
	 * @param nome
	 * @return
	 */
	
	public static boolean testeNome(String nomeNomeCorreto, String nome) {
		if(nomeNomeCorreto == nome)
			return true;
		else
			return false;
	}
}
