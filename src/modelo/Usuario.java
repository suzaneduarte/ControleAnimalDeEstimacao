package modelo;

import java.util.Date;
import enumerate.Sexo;

public class Usuario extends Individuo { 
	private String email;
	private String cpf;
	private String telefone;

	

	public Usuario(String email, String cpf, String telefone, String nome, Date nascimento, Sexo sexo) {
		super(nome, nascimento, sexo);
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}


    // getters and setters	
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 

    public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}


    public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		StringBuilder stringb = new StringBuilder();
		stringb.append("Usuário: \n");
		stringb.append("Nome: "+ this.getNome() + "\n");
		stringb.append("Email: " + email + "\n");
		stringb.append("CPF: "+ cpf + "\n");
		stringb.append("telefone: " + telefone + "\n");
		stringb.append("Sexo: "+ this.getSexo() + "\n");
		stringb.append("Nascimento: "+ this.getNascimento() + "\n");
		
		return stringb.toString();
	}

}