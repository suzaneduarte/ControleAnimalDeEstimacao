package controle;

import javax.swing.JFrame;

import enumerate.Especie;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Raca;
import modelo.Usuario;
import view.TelaPrincipal.MeusPets;

/**
 *  Classe ControleCadastroPet faz o controle do Cadastro dos Pets
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleCadastroPet {
	private JFrame janela;
	private Dados dados;
	
	public ControleCadastroPet (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Voltar() {
		new MeusPets();
	    janela.dispose();
	}
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Cadastrar(Especie especie, Raca raca, String nome, String nascimento, Sexo sexo) {
		AnimalDeEstimacao animal = new AnimalDeEstimacao(especie, raca, nome, nascimento, sexo);
		Usuario usuario = dados.getUsuarioConectado();
		dados.AddAnimal(animal, usuario);
		
		new MeusPets(dados);
	    janela.dispose();
	}
}
