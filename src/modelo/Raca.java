package modelo;


/**
*  Classe Raça contem informações sobre a Raça
*  @author Gabriel Evaristo e Suzane Alves
*  @since 2023
*  @version 1.0
*/

public class Raca {
	private String tipoDeRaca;
	private String pelagem;
	private boolean tamanhoDaPelagem;
	private String temperamento;

	/**
	 * Raça	
	 * @param tipoDeRaca
	 * @param pelagem
	 * @param tamanhoDaPelagem
	 * @param temperamento
	 */
	
	public Raca(String tipoDeRaca, String pelagem, boolean tamanhoDaPelagem, String temperamento) {
		this.tipoDeRaca = tipoDeRaca;
		this.pelagem = pelagem;
		this.tamanhoDaPelagem = tamanhoDaPelagem;
		this.temperamento = temperamento;
	}

    // getters and setters
	public String getTipoDeRaca() {
		return tipoDeRaca;
	}
	
	public void setTipoDeRaca(String tipoDeRaca) {
		this.tipoDeRaca = tipoDeRaca;
	}


	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	
	public boolean isTamanhoDaPelagem() {
		return tamanhoDaPelagem;
	}

	public void setTamanhoDaPelagem(boolean tamanhoDaPelagem) {
		this.tamanhoDaPelagem = tamanhoDaPelagem;
	}

	
	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	
	/**
	 * Método para printar informações sobre a Raça
	 */

	public String toString() {
		StringBuilder stringb = new StringBuilder();
		stringb.append(tipoDeRaca + "\n");
		stringb.append("Pelagem: " + pelagem + "\n");
		stringb.append("Tamanho da pelagem: "+ tamanhoDaPelagem + "\n");
		stringb.append("Temperamento: "+ temperamento + "\n");
		
		return stringb.toString();
	}

}