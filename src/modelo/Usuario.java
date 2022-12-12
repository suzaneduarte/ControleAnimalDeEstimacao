package model;

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
}