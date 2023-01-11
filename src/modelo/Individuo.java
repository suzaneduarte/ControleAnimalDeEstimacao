package modelo;

import enumerate.Sexo;

import java.util.Date;

public abstract class Individuo {
	private String nome;
	private Date nascimento;
	private Sexo sexo;


	public Individuo(String nome, Date nascimento, Sexo sexo) {
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

}