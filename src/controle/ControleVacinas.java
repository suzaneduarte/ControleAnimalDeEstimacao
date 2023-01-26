package controle;

import javax.swing.*;

import modelo.Dados; 

public class ControleVacinas {
	private JFrame janela;
	private Dados dados;
	
	public ControleVacinas (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}
}