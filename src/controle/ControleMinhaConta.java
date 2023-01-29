package controle;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import modelo.*;
import view.TelaCadastro.TelaCadastro;
import view.TelaLogin.*;
import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleMinhaConta faz o controle da Minha Conta
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleMinhaConta {
	private JFrame janela;
	private Dados dados;
	
	public ControleMinhaConta (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	

	/**
	 * Chama a tela Primeira Tela
     * Destrói a janela atual
	 */
	
	public void Sair() {
		new PrimeiraTela();
	    janela.dispose();
	}
}
