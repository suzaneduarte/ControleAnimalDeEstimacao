package controle;

import javax.swing.*;

import enumerate.Intervalo;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Vacina;
import view.TelaCadastro.TelaCadastro;
import view.TelaDetalhesDoPet.TelaDetalhesDoPet;
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
	private AnimalDeEstimacao animal = null;
	private Vacina vacina = null;
	
	public ControleVacinas (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}
	
	public ControleVacinas (JFrame janela, Dados dados, AnimalDeEstimacao animal, Vacina vacina) {
		this.janela = janela;
		this.dados = dados;
		this.animal = animal;
		this.vacina = vacina;
	}

	/**
	 * Chama a tela MeusPets
     * Destrói a janela atual
	 */
	
	public void Voltar() {
		if(vacina == null && animal == null) {
			new MeusPets(this.dados);
			janela.dispose(); //destruindo a tela atual 			
		} else {
			new TelaDetalhesDoPet(animal, dados);
			janela.dispose();
		}
	}

	/**
	 * Chama a tela CadastroVacina
     * Destrói a janela atual
	 */
	public void Cadastrar(String nomeDaVacina, String data, String lote, String laboratorio, boolean necessitaRevacina, int periodo, Intervalo intervalo) {
		if (this.vacina != null) {
			vacina.setNomeDaVacina(nomeDaVacina);
			vacina.setData(data);
			vacina.setLote(lote);
			vacina.setLaboratorio(laboratorio);
			vacina.setNecessitaRevacina(necessitaRevacina);
			vacina.setPeriodo(periodo);
			vacina.setIntervalo(intervalo);
			
			new TelaDetalhesDoPet(animal, dados);
		} else {			
			Vacina vacina = new Vacina(nomeDaVacina, data, lote, laboratorio, necessitaRevacina, periodo, intervalo);
			dados.AddVacina(vacina);
			
			if(animal != null) {
				animal.AddVacina(vacina);
				new TelaDetalhesDoPet(animal, dados);
			} else {
				new MeusPets(this.dados);			
			}
			
		}
		janela.dispose(); //destruindo a tela atual 
		
	}
	
	public Vacina GetVacinaSelecionada() {
		return this.vacina;
	}
}