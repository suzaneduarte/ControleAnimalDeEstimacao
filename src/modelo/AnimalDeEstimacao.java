package modelo;

import java.util.ArrayList;


import java.util.Date;
import java.util.List;

import enumerate.Especie;
import enumerate.Sexo;


/**
 *  Classe AnimalDeEstimação contem informações sobre o pet
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class AnimalDeEstimacao extends Individuo { 
	private Especie especie;
	private Raca raca;
	private List<Vacina> vacinas = new ArrayList<Vacina>();
	
	/**
	 * Informações do pet
	 * @param especie
	 * @param raca
	 * @param nome
	 * @param nascimento
	 * @param sexo
	 */

	public AnimalDeEstimacao(Especie especie, Raca raca, String nome, String nascimento, Sexo sexo) {
		super(nome, nascimento, sexo);
		this.especie = especie;
		this.raca = raca;
	}
	

    public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	} 


    public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}  
	
	public List <Vacina> getVacinas() {
		return vacinas;
	}
	
	/**
	 * Método onde se adiciona a vacina
	 * @param vacina
	 */

	public void AddVacina(Vacina vacina) {
		this.vacinas.add(vacina);
	} 
	
	/**
	 * Método onde se remove a vacina
	 * @param vacina
	 */
	
	public void DeleteVacina(Vacina vacina) {
		this.vacinas.remove(vacina);
	}
	
	
	/**
	 * Método para printar as informções do pet 
	 */
	
	public String toString() {
		StringBuilder stringb = new StringBuilder();
		stringb.append("Animal de Estimação: \n");
		stringb.append("Nome: "+ this.getNome() + "\n");
		stringb.append("Nascimento: "+ this.getNascimento() + "\n");
		stringb.append("Sexo: "+ this.getSexo() + "\n");
		stringb.append("Espécie: " + especie + "\n");
		stringb.append("Raça: "+ raca + "\n");
		
		return stringb.toString();
	}
}