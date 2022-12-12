package model;

import enumerate.Especie;

public class AnimalDeEstimacao extends Individuo { 
	private Especie especie;
	private Raca raca;

	public AnimalDeEstimacao(Especie especie, Raca raca, String nome, Date nascimento, Sexo sexo) {
		super(nome, nascimento, sexo);
		this.especie = especie;
		this.raca = raca;
	}


    // getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
}