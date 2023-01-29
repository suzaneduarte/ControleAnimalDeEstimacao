package controle;

import java.util.*;

import javax.swing.JFrame;

import enumerate.Sexo;
import modelo.*;
import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleCadastro faz o controle de todos os dados dos usuários
 *  @author Gabriel Evaristo
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
	
	/**
	 * Construtor ControleUsuario
	 * Preenche uma lista com todos os usuarios cadastrados.
	 * @param d
	 */
	
//	public ControleUsuario(ControleDados d) {
//		usuarios = d.getUsuario();
//	}
	
	/**
	 * Retorna um array com o nome de todos os pacientes.
	 * @return String[]
	 */
	
//	public String[] getListaUsuarios() {
//		String[] listaUsuarios = new String[usuarios.size()];
//		for(int i = 0; i<usuarios.size(); i++) {
//			listaUsuarios[i] = ("  "+usuarios.get(i).getNome());
//		}
//		return listaUsuarios;
//	}
//
//	public String getNome(int i) {
//		return usuarios.get(i).getNome();
//	}
//
//	public String getEmail(int i) {
//		return usuarios.get(i).getEmail();
//	}
//
//	public String getTelefone(int i) {
//		return usuarios.get(i).getTelefone();
//	}
//	
//	public Sexo getSexo(int i) {
//		return usuarios.get(i).getSexo();
//	}
//	
//	public String getCpf(int i) {
//		return usuarios.get(i).getCPF();	
//	}	
//	
}
