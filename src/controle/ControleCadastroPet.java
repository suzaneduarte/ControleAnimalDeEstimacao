package controle;

import javax.swing.JFrame;

import enumerate.Especie;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Raca;
import modelo.Usuario;
import view.TelaDetalhesDoPet.TelaDetalhesDoPet;
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
	private AnimalDeEstimacao animal;
	
	public ControleCadastroPet (JFrame janela, Dados dados, AnimalDeEstimacao animal) {
		this.janela = janela;
		this.dados = dados;
		this.animal = animal;
	}	
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Voltar() {
		if(this.animal != null) {
			new TelaDetalhesDoPet(animal, dados);
		} else {			
			new MeusPets();
		}
	    janela.dispose();
	}
	
	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Cadastrar(Especie especie, Raca raca, String nome, String nascimento, Sexo sexo) {
		if(this.animal != null) {
			animal.setEspecie(especie);
			animal.setRaca(raca);
			animal.setNome(nome);
			animal.setNascimento(nascimento);
			animal.setSexo(sexo);
			
			new TelaDetalhesDoPet(animal, dados);
		} else {			
			AnimalDeEstimacao animal = new AnimalDeEstimacao(especie, raca, nome, nascimento, sexo);
			Usuario usuario = dados.getUsuarioConectado();
			dados.AddAnimal(animal, usuario);
			
			new MeusPets(dados);
		}
		
	    janela.dispose();
	}
	
	public AnimalDeEstimacao getAnimalSelecionado() {
		return this.animal;
	}
}
