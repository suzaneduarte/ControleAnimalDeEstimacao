package controle;

import javax.swing.*;

import modelo.Dados;
import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina; 

public class ControleVacinas {
	private JFrame janela;
	private Dados dados;
	
	public ControleVacinas (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}
	
	public void Voltar() {
		new MeusPets(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}
	
	public void Cadastrar() {
		new TelaCadVacina(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}
}