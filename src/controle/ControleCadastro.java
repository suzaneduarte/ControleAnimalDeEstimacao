package controle;

import java.util.*;

import javax.swing.JFrame;

import enumerate.Sexo;
import modelo.*;
import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleCadastro faz o controle do Cadastro dos Usuários
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleCadastro {
	
	private JFrame janela;
	
	public ControleCadastro (JFrame janela) {
		this.janela = janela;
	}	
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Cadastrar() {
		new MeusPets();
	    janela.dispose();
	}
	
}
