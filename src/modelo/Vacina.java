package modelo;

import enumerate.Intervalo;

import java.util.Date;

/**
*  Classe Vacina contem informações sobre a Vacina
*  @author Gabriel Evaristo e Suzane Alves
*  @since 2023
*  @version 1.0
*/


public class Vacina {
	private String nomeDaVacina;
	private String data;
	private String lote;
	private String laboratorio;
	private boolean necessitaRevacina;
	private int periodo;
	private Intervalo intervalo;
	
	/**
	 * Vacina
	 * @param nomeDaVacina
	 * @param data
	 * @param lote
	 * @param laboratorio
	 * @param necessitaRevacina
	 * @param periodo
	 * @param intervalo
	 */
    
	public Vacina(String nomeDaVacina, String data, String lote, String laboratorio, boolean necessitaRevacina, int periodo, Intervalo intervalo) {
		this.nomeDaVacina = nomeDaVacina;
		this.data = data;
		this.lote = lote;
		this.laboratorio = laboratorio;
		this.necessitaRevacina = necessitaRevacina;
		this.periodo = periodo;
		this.intervalo = intervalo;

	}


	// getters and setters
	public String getNomeDaVacina() {
		return nomeDaVacina;
	}
	
	public void setNomeDaVacina(String nomeDaVacina) {
		this.nomeDaVacina = nomeDaVacina;
	}
	
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
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
	
	public void setLaboratorio(String laboratorio) {
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
	
	public boolean getRevacina() {
		return this.necessitaRevacina;
	}
	
}