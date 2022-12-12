package enumerate;


public enum Especie{
	CANINO("canino"), 
	FELINO("felino"),
	AVE("ave"),
	ROEDOR("roedor");
	
	private String descricao;
	
	Especie (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}