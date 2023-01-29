package enumerate;

/**
 *  Classe Enumerate Sexo faz o Enumarate dos Sexos
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */


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