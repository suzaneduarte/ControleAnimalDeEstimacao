package modelo;

import enumerate.Sexo;

import java.util.Date;

/**
 *  Classe Individuo contem informações sobre o Individuo
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public abstract class Individuo {
	private String nome;
	private String nascimento;
	private Sexo sexo;
	
	/**
	 * Individuo
	 * @param nome
	 * @param nascimento
	 * @param sexo
	 */
	
	public Individuo(String nome, String nascimento, Sexo sexo) {
			this.nome = nome;
			this.nascimento = nascimento;
			this.sexo = sexo;
	}


	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}


	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}