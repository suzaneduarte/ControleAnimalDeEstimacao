package enumerate;


public enum Intervalo {
	DIA("dia"), 
	MES("mês"),
	ANO("ano");
	
	private String descricao;
	
	Intervalo (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}