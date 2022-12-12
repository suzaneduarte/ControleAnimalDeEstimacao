package enumerate;


public enum Sexo {
	FEMININO("feminino"), 
	MASCULINO("masculino"),
	OUTRO("outro");
	
	private String descricao;
	
	Sexo (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}