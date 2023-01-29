package enumerate;

/**
 *  Classe Enumerate Especie faz o Enumerate das Especies
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public enum Especie{
	CANINO("Canino"), 
	FELINO("Felino"),
	AVE("Ave"),
	ROEDOR("Roedor");
	
	private String descricao;
	
	Especie (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public String toString() {
		StringBuilder stringb = new StringBuilder();
		stringb.append(this.getDescricao() + "\n");		
		return stringb.toString();
	}
}