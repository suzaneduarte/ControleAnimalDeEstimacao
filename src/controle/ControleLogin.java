package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

import modelo.Dados;

public class ControleLogin {
	private JFrame janela;
	private Dados dados;
	public ControleLogin (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	public void Entrar() {
		new MeusPets(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}
	
	public void Cadastrar() {
		new TelaCadastro(this.dados);
        janela.dispose();
	}
}
