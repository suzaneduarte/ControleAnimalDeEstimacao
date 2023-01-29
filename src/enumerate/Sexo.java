package enumerate;


public enum Sexo {
	FEMININO("Feminino"), 
	MASCULINO("Masculino"),
	OUTRO("Outro");
	
	private String descricao;
	
	Sexo (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}