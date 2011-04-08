package edu.upc.cartelerag6.cartelerag6.model;

import java.io.Serializable;


public class Sala implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7789783307702730765L;
	private Integer idSala;
	private Integer numAsiento;
	private String estado; //Activa - Inactiva
	
	
	public Integer getIdSala() {
		return idSala;
	}
	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}
	public Integer getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(Integer numAsiento) {
		this.numAsiento = numAsiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Sala(int idSala, int numAsiento, String estado) {
		//super();
		this.idSala = idSala;
		this.numAsiento = numAsiento;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Sala [idPelicula=" + idSala + ", numAsiento=" + numAsiento + ", estado=" + estado + "]";
	}
	
	
	
}
