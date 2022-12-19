package modelo;

import java.util.Date;
import enumerate.Especie;
import enumerate.Sexo;

public class AnimalDeEstimacao extends Individuo { 
	private Especie especie;
	private Raca raca;

	public AnimalDeEstimacao(Especie especie, Raca raca, String nome, Date nascimento, Sexo sexo) {
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