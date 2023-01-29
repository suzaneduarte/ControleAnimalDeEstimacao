package controle;

import javax.swing.*;

import modelo.Dados;
import view.TelaCadastro.TelaCadastro;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina; 


/**
 *  Classe ControleMinhaConta faz o controle de Vacinas
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleVacinas {
	private JFrame janela;
	private Dados dados;
	
	public ControleVacinas (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}

	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Voltar() {
		new MeusPets(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}

	/**
	 * Chama a tela CadastroVacina
     * Destrói a janela atual
	 */
	
	public void Cadastrar() {
		new TelaCadVacina(this.dados);
	    janela.dispose(); //destruindo a tela atual 
	}
}