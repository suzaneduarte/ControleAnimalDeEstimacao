package controle;

import javax.swing.JFrame;

import view.TelaPrincipal.MeusPets;

public class ControleCadastroPet {
	private JFrame janela;
	
	public ControleCadastroPet (JFrame janela) {
		this.janela = janela;
	}	
	
	public void Voltar() {
		new MeusPets();
	    janela.dispose();
	}
	
	public void Cadastrar() {
		new MeusPets();
	    janela.dispose();
	}
}
