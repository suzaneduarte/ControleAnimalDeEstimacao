package enumerate;

/**
 *  Classe Enumerate Intervalo faz o Enumerate dos Intervalos de tempo
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

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