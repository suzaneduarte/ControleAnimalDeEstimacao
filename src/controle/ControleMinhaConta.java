package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import modelo.*;
import view.TelaCadastro.TelaCadastro;
import view.TelaLogin.*;
import view.TelaPrincipal.MeusPets;

public class ControleMinhaConta {
	private JFrame janela;
	private Dados dados;
	
	public ControleMinhaConta (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	public void Sair() {
		new PrimeiraTela();
	    janela.dispose();
	}
}
