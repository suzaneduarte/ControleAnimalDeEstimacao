package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;

public class ControleLogin {
	private JFrame janela;
	
	public ControleLogin (JFrame janela) {
		this.janela = janela;
	}	
	
	public void Entrar() {
		new MeusPets();
	    janela.dispose();
	}
	
	public void Cadastrar() {
		new TelaCadastro();
        janela.dispose();
	}
}
