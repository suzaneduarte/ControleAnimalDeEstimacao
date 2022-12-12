package model;

import java.util.Date;

public class Vacina {
	private String nomeDaVacina;
	private Date data;
	private String lote;
	private String laboratorio;
	private boolean necessitaRevacina;
	private int periodo;
	private Intervalo intervalo;
    

	// getters and setters
	public String getNomeDaVacina() {
		return nomeDaVacina;
	}
	
	public void setNomeDaVacina(String nomeDaVacina) {
		this.nomeDaVacina = nomeDaVacina;
	}
	
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public String getLote() {
		return lote;
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	public String getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratoro(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
	public boolean isNecessitaRevacina() {
		return necessitaRevacina;
	}
	
	public void setNecessitaRevacina(boolean necessitaRevacina) {
		this.necessitaRevacina = necessitaRevacina;
	}
	
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	
	public Intervalo getIntervalo() {
		return intervalo;
	}
	
	public void setIntervalo(Intervalo intervalo) {
		this.intervalo = intervalo;
	}
	
}