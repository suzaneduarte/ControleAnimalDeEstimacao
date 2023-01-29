package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import modelo.*;
import view.TelaCadastro.TelaCadastro;
import view.TelaCadastroAnimal.TelaCadAnimal;
import view.TelaLogin.PrimeiraTela;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina;

/**
 *  Classe ControleCadastroPet faz o controle do Cadastro dos Pets
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class ControleMeusPets {
	private JFrame janela;
	private Dados dados;
	
	public ControleMeusPets (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	

	/**
	 * Chama a tela CadastroAnimal
     * Destrói a janela atual
	 */
	
	public void CadastrarPet() {
		new TelaCadAnimal();
	    janela.dispose();
	}
	
	/**
	 * Cria uma lista de Animais através da função getAnimaisDeUsuário
	 * @param filtro
	 * O for procura o animal com o correspondente caracter digitado
	 * @return Lista dos pets com o correspondente caracter digitado
	 */
	
	public String[] GerarListaDePets(String filtro) {
		List<AnimalDeEstimacao> animais = dados.getAnimaisDeUsuario();
		ArrayList<String> nomes = new ArrayList<String>();
		for(AnimalDeEstimacao animal : animais) {
			if(animal.getNome().toLowerCase().contains(filtro.toLowerCase())) {
				nomes.add(animal.getNome());				
			}
		}
		
		return nomes.toArray(new String[0]);
	}
	
	/**
	 * Chama a tela CadastroVacinas
     * Destrói a janela atual
	 */
	
	public void Vacinas() {
		new TelaCadVacina();
	    janela.dispose();
	}
	
	/**
	 * Chama a tela Priemira Tela
     * Destrói a janela atual
	 */
	
	public void Sair() {
		new PrimeiraTela();
	    janela.dispose();
	}
}
