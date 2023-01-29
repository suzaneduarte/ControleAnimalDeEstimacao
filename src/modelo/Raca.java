package modelo;

public class Raca {
	private String tipoDeRaca;
	private String pelagem;
	private boolean tamanhoDaPelagem;
	private double peso;
	private String temperamento;

	public Raca(String tipoDeRaca, String pelagem, boolean tamanhoDaPelagem, double peso, String temperamento) {
		this.tipoDeRaca = tipoDeRaca;
		this.pelagem = pelagem;
		this.tamanhoDaPelagem = tamanhoDaPelagem;
		this.peso = peso;
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

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String toString() {
		StringBuilder stringb = new StringBuilder();
		stringb.append(tipoDeRaca + "\n");
		stringb.append("Pelagem: " + pelagem + "\n");
		stringb.append("Tamanho da pelagem: "+ tamanhoDaPelagem + "\n");
		stringb.append("Peso: " + peso + "\n");
		stringb.append("Temperamento: "+ temperamento + "\n");
		
		return stringb.toString();
	}

}