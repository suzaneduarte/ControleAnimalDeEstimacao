package model;

public class Raca {
	private String tipoDeRaca;
	private String pelagem;
	private boolean tamanhoDaPelagem;
	private float peso;
	private String temperamento;
	

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

	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	
}