package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

import modelo.Dados;
import modelo.Usuario;

public class ControleLogin {
	private JFrame janela;
	private Dados dados;
	public ControleLogin (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	public void Entrar(String email, String senha) {
		Usuario usuario = dados.procuraUsuario(email, senha);
		System.out.println(usuario);
		System.out.println(email);
		System.out.println(senha);
		if (usuario == null) {
			
		} else {
			dados.setUsuarioConectado(usuario);
			new MeusPets(this.dados);
			janela.dispose(); //destruindo a tela atual 			
		}		
	}
	
	public void Cadastrar() {
		new TelaCadastro(this.dados);
        janela.dispose();
	}
}
